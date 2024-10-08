package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadata;
import com.instagram.api.schemas.ProductTileProduct;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.ProductDetailsProductItemDict;

public final class BG2 extends AnonymousClass0T0 implements DRO {
    public final ProductCardSubtitleType A00;
    public final ProductTileMetadata A01;
    public final ProductTileProduct A02;
    public final ProductTileUCILoggingInfo A03;
    public final RankingInfo A04;
    public final 1Xj A05;
    public final ProductDetailsProductItemDict A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG2) {
                BG2 bg2 = (BG2) obj;
                if (!0qQ.A0K(this.A05, bg2.A05) || !0qQ.A0K(this.A06, bg2.A06) || !0qQ.A0K(this.A02, bg2.A02) || !0qQ.A0K(this.A01, bg2.A01) || !0qQ.A0K(this.A04, bg2.A04) || this.A00 != bg2.A00 || !0qQ.A0K(this.A03, bg2.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BG2(ProductCardSubtitleType productCardSubtitleType, ProductTileMetadata productTileMetadata, ProductTileProduct productTileProduct, ProductTileUCILoggingInfo productTileUCILoggingInfo, RankingInfo rankingInfo, 1Xj r6, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A05 = r6;
        this.A06 = productDetailsProductItemDict;
        this.A02 = productTileProduct;
        this.A01 = productTileMetadata;
        this.A04 = rankingInfo;
        this.A00 = productCardSubtitleType;
        this.A03 = productTileUCILoggingInfo;
    }
}
