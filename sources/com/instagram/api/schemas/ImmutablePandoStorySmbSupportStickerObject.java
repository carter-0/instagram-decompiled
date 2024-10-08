package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C46107DMm;
import X.CTB;
import X.XWJ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStorySmbSupportStickerObject extends 17P implements StorySmbSupportStickerObject {
    public static final C3035269k CREATOR = CTB.A00(88);
    public SubscriptionStickerDictIntf A00;

    public final SMBSupportStickerDictIntf Bx3() {
        return (SMBSupportStickerDictIntf) A05(-1651674154, ImmutablePandoSMBSupportStickerDict.class);
    }

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, C46107DMm.A00);
    }

    public final StorySmbSupportStickerObject E96(1E9 r2) {
        this.A00 = C41846B3n.A0W(r2, C41846B3n.A0X(this.A00, this));
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.api.schemas.StorySmbSupportStickerObjectImpl FBM(X.1E9 r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r19 = r0.A0d()
            java.lang.String r20 = r0.A0c()
            java.lang.String r21 = r0.A0b()
            java.lang.String r22 = r0.A0Z()
            java.lang.Float r6 = r0.A0E()
            java.lang.Float r7 = r0.A0C()
            java.lang.String r23 = r0.A0e()
            java.lang.Integer r14 = X.C41845B3m.A0e(r0)
            java.lang.Integer r15 = X.C41845B3m.A0f(r0)
            java.lang.Integer r16 = X.C41845B3m.A0g(r0)
            java.lang.Integer r17 = X.C41845B3m.A0h(r0)
            java.lang.String r24 = r0.A0a()
            java.lang.Float r8 = r0.A0F()
            com.instagram.api.schemas.SMBSupportStickerDictIntf r1 = r0.Bx3()
            r3 = 0
            if (r1 == 0) goto L_0x0041
            com.instagram.api.schemas.SMBSupportStickerDict r3 = r1.F8n()
        L_0x0041:
            java.lang.Float r9 = r0.A0D()
            java.lang.Integer r18 = X.C41845B3m.A0i(r0)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = r0.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = X.C41846B3n.A0X(r1, r0)
            r2 = r26
            com.instagram.api.schemas.SubscriptionStickerDict r5 = X.C41846B3n.A0U(r2, r1)
            X.DMm r1 = X.C46107DMm.A00
            com.instagram.api.schemas.StickerTraySurface r4 = X.C41845B3m.A0Y(r0, r1)
            java.lang.Float r10 = r0.A0G()
            java.lang.Float r11 = r0.A0J()
            java.lang.Float r12 = r0.A0H()
            java.lang.Float r13 = r0.A0I()
            com.instagram.api.schemas.StorySmbSupportStickerObjectImpl r2 = new com.instagram.api.schemas.StorySmbSupportStickerObjectImpl
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject.FBM(X.1E9):com.instagram.api.schemas.StorySmbSupportStickerObjectImpl");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject, com.instagram.api.schemas.StorySmbSupportStickerObject] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, XWJ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ad0() {
        return A0d();
    }

    public final String AdC() {
        return A0c();
    }

    public final String Auy() {
        return A0b();
    }

    public final String AyE() {
        return A0Z();
    }

    public final Float B1i() {
        return A0E();
    }

    public final Float BCt() {
        return A0C();
    }

    public final Float Bof() {
        return A0F();
    }

    public final Float Byt() {
        return A0D();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final Integer Bzj() {
        return C41845B3m.A0i(this);
    }

    public final Float CGX() {
        return A0G();
    }

    public final Float CGt() {
        return A0J();
    }

    public final Float CHS() {
        return A0H();
    }

    public final Float CHZ() {
        return A0I();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final StorySmbSupportStickerObjectImpl FBN(1E6 r2) {
        return FBM(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaType() {
        return A0a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
