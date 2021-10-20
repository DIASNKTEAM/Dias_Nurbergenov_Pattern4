public class Main {
    public static void main(String[] args) {
        Factory factoryPlayer = new FactoryPlayer();
        Player Defender = factoryPlayer.createDefender();
        Player Midfielder = factoryPlayer.createMidfielder();
        Player Attacker = factoryPlayer.createAttacker();

        Defender.action();
        Midfielder.action();
        Attacker.action();
    }
}
