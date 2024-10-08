package com.instagram.feed.media;

import X.1E6;
import X.1E9;
import X.AGe;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.List;

public interface ReelCTAIntf extends Parcelable {
    public static final AGe A00 = AGe.A00;

    ShoppingSwipeUpCTATextIcon AtJ();

    String AtK();

    String AtL();

    String AtU();

    EffectPreviewIntf B0A();

    String B5a();

    String B5b();

    Boolean BBN();

    List BN4();

    ReelMultiProductLinkIntf BUd();

    String BXk();

    List Bfy();

    ProductCollectionLinkIntf Bg1();

    ReelProductLinkIntf BgL();

    ProfileShopLinkIntf BhE();

    ReelCTAIntf E9n(1E9 r1);

    ReelCTA FEG(1E9 r1);

    ReelCTA FEH(1E6 r1);

    TreeUpdaterJNI FHC();
}
