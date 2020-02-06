package songbox.house.service.search;

import songbox.house.domain.dto.request.SearchQueryDto;
import songbox.house.domain.dto.response.SearchResultDto;

public interface SearchService {
    SearchResultDto search(SearchQueryDto searchQuery);

    SearchResultDto searchFast(SearchQueryDto searchQuery);
}
