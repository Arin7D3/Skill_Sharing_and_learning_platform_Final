//transfer data between the backend and frontend 
package com.skillsphere.backend.dto;
import lombok.Data;
import java.time.LocalDateTime;

//explain attibutes and their purpose
@Data
public class LearningPlanDTO {
    private Long id;
    private String title;
    private String description;
    private Integer duration;
    private String thumbnailUrl; 
    private String status; 
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long userId;
    private String username;
}