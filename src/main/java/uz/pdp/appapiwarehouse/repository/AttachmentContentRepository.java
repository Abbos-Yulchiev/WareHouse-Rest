package uz.pdp.appapiwarehouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.AttachmentContent;

@RepositoryRestResource(path = "attachmentContent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
