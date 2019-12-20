package cis;

public class Main {
    public static void main(String[] arg){
        //create student object
        Student firo = new Student();
        Student orif = new Student();
        Student duck = new Student();

        //input data object
        firo.name ="X firo";
        firo.id ="001";
        firo.major ="CIS";
        orif.name ="orif";
        orif.id ="002";
        orif.major ="CIS";
        duck.name ="duck kub kub";
        duck.id ="003";
        duck.major ="ASE";


        //get data from object
        System.out.println("1.  "+firo.name + " "+firo.major);
        System.out.println("2.  "+orif.name + " "+orif.major);

        //add student to array
        Student[] oopStudent = {firo, orif};

        System.out.println("1.  "+oopStudent[0].name);
        System.out.println("2.  "+oopStudent[1].name);


        find_cis_Student(oopStudent);
    }
    //To find cis Student
    public static  void find_cis_Student(Student[] students){
        for (int i =0;i <students.length; i++){
            System.out.println(i+1 + ". "+students[i].name);
        }
    }
}
