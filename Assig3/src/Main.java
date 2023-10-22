public class Main {
    public static void main(String[] args) {
        VME gear = new VME();
        TitanKillerAdapter adapter = new TitanKillerAdapter(gear);

        // with adapter
        Human attackWithAdapter = new Human(adapter, true);
        attackWithAdapter.attackTitan();

        // without adapter
        Human attackWithoutAdapter = new Human(null, false);
        attackWithoutAdapter.attackTitan();
    }
}
