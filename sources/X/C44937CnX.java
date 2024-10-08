package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CnX  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44937CnX {
    public static Map A00(ProductStickerIntf productStickerIntf) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productStickerIntf.AsH() != null) {
            A1H.put("creation_method", productStickerIntf.AsH());
        }
        String str = null;
        if (productStickerIntf.AzD() != null) {
            DropsLaunchAnimationIntf AzD = productStickerIntf.AzD();
            if (AzD != null) {
                treeUpdaterJNI3 = AzD.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("drops_launch_animation", treeUpdaterJNI3);
        }
        if (productStickerIntf.B2L() != null) {
            DropsEventPageNavigationMetadata B2L = productStickerIntf.B2L();
            if (B2L != null) {
                treeUpdaterJNI2 = B2L.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("event_page_navigation_metadata", treeUpdaterJNI2);
        }
        if (productStickerIntf.getId() != null) {
            C41845B3m.A0x(productStickerIntf.getId(), A1H);
        }
        if (productStickerIntf.CYe() != null) {
            A1H.put("is_organic_product_tagging", productStickerIntf.CYe());
        }
        if (productStickerIntf.Cbh() != null) {
            A1H.put("is_set_reminder_button_enabled", productStickerIntf.Cbh());
        }
        if (productStickerIntf.getMediaId() != null) {
            C41845B3m.A13(productStickerIntf.getMediaId(), A1H);
        }
        if (productStickerIntf.BgJ() != null) {
            ProductDetailsProductItemDictIntf BgJ = productStickerIntf.BgJ();
            if (BgJ != null) {
                treeUpdaterJNI = BgJ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("product_item", treeUpdaterJNI);
        }
        if (productStickerIntf.Bzq() != null) {
            List<StoryProductItemStickerTappableDataIntf> Bzq = productStickerIntf.Bzq();
            if (Bzq != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (StoryProductItemStickerTappableDataIntf storyProductItemStickerTappableDataIntf : Bzq) {
                    if (storyProductItemStickerTappableDataIntf != null) {
                        arrayList.add(storyProductItemStickerTappableDataIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("stickers", arrayList);
        }
        if (productStickerIntf.getText() != null) {
            C41845B3m.A10(productStickerIntf.getText(), A1H);
        }
        if (productStickerIntf.C5C() != null) {
            A1H.put("text_format", productStickerIntf.C5C());
        }
        if (productStickerIntf.C5a() != null) {
            TextReviewStatus C5a = productStickerIntf.C5a();
            if (C5a != null) {
                str = C5a.A00;
            }
            A1H.put("text_review_status", str);
        }
        if (productStickerIntf.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, productStickerIntf.getUserId());
        }
        if (productStickerIntf.CDo() != null) {
            A1H.put("vibrant_text_color", productStickerIntf.CDo());
        }
        if (productStickerIntf.CG8() != null) {
            A1H.put("was_text_edited", productStickerIntf.CG8());
        }
        return 0Yt.A0B(A1H);
    }
}
