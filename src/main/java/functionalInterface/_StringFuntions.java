package functionalInterface;

public class _StringFuntions {
    @FunctionalInterface
    interface StringFunction {
        int getAmout();

        default void operate(String text) {
            int x = getAmout();
            while (x-- > 0) {
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation{
        void take(String text);

        default void execute(int x, String text){
            while(x-- > 0) take(text);
        }

    }

    public static void main(String[] args) {
        StringFunction stringFunction = () -> 3;
        stringFunction.operate("Alumno");

        DoOperation doOperation = (text) -> System.out.println(text);
        doOperation.execute(3,"Elias");
    }

}
