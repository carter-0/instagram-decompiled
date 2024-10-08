package X;

import com.instagram.api.schemas.WorldLocationPagesInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HUB {
    public static Map A00(WorldLocationPagesInfo worldLocationPagesInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (worldLocationPagesInfo.getCoverPhoto() != null) {
            A1H.put("cover_photo", worldLocationPagesInfo.getCoverPhoto());
        }
        if (worldLocationPagesInfo.Be3() != null) {
            A1H.put("post_count", worldLocationPagesInfo.Be3());
        }
        if (worldLocationPagesInfo.getWorldId() != null) {
            A1H.put("world_id", worldLocationPagesInfo.getWorldId());
        }
        return 0Yt.A0B(A1H);
    }
}
