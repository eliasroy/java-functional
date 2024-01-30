package functionalInterface;

public class _Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello")
                .append(" ")
                .append("World");

        Chainer chainer = new Chainer();
        chainer.sayHi()
                .sayBye();

        Chainer chainer2 = chainer.sayHi();
        System.out.println(chainer2);
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hi");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }


    }
}
