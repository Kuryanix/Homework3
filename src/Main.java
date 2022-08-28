public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА 1
        byte dog = 6;
        short cat = 10000;
        int bird = 12345;
        long fish = 2222222L;
        float month = 1.2f;
        double melon = 1.555555555;
        char bar = 35;
        System.out.println("Значение переменной dog c типом byte равно " + dog);
        System.out.println("Значение переменной cat c типом short равно " + cat);
        System.out.println("Значение переменной bird c типом int равно " + bird);
        System.out.println("Значение переменной fish c типом long равно " + fish);
        System.out.println("Значение переменной month c типом float равно " + month);
        System.out.println("Значение переменной melon c типом double равно " + melon);
        System.out.println("Значение переменной bar c типом char равно " + bar);
        // ЗАДАЧА 2
        double baza = 27.12;
        long km = 987678965549L;
        byte telephone = 2;
        short sheep = 786;
        boolean telephoneMoreSheep = telephone > sheep;
        short lake = 569;
        int word = -159;
        long weight = 27897L;
        byte mouse = 67;
        System.out.println(baza);
        System.out.println(km);
        System.out.println(telephone);
        System.out.println(sheep);
        System.out.println(telephoneMoreSheep);
        System.out.println(lake);
        System.out.println(word);
        System.out.println(weight);
        System.out.println(mouse);
        // ЗАДАЧА 3
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int allStudents = LP + AS + EA;
        short paper = 480;
        int paperPerStudent = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        // ЗАДАЧА 4
        byte producePer2Min = 16;
        byte timeProduce = 2;
        int min20 = 20 / timeProduce * producePer2Min;
        int day = 24 * 60 / timeProduce * producePer2Min;
        int threeDay = 72 * 60 / timeProduce * producePer2Min;
        int perMonth = 31 * 24 * 60 / timeProduce * producePer2Min;
        System.out.println("За 20 минут машина произвела бутылок " + min20 + " штук");
        System.out.println("За день машина произвела бутылок " + day + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + threeDay + " штук");
        System.out.println("За месяц машина произвела бутылок " + perMonth + " штук");
        // ЗАДАЧА 5
        byte dye = 120;
        byte white = 2;
        byte brown = 4;
        int perClass = white + brown;
        int allClass = dye / perClass;
        int allWhite = allClass * white;
        int allBrown = allClass * brown;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        // ЗАДАЧА 6
        byte banana = 80;
        byte milk = 105;
        byte icecream = 100;
        byte egg = 70;
        int recipe = banana * 5 + milk * 2 + icecream * 2 + egg * 4;
        double kg = 1000;
        double kgRecipe = recipe / kg;
        System.out.println("Вес завтрака составляе " + kgRecipe + " кг ");
        // Задача 7
        short targetKg = 7;
        double targetGr = targetKg * kg;
        short min = 250;
        short max = 500;
        int average = (min + max) / 2;
        double targetMin = targetGr / min;
        double targetMax = targetGr / max;
        double targetAverage = targetGr / average;
        System.out.println("Потребуется " + targetMin + " дней, чтобы похудеть при условии, что в день спортсмен теряет " + min + " грамм");
        System.out.println("Потребуется " + targetMax + " дней, чтобы похудеть при условии, что в день спортсмен теряет " + max + " грамм");
        System.out.println("Потребуется " + targetAverage + " дней, чтобы похудеть при условии, что в день спортсмен теряет " + average + " грамм");
        // ЗАДАЧА 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double percent = 1.1;
        double upMasha = masha * percent;
        double upDenis = denis * percent;
        double upKristina = kristina * percent;
        byte year = 12;
        double difYearMasha = year * upMasha - year * masha;
        double difYearDenis = year * upDenis - year * denis;
        double difYearKristina = year * upKristina - year * kristina;
        System.out.println("Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + difYearMasha + " рублей");
        System.out.println("Денис теперь получает " + upDenis + " рублей. Годовой доход вырос на " + difYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + upKristina + " рублей. Годовой доход вырос на " + difYearKristina + " рублей");
    }
}