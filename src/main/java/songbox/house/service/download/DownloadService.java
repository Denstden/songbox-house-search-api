package songbox.house.service.download;

import songbox.house.domain.dto.request.SearchQueryDto;
import songbox.house.domain.dto.response.TrackDto;
import songbox.house.domain.dto.response.TrackMetadataDto;

import java.util.Optional;

public interface DownloadService {
    Optional<TrackDto> download(SearchQueryDto searchQuery);

    Optional<TrackDto> download(SearchQueryDto searchQuery, String artworkUrl);

    Optional<TrackDto> download(TrackMetadataDto trackMetadataDto);

    boolean isDownloadEnabled();
}
