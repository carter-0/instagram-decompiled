package X;

import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vic  reason: case insensitive filesystem */
public abstract class C17947Vic {
    public CheckoutStyle A00;
    public CommerceReviewStatisticsDictIntf A01;
    public LoyaltyToplineInfoDict A02;
    public ProductAffiliateInformationDict A03;
    public ProductArtsLabelsDictIntf A04;
    public ProductDiscountsDict A05;
    public ProductReviewStatus A06;
    public ProductReviewStatus A07;
    public SellerBadgeDictIntf A08;
    public UntaggableReasonIntf A09;
    public XFBsizeCalibrationScore A0A;
    public ProductCheckoutPropertiesIntf A0B;
    public ProductCheckoutPropertiesIntf A0C;
    public ProductImageContainer A0D;
    public ProductImageContainer A0E;
    public ProductLaunchInformation A0F;
    public User A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Integer A0Q;
    public Long A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public List A0l;
    public List A0m;
    public List A0n;
    public final ProductDetailsProductItemDictIntf A0o;

    public final ProductDetailsProductItemDict A00() {
        ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl;
        ProductArtsLabelsDict productArtsLabelsDict;
        ProductCheckoutProperties productCheckoutProperties;
        ProductCheckoutProperties productCheckoutProperties2;
        ProductDiscountsDictImpl productDiscountsDictImpl;
        ProductLaunchInformationImpl productLaunchInformationImpl;
        LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl;
        ProductImageContainerImpl productImageContainerImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        SellerBadgeDict sellerBadgeDict;
        ProductImageContainerImpl productImageContainerImpl2;
        UntaggableReason untaggableReason;
        ArrayList arrayList3;
        CommerceReviewStatisticsDict commerceReviewStatisticsDict = null;
        AnonymousClass7TH.A0K();
        ProductAffiliateInformationDict productAffiliateInformationDict = this.A03;
        if (productAffiliateInformationDict != null) {
            productAffiliateInformationDictImpl = productAffiliateInformationDict.F7m();
        } else {
            productAffiliateInformationDictImpl = null;
        }
        ProductArtsLabelsDictIntf productArtsLabelsDictIntf = this.A04;
        if (productArtsLabelsDictIntf != null) {
            productArtsLabelsDict = productArtsLabelsDictIntf.F7o();
        } else {
            productArtsLabelsDict = null;
        }
        Boolean bool = this.A0H;
        Boolean bool2 = this.A0I;
        Boolean bool3 = this.A0J;
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = this.A0B;
        if (productCheckoutPropertiesIntf != null) {
            productCheckoutProperties = productCheckoutPropertiesIntf.FFY();
        } else {
            productCheckoutProperties = null;
        }
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf2 = this.A0C;
        if (productCheckoutPropertiesIntf2 != null) {
            productCheckoutProperties2 = productCheckoutPropertiesIntf2.FFY();
        } else {
            productCheckoutProperties2 = null;
        }
        CheckoutStyle checkoutStyle = this.A00;
        CommerceReviewStatisticsDictIntf commerceReviewStatisticsDictIntf = this.A01;
        if (commerceReviewStatisticsDictIntf != null) {
            commerceReviewStatisticsDict = commerceReviewStatisticsDictIntf.F23();
        }
        String str = this.A0S;
        String str2 = this.A0T;
        String str3 = this.A0U;
        String str4 = this.A0V;
        String str5 = this.A0W;
        String str6 = this.A0X;
        ProductDiscountsDict productDiscountsDict = this.A05;
        if (productDiscountsDict != null) {
            productDiscountsDictImpl = productDiscountsDict.F7t();
        } else {
            productDiscountsDictImpl = null;
        }
        String str7 = this.A0Y;
        String str8 = this.A0Z;
        String str9 = this.A0a;
        String str10 = this.A0b;
        Boolean bool4 = this.A0K;
        Boolean bool5 = this.A0L;
        Boolean bool6 = this.A0M;
        String str11 = this.A0c;
        Long l = this.A0R;
        Boolean bool7 = this.A0N;
        Boolean bool8 = this.A0O;
        Boolean bool9 = this.A0P;
        ProductLaunchInformation productLaunchInformation = this.A0F;
        if (productLaunchInformation != null) {
            productLaunchInformationImpl = productLaunchInformation.FFd();
        } else {
            productLaunchInformationImpl = null;
        }
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = this.A02;
        if (loyaltyToplineInfoDict != null) {
            loyaltyToplineInfoDictImpl = loyaltyToplineInfoDict.F5f();
        } else {
            loyaltyToplineInfoDictImpl = null;
        }
        ProductImageContainer productImageContainer = this.A0D;
        if (productImageContainer != null) {
            productImageContainerImpl = productImageContainer.FFc();
        } else {
            productImageContainerImpl = null;
        }
        String str12 = this.A0d;
        User user = this.A0G;
        String str13 = this.A0e;
        String str14 = this.A0f;
        String str15 = this.A0g;
        ProductReviewStatus productReviewStatus = this.A06;
        String str16 = this.A0h;
        List<ProductImageContainer> list = this.A0l;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (ProductImageContainer FFc : list) {
                arrayList.add(FFc.FFc());
            }
        } else {
            arrayList = null;
        }
        String str17 = this.A0i;
        String str18 = this.A0j;
        ProductReviewStatus productReviewStatus2 = this.A07;
        List<TextWithEntitiesBlockDictIntf> list2 = this.A0m;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            for (TextWithEntitiesBlockDictIntf FCq : list2) {
                arrayList2.add(FCq.FCq());
            }
        } else {
            arrayList2 = null;
        }
        SellerBadgeDictIntf sellerBadgeDictIntf = this.A08;
        if (sellerBadgeDictIntf != null) {
            sellerBadgeDict = sellerBadgeDictIntf.F8u();
        } else {
            sellerBadgeDict = null;
        }
        XFBsizeCalibrationScore xFBsizeCalibrationScore = this.A0A;
        Integer num = this.A0Q;
        ProductImageContainer productImageContainer2 = this.A0E;
        if (productImageContainer2 != null) {
            productImageContainerImpl2 = productImageContainer2.FFc();
        } else {
            productImageContainerImpl2 = null;
        }
        String str19 = this.A0k;
        UntaggableReasonIntf untaggableReasonIntf = this.A09;
        if (untaggableReasonIntf != null) {
            untaggableReason = untaggableReasonIntf.FCz();
        } else {
            untaggableReason = null;
        }
        List<ProductVariantPossibleValueDictIntf> list3 = this.A0n;
        if (list3 != null) {
            arrayList3 = AnonymousClass7TF.A0p(list3);
            for (ProductVariantPossibleValueDictIntf F86 : list3) {
                arrayList3.add(F86.F86());
            }
        } else {
            arrayList3 = null;
        }
        return new ProductDetailsProductItemDict(checkoutStyle, commerceReviewStatisticsDict, loyaltyToplineInfoDictImpl, productAffiliateInformationDictImpl, productArtsLabelsDict, productDiscountsDictImpl, productReviewStatus, productReviewStatus2, sellerBadgeDict, untaggableReason, xFBsizeCalibrationScore, productCheckoutProperties, productCheckoutProperties2, productImageContainerImpl, productImageContainerImpl2, productLaunchInformationImpl, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, arrayList, arrayList2, arrayList3);
    }

    public C17947Vic(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        this.A0o = productDetailsProductItemDictIntf;
        this.A03 = productDetailsProductItemDictIntf.AaF();
        this.A04 = productDetailsProductItemDictIntf.AcW();
        this.A0H = productDetailsProductItemDictIntf.Akf();
        this.A0I = productDetailsProductItemDictIntf.Al2();
        this.A0J = productDetailsProductItemDictIntf.Al3();
        this.A0B = productDetailsProductItemDictIntf.An4();
        this.A0C = productDetailsProductItemDictIntf.An5();
        this.A00 = productDetailsProductItemDictIntf.An8();
        this.A01 = productDetailsProductItemDictIntf.ApV();
        this.A0S = productDetailsProductItemDictIntf.getCompoundProductId();
        this.A0T = productDetailsProductItemDictIntf.getCurrentPrice();
        this.A0U = productDetailsProductItemDictIntf.getCurrentPriceAmount();
        this.A0V = productDetailsProductItemDictIntf.getCurrentPriceStripped();
        this.A0W = productDetailsProductItemDictIntf.getDebugInfo();
        this.A0X = productDetailsProductItemDictIntf.getDescription();
        this.A05 = productDetailsProductItemDictIntf.Axu();
        this.A0Y = productDetailsProductItemDictIntf.getExternalUrl();
        this.A0Z = productDetailsProductItemDictIntf.getFullPrice();
        this.A0a = productDetailsProductItemDictIntf.getFullPriceAmount();
        this.A0b = productDetailsProductItemDictIntf.getFullPriceStripped();
        this.A0K = productDetailsProductItemDictIntf.BCN();
        this.A0L = productDetailsProductItemDictIntf.BCR();
        this.A0M = productDetailsProductItemDictIntf.BFA();
        this.A0c = productDetailsProductItemDictIntf.BHy();
        this.A0R = productDetailsProductItemDictIntf.BI1();
        this.A0N = productDetailsProductItemDictIntf.CSe();
        this.A0O = productDetailsProductItemDictIntf.CVG();
        this.A0P = productDetailsProductItemDictIntf.CWl();
        this.A0F = productDetailsProductItemDictIntf.BLh();
        this.A02 = productDetailsProductItemDictIntf.BOj();
        this.A0D = productDetailsProductItemDictIntf.BOr();
        this.A0d = productDetailsProductItemDictIntf.getMainImageId();
        this.A0G = productDetailsProductItemDictIntf.BRo();
        this.A0e = productDetailsProductItemDictIntf.getName();
        this.A0f = productDetailsProductItemDictIntf.BbZ();
        this.A0g = productDetailsProductItemDictIntf.getPrice();
        this.A06 = productDetailsProductItemDictIntf.Bfv();
        this.A0h = productDetailsProductItemDictIntf.getProductId();
        this.A0l = productDetailsProductItemDictIntf.BgH();
        this.A0i = productDetailsProductItemDictIntf.BkF();
        this.A0j = productDetailsProductItemDictIntf.getRetailerId();
        this.A07 = productDetailsProductItemDictIntf.BoK();
        this.A0m = productDetailsProductItemDictIntf.BoR();
        this.A08 = productDetailsProductItemDictIntf.Bs8();
        this.A0A = productDetailsProductItemDictIntf.Bwi();
        this.A0Q = productDetailsProductItemDictIntf.Bwj();
        this.A0E = productDetailsProductItemDictIntf.C6z();
        this.A0k = productDetailsProductItemDictIntf.CB1();
        this.A09 = productDetailsProductItemDictIntf.CBw();
        this.A0n = productDetailsProductItemDictIntf.CDZ();
    }
}
