package gdh.api.sample.vo;

import org.apache.ibatis.javassist.tools.rmi.Sample;

public class SampleVo {
	private String id;
	private String name;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public SampleVo(){

	}

	public SampleVo(String id, String name){
		this.id = id;
		this.name = name;
	}
}
