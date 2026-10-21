public class Theatre {
    public static void main(String[] args) {

        String katyaKabanovaLibretto = "Послеполуденное солнце ярко освещает сад на берегу Волги и дом Кабановых.\n" +
                "Молодой парень Кудряш самозабвенно смотрит на реку.\n" +
                "Он делает это уже много лет и все не может наглядеться на красавицу Волгу.\n";

        String ritualsLibretto = "Молодые юноши и девушки водят хороводы, гадают и соревнуются в играх.\n" +
                "Появляются старцы во главе с древним Мудрецом.\n" +
                "Праздник достигает кульминации, когда Мудрец падает ниц и целует просыпающуюся землю, " +
                "благословляя ее на плодородие.";

        Actor kamilKatrin = new Actor("Камиль", "Катрин", Gender.FEMALE, 175);
        Actor lilianRover = new Actor("Лилиан", "Ровер", Gender.FEMALE, 168);
        Actor gregoryMontel = new Actor("Грегори", "Монтель", Gender.MALE, 165);
        Director jeanVilar = new Director("Жан", "Вилар", Gender.MALE, 15);
        Director patriceChereau = new Director("Патрис", "Шеро", Gender.MALE, 10);
        Person musicAuthor = new Person("Рене", "Обри", Gender.MALE);
        Person choreographer = new Person("Хосе", "Мартинес", Gender.MALE);
        Show tchekhovsFarewellToTolstoi = new Show("Прощание Чехова с Толстым", jeanVilar, 150);
        Opera katyaKabanova = new Opera("Катя Кабанова", patriceChereau, 90, musicAuthor,
                katyaKabanovaLibretto, 20);
        Ballet rituals = new Ballet("Ритуалы", jeanVilar, 70, musicAuthor,
                ritualsLibretto, choreographer);

        tchekhovsFarewellToTolstoi.addNewActor(gregoryMontel);
        tchekhovsFarewellToTolstoi.addNewActor(kamilKatrin);
        katyaKabanova.addNewActor(kamilKatrin);
        katyaKabanova.addNewActor(lilianRover);
        rituals.addNewActor(gregoryMontel);

        System.out.println("Актёры спектакля «" + tchekhovsFarewellToTolstoi.title + "»:");
        tchekhovsFarewellToTolstoi.printActorsNames();
        System.out.println();
        System.out.println("Актёры спектакля «" + katyaKabanova.title + "»:");
        katyaKabanova.printActorsNames();
        System.out.println();
        System.out.println("Актёры спектакля «" + rituals.title + "»:");
        rituals.printActorsNames();
        System.out.println();
        rituals.changeActor(kamilKatrin, "Монтель");
        System.out.println("Актёры спектакля «" + rituals.title + "»:");
        rituals.printActorsNames();
        System.out.println();
        tchekhovsFarewellToTolstoi.changeActor(lilianRover, "Монталембер");
        System.out.println();
        katyaKabanova.printLibrettoText();
        rituals.printLibrettoText();
    }
}
