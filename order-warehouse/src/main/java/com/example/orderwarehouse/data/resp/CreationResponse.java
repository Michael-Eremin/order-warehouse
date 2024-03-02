package com.example.orderwarehouse.data.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class CreationResponse {
    @JsonProperty("ts")
    private Date ts;
    @JsonProperty("description")
    private String description;

    public CreationResponse(Date date, String ok) {
    }

}
