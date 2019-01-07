package ru.rzn.sbt.javaschool.lesson3.army;

public class Solution {
    /**
     * Сравнение армий
     *
     * 1. В классах {@link Warrior} и {@link Weapon} переопределите метод equals, чтобы можно было осуществлять
     *  сравнение объектов
     *
     * 2. Перепишите тело метода {{@link Solution#armyEquals(Warrior[], Warrior[])}} таким образом, чтобы она возвращал
     * true, если а) оба аргумента отличны от null, оба массива имеют одинаковый размер,  по одинаковым индексам в
     * массивах расположены равные объекты класса Warrior
     */
    public static boolean armyEquals(Warrior[] alpha, Warrior[] beta) {
        if (alpha==beta)
            return true;

        if (alpha == null || beta == null)
            return false;

        int length = alpha.length;

        if (alpha.length != beta.length)
            return false;

        for (int i=0; i<length; i++) {
            if (alpha[i] != null){
                if (!(alpha[i].equals(beta[i]) || alpha[i] == beta[i] ))
                    return false;}

            else if(alpha[i] != beta[i])
                    return false;
        }
        return true;

    }
}
