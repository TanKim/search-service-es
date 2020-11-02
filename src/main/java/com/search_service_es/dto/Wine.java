package com.search_service_es.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wine {
    @JsonProperty("wineNm")
    private String wineNm;

    @JsonProperty("wineNmEn")
    private String wineNmEn;

    @JsonProperty("sellerNm")
    private String sellerNm;

    @JsonProperty("wineTypeNm")
    private String wineTypeNm;

    @JsonProperty("wineTypeNmEn")
    private String wineTypeNmEn;

    @JsonProperty("id")
    private Integer id;
}
