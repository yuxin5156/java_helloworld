package com.yuwen.helloworld;

/**
 * @author Administrator
 *
 */
public enum TestEnum {
 Mon(1,"周一"),
 Tues(2,"周er")
	
	;
	private int value;
	private String desc;
	private TestEnum(int value,String desc) {
		this.value=value;
		this.desc=desc;
	}
	
	/**
	 * 获取值
	 * @return
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * 获取秒数
	 * @return
	 */
	public String getDesc() {
		return desc;
	}
	
	public static void main(String[] args)
	{
		System.out.println("name:"+TestEnum.Tues.name()+",ordinal:"+TestEnum.Tues.ordinal()+",value:"+TestEnum.Tues.getValue()+",desc:"+TestEnum.Tues.getDesc());
	}
	
	
	
}
