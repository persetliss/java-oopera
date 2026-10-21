import java.util.ArrayList;

public class Show {
    String title;
    Director director;
    ArrayList<Actor> listOfActors;
    int duration;

    public Show(String title, Director director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorName() {
        System.out.println(director.toString());
    }

    public void printActorsNames() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println(actor.toString() + " уже есть в списке.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (surname.equals(listOfActors.get(i).surname)) {
                listOfActors.set((i), actor);
                return;
            }
        }
        System.out.println("Похоже, такого актера нет в списке.");
    }
}
