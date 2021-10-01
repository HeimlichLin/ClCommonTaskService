package idv.heimlich.BaseProject;

import org.slf4j.Logger;

import idv.heimlich.ClCommonTaskService.common.db.IDBSession;
import idv.heimlich.ClCommonTaskService.common.db.IDBSessionFactory;
import idv.heimlich.ClCommonTaskService.common.db.impl.DBSessionFactoryImpl;
import idv.heimlich.ClCommonTaskService.common.log.LogFactory;

public class Test {
	
	private static Logger LOGGER = LogFactory.getInstance();
	
	public static void main(String[] args) {
		LOGGER.debug("Test Start");
		IDBSessionFactory sessionFactory = new DBSessionFactoryImpl();
		IDBSession session = sessionFactory.getXdaoSession("");
		
	}

}
