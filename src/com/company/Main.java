package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mill m=new Mill();
        Grain g=m.process();
        System.out.println(g);
        m=new WheatMill();
        g=m.process();
        System.out.println(g);
    }
}
