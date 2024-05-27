package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString 은 Object 클래스의 메서드 => Object 로 부터 상속 받아 쓰게 된다.
        String string = child.toString();
        System.out.println(string);
    }
}
