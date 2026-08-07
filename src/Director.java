public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        setName(name);
       setSurname(surname);
        setGender(gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInformation() {
System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Director{" +
                "name='" + getName() + "\'" +
                ", surname='" + getSurname() + "\'" +
                ", gender=" + getGender() +
                ", numberOfShows=" + numberOfShows +
                "}";
    }
}
