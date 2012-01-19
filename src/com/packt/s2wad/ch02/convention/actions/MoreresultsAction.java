package com.packt.s2wad.ch02.convention.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
	@Result(name="nine", 
			location="/WEB-INF/jsps/tristate/tristate-nine.jsp")
})
public class MoreresultsAction extends ActionSupport
{
	private long ctm;
	public String execute()
	{
		ctm = System.currentTimeMillis();
		long tmp = ctm - ((ctm / 10L) * 10L);
		if (tmp <= 3) return "three";
		if (tmp <= 6) return "six";
		return "nine";
	}
	public long getCtm() { return ctm; }
	
	@Action(value = "/tristate", 
			results = { 
				@Result (name="three", 
						location="/WEB-INF/jsps/tristate/tristate-three.jsp"), 
				@Result (name="six", 
						location="/WEB-INF/jsps/tristate/tristate-six.jsp")
			})
	public String tristate()
	{
		ctm = System.currentTimeMillis();
		long tmp = ctm - ((ctm / 10L) * 10L);
		if (tmp <= 3) return "three";
		if (tmp <= 6) return "six";
		return "nine";
	}
}
