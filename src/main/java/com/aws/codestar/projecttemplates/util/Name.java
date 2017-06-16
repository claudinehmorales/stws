package com.aws.codestar.projecttemplates.util;

public class Name {
	
	private String ln;
	private String fn;
	private String mn;

	public Name(String ln, String fn, String mn) {
		
		this.ln = ln;
		this.fn = fn;
		this.mn = mn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}
	
	public String getFn() {
		return this.fn;
	}
	
	public void setLn(String ln) {
		this.ln = ln;
	}
	
	public String getLn() {
		return this.ln;
	}
	
	public void setMn(String mn) {
		this.mn = mn;
	}
	
	public String getMn() {
		return this.mn;
	}
	
	public String toString() {
		String ln = this.getLn();
		String fn = this.getFn();
		String mn = this.getMn();
		return String.format("%s, %s %s", ln, fn, mn);
	}
}
