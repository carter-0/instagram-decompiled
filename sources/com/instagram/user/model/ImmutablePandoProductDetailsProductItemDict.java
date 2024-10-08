package com.instagram.user.model;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.AnonymousClass91H;
import X.C20782Wyt;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CTA;
import X.DP1;
import X.DP2;
import X.DP3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict;
import com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict;
import com.instagram.api.schemas.ImmutablePandoProductAffiliateInformationDict;
import com.instagram.api.schemas.ImmutablePandoProductArtsLabelsDict;
import com.instagram.api.schemas.ImmutablePandoProductDiscountsDict;
import com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict;
import com.instagram.api.schemas.ImmutablePandoSellerBadgeDict;
import com.instagram.api.schemas.ImmutablePandoTextWithEntitiesBlockDict;
import com.instagram.api.schemas.ImmutablePandoUntaggableReason;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.List;

public final class ImmutablePandoProductDetailsProductItemDict extends 17P implements ProductDetailsProductItemDictIntf {
    public static final C3035269k CREATOR = CTA.A00(83);
    public User A00;

    public final ProductAffiliateInformationDict AaF() {
        return (ProductAffiliateInformationDict) A05(-46281414, ImmutablePandoProductAffiliateInformationDict.class);
    }

    public final ProductArtsLabelsDictIntf AcW() {
        return (ProductArtsLabelsDictIntf) A05(1808133294, ImmutablePandoProductArtsLabelsDict.class);
    }

    public final ProductCheckoutPropertiesIntf An4() {
        return (ProductCheckoutPropertiesIntf) A05(-1890833401, ImmutablePandoProductCheckoutProperties.class);
    }

    public final ProductCheckoutPropertiesIntf An5() {
        return (ProductCheckoutPropertiesIntf) A05(2021764556, ImmutablePandoProductCheckoutProperties.class);
    }

    public final CheckoutStyle An8() {
        return (CheckoutStyle) A0N(1523138936, C20782Wyt.A00);
    }

    public final CommerceReviewStatisticsDictIntf ApV() {
        return (CommerceReviewStatisticsDictIntf) A05(643988486, ImmutablePandoCommerceReviewStatisticsDict.class);
    }

    public final ProductDiscountsDict Axu() {
        return (ProductDiscountsDict) A05(-1513590994, ImmutablePandoProductDiscountsDict.class);
    }

    public final ProductLaunchInformation BLh() {
        return (ProductLaunchInformation) A05(-1071840608, ImmutablePandoProductLaunchInformation.class);
    }

    public final LoyaltyToplineInfoDict BOj() {
        return (LoyaltyToplineInfoDict) A05(301470983, ImmutablePandoLoyaltyToplineInfoDict.class);
    }

    public final ProductImageContainer BOr() {
        return (ProductImageContainer) A05(798171989, ImmutablePandoProductImageContainer.class);
    }

    public final User BRo() {
        return this.A00;
    }

    public final ProductReviewStatus Bfv() {
        return (ProductReviewStatus) A0N(-593451687, DP1.A00);
    }

    public final List BgH() {
        return A08(-275245112, ImmutablePandoProductImageContainer.class);
    }

    public final ProductReviewStatus BoK() {
        return (ProductReviewStatus) A0N(1206018745, DP2.A00);
    }

    public final List BoR() {
        return A08(30415085, ImmutablePandoTextWithEntitiesBlockDict.class);
    }

    public final SellerBadgeDictIntf Bs8() {
        return (SellerBadgeDictIntf) A05(15626979, ImmutablePandoSellerBadgeDict.class);
    }

    public final XFBsizeCalibrationScore Bwi() {
        return (XFBsizeCalibrationScore) A0N(1581109055, DP3.A00);
    }

    public final ProductImageContainer C6z() {
        return (ProductImageContainer) A05(2074606664, ImmutablePandoProductImageContainer.class);
    }

    public final UntaggableReasonIntf CBw() {
        return (UntaggableReasonIntf) A05(119971555, ImmutablePandoUntaggableReason.class);
    }

