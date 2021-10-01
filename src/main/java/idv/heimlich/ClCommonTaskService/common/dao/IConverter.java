package idv.heimlich.ClCommonTaskService.common.dao;


public interface IConverter<Po> {

	Po convert(RowMap paramDataObject);
	
	RowMap toRowMap(Po po);

}
