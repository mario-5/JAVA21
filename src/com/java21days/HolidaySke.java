package com.java21days;

import java.util.*;

public class HolidaySke{
BitSet sked;

public HolidaySke(){
    sked = new BitSet(365);
    int[] holiday = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
    for(int i=0;i<holiday.length;i++){
        addHoliday(holiday[i]);
    }
}

public void addHoliday(int dayToAdd){
    sked.set(dayToAdd);
}

public boolean isHoliday(int dayToCheck){
    boolean result = sked.get(dayToCheck);
    return result;
} 

public static void main(String[] arguments){
    HolidaySke cal = new HolidaySke();
    
    if (arguments.length>0){
        try {
            int whichDay = Integer.parseInt (arguments[0]);
            if (cal.isHoliday(whichDay)) {System.out.println("The day "+ 
                    whichDay + "is a holiday");
                    } else {System.out.println("The day "+ 
                    whichDay + "is not a holiday");}
                
            } catch (NumberFormatException nfe){System.out.println("Error: "+
                    nfe.getMessage());
        
    }
    }
    
}
}