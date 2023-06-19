package gdh.api.sample.service;

import gdh.api.sample.mapper.SampleMapper;
import gdh.api.sample.vo.SampleVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {
	private final SampleMapper sampleMapper;

	public List<SampleVo> selectSample() {
		return sampleMapper.selectSample();
	}
}
