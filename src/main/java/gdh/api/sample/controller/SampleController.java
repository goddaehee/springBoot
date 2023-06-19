package gdh.api.sample.controller;

import gdh.api.sample.service.SampleService;
import gdh.api.sample.vo.SampleVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/sample")
public class SampleController {

	private final SampleService sampleService;

	@GetMapping("/sampleJsp")
	public String sampleJsp(Model model) throws Exception {

		List<SampleVo> sampleList = sampleService.selectSample();
		model.addAttribute("list", sampleList);

		return "sample";
	}

	@GetMapping("/sampleThymeleaf")
	public String sampleThymeleaf(Model model) throws Exception {

		SampleVo sampleModel = new SampleVo("goddaehee", "갓대희");
		model.addAttribute("sampleModel", sampleModel);

		return "thymeleaf/sampleThymeleaf";
	}
}