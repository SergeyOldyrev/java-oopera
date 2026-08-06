import java.util.ArrayList;

public class Show {
    String title;
    String duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, String duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActorToShow(Actor newActor) {
        if (newActor == null) {
            System.out.println("Нельзя добавить пустого актера!");
            return;
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже есть в спектакле");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер успешно добавлен");
        }
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }

    }

    public void replaceActor(String actorSurnameForReplace, Actor newActor) {
        if (newActor == null) {
            System.out.println("Нельзя добавить пустого актера!");
            return;
        }

        Actor actorToReplace = null;

        for (Actor actor : listOfActors) {

            if (actor.getSurname().equals(actorSurnameForReplace)) {
                actorToReplace = actor;
                break;
            }
        }

        if (actorToReplace != null) {
            listOfActors.remove(actorToReplace);
            listOfActors.add(newActor);
            System.out.println("Актер " + actorToReplace.getSurname() + " заменен на " + newActor.getSurname());
        } else {

            System.out.println("Такого актера нет");
        }
    }
}
