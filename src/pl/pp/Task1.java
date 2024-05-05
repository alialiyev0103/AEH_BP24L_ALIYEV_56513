package pl.pp;

public class Task1 {
    public static void main(String[] args) {
        Person_Task1 person1 = new Person_Task1();
        person1.hiToAll();

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.hiToAll();


        Person_Task1 person2 = new Person_Task1("Alice", "Hart", 42);
        person2.hiToAll();

        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }
        person1.hiToAll();
        person2.hiToAll();


        System.out.println(person1.getName()); // read forename from the object using a method (see - Person class code)
        person1.setName("Lolo"); // change the forename field in the object person1
        System.out.println(person1.getName()); // check if the forename in the object person1 has changed
        person1.hiToAll();
    }
}