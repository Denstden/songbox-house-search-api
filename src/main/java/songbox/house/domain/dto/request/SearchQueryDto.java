package songbox.house.domain.dto.request;

import lombok.Data;

@Data
public class SearchQueryDto {
    final String query;
    boolean fetchArtwork = true;
    boolean filterByArtistTitle = true;
}
