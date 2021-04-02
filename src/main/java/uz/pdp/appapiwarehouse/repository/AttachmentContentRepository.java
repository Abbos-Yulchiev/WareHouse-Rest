package uz.pdp.appapiwarehouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapiwarehouse.entity.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}
