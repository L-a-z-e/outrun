package com.laze.outrun.backend.common.domain.sample.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleDtoTest {
    @Test
    public void lombokFunctionTest(){
        // given
        String name = "sampleTest";
        int amount = 1000;

        // when
        SampleResponseDto dto = new SampleResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertThat - assertj 테스트 검증 라이브러리, 검증하고싶은 대상을 메서드 인자, 메서드 체이닝 지원
        assertThat(dto.getAmount()).isEqualTo(amount); // isEqualTo - assertj 동등 비교 메서드, assertThat에 있는 값과 isEqualTo의 값을 비교해서 같을 때 성공


    }
}
