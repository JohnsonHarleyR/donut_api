package co.grandcircus.donut.model;
public class Result {
	
	private Long id;
	private String ref;
	private String name;
	
	/**
	 * @return the id
	 */
	
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Result [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}

}