    public final List CDZ() {
        return A08(-1033709028, ImmutablePandoProductVariantPossibleValueDict.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0100, code lost:
        r2 = r56;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.user.model.ProductDetailsProductItemDict FGq(X.1E9 r56) {
        /*
            r55 = this;
            r0 = r55
            com.instagram.api.schemas.ProductAffiliateInformationDict r1 = r0.AaF()
            if (r1 == 0) goto L_0x0167
            com.instagram.api.schemas.ProductAffiliateInformationDictImpl r8 = r1.F7m()
        L_0x000c:
            com.instagram.api.schemas.ProductArtsLabelsDictIntf r1 = r0.AcW()
            if (r1 == 0) goto L_0x0164
            com.instagram.api.schemas.ProductArtsLabelsDict r9 = r1.F7o()
        L_0x0016:
            r1 = 2126971616(0x7ec702e0, float:1.3226565E38)
            java.lang.Boolean r22 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1925463788(0x72c43eec, float:7.7740966E30)
            java.lang.Boolean r23 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2039092411(0x798a14bb, float:8.961968E34)
            java.lang.Boolean r24 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf r1 = r0.An4()
            if (r1 == 0) goto L_0x0160
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r16 = r1.FFY()
        L_0x0035:
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf r1 = r0.An5()
            if (r1 == 0) goto L_0x015c
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r17 = r1.FFY()
        L_0x003f:
            com.instagram.api.schemas.CheckoutStyle r5 = r0.An8()
            com.instagram.api.schemas.CommerceReviewStatisticsDictIntf r1 = r0.ApV()
            if (r1 == 0) goto L_0x0159
            com.instagram.api.schemas.CommerceReviewStatisticsDict r6 = r1.F23()
        L_0x004d:
            r1 = 601238911(0x23d62d7f, float:2.3221195E-17)
            java.lang.String r33 = r0.A0j(r1)
            r1 = -1711795453(0xffffffff99f81303, float:-2.5650278E-23)
            java.lang.String r34 = r0.A0i(r1)
            r1 = -97885932(0xfffffffffa2a6114, float:-2.2116486E35)
            java.lang.String r35 = r0.A0i(r1)
            r1 = -575829837(0xffffffffddad88b3, float:-1.56305515E18)
            java.lang.String r36 = r0.A0i(r1)
            r1 = -1840544998(0xffffffff924b831a, float:-6.42171E-28)
            java.lang.String r37 = r0.A0i(r1)
            java.lang.String r38 = r0.A0T()
            com.instagram.api.schemas.ProductDiscountsDict r1 = r0.Axu()
            if (r1 == 0) goto L_0x0156
            com.instagram.api.schemas.ProductDiscountsDictImpl r10 = r1.F7t()
        L_0x007e:
            r1 = -1385596165(0xffffffffad697afb, float:-1.3271824E-11)
            java.lang.String r39 = r0.A0i(r1)
            r1 = -450506855(0xffffffffe525cf99, float:-4.893875E22)
            java.lang.String r40 = r0.A0i(r1)
            r1 = 1833004990(0x6d416fbe, float:3.741606E27)
            java.lang.String r41 = r0.A0i(r1)
            r1 = -415525667(0xffffffffe73b94dd, float:-8.858286E23)
            java.lang.String r42 = r0.A0i(r1)
            r1 = 45804691(0x2baec93, float:2.746603E-37)
            java.lang.Boolean r25 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -971305057(0xffffffffc61b0f9f, float:-9923.905)
            java.lang.Boolean r26 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1699805941(0xffffffff9aaf050b, float:-7.238645E-23)
            java.lang.Boolean r27 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -2101995259(0xffffffff82b61905, float:-2.6756857E-37)
            java.lang.String r43 = r0.A0i(r1)
            r1 = -2095434588(0xffffffff831a34a4, float:-4.531696E-37)
            java.lang.Long r32 = r0.A0L(r1)
            r1 = -467471393(0xffffffffe422f3df, float:-1.2023781E22)
            java.lang.Boolean r28 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -752841999(0xffffffffd3208af1, float:-6.8952582E11)
            java.lang.Boolean r29 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1995945578(0xffffffff89084996, float:-1.6405004E-33)
            java.lang.Boolean r30 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r1 = r0.BLh()
            if (r1 == 0) goto L_0x0153
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl r20 = r1.FFd()
        L_0x00dc:
            com.instagram.api.schemas.LoyaltyToplineInfoDict r1 = r0.BOj()
            if (r1 == 0) goto L_0x0151
            com.instagram.api.schemas.LoyaltyToplineInfoDictImpl r7 = r1.F5f()
        L_0x00e6:
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r1 = r0.BOr()
            if (r1 == 0) goto L_0x014e
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r18 = r1.FFc()
        L_0x00f0:
            r1 = 1402868293(0x539e1245, float:1.35782269E12)
            java.lang.String r44 = r0.A0j(r1)
            r1 = -505296440(0xffffffffe1e1c9c8, float:-5.2063216E20)
            com.instagram.user.model.ImmutablePandoUserDict r1 = X.C41845B3m.A0Z(r0, r1)
            if (r1 == 0) goto L_0x014b
            r2 = r56
            com.instagram.user.model.User r1 = X.C41845B3m.A0b(r2, r1)
            if (r1 == 0) goto L_0x014b
            com.instagram.user.model.User r21 = X.C41846B3n.A0b(r2, r1)
        L_0x010c:
            java.lang.String r45 = r0.A0W()
            r1 = 802585392(0x2fd67b30, float:3.9013903E-10)
            java.lang.String r46 = r0.A0i(r1)
            r1 = 106934601(0x65fb149, float:4.2071887E-35)
            java.lang.String r47 = r0.A0i(r1)
            com.instagram.api.schemas.ProductReviewStatus r11 = r0.Bfv()
            r1 = 1753008747(0x687cca6b, float:4.7750812E24)
            java.lang.String r48 = r0.A0j(r1)
            java.util.List r1 = r0.BgH()
            if (r1 == 0) goto L_0x016a
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0137:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r2.next()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r1 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r1
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r1 = r1.FFc()
            r3.add(r1)
            goto L_0x0137
        L_0x014b:
            r21 = 0
            goto L_0x010c
        L_0x014e:
            r18 = 0
            goto L_0x00f0
        L_0x0151:
            r7 = 0
            goto L_0x00e6
        L_0x0153:
            r20 = 0
            goto L_0x00dc
        L_0x0156:
            r10 = 0
            goto L_0x007e
        L_0x0159:
            r6 = 0
            goto L_0x004d
        L_0x015c:
            r17 = 0
            goto L_0x003f
        L_0x0160:
            r16 = 0
            goto L_0x0035
        L_0x0164:
            r9 = 0
            goto L_0x0016
        L_0x0167:
            r8 = 0
            goto L_0x000c
        L_0x016a:
            r3 = 0
        L_0x016b:
            r1 = -1889567899(0xffffffff8f5f7b65, float:-1.1018514E-29)
            java.lang.String r49 = r0.A0i(r1)
            r1 = -1432108342(0xffffffffaaa3c2ca, float:-2.9089779E-13)
            java.lang.String r50 = r0.A0j(r1)
            com.instagram.api.schemas.ProductReviewStatus r12 = r0.BoK()
            java.util.List r1 = r0.BoR()
            if (r1 == 0) goto L_0x019f
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x018b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x01a0
            java.lang.Object r1 = r4.next()
            com.instagram.api.schemas.TextWithEntitiesBlockDictIntf r1 = (com.instagram.api.schemas.TextWithEntitiesBlockDictIntf) r1
            com.instagram.api.schemas.TextWithEntitiesBlockDict r1 = r1.FCq()
            r2.add(r1)
            goto L_0x018b
        L_0x019f:
            r2 = 0
        L_0x01a0:
            com.instagram.api.schemas.SellerBadgeDictIntf r1 = r0.Bs8()
            if (r1 == 0) goto L_0x01f7
            com.instagram.api.schemas.SellerBadgeDict r13 = r1.F8u()
        L_0x01aa:
            com.instagram.api.schemas.XFBsizeCalibrationScore r15 = r0.Bwi()
            r1 = -113072286(0xfffffffff942a762, float:-6.316878E34)
            java.lang.Integer r31 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r1 = r0.C6z()
            if (r1 == 0) goto L_0x01f4
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r19 = r1.FFc()
        L_0x01bf:
            r1 = -1599733110(0xffffffffa0a6028a, float:-2.8123174E-19)
            java.lang.String r51 = r0.A0i(r1)
            com.instagram.api.schemas.UntaggableReasonIntf r1 = r0.CBw()
            if (r1 == 0) goto L_0x01f2
            com.instagram.api.schemas.UntaggableReason r14 = r1.FCz()
        L_0x01d0:
            java.util.List r0 = r0.CDZ()
            if (r0 == 0) goto L_0x01f9
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x01de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r4.next()
            com.instagram.api.schemas.ProductVariantPossibleValueDictIntf r0 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r0
            com.instagram.api.schemas.ProductVariantPossibleValueDict r0 = r0.F86()
            r1.add(r0)
            goto L_0x01de
        L_0x01f2:
            r14 = 0
            goto L_0x01d0
        L_0x01f4:
            r19 = 0
            goto L_0x01bf
        L_0x01f7:
            r13 = 0
            goto L_0x01aa
        L_0x01f9:
            r1 = 0
        L_0x01fa:
            com.instagram.user.model.ProductDetailsProductItemDict r4 = new com.instagram.user.model.ProductDetailsProductItemDict
            r52 = r3
            r53 = r2
            r54 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict.FGq(X.1E9):com.instagram.user.model.ProductDetailsProductItemDict");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.instagram.user.model.ProductDetailsProductItemDictIntf, com.facebook.pando.TreeJNI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, AnonymousClass91H.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean Akf() {
        return getOptionalBooleanValueByHashCode(2126971616);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean Al2() {
        return getOptionalBooleanValueByHashCode(1925463788);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean Al3() {
        return getOptionalBooleanValueByHashCode(2039092411);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean BCN() {
        return getOptionalBooleanValueByHashCode(45804691);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean BCR() {
        return getOptionalBooleanValueByHashCode(-971305057);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean BFA() {
        return getOptionalBooleanValueByHashCode(-1699805941);
    }

    public final String BHy() {
        return A0i(-2101995259);
    }

    public final Long BI1() {
        return A0L(-2095434588);
    }

    public final String BbZ() {
        return A0i(802585392);
    }

    public final String BkF() {
        return A0i(-1889567899);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Integer Bwj() {
        return getOptionalIntValueByHashCode(-113072286);
    }

    public final String CB1() {
        return A0i(-1599733110);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean CSe() {
        return getOptionalBooleanValueByHashCode(-467471393);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean CVG() {
        return getOptionalBooleanValueByHashCode(-752841999);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final Boolean CWl() {
        return getOptionalBooleanValueByHashCode(-1995945578);
    }

    public final ProductDetailsProductItemDictIntf EAY(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -505296440);
        return this;
    }

    public final ProductDetailsProductItemDict FGr(1E6 r2) {
        return FGq(C41847B3o.A0p());
    }

    public final String getCompoundProductId() {
        return A0j(601238911);
    }

    public final String getCurrentPrice() {
        return A0i(-1711795453);
    }

    public final String getCurrentPriceAmount() {
        return A0i(-97885932);
    }

    public final String getCurrentPriceStripped() {
        return A0i(-575829837);
    }

    public final String getDebugInfo() {
        return A0i(-1840544998);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getExternalUrl() {
        return A0i(-1385596165);
    }

    public final String getFullPrice() {
        return A0i(-450506855);
    }

    public final String getFullPriceAmount() {
        return A0i(1833004990);
    }

    public final String getFullPriceStripped() {
        return A0i(-415525667);
    }

    public final String getMainImageId() {
        return A0j(1402868293);
    }

    public final String getName() {
        return A0W();
    }

    public final String getPrice() {
        return A0i(106934601);
    }

    public final String getProductId() {
        return A0j(1753008747);
    }

    public final String getRetailerId() {
        return A0j(-1432108342);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
