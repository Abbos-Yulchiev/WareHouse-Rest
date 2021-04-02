package uz.pdp.appapiwarehouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapiwarehouse.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
