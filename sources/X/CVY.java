package X;

import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CVY {
    public static Map A00(DU4 du4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du4.getAssetId() != null) {
            A1H.put("asset_id", du4.getAssetId());
        }
        if (du4.getAssetName() != null) {
            A1H.put("asset_name", du4.getAssetName());
        }
        if (du4.Acj() != null) {
            AssetRecommendationType Acj = du4.Acj();
            0qQ.A0B(Acj, 0);
            A1H.put("asset_type", Acj.A00);
        }
        if (du4.Arq() != null) {
            ImageUrl Arq = du4.Arq();
            if (Arq != null) {
                str = Arq.getUrl();
            } else {
                str = null;
            }
            A1H.put("cover_artwork_thumbnail_uri", str);
        }
        if (du4.getExtra() != null) {
            A1H.put("extra", du4.getExtra());
        }
        return 0Yt.A0B(A1H);
    }
}
