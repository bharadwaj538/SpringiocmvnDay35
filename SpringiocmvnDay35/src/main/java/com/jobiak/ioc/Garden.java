package com.jobiak.ioc;
import java.util.*;
public class Garden {
	ArrayList<String>fruits;
	ArrayList<String>flowers;
	HashSet<String>trees;
	HashMap<String,String>cityFruits;
	public Garden() {
		
	}
	public void setFruits(ArrayList<String> fruits) {
		System.out.println("set called...");
		this.fruits = fruits;
	}
	public Garden(ArrayList<String>flowers) { 
		this.flowers=flowers;
	}
	public void setTrees(HashSet<String>trees) {
		this.trees=trees;
	}
	public HashSet<String>getTrees(){
		return this.trees;
	}
	public void setCityFruits(HashMap<String,String>cityFruits) {
		this.cityFruits=cityFruits;
	}
	public HashMap<String,String>getCityFruits(){
		return this.cityFruits;
	}
	@Override
	public String toString() {
		return "Garden [fruits=" + fruits + ","+"\n"+" flowers=" + flowers + ","+"\n"+" trees=" + trees + ","+"\n"+" cityFruits=" + cityFruits
				+ "]";
	}
	
	
	
}
