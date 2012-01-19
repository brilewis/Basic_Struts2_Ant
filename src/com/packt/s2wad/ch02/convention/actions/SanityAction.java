package com.packt.s2wad.ch02.convention.actions;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class SanityAction extends ActionSupport
{
	Logger log = Logger.getLogger(SanityAction.class);
	
	public String execute()
	{
		log.debug("****** Hello from SanityAction!");
		return SUCCESS;
	}
}
