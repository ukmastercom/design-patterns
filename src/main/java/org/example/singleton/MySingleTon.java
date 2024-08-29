package org.example.singleton;

public class MySingleTon {
    private static MySingleTon instance = null;

    private int value;

    private MySingleTon(){
        this.value = 5;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static MySingleTon getInstance(){
        if(instance==null){
            synchronized (MySingleTon.class) {
                if(instance==null) {
                    instance = new MySingleTon();
                }
            }
        }
        return instance;
    }


}
