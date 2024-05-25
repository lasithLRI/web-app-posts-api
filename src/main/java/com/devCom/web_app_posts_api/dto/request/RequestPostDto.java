package com.devCom.web_app_posts_api.dto.request;

import com.devCom.web_app_posts_api.entity.Feedback;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestPostDto {
    private String title;
    private String descriptions;
    private BigDecimal charges;
    private String[] contact;
    private String[] images;
    private List<Feedback> feedbacks;
}
