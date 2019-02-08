package com.java21days;

class HalfLooper{
    public static void main(String[] arguments){
        int[] denver = {1_700_000,4_600_000,2_100-000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int [denver.length];
        int sum = 0;
        
        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;
        
        for (int i =0;i<denver.length;i++){
            total[i] = denver[i] + philadelphia[i];
            System.out.format((i + 2012) +" production:%,d%n",total[i]);
            sum += total[i];
        }
        
        
                System.out.format("Average production:%,d%n",(sum / denver.length));
            }
}