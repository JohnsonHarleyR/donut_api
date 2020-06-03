package co.grandcircus.donut.model;

import java.util.List;

public class ResultResponse {
	
	private Long count;
	private List<Result> results;
	/**
	 * @return the count
	 */
	public Long getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	/**
	 * @return the results
	 */
	public List<Result> getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(List<Result> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "ResultResponse [count=" + count + ", results=" + results + "]";
	}

}