package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj) {
        // obj.sound(); // 컴파일 오류 Object 는 sound() 기능이 없다.
        // obj.move(); // 컴파일 오류 , Object sms move() 가 없다.

        // 객체에 맞는 다운캐스팅 으로 호출 가능
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
