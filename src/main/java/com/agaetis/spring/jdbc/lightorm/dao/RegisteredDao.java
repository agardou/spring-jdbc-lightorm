package com.agaetis.spring.jdbc.lightorm.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by <a href="https://github.com/rnicob">Nicolas Roux</a> - <a href="http://www.agaetis.fr">Agaetis</a>  on 12/03/2015.
 */
public class RegisteredDao {

	private static RegisteredDao REGITERED_DAO;

	private Map<Class<?>, AbstractAnnotatedBeanDao<?>> daoMap = new HashMap<Class<?>, AbstractAnnotatedBeanDao<?>>();

	private static RegisteredDao getRegisteredDao() {
		if (REGITERED_DAO == null)
			REGITERED_DAO = new RegisteredDao();
		return REGITERED_DAO;
	}

	public static void registerDao(AbstractAnnotatedBeanDao<?> dao) {
		getRegisteredDao().daoMap.put(dao.getTableClass(), dao);
	}

	public static AbstractAnnotatedBeanDao<?> getDao(Class<?> clazz) {
		return getRegisteredDao().daoMap.get(clazz);
	}
}
