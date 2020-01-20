package songbox.house.service.download;

import songbox.house.domain.dto.request.SearchQueryDto;
import songbox.house.domain.dto.response.TrackDto;

import java.util.Optional;

public interface DownloadService {
    Optional<TrackDto> download(SearchQueryDto searchQuery);
}
