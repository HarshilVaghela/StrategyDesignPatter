package DuckSimulator;
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck m = new DecoyDuck();
        m.performQuack();
        // error on previous document:
        // m.setQuack ing Behavior(new MeTalking());
        m.setQuackBehavior(new MeTalking());
        m.performQuack();
    }
}
