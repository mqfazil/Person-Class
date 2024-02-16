public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student("Murid","Quorishi", new myDOB(8,2,2004));
       System.out.println(s2.toString());

       Faculty f1 = new Faculty("Murid", "Quorishi", new myDOB(8, 2, 2004), new myDOB(21, 8, 2024), "MQ123");
       System.out.println(f1.toString());

       Admin a1 = new Admin("Murid", "Quorishi", new myDOB(8, 2, 2004), new myDOB(15, 9, 2020), "MQ321");
       System.out.println(a1.toString());
    }
}