package com.instagram.user.model;

import X.1E6;
import X.1E9;
import X.C18714Vyk;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.List;

public interface ProductDetailsProductItemDictIntf extends Parcelable {
    public static final C18714Vyk A00 = C18714Vyk.A00;

    ProductAffiliateInformationDict AaF();

    ProductArtsLabelsDictIntf AcW();

    Boolean Akf();

    Boolean Al2();

    Boolean Al3();

    ProductCheckoutPropertiesIntf An4();

    ProductCheckoutPropertiesIntf An5();

    CheckoutStyle An8();

    CommerceReviewStatisticsDictIntf ApV();

    ProductDiscountsDict Axu();

    Boolean BCN();

    Boolean BCR();

    Boolean BFA();

    String BHy();

    Long BI1();

    ProductLaunchInformation BLh();

    LoyaltyToplineInfoDict BOj();

    ProductImageContainer BOr();

    User BRo();

    String BbZ();

    ProductReviewStatus Bfv();

    List BgH();

    String BkF();

    ProductReviewStatus BoK();

    List BoR();

    SellerBadgeDictIntf Bs8();

    XFBsizeCalibrationScore Bwi();

    Integer Bwj();

    ProductImageContainer C6z();

    String CB1();

    UntaggableReasonIntf CBw();

    List CDZ();

    Boolean CSe();

    Boolean CVG();

    Boolean CWl();

    ProductDetailsProductItemDictIntf EAY(1E9 r1);

    ProductDetailsProductItemDict FGq(1E9 r1);

    ProductDetailsProductItemDict FGr(1E6 r1);

    TreeUpdaterJNI FHC();

    String getCompoundProductId();

    String getCurrentPrice();

    String getCurrentPriceAmount();

    String getCurrentPriceStripped();

    String getDebugInfo();

    String getDescription();

    String getExternalUrl();

    String getFullPrice();

    String getFullPriceAmount();

    String getFullPriceStripped();

    String getMainImageId();

    String getName();

    String getPrice();

    String getProductId();

    String getRetailerId();
}
