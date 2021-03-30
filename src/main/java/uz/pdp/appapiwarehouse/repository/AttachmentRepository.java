package uz.pdp.appapiwarehouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Attachment;

@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
