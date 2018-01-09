package pl.dziedziul.aspectexample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionAspect {
    @Around("@annotation(LogExecution)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        logger(joinPoint).warn("Logging execution of {}", joinPoint.getSignature());
        return joinPoint.proceed();
    }

    private Logger logger(ProceedingJoinPoint joinPoint) {
        return LoggerFactory.getLogger(joinPoint.getThis().getClass());
    }

}
