package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.User;
import uz.pdp.appapiwarehouse.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByPhoneNumber(String phoneNumber);

    @Query(value = "select max(id) from users", nativeQuery = true)
    Integer maxUserId();
}
