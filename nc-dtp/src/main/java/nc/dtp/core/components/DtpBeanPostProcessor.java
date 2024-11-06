package nc.dtp.core.components;

import nc.dtp.core.domain.DtpThreadPoolExecutor;
import nc.dtp.core.service.DtpRegistry;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DtpBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DtpThreadPoolExecutor) {
            //直接纳入管理
            DtpRegistry.registry(beanName, (DtpThreadPoolExecutor) bean);
        }
        return bean;
    }
}
