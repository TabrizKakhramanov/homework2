//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        var dog= 8.0;
        var cat =3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //4
        var friend=19;
        System.out.println(friend);
        friend=19+2;
        System.out.println(friend);
        friend=21/3;
        System.out.println(friend);
        //5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);
        //6
        var firstFighterWeight=78.2;
        var secondFighterWeight=82.7;
        var summaryWeight= firstFighterWeight+secondFighterWeight;
        System.out.println(summaryWeight);
        var diffWeight=secondFighterWeight-firstFighterWeight;
        System.out.println(diffWeight);
        //7
        var remOfDivision= secondFighterWeight%firstFighterWeight;
        System.out.println(remOfDivision);
        //8
        var workTime=640;
        var workTimePerWorker=8;
        var numberOfWorkers=workTime/workTimePerWorker;
        System.out.println("Всего работников в компании — "+numberOfWorkers+" человек.");
        numberOfWorkers=numberOfWorkers+94;
        workTimePerWorker=workTime/numberOfWorkers;
        System.out.println("Если в компании работает "+numberOfWorkers+" человек, то всего "+workTimePerWorker+" часов работы может быть поделено между сотрудниками");

    }
}