import java.util.ArrayList;
import java.util.Optional;

public interface DAO<T> {

    Optional<T> get (long id);

    ArrayList<T> getAll();

    Boolean save (T t);

    Integer update (T t, String[] params);

    Integer delete (T t);
}
