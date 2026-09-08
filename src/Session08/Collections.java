package Session08;


import java.util.*;


public class Collections {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set<String> fruits= new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Orange");
        System.out.println(fruits.size());
        System.out.println(fruits);
//        var i =fruits.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        for(String fruit:fruits)
//        {
//            System.out.println(fruit);
//        }
        fruits.forEach(System.out::println);


    }
    public static void listDemo(){
        List fruits= new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add(2,"Orange");
        System.out.println(fruits.size());
        System.out.println(fruits);
    }
    public static void queueDemo(){
        Queue fruits= new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Orange");
        System.out.println(fruits.peek());
        System.out.println(fruits.size());
        System.out.println(fruits);
        fruits.forEach(System.out::println);
    }
    public static void mapDemo(){
        Map<String,Integer> fruits = new HashMap();
        fruits.put("Apple", 100);
        fruits.put("Banana", 200);
        fruits.put("Pear", 300);
        fruits.put("Orange", 400);
        fruits.put("Pineapple", 500);
        fruits.putIfAbsent("Orange", 50);

        System.out.println(fruits.size());
        System.out.println(fruits);
        for(var fruit:fruits.entrySet())
        {
            System.out.println("The number of calories of fruit"+fruit.getKey()+ " "+fruit.getValue());
        }
    }
}

