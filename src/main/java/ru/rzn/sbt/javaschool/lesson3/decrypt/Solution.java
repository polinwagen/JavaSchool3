package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     *
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     *
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     *
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted){
        StringBuilder builder = new StringBuilder();
        if(encrypted==null) return null;
        for (char c : encrypted.toCharArray()) {
            int position = (int)c ;

            if ((position >= 97 && position <= 105 ) || (position >= 64 && position <= 73))
                builder.append((char)(position+17));
            else if ((int) c < 65 || (int) c >= 128)
                builder.append(c); else
                builder.append((char)(position -9));

        }
        return builder.toString();
    }
}
