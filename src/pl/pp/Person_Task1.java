package pl.pp;

public class Person_Task1 {
    public String forename;
    public String surname;
    public int age;


    public Person_Task1() {

    }


    public Person_Task1(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    public void hiToAll(){
        System.out.println("My name is " + forename + " " + surname + ". " + "I am " + age + " years old.");
    }

    public int growOld(){
        age = age + 1;
        return age;
    }

    public String getName(){
        return forename;
    }

    public void setName(String nameToSet){
        forename = nameToSet;
    }
}