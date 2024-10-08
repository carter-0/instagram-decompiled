package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.CcM  reason: case insensitive filesystem */
public abstract class C44278CcM {
    public static BG2 parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            1Xj r8 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            ProductTileProductImpl productTileProductImpl = null;
            ProductTileMetadataImpl productTileMetadataImpl = null;
            RankingInfo rankingInfo = null;
            ProductCardSubtitleType productCardSubtitleType = null;
            ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (C41845B3m.A1D(A17)) {
                    r8 = 1Xj.A00(r10);
                } else if ("micro_product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r10);
                } else if ("product".equals(A17)) {
                    productTileProductImpl = C44273CcH.parseFromJson(r10);
                } else if ("product_metadata".equals(A17)) {
                    productTileMetadataImpl = C44271CcF.parseFromJson(r10);
                } else if ("ranking_info".equals(A17)) {
                    rankingInfo = V85.parseFromJson(r10);
                } else if ("subtitle_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    productCardSubtitleType = (ProductCardSubtitleType) ProductCardSubtitleType.A01.get(str);
                    if (productCardSubtitleType == null) {
                        productCardSubtitleType = ProductCardSubtitleType.UNRECOGNIZED;
                    }
                } else if ("uci_logging_info".equals(A17)) {
                    productTileUCILoggingInfoImpl = V82.parseFromJson(r10);
                }
                r10.A0z();
            }
            return new BG2(productCardSubtitleType, productTileMetadataImpl, productTileProductImpl, productTileUCILoggingInfoImpl, rankingInfo, r8, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
