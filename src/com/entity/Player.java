package com.entity;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;

public class Player {	//���
	private String name = null;
	public void setName(String name) {
		this.name = name;
	}
	private Equip armet;//ͷ��
	private Equip loricae;//����
	private Equip boot;//Ь��
	private Equip ring;//ָ��
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
		System.out.println(this.name+"װ������"+this.armet.getType()+":����"+this.armet.getName()+"�ٶ���Ч"+this.armet.getSpeedPlus()
				+"������Ч"+this.armet.getAttackPlus()+"������Ч"+this.armet.getSpeedPlus());
	}
	public void print1(){
		System.out.println(this.name+"װ������"+this.loricae.getType()+":����"+this.loricae.getName()+"�ٶ���Ч"+this.loricae.getSpeedPlus()
				+"������Ч"+this.loricae.getAttackPlus()+"������Ч"+this.loricae.getSpeedPlus());
	}
	public void print2(){
		System.out.println(this.name+"װ������"+this.boot.getType()+":����"+this.boot.getName()+"�ٶ���Ч"+this.boot.getSpeedPlus()
				+"������Ч"+this.boot.getAttackPlus()+"������Ч"+this.boot.getSpeedPlus());
	}
	public void print3(){
		System.out.println(this.name+"װ������"+this.ring.getType()+":����"+this.ring.getName()+"�ٶ���Ч"+this.ring.getSpeedPlus()
				+"������Ч"+this.ring.getAttackPlus()+"������Ч"+this.ring.getSpeedPlus());
	}
	public void ring() {
		System.out.println(this.ring.getName()+"[�ٶ���Ч:"+this.ring.getSpeedPlus()
		+"������Ч:"+this.ring.getAttackPlus()+"������Ч:"+this.ring.getSpeedPlus()+"]");
	}
	public void updateEqiup(Equip equip) {
		if("ָ��".equals(equip.getType())) {
			System.out.println(ring.getName()+"����Ϊ��ɫ�λ�"+equip.getName());
			equip=ring;
			equip.setAttackPlus(equip.getSpeedPlus()+6);
			equip.setDefenceplus(equip.getDefenceplus()+4);
		}
		System.out.println(equip.getAttackPlus()+"ssss"+equip.getDefenceplus());
	}

	public void before(JoinPoint js) {
		System.out.println(js.getTarget()+"���ж�"+js.getSignature()+"�ķ���");
	}
}
