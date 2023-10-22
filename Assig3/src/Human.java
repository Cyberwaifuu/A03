class Human {
    private TitanKillerAdapter adapter;
    private boolean useAdapter;

    public Human(TitanKillerAdapter adapter, boolean useAdapter) {
        this.adapter = adapter;
        this.useAdapter = useAdapter;
    }

    public void attackTitan() {
        if (useAdapter && adapter != null) {
            adapter.killTitan(); // using adapter
        } else {
            attackTitanFromHorse(); // attack from horse
        }
    }

    private void attackTitanFromHorse() {
        System.out.println("Attack the titan from horse.");
    }
}