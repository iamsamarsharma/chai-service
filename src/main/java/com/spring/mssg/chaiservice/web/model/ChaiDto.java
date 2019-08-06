package com.spring.mssg.chaiservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChaiDto {

    private UUID id;
    private Integer version;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private String chaiName;
    private Long upc;
    private ChaiTypeEnum chaiType;
    private BigDecimal price;
    private Integer quantityRemaining;
}
