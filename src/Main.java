public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров: " + boxersWeight);
        var difference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров: " + difference + "кг");
        var differenceFunction = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе: " + differenceFunction + "кг");

        var commonHours = 640;
        var companyWorkers = commonHours / 8;
        System.out.println("Всего в компании " + companyWorkers + " человек");
        var companyMoreWorkers = companyWorkers + 94;
        System.out.println("Если прибавить 94 сотрудника в компании окажется " + companyMoreWorkers + " сотрудников");
        var hoursPerEmployee = commonHours / companyMoreWorkers;
        System.out.println("На увеличившееся число сотрудников придётся по " + hoursPerEmployee + " часа на каждого");
    }
}