package bug_lombok;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.bson.codecs.pojo.annotations.BsonIgnore;

@Getter
@Setter
@Serdeable
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SampleDTO {

    @NotNull
    private String uno;

    @NotNull
    private String dos;

    @BsonIgnore
    private boolean updated = false;

    private boolean hasDetail = true;
}
