package functionalInterface;

public class _functional {

    public static void main(String[] args) {
        TriFuncion<Integer,Integer,Integer,Integer> ages = (age,month,year) -> {
            int result = 0;
            return age;
        };
    }
    @FunctionalInterface
    interface TriFuncion<T,Y,U,I>{
        I apply(T t, Y y, U u);
    }

}
