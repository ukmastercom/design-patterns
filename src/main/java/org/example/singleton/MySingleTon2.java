package org.example.singleton;

public enum MySingleTon2 {
    INSTANCE;
    int value;
    private MySingleTon2(){}

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
