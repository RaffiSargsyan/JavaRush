package homework.chapter1;

/*
Ստատիկ փոփողականները կապված են կլասի անունի հետ
ոչ ստատիկ փոփոխականին կդիմենք կլասից օբյեկտ ստեղծելուց հետո
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetCounts + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.name + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
        DataInfo dataInfo = new DataInfo();
        System.out.println(dataInfo.value);
    }
}
