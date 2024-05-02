public class streams{
    public static void main(String[] args){
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(2);
        arg.add(3);
        arg.add(4);
        arg.add(2);
        arg.add(4);
        arg.add(5);
        arg.add(6);
        arg.add(7);
        arg.add(10);

        Stream<Integer> stm = arg.Stream()
        stm.distinct().forEach(x -> System.out.println(x));


    }
}