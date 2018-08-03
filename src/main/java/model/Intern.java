package model;

public class Intern extends Endavan{

    public Intern(){
        registerOracleTimeBehavior = new NoRegisterOracleTimes();
    }

    public String work(){
        return "I'm learning";
    }
}
