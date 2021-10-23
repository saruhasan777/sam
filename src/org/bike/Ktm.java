package org.bike;

public class Ktm implements Bike {
@Override
public void cost() {
System.out.println("100000");	
}

@Override
public void speed() {
System.out.println("150km");
}public Ktm() {
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
Ktm k = new Ktm();
k.speed();
k.cost();
}

}
