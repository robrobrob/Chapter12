public class Tester{
    public static void main(String[] args) throws IllegalAccessException {
        Location a = new Location(1);
        Location b = new Location(3);
        Location o = new Location(3);
        int c = a.distance(b);
        System.out.println(c);
        boolean r = a.sameDistance(a,b,o);
        System.out.println(r);
    }
}
