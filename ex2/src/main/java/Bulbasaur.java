public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        this.level = lv;

        if (level >= 32){
            id = 3;
        } else if (level >= 16 && level < 32) {
            id = 2;
        } else {
            id = 1;
        }
    }

    // getLevel method
    public int getLevel() {
        return this.level;
    }

    // getName method
    public String getName() {
        switch (id) {
            case 1:
                return "Bulbasaur";
            case 2:
                return "Ivysaur";
            case 3:
                return "Venusaur";
            default:
                return "Unknown";
        }
    }

    // getID method
    public int getID() {
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        return "Level: " + this.level + ", ID: " + this.id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            Bulbasaur anotherObject = (Bulbasaur) obj;
            return this.id == anotherObject.id && this.level == anotherObject.level;
        }
        return false;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur clone = new Bulbasaur();
        clone.id = this.id;
        clone.level = this.level;
        return clone;
    }
}