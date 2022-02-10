package com.my_project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nameOfJob")
    String nameOfJob;
    @Column(name = "price")
    String price;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "job")
    private List<User> userList;
}
