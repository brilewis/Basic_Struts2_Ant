package com.packt.s2wad.ch03.i18n;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class TextExampleAction extends ActionSupport
{
	private static Logger log = Logger.getLogger(TextExampleAction.class);
	public String execute() throws Exception
	{
		log.debug(getText("from.class.props"));
		return SUCCESS;
	}
}
