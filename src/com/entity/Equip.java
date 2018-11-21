package com.entity;

public class Equip {
	private String name;//装备名称
	private String type;//装备类型
	private long speedPlus;//装备增效
	private long attackPlus;//攻击增效
	private long defenceplus;//防御增效
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getSpeedPlus() {
		return speedPlus;
	}
	public void setSpeedPlus(long speedPlus) {
		this.speedPlus = speedPlus;
	}
	public long getAttackPlus() {
		return attackPlus;
	}
	public void setAttackPlus(long attackPlus) {
		this.attackPlus = attackPlus;
	}
	public long getDefenceplus() {
		return defenceplus;
	}
	public void setDefenceplus(long defenceplus) {
		this.defenceplus = defenceplus;
	}
	
}
