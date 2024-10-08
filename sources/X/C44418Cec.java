package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import java.io.IOException;

/* renamed from: X.Cec  reason: case insensitive filesystem */
public abstract class C44418Cec {
    public static StoryProductItemStickerTappableData parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ProductItemStickerBundleStyle productItemStickerBundleStyle = null;
            while (r4.A1J() != 16L.A09) {
                if (C41846B3n.A1Y(r4, r4.A0q())) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    productItemStickerBundleStyle = (ProductItemStickerBundleStyle) ProductItemStickerBundleStyle.A01.get(str);
                    if (productItemStickerBundleStyle == null) {
                        productItemStickerBundleStyle = ProductItemStickerBundleStyle.UNRECOGNIZED;
                    }
                }
                r4.A0z();
            }
            return new StoryProductItemStickerTappableData(productItemStickerBundleStyle);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
