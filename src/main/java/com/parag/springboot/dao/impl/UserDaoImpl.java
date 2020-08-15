package com.parag.springboot.dao.impl;

import com.parag.springboot.dao.UserDao;
import com.parag.springboot.model.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Component
@ComponentScan(basePackages="com.parag.springboot")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List getUserdetails() {
         Criteria criteria= sessionFactory.openSession().createCriteria(UserDetails.class);
         return criteria.list();
//        CriteriaBuilder builder = sessionFactory.openSession().getCriteriaBuilder();
//
//       CriteriaQuery<UserDetails> criteria = builder.createQuery(UserDetails.class);
//        return criteria.getOrderList();
    }
}
