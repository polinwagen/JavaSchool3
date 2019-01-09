package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     *
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {

        DetectionResult parent = new DetectionResult();
        if(students==null || students.length == 0) return parent;
        for (int i = 0 ; i < students.length ; i++ ) {
            if (students[i] != null) {
                if (students[i].equals(new Biker()))
                    parent.setBikersCount(parent.getBikersCount() + 1);
                else if (students[i].equals(new Rockstar()))
                    parent.setRockstarsCount(parent.getRockstarsCount() + 1);
                else if (students[i].equals(new Student()))
                    parent.setPureStudentsCount(parent.getPureStudentsCount() + 1);
            }
        }

        return parent;
    }
}
