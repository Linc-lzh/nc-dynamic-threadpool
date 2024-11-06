package nc.dtp.core.components;

import lombok.Getter;
import nc.dtp.core.properties.ThreadPoolProperties;
import org.springframework.context.ApplicationEvent;

@Getter
public class DtpEvent extends ApplicationEvent {
    private ThreadPoolProperties properties;
    public DtpEvent(ThreadPoolProperties properties) {
        super(properties);
        this.properties = properties;
    }
}
