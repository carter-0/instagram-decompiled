package com.instagram.model.shopping.reels;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44937CnX;
import X.C46152DOf;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

public final class ImmutablePandoProductSticker extends 17P implements ProductStickerIntf {
    public static final C3035269k CREATOR = CTA.A00(58);
    public ProductDetailsProductItemDictIntf A00;

    public final DropsLaunchAnimationIntf AzD() {
        return (DropsLaunchAnimationIntf) A05(461462899, ImmutablePandoDropsLaunchAnimation.class);
    }

    public final DropsEventPageNavigationMetadata B2L() {
        return (DropsEventPageNavigationMetadata) A05(935996751, ImmutablePandoDropsEventPageNavigationMetadata.class);
    }

    public final ProductDetailsProductItemDictIntf BgJ() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public final List Bzq() {
        return A08(1531715286, ImmutablePandoStoryProductItemStickerTappableData.class);
    }

    public final TextReviewStatus C5a() {
        return (TextReviewStatus) A0N(1914398503, C46152DOf.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.reels.ProductStickerIntf, com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductSticker] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44937CnX.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AsH() {
        return A0i(1342355009);
    }

    public final String C5C() {
        return A0i(-1064897719);
    }

    public final String CDo() {
        return A0i(1595179052);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductSticker] */
    public final Boolean CG8() {
        return getOptionalBooleanValueByHashCode(402861861);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductSticker] */
    public final Boolean CYe() {
        return getOptionalBooleanValueByHashCode(-1403186180);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductSticker] */
    public final Boolean Cbh() {
        return getOptionalBooleanValueByHashCode(-1801354193);
    }

    public final ProductStickerIntf EAB(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, BgJ());
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.shopping.reels.ProductSticker FFm(X.1E9 r20) {
        /*
            r19 = this;
            r0 = 1342355009(0x5002b641, float:8.7719291E9)
            r2 = r19
            java.lang.String r11 = r2.A0i(r0)
            com.instagram.model.shopping.drops.DropsLaunchAnimationIntf r1 = r2.AzD()
            r0 = 0
            if (r1 == 0) goto L_0x0066
            com.instagram.model.shopping.drops.DropsLaunchAnimation r6 = r1.FFR()
        L_0x0014:
            com.instagram.api.schemas.DropsEventPageNavigationMetadata r1 = r2.B2L()
            if (r1 == 0) goto L_0x0064
            com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl r4 = r1.F2h()
        L_0x001e:
            java.lang.String r12 = r2.A0e()
            r1 = -1403186180(0xffffffffac5d13fc, float:-3.1417082E-12)
            java.lang.Boolean r8 = r2.getOptionalBooleanValueByHashCode(r1)
            r1 = -1801354193(0xffffffff94a1842f, float:-1.6308983E-26)
            java.lang.Boolean r9 = r2.getOptionalBooleanValueByHashCode(r1)
            java.lang.String r13 = r2.A0f()
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r2.BgJ()
            if (r1 == 0) goto L_0x0062
            r3 = r20
            com.instagram.user.model.ProductDetailsProductItemDict r7 = r1.FGq(r3)
        L_0x0040:
            java.util.List r1 = r2.Bzq()
            if (r1 == 0) goto L_0x0068
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x004e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r3.next()
            com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf r1 = (com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf) r1
            com.instagram.api.schemas.StoryProductItemStickerTappableData r1 = r1.FAk()
            r0.add(r1)
            goto L_0x004e
        L_0x0062:
            r7 = r0
            goto L_0x0040
        L_0x0064:
            r4 = r0
            goto L_0x001e
        L_0x0066:
            r6 = r0
            goto L_0x0014
        L_0x0068:
            java.lang.String r14 = r2.A0X()
            r1 = -1064897719(0xffffffffc086f349, float:-4.217198)
            java.lang.String r15 = r2.A0i(r1)
            com.instagram.api.schemas.TextReviewStatus r5 = r2.C5a()
            java.lang.String r16 = X.C41845B3m.A0n(r2)
            r1 = 1595179052(0x5f14802c, float:1.0700601E19)
            java.lang.String r17 = r2.A0i(r1)
            r1 = 402861861(0x18032f25, float:1.6955155E-24)
            java.lang.Boolean r10 = r2.getOptionalBooleanValueByHashCode(r1)
            com.instagram.model.shopping.reels.ProductSticker r3 = new com.instagram.model.shopping.reels.ProductSticker
            r18 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.reels.ImmutablePandoProductSticker.FFm(X.1E9):com.instagram.model.shopping.reels.ProductSticker");
    }

    public final ProductSticker FFn(1E6 r2) {
        return FFm(C41847B3o.A0p());
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getText() {
        return A0X();
    }

    public final String getUserId() {
        return C41845B3m.A0n(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductSticker] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
