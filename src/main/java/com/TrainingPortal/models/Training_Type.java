package com.TrainingPortal.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "training_type")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Training_Type {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id ;
    private String name;
    private Date createddate;

}
