package X;

import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

public abstract class CVZ {
    public static BE5 parseFromJson(16F r12) {
        String str;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            AssetRecommendationType assetRecommendationType = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("asset_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("asset_name".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("asset_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    assetRecommendationType = (AssetRecommendationType) AssetRecommendationType.A01.get(str);
                    if (assetRecommendationType == null) {
                        assetRecommendationType = AssetRecommendationType.UNRECOGNIZED;
                    }
                } else if ("cover_artwork_thumbnail_uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r12);
                } else if ("extra".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("asset_id", r12, "ClipsAssetRecommendationMetadataImpl");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("asset_name", r12, "ClipsAssetRecommendationMetadataImpl");
            } else if (assetRecommendationType != null || !(r12 instanceof 0c9)) {
                return new BE5(assetRecommendationType, simpleImageUrl, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("asset_type", r12, "ClipsAssetRecommendationMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
