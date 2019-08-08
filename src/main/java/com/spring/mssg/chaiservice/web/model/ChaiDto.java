package com.spring.mssg.chaiservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChaiDto {

    @Null
    private UUID id;
    @Null
    private Integer version;
    @Null
    private OffsetDateTime createDate;
    @Null
    private OffsetDateTime lastModifiedDate;
    @NotBlank
    private String chaiName;
    @NotNull
    @Positive
    private Long upc;
    @NotBlank
    private ChaiTypeEnum chaiType;

    @NotNull
    @Positive
    private BigDecimal price;
    private Integer quantityRemaining;
}
