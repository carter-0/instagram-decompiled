package com.instagram.user.model;

import X.0lg;
import X.0qQ;
import X.0sn;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.AnonymousClass1Nd;
import X.AnonymousClass3DT;
import X.AnonymousClass3ZL;
import X.C17947Vic;
import X.C243373Ym;
import X.C273654mx;
import X.C376399Hv;
import X.WQH;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.tagging.model.TaggableModel;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Deprecated;

public final class Product extends AnonymousClass0T0 implements AnonymousClass3ZL, TaggableModel {
    public static final Parcelable.Creator CREATOR = new C376399Hv(87);
    public TaggingFeedSessionInformation A00;
    public ProductDetailsProductItemDict A01;
    public final CommerceReviewStatisticsDictIntf A02;
    public final LoyaltyToplineInfoDict A03;
    public final ProductAffiliateInformationDict A04;
    public final ProductReviewStatus A05;
    public final UntaggableReason A06;
    public final ImageInfo A07;
    public final ImageInfo A08;
    public final ProductImageContainer A09;
    public final ProductImageContainer A0A;
    public final User A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final ProductImageContainer A0R;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        if ((r1 != null ? r1.A00 : r2) == com.instagram.api.schemas.InstagramProductTaggabilityState.A04) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Product(com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r7, com.instagram.user.model.ProductDetailsProductItemDict r8) {
        /*
            r6 = this;
            r4 = 1
            X.0qQ.A0B(r8, r4)
            r6.<init>()
            r6.A01 = r8
            r6.A00 = r7
            java.lang.String r0 = r8.A0W
            r6.A0D = r0
            java.lang.String r0 = r8.A0X
            r6.A0E = r0
            java.lang.String r0 = r8.A0Y
            r6.A0F = r0
            java.lang.String r3 = r8.A0b
            if (r3 != 0) goto L_0x001d
            java.lang.String r3 = r8.A0Z
        L_0x001d:
            r6.A0G = r3
            java.lang.String r0 = r8.A0h
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = ""
        L_0x0025:
            r6.A0H = r0
            java.lang.String r0 = r8.A0S
            r6.A0C = r0
            com.instagram.api.schemas.ProductDiscountsDict r0 = r8.A05
            r2 = 0
            if (r0 == 0) goto L_0x00f3
            java.util.List r0 = r0.Axx()
        L_0x0034:
            r6.A0N = r0
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r6.A01
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r0.A0D
            if (r0 == 0) goto L_0x00f0
            com.instagram.model.mediasize.ImageInfo r0 = r0.BGO()
        L_0x0040:
            r6.A07 = r0
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r6.A01
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r0.A0D
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = r0.getPreview()
        L_0x004c:
            r6.A0I = r0
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r6.A01
            com.instagram.user.model.User r0 = r1.A0G
            r6.A0B = r0
            java.lang.String r0 = r1.A0e
            r6.A0J = r0
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0064
            java.lang.String r3 = r1.A0V
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = r1.A0T
        L_0x0064:
            r6.A0L = r3
            java.lang.String r0 = r1.A0f
            r6.A0K = r0
            com.instagram.api.schemas.ProductReviewStatus r0 = r1.A07
            if (r0 != 0) goto L_0x0070
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
        L_0x0070:
            r6.A05 = r0
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r1.A0D
            r6.A09 = r0
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r1.A0E
            if (r0 == 0) goto L_0x0080
            com.instagram.model.mediasize.ImageInfo r0 = r0.BGO()
            if (r0 != 0) goto L_0x008a
        L_0x0080:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r6.A01
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r0.A0D
            if (r0 == 0) goto L_0x00eb
            com.instagram.model.mediasize.ImageInfo r0 = r0.BGO()
        L_0x008a:
            r6.A08 = r0
            com.instagram.user.model.ProductDetailsProductItemDict r5 = r6.A01
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r5.A0E
            r6.A0R = r0
            if (r0 != 0) goto L_0x0096
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r5.A0D
        L_0x0096:
            r6.A0A = r0
            java.util.List r0 = r5.A0n
            r6.A0O = r0
            java.lang.String r0 = r5.A0j
            r6.A0M = r0
            com.instagram.api.schemas.UntaggableReason r1 = r5.A09
            r6.A06 = r1
            if (r1 == 0) goto L_0x00e9
            com.instagram.api.schemas.InstagramProductTaggabilityState r0 = r1.A00
        L_0x00a8:
            r3 = 1
            if (r0 == 0) goto L_0x00b4
            if (r1 == 0) goto L_0x00af
            com.instagram.api.schemas.InstagramProductTaggabilityState r2 = r1.A00
        L_0x00af:
            com.instagram.api.schemas.InstagramProductTaggabilityState r1 = com.instagram.api.schemas.InstagramProductTaggabilityState.TAGGABLE
            r0 = 0
            if (r2 != r1) goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            r6.A0Q = r0
            com.instagram.api.schemas.ProductAffiliateInformationDict r0 = r5.A03
            r6.A04 = r0
            com.instagram.api.schemas.LoyaltyToplineInfoDict r0 = r5.A02
            r6.A03 = r0
            com.instagram.api.schemas.CommerceReviewStatisticsDict r0 = r5.A01
            r6.A02 = r0
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r5.A0C
            if (r0 == 0) goto L_0x00d4
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x00d4
        L_0x00d1:
            r6.A0P = r3
            return
        L_0x00d4:
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r5.A0F
            if (r0 == 0) goto L_0x00e7
            java.lang.Boolean r1 = r0.BBR()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00e7
            goto L_0x00d1
        L_0x00e7:
            r3 = 0
            goto L_0x00d1
        L_0x00e9:
            r0 = r2
            goto L_0x00a8
        L_0x00eb:
            r0 = r2
            goto L_0x008a
        L_0x00ed:
            r0 = r2
            goto L_0x004c
        L_0x00f0:
            r0 = r2
            goto L_0x0040
        L_0x00f3:
            r0 = r2
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.Product.<init>(com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation, com.instagram.user.model.ProductDetailsProductItemDict):void");
    }

    public final void AE7(0lg r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass1Nd.A00(r3).A00(new AnonymousClass3DT(this));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Product) {
                Product product = (Product) obj;
                if (!0qQ.A0K(this.A01, product.A01) || !0qQ.A0K(this.A00, product.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        TaggingFeedSessionInformation taggingFeedSessionInformation = this.A00;
        return hashCode + (taggingFeedSessionInformation == null ? 0 : taggingFeedSessionInformation.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final boolean A03() {
        List list = this.A01.A0n;
        if (list == null) {
            return false;
        }
        for (Object next : list) {
            if (((ProductVariantPossibleValueDict) next).A00 == ProductVariantVisualStyle.THUMBNAIL) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean A04() {
        return C273654mx.A00(3052).equals(String.valueOf(this.A01.A00));
    }

    public final boolean A05() {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        String str = productDetailsProductItemDict.A0V;
        if (str == null) {
            str = productDetailsProductItemDict.A0T;
        }
        String str2 = this.A0G;
        if (str == null) {
            if (str2 != null) {
                return true;
            }
            return false;
        } else if (!str.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A06() {
        Long l;
        ProductCheckoutProperties productCheckoutProperties = this.A01.A0C;
        if (productCheckoutProperties != null) {
            l = productCheckoutProperties.A0F;
        } else {
            l = null;
        }
        if (!A04() || l == null) {
            return false;
        }
        long longValue = l.longValue() * 1000;
        if (longValue > 0) {
            return new Date(System.currentTimeMillis()).before(new Date(longValue));
        }
        return false;
    }

    public final String BHy() {
        return this.A01.A0c;
    }

    public final long BI0() {
        Long l = this.A01.A0R;
        if (l != null) {
            return l.longValue();
        }
        return System.currentTimeMillis();
    }

    public final C243373Ym BpO() {
        if (0qQ.A0K(this.A01.A0L, true)) {
            return C243373Ym.SAVED;
        }
        return C243373Ym.NOT_SAVED;
    }

    public final String BpP() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ Collection BpQ() {
        return 0sn.A00;
    }

    public final Integer BpT() {
        return AnonymousClass05K.A01;
    }

    @Deprecated(message = "Please use SavedProductStore.isSaved() instead")
    public final boolean CbC() {
        Boolean bool = this.A01.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void EjB(C243373Ym r4) {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A01;
        0qQ.A0B(productDetailsProductItemDict, 1);
        C17947Vic vic = new C17947Vic(productDetailsProductItemDict);
        boolean z = false;
        if (r4 == C243373Ym.SAVED) {
            z = true;
        }
        vic.A0L = Boolean.valueOf(z);
        this.A01 = vic.A00();
    }

    public final String getId() {
        return this.A0H;
    }

    public final void A00(0lg r3) {
        AnonymousClass1Nd.A00(r3).A00(new WQH(this));
    }

    public final void A01(String str) {
        A01(str);
        throw null;
    }

    public final void A02(String str) {
        A02(str);
        throw null;
    }
}
