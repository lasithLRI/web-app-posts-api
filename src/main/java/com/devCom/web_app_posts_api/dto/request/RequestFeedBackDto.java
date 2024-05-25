package com.devCom.web_app_posts_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestFeedBackDto {
    private String name;
    private Date date;
    private String comments;
}
