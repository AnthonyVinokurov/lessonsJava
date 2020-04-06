package interfaces;

public class Animal implements Info {
    public int id;
    public void sleep(){
        System.out.println("I am slepping");
    }

    public Animal (int id){
        this.id = id;
    }

    public void showInfo(){
        System.out.println("Id is " + this.id);
    }
}
