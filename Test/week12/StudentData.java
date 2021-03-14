package Test.week12;

public class StudentData extends Student{
    public static void main(String[] args) {
        //student object include name, age, gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        System.out.println(std01.getName().equals(std02.getName()));
        System.out.println(std01.getName().equals(std03.getName()));
        System.out.println(std02.getName().equals(std04.getName()));
        System.out.println(std01.getName().equals(std04.getName()));

        System.out.println(std01.getAge().equals(std02.getAge()));
        System.out.println(std03.getAge().equals(std04.getAge()));
        System.out.println(std01.getAge().equals(std03.getAge()));

        System.out.println(std01.getGpa().equals(std03.getGpa()));
        System.out.println(std02.getGpa().equals(std04.getGpa()));
        System.out.println(std02.getGpa().equals(std03.getGpa()));

        
    }
}

    
