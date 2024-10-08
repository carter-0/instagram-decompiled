package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.ImageUrl;

public final class BE5 extends AnonymousClass0T0 implements DU4 {
    public final AssetRecommendationType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final BE5 F1R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE5) {
                BE5 be5 = (BE5) obj;
                if (!0qQ.A0K(this.A02, be5.A02) || !0qQ.A0K(this.A03, be5.A03) || this.A00 != be5.A00 || !0qQ.A0K(this.A01, be5.A01) || !0qQ.A0K(this.A04, be5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AssetRecommendationType Acj() {
        return this.A00;
    }

    public final ImageUrl Arq() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsAssetRecommendationMetadata", CVY.A00(this));
    }

    public final String getAssetId() {
        return this.A02;
    }

    public final String getAssetName() {
        return this.A03;
    }

    public final String getExtra() {
        return this.A04;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public BE5(AssetRecommendationType assetRecommendationType, ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, assetRecommendationType);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = assetRecommendationType;
        this.A01 = imageUrl;
        this.A04 = str3;
    }
}
