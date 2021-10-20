public class FactoryPlayer implements Factory{
    @Override
    public Player createDefender() {
        return new Defender();
    }

    @Override
    public Player createMidfielder() {
        return new Midfielder();
    }

    @Override
    public Player createAttacker() {
        return new Attacker();
    }
}
