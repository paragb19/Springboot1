package com.parag.springboot.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

@Configuration
@ComponentScan(basePackages="com.parag.springboot")
@EnableJpaRepositories(basePackages = "com.parag.springboot.repository")
@EnableTransactionManagement
public class HikkariSessionFactoryConfig {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    @Primary
    public SessionFactory getSessionFactory(){
        if (entityManagerFactory.unwrap(SessionFactory.class)==null){
            throw new NullPointerException("Factory is not hibernet Factory");
        }
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Bean
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                entityManagerFactory);
        return transactionManager;
    }
}
