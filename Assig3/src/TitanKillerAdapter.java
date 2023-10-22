class TitanKillerAdapter {
    private VME gear;

    public TitanKillerAdapter(VME gear) {
        this.gear = gear;
    }

    public void killTitan() {
        gear.flyAndAttack();
    }
}