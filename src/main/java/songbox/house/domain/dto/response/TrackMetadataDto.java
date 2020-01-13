package songbox.house.domain.dto.response;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class TrackMetadataDto {
    String artists;
    String title;
    Integer durationSec;
    Short bitRate;
    String thumbnail;
    String uri;
    String resource;
}

