package com.aenesgur.productstockservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockResponseDto extends BaseResponse {
    private List<ProductStockResponse> productStockResponses;
}
