package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.model.shopping.reels.MultiProductSticker;
import java.util.List;

public abstract class CnO {
    public static final String A00(MultiProductSticker multiProductSticker) {
        String str;
        0qQ.A0B(multiProductSticker, 0);
        List list = multiProductSticker.A0A;
        if (list == null || list.isEmpty()) {
            throw AnonymousClass7TE.A0z("stickers should be non empty");
        }
        ProductItemStickerBundleStyle productItemStickerBundleStyle = ((StoryProductItemStickerTappableData) list.get(0)).A00;
        if (productItemStickerBundleStyle == null || (str = productItemStickerBundleStyle.A00) == null) {
            return ProductItemStickerBundleStyle.UNRECOGNIZED.toString();
        }
        return str;
    }
}
