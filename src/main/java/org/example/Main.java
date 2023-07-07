package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("Python");

        List<String> frameworkList = new ArrayList<>();
        frameworkList.add("Spring");
        frameworkList.add("Django");

        List<String> databaseList = new ArrayList<>();
        databaseList.add("MySQL");
        databaseList.add("MongoDB");

        List<String> blockchainList = new ArrayList<>();
        blockchainList.add("Ethereum");
        blockchainList.add("Bitcoin");

        Skills skills = new Skills(languageList, frameworkList, databaseList, blockchainList);

        Person person = new Person("Leandro", "Lean",
                20, "Argentina", "Programacion", "Leandro", "Lean", skills);

        //System.out.println(person.toString());
        //System.out.println(skills.toString());

        System.out.println("Skills:...................................");

        System.out.println();

        System.out.println(skills.getLanguage());
        System.out.println(skills.getFramework());
        System.out.println(skills.getDataBase());
        System.out.println(skills.getBlockchains());


        System.out.println();

        System.out.println("Person:...................................");

        System.out.println();

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getCountry());
        System.out.println(person.getInterest());
        System.out.println(person.getLinkedin());
        System.out.println(person.getGitHub());
        System.out.println(person.getSkills());





    }
}
