package com.nutrition_assitant.nutrition_assitant.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "meal")
public class Meal {
    @Id
    private String id;

    @DBRef
    private User user;
    private LocalDateTime dateTime;
//    private List<Food> foods;
}
