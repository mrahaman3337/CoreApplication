package com.TrainingPortal.models;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "designation")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString



public class Designation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id ;
    private String name;
    private Date created_timestamp;
    private Date modified_timestamp;
    private int is_active;


}
