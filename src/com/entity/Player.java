package com.entity;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;

public class Player {	//玩家
	private String name = null;
	public void setName(String name) {
		this.name = name;
	}
	private Equip armet;//头盔
	private Equip loricae;//铠甲
	private Equip boot;//鞋子
	private Equip ring;//指环
	public void setArmet(Equip armet) {
		this.armet = armet;
	}
	public void setLoricae(Equip loricae) {
		this.loricae = loricae;
	}
	public void setBoot(Equip boot) {
		this.boot = boot;
	}
	public void setRing(Equip ring) {
		this.ring = ring;
	}
	public void print(){
		System.out.println(this.name+"装备类型"+this.armet.getType()+":名称"+this.armet.getName()+"速度增效"+this.armet.getSpeedPlus()
				+"攻击增效"+this.armet.getAttackPlus()+"防御增效"+this.armet.getSpeedPlus());
	}
	public void print1(){
		System.out.println(this.name+"装备类型"+this.loricae.getType()+":名称"+this.loricae.getName()+"速度增效"+this.loricae.getSpeedPlus()
				+"攻击增效"+this.loricae.getAttackPlus()+"防御增效"+this.loricae.getSpeedPlus());
	}
	public void print2(){
		System.out.println(this.name+"装备类型"+this.boot.getType()+":名称"+this.boot.getName()+"速度增效"+this.boot.getSpeedPlus()
				+"攻击增效"+this.boot.getAttackPlus()+"防御增效"+this.boot.getSpeedPlus());
	}
	public void print3(){
		System.out.println(this.name+"装备类型"+this.ring.getType()+":名称"+this.ring.getName()+"速度增效"+this.ring.getSpeedPlus()
				+"攻击增效"+this.ring.getAttackPlus()+"防御增效"+this.ring.getSpeedPlus());
	}
	public void ring() {
		System.out.println(this.ring.getName()+"[速度增效:"+this.ring.getSpeedPlus()
		+"攻击增效:"+this.ring.getAttackPlus()+"防御增效:"+this.ring.getSpeedPlus()+"]");
	}
	public void updateEqiup(Equip equip) {
		if("指环".equals(equip.getType())) {
			System.out.println(ring.getName()+"升级为紫色梦幻"+equip.getName());
			equip=ring;
			equip.setAttackPlus(equip.getSpeedPlus()+6);
			equip.setDefenceplus(equip.getDefenceplus()+4);
		}
		System.out.println(equip.getAttackPlus()+"ssss"+equip.getDefenceplus());
	}

	public void before(JoinPoint js) {
		System.out.println(js.getTarget()+"先判断"+js.getSignature()+"的方法");
	}
}
