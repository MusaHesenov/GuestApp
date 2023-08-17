package com.example.GuestApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Post {
    @Id
    Long id;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    User user;

    String title;
    @Column(columnDefinition = "text")
    String text;
}
