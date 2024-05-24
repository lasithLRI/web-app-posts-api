package com.devCom.web_app_posts_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestPostDto {
    private String title;
    private String descriptions;
    private BigDecimal charges;
    private String[] contact;
}
