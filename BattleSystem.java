// Base class
class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println(name + " attacks in a generic way.");
    }
}

// Warrior class
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a mighty sword with high defense!");
    }
}

// Mage class
class Mage extends Character {
    int mana;

    Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    void attack() {
        System.out.println(name + " casts a powerful spell using " + mana + " mana!");
    }
}

// Archer class
class Archer extends Character {
    int arrows;

    Archer(String name, int arrows) {
        super(name);
        this.arrows = arrows;
    }

    @Override
    void attack() {
        System.out.println(name + " shoots an arrow with long-range damage! (" + arrows + " arrows left)");
    }
}

// Main class
public class BattleSystem {
    public static void main(String[] args) {
        Character[] army = new Character[3];

        army[0] = new Warrior("Thor");
        army[1] = new Mage("Gandalf", 100);
        army[2] = new Archer("Legolas", 30);

        System.out.println("⚔️ Battle Start ⚔️\n");

        for (Character c : army) {
            c.attack(); // Dynamic method dispatch in action
        }
    }
}
