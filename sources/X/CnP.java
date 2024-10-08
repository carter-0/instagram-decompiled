package X;

import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.reels.MultiProductStickerIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CnP {
    public static Map A00(MultiProductStickerIntf multiProductStickerIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (multiProductStickerIntf.getId() != null) {
            C41845B3m.A0x(multiProductStickerIntf.getId(), A1H);
        }
        if (multiProductStickerIntf.CYe() != null) {
            A1H.put("is_organic_product_tagging", multiProductStickerIntf.CYe());
        }
        ArrayList arrayList3 = null;
        if (multiProductStickerIntf.BN4() != null) {
            List<StoryMultiProductStickerLinkData> BN4 = multiProductStickerIntf.BN4();
            if (BN4 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (StoryMultiProductStickerLinkData storyMultiProductStickerLinkData : BN4) {
                    if (storyMultiProductStickerLinkData != null) {
                        arrayList2.add(storyMultiProductStickerLinkData.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("links", arrayList2);
        }
        if (multiProductStickerIntf.getMediaId() != null) {
            C41845B3m.A13(multiProductStickerIntf.getMediaId(), A1H);
        }
        if (multiProductStickerIntf.BUc() != null) {
            List BUc = multiProductStickerIntf.BUc();
            if (BUc != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = BUc.iterator();
                while (it.hasNext()) {
                    C41848B3p.A1W(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1H.put("multi_product_items", arrayList);
        }
        if (multiProductStickerIntf.Bzq() != null) {
            List<StoryProductItemStickerTappableDataIntf> Bzq = multiProductStickerIntf.Bzq();
            if (Bzq != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (StoryProductItemStickerTappableDataIntf storyProductItemStickerTappableDataIntf : Bzq) {
                    if (storyProductItemStickerTappableDataIntf != null) {
                        arrayList3.add(storyProductItemStickerTappableDataIntf.FHC());
                    }
                }
            }
            A1H.put("stickers", arrayList3);
        }
        if (multiProductStickerIntf.getText() != null) {
            C41845B3m.A10(multiProductStickerIntf.getText(), A1H);
        }
        if (multiProductStickerIntf.C5C() != null) {
            A1H.put("text_format", multiProductStickerIntf.C5C());
        }
        if (multiProductStickerIntf.C5b() != null) {
            A1H.put("text_review_status", multiProductStickerIntf.C5b());
        }
        if (multiProductStickerIntf.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, multiProductStickerIntf.getUserId());
        }
        if (multiProductStickerIntf.CDo() != null) {
            A1H.put("vibrant_text_color", multiProductStickerIntf.CDo());
        }
        return 0Yt.A0B(A1H);
    }
}
