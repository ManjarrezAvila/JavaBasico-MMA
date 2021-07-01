public class Main {
    public static void main(String[] args) {
        MyFamily mom = new MyFamily("mom.");
        mom.name = "Esther Avila.";
        mom.age = 49;
        mom.printDataMyFamily();

        MyFamily dad = new MyFamily("dad.");
        dad.name = "Jose MAnjarrez.";
        dad.age = 51;
        dad.printDataMyFamily();

        MyFamily brother = new MyFamily("brother.");
        brother.name = "Ivan Manjarrez.";
        brother.age = 28;
        brother.printDataMyFamily();

    }
}
