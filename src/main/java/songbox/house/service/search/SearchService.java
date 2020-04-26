package songbox.house.service.search;

import songbox.house.domain.dto.request.SearchQueryDto;
import songbox.house.domain.dto.response.SearchResultDto;
import songbox.house.domain.dto.response.TrackMetadataDto;

import java.util.Optional;

public interface SearchService {
    SearchResultDto search(SearchQueryDto searchQuery);

    SearchResultDto searchFast(SearchQueryDto searchQuery);

    Optional<TrackMetadataDto> searchForPreview(SearchQueryDto query);
}
