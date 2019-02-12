package com.java21days;

public class InstanceCounter {
    private static int numInstances = 0;
    
    protected static int getCount(){
        return numInstances;
    }
    
    private static void addInstance(){
        numInstances++;
    }
    
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    
    public static void main(String[] arguments){
        System.out.println("Starting with "+
                InstanceCounter.getCount()+ " objects");
        for(int i=0;i<500;i++){
            new InstanceCounter();
        }
        System.out.println("Created "+ InstanceCounter.getCount()+ " objects");
    }
}