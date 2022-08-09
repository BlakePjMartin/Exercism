import java.util.Random;

class DnDCharacter {

    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;

    public DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }

    int ability() {
        Random rand = new Random();
        int upperbound = 5;  // we will generate numbers between 0 and 5
        int sumOfRolls = 0;
        int smallestRoll = 6;  // keep track of the smallest of 4 rolls
        int curRoll;
        for (int i = 0; i < 4; i++) {
            curRoll = rand.nextInt(upperbound) + 1;
            sumOfRolls += curRoll;
            smallestRoll = Math.min(smallestRoll, curRoll);
        }
        return sumOfRolls - smallestRoll;
    }

    int modifier(int input) {
        double res = ((input - 10) / 2.0);
        res = Math.floor(res);
        return (int) res;
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
