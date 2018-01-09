package pl.dziedziul.aspectexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class SampleServiceImpl implements SampleService {
    private static final Logger log = LoggerFactory.getLogger(SampleServiceImpl.class);

    @Override
    @LogExecution
    public void sampleMethod() {
        log.info("Some fancy logic");
    }
}
