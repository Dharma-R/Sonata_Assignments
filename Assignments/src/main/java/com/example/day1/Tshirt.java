package com.example.day1;


public class Tshirt {
String color;
String material;
String design;
public Tshirt() {
	
}

public static void main(String[] args) {
	Tshirt small = new Tshirt();
	small.color="red";
	small.material = "plastic";
	small.design="round-neck";
	
	Tshirt large = new Tshirt();
	large.color= "yellow";
	large.material = "woll";
	large.design="chinese-color";
	
	Tshirt xl = new Tshirt();
	xl.color="green";
	xl.material="cotton";
	xl.design="half-sleeve";
	
	
	System.out.println(small.color+ " "+small.design+ " " +small.material);
	System.out.println(large.color+ " "+large.design+ " " +large.material);
	System.out.println(xl.color+ " "+xl.design+ " " +xl.material);
}
}
