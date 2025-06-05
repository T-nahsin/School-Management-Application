package net.tNahsin.journalApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
@Data
@Document(collection = "journal_entries")
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id ;
    private String title ;
    private String content;

    private LocalDateTime date;

}
