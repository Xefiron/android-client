package com.podevs.android.pokemononline.pokeinfo;

public class TypeInfo {
	public enum Type {
		Normal, //0
		Fighting, //1
		Flying, //2
		Poison, //3
		Ground, //4
		Rock, //5
		Bug, //6
		Ghost, //7
		Steel, //8
		Fire, //9
		Water, //10
		Grass, //11
		Electric, //12
		Psychic, //13
		Ice, //14
		Dragon, //15
		Dark, //16
		Curse //17
	}
	
	public static String name(int num) {
		return Type.values()[num].toString();
	}
}
