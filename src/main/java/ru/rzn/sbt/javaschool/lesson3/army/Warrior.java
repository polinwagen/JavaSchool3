package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Воин
 */
final public class Warrior {
    /**
     * Оружие
     */
    private Weapon weapon;

    /**
     * Сила
     */
    private final int strength;

    public Warrior(int strength) {
        this(null, strength);
    }

    public Warrior(Weapon weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(obj == null)return false;
        if (getClass() != obj.getClass()) return false;
        Warrior other = (Warrior)obj;
        return  other.getStrength() == this.getStrength() && (this.getWeapon()==other.getWeapon()||(this.getWeapon() != null && this.getWeapon().equals(other.getWeapon())));

    }
}
