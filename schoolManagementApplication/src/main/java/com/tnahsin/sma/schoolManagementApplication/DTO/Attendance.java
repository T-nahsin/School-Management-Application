package com.tnahsin.sma.schoolManagementApplication.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;


@Getter
@Setter
@Component
@NoArgsConstructor
public class Attendance {
    @Id
    private ObjectId id;


    @NonNull
    private ObjectId studentId;
    @NonNull
    private LocalDate date;
    @NonNull
    private boolean present;

    private String remarks;

}

