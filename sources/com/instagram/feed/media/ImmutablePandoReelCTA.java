package com.instagram.feed.media;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C46140DNt;
import X.CTA;
import X.CkJ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLink;
import com.instagram.model.shopping.reels.ImmutablePandoProfileShopLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelMultiProductLink;
import com.instagram.model.shopping.reels.ImmutablePandoReelProductLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.List;

public final class ImmutablePandoReelCTA extends 17P implements ReelCTAIntf {
    public static final C3035269k CREATOR = CTA.A00(30);
    public ReelMultiProductLinkIntf A00;
    public ReelProductLinkIntf A01;

    public final ShoppingSwipeUpCTATextIcon AtJ() {
        return (ShoppingSwipeUpCTATextIcon) A0N(1782405679, C46140DNt.A00);
    }

    public final EffectPreviewIntf B0A() {
        return (EffectPreviewIntf) A05(347677466, ImmutablePandoEffectPreview.class);
    }

    public final List BN4() {
        return A08(102977465, ImmutablePandoAndroidLink.class);
    }

    public final ReelMultiProductLinkIntf BUd() {
        ReelMultiProductLinkIntf reelMultiProductLinkIntf = this.A00;
        if (reelMultiProductLinkIntf == null) {
            return (ReelMultiProductLinkIntf) A05(-742264176, ImmutablePandoReelMultiProductLink.class);
        }
        return reelMultiProductLinkIntf;
    }

    public final List Bfy() {
        return A08(1230535189, ImmutablePandoAndroidLink.class);
    }

    public final ProductCollectionLinkIntf Bg1() {
        return (ProductCollectionLinkIntf) A05(-748711509, ImmutablePandoProductCollectionLink.class);
    }

    public final ReelProductLinkIntf BgL() {
        ReelProductLinkIntf reelProductLinkIntf = this.A01;
        if (reelProductLinkIntf == null) {
            return (ReelProductLinkIntf) A05(1014323530, ImmutablePandoReelProductLink.class);
        }
        return reelProductLinkIntf;
    }

    public final ProfileShopLinkIntf BhE() {
        return (ProfileShopLinkIntf) A05(-1400226675, ImmutablePandoProfileShopLink.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.feed.media.ReelCTA FEG(X.1E9 r22) {
        /*
            r21 = this;
            r2 = r21
            com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon r6 = r2.AtJ()
            r0 = 2060973673(0x7ad7f669, float:5.606708E35)
            java.lang.String r13 = r2.A0i(r0)
            r0 = 1782735587(0x6a4262e3, float:5.8749647E25)
            java.lang.String r14 = r2.A0i(r0)
            r0 = -815886327(0xffffffffcf5e9009, float:-3.73398144E9)
            java.lang.String r15 = r2.A0i(r0)
            com.instagram.feed.media.EffectPreviewIntf r0 = r2.B0A()
            r9 = 0
            if (r0 == 0) goto L_0x0053
            com.instagram.feed.media.EffectPreview r7 = r0.FE1()
        L_0x0026:
            r0 = -1384589206(0xffffffffad78d86a, float:-1.41452215E-11)
            java.lang.String r16 = r2.A0i(r0)
            r0 = 893516482(0x3541fac2, float:7.2263003E-7)
            java.lang.String r17 = r2.A0j(r0)
            r0 = -1697623503(0xffffffff9ad05231, float:-8.615957E-23)
            java.lang.Boolean r12 = r2.getOptionalBooleanValueByHashCode(r0)
            java.util.List r0 = r2.BN4()
            if (r0 == 0) goto L_0x0055
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            X.C41846B3n.A1W(r4, r1)
            goto L_0x0049
        L_0x0053:
            r7 = r9
            goto L_0x0026
        L_0x0055:
            r4 = r9
        L_0x0056:
            com.instagram.model.shopping.reels.ReelMultiProductLinkIntf r0 = r2.BUd()
            r3 = r22
            if (r0 == 0) goto L_0x0081
            com.instagram.model.shopping.reels.ReelMultiProductLink r10 = r0.FFp(r3)
        L_0x0062:
            r0 = -1489595877(0xffffffffa736921b, float:-2.5336778E-15)
            java.lang.String r18 = r2.A0j(r0)
            java.util.List r0 = r2.Bfy()
            if (r0 == 0) goto L_0x0083
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0084
            X.C41846B3n.A1W(r1, r0)
            goto L_0x0077
        L_0x0081:
            r10 = r9
            goto L_0x0062
        L_0x0083:
            r1 = r9
        L_0x0084:
            com.instagram.model.shopping.reels.ProductCollectionLinkIntf r0 = r2.Bg1()
            if (r0 == 0) goto L_0x00ae
            com.instagram.model.shopping.reels.ProductCollectionLink r8 = r0.FFg()
        L_0x008e:
            com.instagram.model.shopping.reels.ReelProductLinkIntf r0 = r2.BgL()
            if (r0 == 0) goto L_0x00ac
            com.instagram.model.shopping.reels.ReelProductLink r11 = r0.FFq(r3)
        L_0x0098:
            com.instagram.model.shopping.reels.ProfileShopLinkIntf r0 = r2.BhE()
            if (r0 == 0) goto L_0x00a2
            com.instagram.model.shopping.reels.ProfileShopLink r9 = r0.FFo()
        L_0x00a2:
            com.instagram.feed.media.ReelCTA r5 = new com.instagram.feed.media.ReelCTA
            r20 = r1
            r19 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r5
        L_0x00ac:
            r11 = r9
            goto L_0x0098
        L_0x00ae:
            r8 = r9
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.ImmutablePandoReelCTA.FEG(X.1E9):com.instagram.feed.media.ReelCTA");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ReelCTAIntf, com.instagram.feed.media.ImmutablePandoReelCTA] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CkJ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AtK() {
        return A0i(2060973673);
    }

    public final String AtL() {
        return A0i(1782735587);
    }

    public final String AtU() {
        return A0i(-815886327);
    }

    public final String B5a() {
        return A0i(-1384589206);
    }

    public final String B5b() {
        return A0j(893516482);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoReelCTA] */
    public final Boolean BBN() {
        return getOptionalBooleanValueByHashCode(-1697623503);
    }

    public final String BXk() {
        return A0j(-1489595877);
    }

    public final ReelCTAIntf E9n(1E9 r3) {
        ReelMultiProductLinkIntf BUd = BUd();
        ReelProductLinkIntf reelProductLinkIntf = null;
        if (BUd != null) {
            BUd.EAC(r3);
        } else {
            BUd = null;
        }
        this.A00 = BUd;
        ReelProductLinkIntf BgL = BgL();
        if (BgL != null) {
            BgL.EAD(r3);
            reelProductLinkIntf = BgL;
        }
        this.A01 = reelProductLinkIntf;
        return this;
    }

    public final ReelCTA FEH(1E6 r2) {
        return FEG(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoReelCTA] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
