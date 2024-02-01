package Optionals;

import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String>names=getnames();
        if(names!=null) {
            System.out.println(names.get(0));
        }

        Optional<List<String>> optionalnames=getoptionalnames();
        if(optionalnames.isPresent()) {
            System.out.println(optionalnames.get());
        }

        optionalnames.ifPresent(namesvalue->namesvalue.forEach(System.out::println));

        optionalnames.flatMap(namesvalue->namesvalue.stream().findFirst()).ifPresent(System.out::println);

        optionalnames.map(namesvalue->namesvalue.get(0)).ifPresent(System.out::println);

        Optional<String> firstname=getfirstnameoptional();
        String value=firstname.orElseGet(()->"no player");
    }
    static List<String>getnames(){
        List<String>names=null;

        return names;
    }

    static String getfirstname(){
        return null;
    }

    static int  getage(){
        return 0;
    }

    static Optional<List<String>> getoptionalnames(){
        return Optional.of(List.of("Rahul","Rohit","Rajat","Rahul","Rohit","Rajat","Rahul","Rohit","Rajat","Rahul","Rohit","Rajat","Rahul","Rohit","Rajat","Rahul"));
    }

    static Optional<String> getfirstnameoptional(){
        //
        //return Optional.ofNullable("Rahul");

        try {
            return Optional.of("JUAN");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
