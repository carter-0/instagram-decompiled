package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.model.shopping.reels.ProductSticker;
import java.util.List;

/* renamed from: X.CnW  reason: case insensitive filesystem */
public abstract class C44936CnW {
    public static final String A00(ProductSticker productSticker) {
        String str;
        0qQ.A0B(productSticker, 0);
        List list = productSticker.A0E;
        if (list == null || list.isEmpty() || ((StoryProductItemStickerTappableData) list.get(0)).A00 == null) {
            throw AnonymousClass7TE.A0z("sticker ID expected");
        }
        ProductItemStickerBundleStyle productItemStickerBundleStyle = ((StoryProductItemStickerTappableData) list.get(0)).A00;
        if (productItemStickerBundleStyle == null || (str = productItemStickerBundleStyle.A00) == null) {
            return ProductItemStickerBundleStyle.UNRECOGNIZED.toString();
        }
        return str;
    }
}
