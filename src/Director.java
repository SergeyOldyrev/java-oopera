public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        setGender(gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInformation() {
System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + "\'" +
                ", surname='" + surname + "\'" +
                ", gender=" + getGender() +
                ", numberOfShows=" + numberOfShows +
                "}";
    }
}
