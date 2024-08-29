package org.example.singleton;

public class SingleTonMain {

    public static void main(String[] args){
        MySingleTon singleTon1 = MySingleTon.getInstance();
        System.out.println(singleTon1.getValue());
        singleTon1.setValue(10);
        MySingleTon singleTon2 = MySingleTon.getInstance();
        System.out.println(singleTon2.getValue());

        MySingleTon2 singleTon21 = MySingleTon2.INSTANCE;
        singleTon21.setValue(5);
        System.out.println(singleTon21.getValue());
        singleTon21.setValue(10);
        MySingleTon2 singleTon22 = MySingleTon2.INSTANCE;
        System.out.println(singleTon22.getValue());


    }
}
