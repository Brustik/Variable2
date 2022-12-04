public class Main {
    public static void main(String[] args) {
      //Задача 1
        int i = 230;
        byte b = 8;
        short s = 25;
        long l = 123456789l;
        float f = 6.78945f;
        double d = 8.123456789;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //Задача 2
        float f1 = 27.12f;
        long l1 = 987678965549l;
        double d1 = 2.786;
        boolean bool = false;
        short s1 = 569;
        int i1 = -159;
        byte b1 = 67;


        //Задача 3
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int totalStudents = studentsLP + studentsAS + studentsEA;
        int sheetsOneStudent = 480 / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOneStudent + " листов бумаги");

        //Задача 4
        int bootles2Minute = 16;
        int bootles20Minute = bootles2Minute * 10;
        int bootlesOneDay = bootles20Minute * 3 * 24;
        int bootles3Day = bootlesOneDay * 3;
        int bootlesOneMonth = bootles3Day * 10;
        System.out.println("За 20 минут машина произвела бутылок - " + bootles20Minute + " штук");
        System.out.println("За сутки машина произвела бутылок - " + bootlesOneDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок - " + bootles3Day + " штук");
        System.out.println("За месяц машина произвела бутылок - " + bootlesOneMonth + " штук");

        //Задача 5
        int numberWhiteColor = 2;
        int numberBrownColor = 4;
        int numberClass = 120 / (numberWhiteColor + numberBrownColor);
        int totalNumberWhiteColor = numberWhiteColor * numberClass;
        int totalNumberBrownColor = numberBrownColor * numberClass;
        System.out.println("В школе, где " + numberClass + " классов, нужно " + totalNumberWhiteColor + " банок белой краски и " + totalNumberBrownColor + " банок коричневой краски");

        //Задача 6
        int bananaWeight = 80;
        int milkWeight = 105;
        int plombirWeight = 100;
        int eggWeight = 70;
        int recipeWeightGr = 5 * bananaWeight + 2 * milkWeight + 2 * plombirWeight + 4 * eggWeight;
        float recipeWeightKg = (float)recipeWeightGr / 1000;
        System.out.println("Общий вес спорт-завтрака составляет - " + recipeWeightGr + " грамм, или " + recipeWeightKg + " кг");

        //Задача 7
        int minLooseWeight = 250;
        int maxLooseWeight = 500;
        double middleLooseWeight = (minLooseWeight + maxLooseWeight) / 2; // средняя потеря веса в день
        System.out.println("Если спортсмен будет худеть на " + minLooseWeight + " граммов в день, то 7 кг сбросит за " + 7000 / minLooseWeight + " дней");
        System.out.println("Если спортсмен будет худеть на " + maxLooseWeight + " граммов в день, то 7 кг сбросит за " + 7000 / maxLooseWeight + " дней");
        System.out.println("А в среднем спортсмен 7 кг сбросит за " + 7000 / middleLooseWeight + " дней");

        //Задача 8
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristine = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristine = salaryKristine * 1.1;
        double differenceYearProfitMasha = newSalaryMasha * 12 - salaryMasha * 12;
        double differenceYearProfitDenis = newSalaryDenis * 12 - salaryDenis * 12;
        double differenceYearProfitKristine = newSalaryKristine * 12 - salaryKristine * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceYearProfitMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceYearProfitDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristine + " рублей. Годовой доход вырос на " + differenceYearProfitKristine + " рублей");










    }
}