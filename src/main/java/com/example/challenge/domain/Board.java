package com.example.challenge.domain;

import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    String title;

    @NotNull
    String content;

    @Column(updatable = false)
    String writer;

    @Column(insertable = false, updatable = false, columnDefinition = "date default current_date")
    Date createDate;

    @Column(insertable = false, columnDefinition = "number default 0")
    Long cnt;
}
