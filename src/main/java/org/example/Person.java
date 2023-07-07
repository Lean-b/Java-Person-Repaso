package org.example;



public class Person {

    //Atributos de la clase
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String interest;
    private String linkedin;
    private String gitHub;

    private Skills skills;




    //Constructor metodo para crear el objecto,tambien se puede crear sin parametros
    public Person(String firstName, String lastName, int age, String country, String interest, String linkedin, String gitHub, Skills skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.interest = interest;
        this.linkedin = linkedin;
        this.gitHub = gitHub;
        this.skills = skills;
    }

    //Getter y Setter,es para obtener y modificar los datos de la clase
    public void setFirstName(String firstName) {this.firstName = firstName; }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }


    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}
