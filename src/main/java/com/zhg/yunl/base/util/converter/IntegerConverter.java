package com.zhg.yunl.base.util.converter;

import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

/**
 * 自定义SpringMvc日期转化器
 * @author zhou
 */
public class IntegerConverter implements Converter<String, Integer> {

	@Override    
	public Integer convert(String source) 
	{
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    try 
	    {
	    	if(null != source && !"".equals(source)) {
	    		return Integer.parseInt(source);
	    	}
	    } 
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	    return 0;
	}
	
}
