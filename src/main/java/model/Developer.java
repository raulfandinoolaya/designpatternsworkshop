package model;

public class Developer extends Endavan {

    private String mainLanguageProgramming;
    private Boolean tddExperience;

    public Developer(){

        registerOracleTimeBehavior = new RegisterOracleTime();
    }

    @Override
    public String work() {
        return "I'm coding";
    }
}
