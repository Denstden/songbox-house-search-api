package songbox.house.util.compare;

import songbox.house.domain.dto.response.TrackMetadataDto;
import songbox.house.util.ArtistsTitle;

import java.util.Comparator;

public class TrackMetadataComparator implements Comparator<TrackMetadataDto> {

    private static final ArtistTitleComparator ARTIST_TITLE_COMPARATOR = new ArtistTitleComparator();
    private static final BitRateDurationComparator BIT_RATE_DURATION_COMPARATOR = new BitRateDurationComparator();

    private final ArtistsTitle expectedArtistsTitle;
    private final int threshold;

    public TrackMetadataComparator(ArtistsTitle expectedArtistsTitle, int threshold) {
        this.expectedArtistsTitle = expectedArtistsTitle;
        this.threshold = threshold;
    }

    @Override
    public int compare(TrackMetadataDto o1, TrackMetadataDto o2) {
        final int compare1 = ARTIST_TITLE_COMPARATOR.compare(o1.getArtistsTitle(), expectedArtistsTitle);
        final int compare2 = ARTIST_TITLE_COMPARATOR.compare(o2.getArtistsTitle(), expectedArtistsTitle);
        if (compare1 > threshold && compare2 > threshold) {
            return BIT_RATE_DURATION_COMPARATOR.compare(o1, o2);
        } else {
            return Integer.compare(compare1, compare2);
        }
    }
}
