class MarsRobot {
    String status;
    int speed;
    float temperature;
    String oportvar;
    String destino;
    int años;
    
    void checkTemperature(){
        if (temperature <-80){
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes(){
        System.out.println("status:"+ status);
        System.out.println("Speed:" + speed);
        System.out.println("Temperature:" + temperature);
    }
    void opportunity(){
        oportvar = "Poder acceder";
        destino = "la Luna";
        años= 5;
              
        System.out.println("La Oportunidad: "+ oportvar);
        System.out.println("Destino: "+ destino);
        System.out.println("En los Proximos: "+ años);
    }
    }