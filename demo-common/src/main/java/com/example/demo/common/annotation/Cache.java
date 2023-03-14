package com.example.demo.common.annotation;


import com.example.demo.common.redis.CacheTime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author linjian
 * @date 2021/3/29
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    String key();

    String[] variables() default {};

    int expireTime() default CacheTime.CACHE_EXP_HOUR;
}
