public class Dog extends Animal{



    public Dog() {
        super("Mutt","big",50);
    }

    public Dog(String type, String size, double weight) { // 매개변수 생성자
        super(type,size,weight); // 조상의 생성자 호출 super()
    }

//    @Override
//    public void move() {
//        System.out.println("Mutt moves fast");
//    }
//
//    @Override
//    public void noise() {
//        System.out.println("Mutt makes noise");
//    }

}
