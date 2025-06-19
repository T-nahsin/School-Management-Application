package com.tnahsin.sma.schoolManagementApplication.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "teachers")
@Component
@Getter
@Setter
@NoArgsConstructor
public class Teacher {


    @Id
    private ObjectId id;
    @Indexed(unique=true)
    @NonNull
    private String name;
    @NonNull
    private String password;
    private String email;

    private List<String> role = new ArrayList<>();
}
