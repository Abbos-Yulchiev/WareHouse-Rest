package uz.pdp.appapiwarehouse.service;

import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.appapiwarehouse.entity.Attachment;
import uz.pdp.appapiwarehouse.entity.AttachmentContent;
import uz.pdp.appapiwarehouse.payload.Result;
import uz.pdp.appapiwarehouse.repository.AttachmentContentRepository;
import uz.pdp.appapiwarehouse.repository.AttachmentRepository;


import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    final AttachmentRepository attachmentRepository;
    final AttachmentContentRepository attachmentContentRepository;

    public AttachmentService(AttachmentRepository attachmentRepository, AttachmentContentRepository attachmentContentRepository) {
        this.attachmentRepository = attachmentRepository;
        this.attachmentContentRepository = attachmentContentRepository;
    }

    @SneakyThrows
    public Result uploadFile(MultipartHttpServletRequest request) {

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        Attachment attachment = new Attachment();
        assert file != null;
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());

        Attachment savedAttachment = attachmentRepository.save(attachment);
        AttachmentContent attachmentContent = new AttachmentContent();

        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(savedAttachment);
        attachmentContentRepository.save(attachmentContent);

        return new Result("File saved", true, savedAttachment.getId());
    }

    public Page<Attachment> getAttachmentList(Integer page) {

        Pageable pageable = PageRequest.of(page, 15);
        return attachmentRepository.findAll(pageable);
    }

    public Attachment getOneAttachment(Integer attachmentId) {

        Optional<Attachment> optionalAttachment = attachmentRepository.findById(attachmentId);
        return optionalAttachment.orElseGet(Attachment::new);
    }

    @SneakyThrows
    public Result editAttachment(Integer attachmentId, MultipartHttpServletRequest request) {

        Optional<Attachment> optionalAttachment = attachmentRepository.findById(attachmentId);

        if (!optionalAttachment.isPresent())
            return new Result("Invalid attachment ID", false);

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        Attachment editedAttachment = optionalAttachment.get();

        assert file != null;
        editedAttachment.setContentType(file.getContentType());
        editedAttachment.setName(file.getOriginalFilename());
        editedAttachment.setSize(file.getSize());

        Attachment savedAttachment = attachmentRepository.save(editedAttachment);

        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(savedAttachment);
        attachmentContentRepository.save(attachmentContent);

        return new Result("Attachment edited", true, savedAttachment.getId());
    }

    public Result deleteAttachment(Integer attachmentId) {

        Optional<Attachment> optionalAttachment = attachmentRepository.findById(attachmentId);
        if (!optionalAttachment.isPresent())
            return new Result("Invalid Attachment Id", false);

        attachmentRepository.deleteById(attachmentId);
        return new Result("Attachment deleted", true);
    }
}
