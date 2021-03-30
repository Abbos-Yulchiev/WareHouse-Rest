package uz.pdp.appapiwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Integer getId();

    String getName();

    Long getSize();

    String getContentType();

    Byte getBytes();
}
