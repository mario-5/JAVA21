package com.java21days;

class Printer{
    int x =0;
    int y =1;
    
    void printMe(){
        System.out.println("x is "+x+",y is "+y);
        System.out.println("i am an instance of the class "+
                this.getClass().getName());
    }
}

class SubPrinter extends Printer{
    int z=3;

public static void main(String[] arguments){
    SubPrinter obj =new SubPrinter();
    obj.printMe();
}
}