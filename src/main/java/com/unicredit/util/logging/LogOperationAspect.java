package com.unicredit.util.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogOperationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogOperationAspect.class);

    @Around(value = "execution(* com.unicredit.controller..*(..))")
    public void logOperationDetails(ProceedingJoinPoint proceedingJoinPoint) {
        LOGGER.info("Call to endpoint: " + proceedingJoinPoint.getSignature().toShortString());

    }
}
