package com.parag.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages="com.parag.springboot")

public class HikkariEntityManagerConfig {
    @Autowired
    private DataSource dataSource;

    @Bean(name = "entityManagerFactory")
    public EntityManagerFactory entityManagerFactory(){

        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean=new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter() );
        localContainerEntityManagerFactoryBean.setPackagesToScan("com/parag/springboot/entity");
        localContainerEntityManagerFactoryBean.setPersistenceUnitName("deafault");
        localContainerEntityManagerFactoryBean.afterPropertiesSet();
        return  localContainerEntityManagerFactoryBean.getObject();

    }


}

