import java.util.Objects;

public class Actor extends Person{

  private Double height;

    public Actor(String name, String surname, Gender gender, double height) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + "\'" +
                ", surname='" + getSurname() + "\'" +
                ", gender=" + getGender() +
                ", height=" + height +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname()) &&
                Objects.equals(getGender(),otherActor.getGender())&&
                (Objects.equals(height, otherActor.height));
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (getName() != null) {

            hash = hash + getName().hashCode();
        }
        hash = hash * 31;

        if (getSurname() != null) {

            hash = hash + getSurname().hashCode();
        }
        hash = hash * 19;

        if (getGender() != null) {

            hash = hash + getGender().hashCode();
        }
        hash = hash * 13;

        if (height != null) {

            hash = hash + height.hashCode();
        }

        return hash;
    }
}
