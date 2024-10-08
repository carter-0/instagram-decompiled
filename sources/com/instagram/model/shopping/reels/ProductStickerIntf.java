package com.instagram.model.shopping.reels;

import X.1E6;
import X.1E9;
import X.D95;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

public interface ProductStickerIntf extends Parcelable {
    public static final D95 A00 = D95.A00;

    String AsH();

    DropsLaunchAnimationIntf AzD();

    DropsEventPageNavigationMetadata B2L();

    ProductDetailsProductItemDictIntf BgJ();

    List Bzq();

    String C5C();

    TextReviewStatus C5a();

    String CDo();

    Boolean CG8();

    Boolean CYe();

    Boolean Cbh();

    ProductStickerIntf EAB(1E9 r1);

    ProductSticker FFm(1E9 r1);

    ProductSticker FFn(1E6 r1);

    TreeUpdaterJNI FHC();

    String getId();

    String getMediaId();

    String getText();

    String getUserId();
}
