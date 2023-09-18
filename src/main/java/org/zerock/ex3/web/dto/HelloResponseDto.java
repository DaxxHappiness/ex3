package org.zerock.ex3.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor        // final 일 때 사용하는 애노테이션
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
