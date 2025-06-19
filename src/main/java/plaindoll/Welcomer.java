package plaindoll;

public class Welcomer {
    private static final Random random = new Random();
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }
    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }
    public String sayNeedGold() {
        return "Not enough gold";
    }
    public String saySome() {
        return "something in the way";
    }
    public String sayHunter() {
        return "where is the hunter";
    }
}
