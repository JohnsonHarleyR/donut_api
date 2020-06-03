package co.grandcircus.donut.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donut.model.Result;
import co.grandcircus.donut.model.ResultResponse;

@Service
public class ResultsService {
	
	private RestTemplate rest = new RestTemplate();
	
	
	public List<Result> getResults() {
		
		//Specify url
		String url="https://grandcircusco.github.io/demo-apis/donuts.json";
			
		//Call the API, specify the return type to match ENTIRE JSon
		ResultResponse response = rest.getForObject(url, ResultResponse.class);
		
		//Pick a part of JSON to return
		return response.getResults();
			
	}

}
