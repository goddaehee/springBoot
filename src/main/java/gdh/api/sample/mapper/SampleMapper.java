package gdh.api.sample.mapper;

import gdh.api.sample.vo.SampleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {
	List<SampleVo> selectSample();
}
