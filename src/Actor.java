import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Actor otherActor = (Actor) obj;
        return this.name.equals(otherActor.name) && this.surname.equals(otherActor.surname) &&
                this.height == otherActor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}
