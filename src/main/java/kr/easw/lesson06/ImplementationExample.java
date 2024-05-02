package kr.easw.lesson06;

/**
 * �ش� Ŭ������ �������̽��� ���� ���� �� ģ�������� ���� ������ �����Դϴ�.
 *
 * Dog Ŭ������ �����Ͽ�, Cat�� Horse Ŭ������ Animal �������̽��� �����ϵ��� ��������.
 * �ش� ������ �ǵ������� ������ �߻��ϵ��� �����Ǿ�����, Animal�� �������� ���� Ŭ������ ������ �߻��մϴ�.
 */
public class ImplementationExample {

    public static void main(String[] args) {
        new Dog().speak();
        new Cat().speak();
        new Horse().speak();
    }

    // �������̽��� Ŭ������ ���赵�� ����� �����Դϴ�.
    // �޼��带 ������ �� ������ ������ ���� �������� �����ʹ� ���� �� �����ϴ�.
    // ����, ���赵�� ����� �����̱⿡ ��ü�� �ִ� �ν��Ͻ��� ������ �� �����ϴ�.
    // �ڹ� 7������ �������̽����� ��ü(body)�� �ִ� �޼��带 ����� �� ��������, �ڹ� 8���ʹ� default Ű���带 ����Ͽ� ��ü�� �ִ� �޼��带 ����� �� �ֽ��ϴ�.
    // �̹� ���������� default Ű���带 �ǽ����� �ʽ��ϴ�.
    interface Animal {
        // ��ü(body)�� ���� ����� �������̽��� �޼���� �� �������̽��� ����� Ŭ������ �� �޼����� ������ �����մϴ�.
        void speak();
    }

    // �� Ŭ������ final�� ���������ν� Dog Ŭ�������� �߰������� �Ļ��Ǵ� Ŭ������ �������� ���ϵ��� �����մϴ�.
    // final�� ����� Ŭ������ ����� �� �����ϴ�.
    final static class Dog implements Animal {
        private void bark() {
            System.out.println("Bark!");
        }

        // �θ� Ŭ�������� �������̵�(Overriding)�� Ŭ������ @Override ������̼��� ���� �������̵��� �޼������� ����� �� �ֽ��ϴ�.
        // ������̼��� �����Ϸ����� Ư���� ������ �����ϴ� ������ �մϴ�. @Override�� ���, �ش� �޼��尡 �������̵��� �޼������� ����մϴ�.
        // ����, �� ������̼��� ��� ����� �ƴ� �޼��忡 ���ȴٸ� �����Ϸ��� ������ �߻���ŵ�ϴ�.
        @Override
        public void speak() {
            bark();
        }
    }


    static class Cat implements Animal{
        private void meow() {
            System.out.println("Meow!");
        }

        public void speak() {
            meow();
        }
    }

    static class Horse implements Animal{
        private void neigh() {
            System.out.println("Neigh!"); }

        public void speak() {
            neigh();
        }
    }
}
