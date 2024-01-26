package bug_lombok;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@Controller("/test")
public class SampleController {


    @Post
    @Status(HttpStatus.CREATED)
    public SampleDTO create(@Body @Valid SampleDTO administracionDTO) {
        return administracionDTO;
    }

    @Options("{/path:.*}")
    @SuppressWarnings("unused")
    void handleOptions(@Nullable @PathVariable String path) {
        // let the cors filter do its job
    }
}
