package com.yuwen.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 枚举处理器https://www.cnblogs.com/draem0507/p/4110987.html
 * 
 * @author yxf
 * 
 */
public class EnumUtils {
	

	public EnumUtils() {

		
	}
	/**
	 * 初始化配置信息
	 */
	protected EnumConfig InitConfig()
	{
		EnumConfig config=new EnumConfig();
		return config;
	}
	
	/**
	 * 获取包下所有类
	 */
	public static List<String> getClasses(String packageName)
	{
		//获取包绝对路径
		String packageAbsPath=ClassLoader.getSystemResource("").getPath()+packageName.replace('.', '\\');
		//获取包下所有类
		List<String> classes=new ArrayList<String>();
		File file=new File(packageAbsPath);
		
		File[] listFiles = file.listFiles();
		for (File childFile : listFiles) {
			if(!childFile.isDirectory())
			{
				
			}
		}
		
		return null;
	}
	
	public static void main(String[] args)
	{
		System.out.println(ClassLoader.getSystemResource("").getPath());
	}
	
	
	

}

/**
 * 枚举配置
 * 
 * @author Administrator
 *
 */
class EnumConfig {
	/**
	 * 包全名称
	 */
	private String packageName;
	/**
	 * 枚举接口类全路径
	 */
	private String ienumName;

	/**
	 * 获取值的方法名
	 */
	private String getValueMethod;

	/**
	 * 获取描述的方法名
	 */
	private String getDescriptionMethod;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getIenumName() {
		return ienumName;
	}

	public void setIenumName(String ienumName) {
		this.ienumName = ienumName;
	}

	public String getGetValueMethod() {
		return getValueMethod;
	}

	public void setGetValueMethod(String getValueMethod) {
		this.getValueMethod = getValueMethod;
	}

	public String getGetDescriptionMethod() {
		return getDescriptionMethod;
	}

	public void setGetDescriptionMethod(String getDescriptionMethod) {
		this.getDescriptionMethod = getDescriptionMethod;
	}

}