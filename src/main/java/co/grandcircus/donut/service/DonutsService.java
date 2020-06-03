package co.grandcircus.donut.service;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donut.model.DonutResponse;



@Service
public class DonutsService {
	
	private RestTemplate rest = new RestTemplate();

	public DonutResponse getDonut(Long id) {
	
		String url="https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
	
		DonutResponse response = rest.getForObject(url, DonutResponse.class, id);
	
		return response;
	
	
	
	}
	
	
	
}