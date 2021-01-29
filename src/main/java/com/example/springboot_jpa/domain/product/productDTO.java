package com.example.springboot_jpa.domain.product;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class productDTO {

    @Size(min  = 3, message = "물품명은 3글자 이상 등록 가능합니다.")
    @NotBlank(message = "물품명은 필수로 입력하셔야합니다.")
    public String productName;

    @Max(value = 5, message = "물품코드는 5글자 이하로 등록 가능합니다.")
    @NotBlank(message = "물품코드는 필수로 입력하셔야합니다.")
    public int productCode;

    @Max(value = 5, message = "상품코드는 5글자 이하로 등록 가능합니다.")
    @Size(min = 3,max = 5, message = "상품코드는 3글자 이상 5글자 이하로 등록 가능합니다.")
    @NotBlank(message = "제조사는 필수로 입력하셔야합니다.")
    public String manufacturer;
}
