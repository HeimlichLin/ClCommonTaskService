package idv.heimlich.ClCommonTaskService.common.db.impl;

import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;

import idv.heimlich.ClCommonTaskService.common.db.DBSessionManager;
import idv.heimlich.ClCommonTaskService.common.db.IDBSession;
import idv.heimlich.ClCommonTaskService.common.db.IDBSessionFactory;
import idv.heimlich.ClCommonTaskService.common.db.code.DBConfig;
import idv.heimlich.ClCommonTaskService.common.log.LogFactory;

public class DBSessionFactoryImpl implements IDBSessionFactory {
	
	private static Logger LOGGER = LogFactory.getInstance();

	@Override
	public IDBSession getXdaoSession(String conn) {
		final String connid = StringUtils.defaultIfEmpty(conn, DBSessionManager.PROP_DEFAULT_CONN_ID);
		Objects.requireNonNull(connid, "無此定義coonid" + conn);
		DBConfig dbConfig = DBConfig.valueOf(connid);
//		LOGGER.debug("use connid:" + connid);
		return dbConfig.getXdaoSession();
	}

}
