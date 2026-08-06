import java.util.Objects;

public class Actor extends Person{

    Double height;

    public Actor(String name, String surname, Gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + "\'" +
                ", surname='" + surname + "\'" +
                ", gender=" + gender +
                ", height=" + height +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                Objects.equals(gender,otherActor.gender)&&
                (Objects.equals(height, otherActor.height));
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {

            hash = hash + name.hashCode();
        }
        hash = hash * 31;

        if (surname != null) {

            hash = hash + surname.hashCode();
        }
        hash = hash * 19;

        if (gender != null) {

            hash = hash + gender.hashCode();
        }
        hash = hash * 13;

        if (height != null) {

            hash = hash + height.hashCode();
        }

        return hash;
    }
}
