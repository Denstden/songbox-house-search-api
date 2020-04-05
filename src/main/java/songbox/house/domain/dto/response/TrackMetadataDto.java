package songbox.house.domain.dto.response;

import lombok.Data;
import lombok.experimental.FieldDefaults;
import songbox.house.util.ArtistsTitle;
import songbox.house.util.BitRateDuration;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class TrackMetadataDto implements BitRateDuration {
    ArtistsTitle artistsTitle;
    Integer durationSec;
    Short bitRate;
    String thumbnail;
    String uri;
    String resource;
    Double sizeMb;
}

