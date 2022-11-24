public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hero batman = new Hero("Tom", "can fly", 10, 1.5, true);
        System.out.println(batman.getNick());
        System.out.println(batman.getAbilities());
        System.out.println(batman.getLevel());
        System.out.println(batman.getDamage());
        System.out.println(batman.getFame());

        System.out.println("__________________");

        batman.setName("John");
        System.out.println(batman.getNick());

        batman.setAbilities("can run");
        System.out.println(batman.getAbilities());

        batman.setDamage(5.5);
        System.out.println(batman.getDamage());

        batman.setFame(false);
        System.out.println(batman.getFame());


    }
}