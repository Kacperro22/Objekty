public class Hero {
    private String name;
    private String abilities;
    private int level;
    private double damage;
    private boolean fame;

    public Hero(String name, String abilities, int level, double damage, boolean fame) {
        this.name = name;
        this.abilities = abilities;
        this.level = level;
        this.damage = damage;
        this.fame = fame;
    }

    public String getName() {
        return name;
    }

    public String getAbilities() {
        return abilities;
    }

    public int getLevel() {
        return level;
    }

    public double getDamage() {
        return damage;
    }

    public boolean getFame() {
        return fame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setFame(boolean fame) {
        this.fame = fame;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", abilities='" + abilities + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                ", fame=" + fame +
                '}';
    }

    public double damagePerSec(){
        return (damage*5);
    }
}


