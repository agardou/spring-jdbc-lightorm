package com.agaetis.spring.jdbc.lightorm.dao;

/**
 * Created by <a href="https://github.com/rnicob">Nicolas Roux</a> - <a href="http://www.agaetis.fr">Agaetis</a>  on 12/03/2015.
 */
public class DaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException(Throwable t) {
		super(t);
	}

	public DaoException(String message, Throwable t) {
		super(message, t);
	}

	public DaoException(String message) {
		super(message);
	}
}
