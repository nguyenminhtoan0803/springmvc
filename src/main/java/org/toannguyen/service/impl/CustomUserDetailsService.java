package org.toannguyen.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.toannguyen.constant.SystemConstant;
import org.toannguyen.dto.MyUser;
import org.toannguyen.entity.RoleEntity;
import org.toannguyen.entity.UserEntity;
import org.toannguyen.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserEntity userEntity = userRepository.findOneByUserNameAndStatus(username, SystemConstant.ACTIVE_STATUS);

		if (userEntity == null) {
			throw new UsernameNotFoundException("user not found");
		}

		List<GrantedAuthority> authorities = new ArrayList<>();
		
		for(RoleEntity role:userEntity.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		// put thong tin vao security duy tri thong tin do khi user login vao he thong
		MyUser user = new MyUser(userEntity.getUserName(), 
							userEntity.getPassword(),
							true, true, true, true, authorities);
		user.setFullName(userEntity.getFullName());
		
		return user;
	}

}
