package songbox.house.domain.dto.response;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class TrackDto {
    String artists;
    String title;
    String fileName;
    String extension;
    Integer durationSec;
    Long sizeBytes;
    Short bitRate;
    byte[] content;
    String artworkUrl;
}
