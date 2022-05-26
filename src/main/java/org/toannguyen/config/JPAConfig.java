package org.toannguyen.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableTransactionManagement // bat tinh nang quan ly transaction cho jpa
@EnableJpaRepositories(basePackages = {"org.toannguyen.repository"})
public class JPAConfig {

	@Bean
	// noi khoi tao doi tuong entity manager factory thuc thi cac cau sql
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean en = new LocalContainerEntityManagerFactoryBean();// noi khoi tao entity
																									// manager factory
		en.setDataSource(dataSource());// tuong tu method getConnection
		en.setPersistenceUnitName("persistence-data");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		en.setJpaVendorAdapter(vendorAdapter);
		en.setJpaProperties(additionalProperties());
		return en;
	}

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mvc");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}

	Properties additionalProperties() {

		Properties properties = new Properties();
		
		//properties.setProperty("hibernate.hbm2ddl.auto", "create");
		//properties.setProperty("hibernate.hbm2ddl.auto", "update");// tu dong dua theo entity ma generate ra table
		properties.setProperty("hibernate.hbm2ddl.auto", "none");
		 
		 properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
		return properties;
	}
}