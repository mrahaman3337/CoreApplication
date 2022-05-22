package com.TrainingPortal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int id ;
private String firstname;
private String lastname;
private String email;
private String password;
private String picurl;
    private Date created_date;
    private Date modified_date;
   // private int designation_id;
   // private int track_id;
   // private int hu_product_id;
   // private String section_lead;
    private int isactive;
   // private int role_id;
    @ManyToOne
    @JoinColumn (name="designation_id")

    private Designation desigantion;





}
