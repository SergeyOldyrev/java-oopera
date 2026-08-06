public class Theatre {

    public static void main(String[] args) {
        Actor john = new Actor("John", "Doue", Gender.MALE, 182.2);
        Actor morgan = new Actor("Morgan", "Freeman", Gender.MALE, 190.3);
        Actor sigurnie = new Actor("Sigurnie", "Wiever", Gender.FEMALE, 179.4);
        Director robert = new Director("Roberd", "Weide", Gender.MALE, 4);
        Director sasha = new Director("Sasha", "Grey", Gender.FEMALE, 12);
        String musitian = "Mick Gordon";
        String baletmeister = "John Wick";
        String balletLibretto= "balet libretto";
        String operaLibretto= " opera libretto";

        Show commonShow = new Show("Каштанка", "120", robert);
        Ballet ballet = new Ballet("Щелкунчик", "121", sasha,musitian,balletLibretto,baletmeister);

        Opera opera = new Opera("Comedy", "260", robert,musitian,operaLibretto,22);

        commonShow.addActorToShow(john);
        commonShow.addActorToShow(sigurnie);

        ballet.addActorToShow(morgan);
        ballet.addActorToShow(john);
        ballet.addActorToShow(sigurnie);

        opera.addActorToShow(sigurnie);

        System.out.println("Актеры пьесы");
        commonShow.printListOfActors();

        System.out.println("Актеры балета");
        ballet.printListOfActors();

        System.out.println("Актеры оперы");
        opera.printListOfActors();

        opera.replaceActor("Wiever",morgan);

        System.out.println("Актеры пьесы");
        commonShow.printListOfActors();

        System.out.println("Актеры балета");
        ballet.printListOfActors();

        System.out.println("Актеры оперы");
        opera.printListOfActors();

        ballet.replaceActor("Никтов",john);

        ballet.printLibrettoText();
        opera.printLibrettoText();

    }
}
