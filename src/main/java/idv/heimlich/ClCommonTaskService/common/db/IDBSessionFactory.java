package idv.heimlich.ClCommonTaskService.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}
