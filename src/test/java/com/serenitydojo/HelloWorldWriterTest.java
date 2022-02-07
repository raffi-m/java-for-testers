package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        long starsInTheGalaxy = 10000000000L;
        float weight = 15.5F;
        double weight1 = 20.5;
        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings(){
        String firstName = "Sarah-Jane";
//        String upperCaseFirstName = firstName.toUpperCase();
        String upperCaseFirstName = firstName.replace("Sarah","Mary");
        System.out.println(upperCaseFirstName);
    }

}
