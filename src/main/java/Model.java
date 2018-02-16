import java.util.Objects;

public class Model {
    public final int id;
    public final String name;

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id == model.id &&
                Objects.equals(name, model.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
