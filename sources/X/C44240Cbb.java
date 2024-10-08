package X;

import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cbb  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44240Cbb {
    public static Map A00(PopularReelWithFollowersInsightMetadata popularReelWithFollowersInsightMetadata) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        popularReelWithFollowersInsightMetadata.getLikeCount();
        A1H.put("like_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getLikeCount()));
        if (popularReelWithFollowersInsightMetadata.BQJ() != null) {
            A1H.put("media_ids", popularReelWithFollowersInsightMetadata.BQJ());
        }
        popularReelWithFollowersInsightMetadata.getPlayCount();
        A1H.put("play_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getPlayCount()));
        popularReelWithFollowersInsightMetadata.getReshareCount();
        return C41845B3m.A0u("reshare_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getReshareCount()), A1H);
    }
}
