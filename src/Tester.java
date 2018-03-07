public class Tester{
    public static void main(String[] args) throws IllegalAccessException {
        //Question 4
        Diploma diploma1 = new Diploma("Adam Smith","Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Betsy Smith","Robotics");
        System.out.println(diploma2);
        System.out.println();

        //Question 12
        ArrayListWithSum i = new ArrayListWithSum();
        i.add(1);
        i.add(2);
        System.out.println(i.sum());

        //Question 14
        Location a = new Location(1);
        Location b = new Location(3);
        Location o = new Location(3);
        int c = a.distance(b);
        System.out.println(c);
        boolean r = a.sameDistance(a,b,o);
        System.out.println(r);
    }
}
