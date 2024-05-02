package kr.easw.lesson06;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * �ش� Ŭ������ ���� ǥ���Ŀ� ���� ���� �� ģ�������� ���� ������ �����Դϴ�.
 * <p>
 * �̸� ����� ���� ǥ������ ����Ͽ�, ������ �־��� �޼���� ������ ����� �����ϴ� �ڵ带 �ۼ��غ�����.
 */
public class LambdaExample {
    // �� ������ ����̱⿡ �빮�ڷ� �����մϴ�.
    private static final Random RANDOM = new Random();

    // �ǽ��� ���� ���ڵ��Դϴ�.
    private static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Supplier�� ���ʸ����� ���Ե� Ÿ���� ��ȯ�ϴ� �Լ��� �������̽��Դϴ�.
    // �̴� ������ ���� �ڵ带 ����� �����Դϴ� :
    // public int supplyNumber() {
    //    return numbers[RANDOM.nextInt(numbers.length)];
    // }
    private static final Supplier<Integer> numberSupplier = () -> numbers[RANDOM.nextInt(numbers.length)];

    // Function�� ���ʸ����� ���Ե� Ÿ���� �޾� ���ʸ����� ���Ե� Ÿ���� ��ȯ�ϴ� �Լ��� �������̽��Դϴ�.
    // �� ���� ���ʸ����� <Integer, Integer>�̱⿡ Integer�� �޾� Integer�� ��ȯ�մϴ�.
    // �ش� ���� ǥ������ ������ ���� �ڵ带 ����� �����Դϴ� :
    // public int convertToNegative(int number) {
    //    return -number;
    // }
    private static final Function<Integer, Integer> negativeConverter = (number) -> -number;

    // Consumer�� ���ʸ����� ���Ե� Ÿ���� �޾� �ƹ��͵� ��ȯ���� �ʴ� �Լ��� �������̽��Դϴ�.
    // �� ���� ���ʸ����� <Integer>�̱⿡ Integer�� �޽��ϴ�.
    // �ش� ���� ǥ������ ������ ���� �ڵ带 ����� �����Դϴ� :
    // public void printNumber(int number) {
    //    System.out.println(number);
    // }
    @SuppressWarnings({"Convert2MethodRef", "RedundantSuppression"})
    private static final Consumer<Integer> printer = (number) -> {
        System.out.println(number);
    };

    // BiFunction�� ���ʸ����� ���Ե� Ÿ���� �� �� �޾� ���ʸ����� ���Ե� Ÿ���� ��ȯ�ϴ� �Լ��� �������̽��Դϴ�.
    // �� ���� ���ʸ����� <Integer, Integer, Integer>�̱⿡ Integer�� �� �� �޾� Integer�� ��ȯ�մϴ�.
    // �ش� ���� ǥ������ ������ ���� �ڵ带 ����� �����Դϴ� :
    // public int adjustNumber(int number, int adjustment) {
    //    return number + adjustment;
    // }
    @SuppressWarnings({"Convert2MethodRef", "RedundantSuppression"})
    private static final BiFunction<Integer, Integer, Integer> adjuster = (number, adjustment) -> number + adjustment;


    public static void main(String[] args) {
        int first = numberSupplier.get();
        int second = numberSupplier.get();
        int example = exampleResult(first, second);
        int lambda = lambdaResult(first, second);
        if (example == lambda) {
            System.out.println("�����Դϴ�!");
        } else {
            System.out.println("�����Դϴ�!");
        }
    }

    // �� �޼���� �� ���� ������ �޾�, �ι�° ���� ������ ��ȯ�ϰ�, �̸� ����� ���� �� ���� ���� ���� ��ȯ�մϴ�.
    private static int exampleResult(int base, int delta) {
        int negative = -delta;
        int adjusted = base + delta;
        System.out.println(negative);
        return adjusted;
    }

    // �� �޼���� exampleResult�� ������ ������ ���� ����� ���� ǥ������ ����Ͽ� �����ؾ� �մϴ�.
    // �� ���ٴ� ���� �ٸ� �̸����� ���� �����Ѵٴ°��� ���� ������.
    // Function / BiFunction�� apply��, Consumer�� accept�� ����մϴ�.
    private static int lambdaResult(int base, int delta) {

        int negativeDelta = negativeConverter.apply(delta);

        printer.accept(negativeDelta);

        int adjusted= adjuster.apply(base,delta);

        return adjusted;
    }

}
