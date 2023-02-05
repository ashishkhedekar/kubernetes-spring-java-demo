package co.ak.kubernetes.spring.java.propertywatch.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RightMovePagination {

	@JsonProperty("total")
	private int total;
	@JsonProperty("first")
	private String first;
	@JsonProperty("last")
	private String last;
	@JsonProperty("next")
	private String next;
	@JsonProperty("page")
	private String page;

	@JsonProperty("total")
	public int getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(int total) {
		this.total = total;
	}

	@JsonProperty("first")
	public String getFirst() {
		return first;
	}

	@JsonProperty("properties")
	public void setFirst(String first) {
		this.first = first;
	}

	@JsonProperty("last")
	public String getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(String last) {
		this.last = last;
	}

	@JsonProperty("next")
	public String getNext() {
		return next;
	}

	@JsonProperty("next")
	public void setNext(String next) {
		this.next = next;
	}

	@JsonProperty("page")
	public String getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(String page) {
		this.page = page;
	}
}
