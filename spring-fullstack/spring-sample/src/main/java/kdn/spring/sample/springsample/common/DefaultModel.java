package kdn.spring.sample.springsample.common;

import lombok.Data;

@Data
public abstract class DefaultModel {
    private int seq;
    private String mode;
}
