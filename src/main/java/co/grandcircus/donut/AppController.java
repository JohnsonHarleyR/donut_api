package co.grandcircus.donut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.donut.model.DonutResponse;
import co.grandcircus.donut.model.Result;
import co.grandcircus.donut.service.DonutsService;
import co.grandcircus.donut.service.ResultsService;



@Controller
public class AppController {
	
	@Autowired
	private ResultsService resultsService;
	@Autowired
	private DonutsService donutsService;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		//Get a list of donuts
		List<Result> results = resultsService.getResults();
		
		model.addAttribute("results", results);
		
		return "index";
	}
	
	@RequestMapping("/donut/{id}")
	public String detailPage(
			@PathVariable(value = "id") long id,
			Model model) {
		
		DonutResponse donut = donutsService.getDonut(id);
		
		model.addAttribute("donut", donut);
		
		return "details";
		
	}

}
