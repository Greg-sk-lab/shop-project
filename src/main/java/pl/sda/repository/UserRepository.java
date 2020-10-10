package pl.sda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    //tu własne zapytania i metody
    User findByUsername (String username);
}
