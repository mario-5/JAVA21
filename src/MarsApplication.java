class MarsApplication {
    public static void main(String[] arguments){
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature =-60;
        
        spirit.showAttributes();
        System.out.println("Increasing speed to 3");
        spirit.speed =3;
        spirit.showAttributes();
        System.out.println ("Changing the temperature.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        spirit.temperature = -75;
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        System.out.println("Proximos Pasos");
        spirit.opportunity();
}
}
