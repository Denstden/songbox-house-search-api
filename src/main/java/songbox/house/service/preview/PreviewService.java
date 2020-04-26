package songbox.house.service.preview;

import songbox.house.domain.dto.response.TrackMetadataDto;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public interface PreviewService {
    Optional<ByteArrayOutputStream> getM3U(TrackMetadataDto trackMetadataDto, Long startFromSec, Long durationSec);

    Optional<ByteArrayOutputStream> getTsPart(String path);
}
