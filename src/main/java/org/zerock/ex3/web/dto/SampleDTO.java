package org.zerock.ex3.web.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
// builder 패턴으로 생성된 객체의 일부 값을 변경한 새로운 객체를 생성
@Builder(toBuilder = true)
@ToString
public class SampleDTO {
    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
