package com.example.orderwarehouse.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Getter
@Setter
public class StockDTO {
    @JsonProperty("stockId")
    private Integer stockId;
    @JsonProperty("StockName")
    private String StockName;
    @JsonProperty("stockAddress")
    private String stockAddress;
    @JsonProperty("StockCapacity")
    private Integer StockCapacity;
    @JsonProperty("stockBalance")
    private Integer stockBalance;
}
