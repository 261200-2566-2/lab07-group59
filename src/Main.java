public class Main {
    public static void main(String[] args) {
        HashMapSet<Object> map=new HashMapSet<Object>();

        System.out.println("Add Lica Ice false");
        map.add("Lica");
        map.add("Ice");
        map.add(false);
        System.out.println("Contains Lica : " + map.contains("Lica"));
        System.out.println("Size : " + map.size());
        map.remove("Ice");
        System.out.println("(Remove Ice)");
        System.out.println("Contains Ice : " + map.contains("Ice"));
        System.out.println("Size : " + map.size());
        System.out.println("Contains Peppy : " + map.contains("Peppy"));
        map.clear();
        System.out.println("(Clear)");
        System.out.println("Map Empty : " + map.isEmpty());
    }
}