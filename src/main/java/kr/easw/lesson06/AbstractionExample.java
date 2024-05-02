package kr.easw.lesson06;

/**
 * �ش� Ŭ������ �߻� Ŭ������ ���� ���� �� ģ�������� ���� ������ �����Դϴ�.
 *
 * Vehicle Ŭ������ �����Ͽ�, Car, Bicycle, Motorcycle Ŭ������ �����ϵ��� ��������.
 * �ش� ������ �ǵ������� ������ �߻��ϵ��� �����Ǿ�����, Vehicle�� ������� ���� Ŭ������ ������ �߻��մϴ�.
 */
public class AbstractionExample {

    public static void main(String[] args) {
        new Car("Car").run();
        new Bicycle("Bicycle").run();
        new Motorcycle("Motorcycle").run();
    }

    // �߻� Ŭ������ �������̽��� ����� ����������, �������̽��� �޸� ������ ���� �� �ֽ��ϴ�.
    // ����, �������̽��� �޸� ��ü(body)�� �ִ� �޼��带 ���� �� �ֽ��ϴ�. (�̴� �ڹ� 8���� ��ȭ�Ǿ� �������̽��� default Ű���带 ����Ͽ� ��ü�� �ִ� �޼��带 ���� �� �ֽ��ϴ�.)
    // �߻� Ŭ������ �Ϲ� Ŭ������ ���� ������, �߻� �޼���(abstract)�� ������ �� �ִ°Ͱ� �ν��Ͻ��� ������ �� ���� ���� �ٸ��ϴ�.
    //
    // abstract�� �ش� �޼��尡 ��ü(body)�� ���� �޼������� ����մϴ�. �̷��� �޼���� �ش� Ŭ������ ����� Ŭ�������� �ݵ�� �����ؾ� �մϴ�.
    // ���� ��ӹ޴� Ŭ������ �߻� Ŭ������ ���, �ش� Ŭ������ �߻� �޼��带 �����Կ� �������� �ʽ��ϴ�.
    abstract static class Vehicle {
        private final String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void run();
    }

    static class Car extends Vehicle {
        public Car(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Car is running!");
        }
    }


    static class Bicycle extends Vehicle {
        public Bicycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Bicycle is running!");
        }

    }

    static class Motorcycle extends Vehicle {
        public Motorcycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Motorcycle is running!");
        }

    }
}
