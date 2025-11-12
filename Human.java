class Human {

    public static void main(String[] args) {

        InnerHuman obj = new InnerHuman();
        obj.setAge(19);
        System.out.println("hello"+obj.getAge());

    }
    
}


class InnerHuman {

    private int age =30;
    private String name="John";

    public int getAge() {
        return age;
    }
    public void setAge(int age1) {
        this.age = age1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name2) {
        name = name2;
    }

    
}