public class MyFamily {
    String member;
    String name;
    int age;


    public MyFamily(String member){
        this.member = member;
    }

    void printDataMyFamily(){
        System.out.println("Relative: " + member + " Name: " + name + " Age: " + age);
    }

}
