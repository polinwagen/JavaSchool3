package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Оружие
 */
final public class Weapon {

    /**
     * Тип оружия
     */
    private final WeaponType weaponType;

    /**
     * Урон
     */
    private final int damage;

    /**
     * Стоимость
     */
    private final int cost;

    public Weapon(WeaponType weaponType, int damage, int cost) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.cost = cost;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(obj == null)return false;
        if (getClass() != obj.getClass()) return false;
        Weapon other = (Weapon)obj;
        return(other.getCost()==this.getCost()&& other.getDamage()==this.getDamage()
                    &&(other.getWeaponType()==this.getWeaponType() ||(this.getWeaponType() != null && this.getWeaponType().equals(other.getWeaponType()))));
    }




}
