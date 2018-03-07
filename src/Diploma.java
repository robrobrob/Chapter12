public class Diploma {
    String name;
    String subject;

    public Diploma(String name, String subject){
       this.name = name;
       this.subject = subject;
    }

    @Override
    public String toString() {
        return "This Certifies that "+name+"\n"+"has completed a MOOC in "+subject;
    }
}
