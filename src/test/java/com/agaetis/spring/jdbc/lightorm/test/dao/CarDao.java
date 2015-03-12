package com.agaetis.spring.jdbc.lightorm.test.dao;

import com.agaetis.spring.jdbc.lightorm.dao.AbstractAnnotatedBeanDao;
import com.agaetis.spring.jdbc.lightorm.test.model.Car;
import org.springframework.stereotype.Repository;

/**
 * Created by <a href="https://github.com/rnicob">Nicolas Roux</a> - <a href="http://www.agaetis.fr">Agaetis</a>  on 12/03/2015.
 */
@Repository
public class CarDao extends AbstractAnnotatedBeanDao<Car> {

    @Override
    public Class<Car> getTableClass() {
        return Car.class;
    }
}
