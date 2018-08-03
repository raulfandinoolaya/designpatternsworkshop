package model;

public abstract class Endavan {

    RegisterOracleTimeBehavior registerOracleTimeBehavior;

    public String performRegisterTimesinOracle()
    {
        return registerOracleTimeBehavior.registerTimeInOracle();
    }

    public String introduceItself(){
        return ("Hi! I'm new in the company, nice to meet you");
    };

    public abstract String work();
}
