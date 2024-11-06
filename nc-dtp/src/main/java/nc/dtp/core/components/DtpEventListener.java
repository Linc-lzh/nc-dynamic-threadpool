package nc.dtp.core.components;

import nc.dtp.core.properties.ThreadPoolProperties;
import nc.dtp.core.service.DtpRegistry;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DtpEventListener {
    @EventListener(DtpEvent.class)
    public void onApplicationEvent(DtpEvent event) {
        ThreadPoolProperties properties = event.getProperties();
        DtpRegistry.refresh(properties.getPoolName(), properties);
    }
}
