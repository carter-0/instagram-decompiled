package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData;
import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

public final class CMD extends 17P implements C22563YBd {
    public SubscriptionStickerDictIntf A00;
    public MediaVCRTappableDataIntf A01;

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, DLB.A00);
    }

    public final MediaVCRTappableDataIntf CDa() {
        MediaVCRTappableDataIntf mediaVCRTappableDataIntf = this.A01;
        if (mediaVCRTappableDataIntf == null) {
            return (MediaVCRTappableDataIntf) A05(1009730147, ImmutablePandoMediaVCRTappableData.class);
        }
        return mediaVCRTappableDataIntf;
    }

    public final C22563YBd E7b(1E9 r3) {
        SubscriptionStickerDictIntf A0X = C41846B3n.A0X(this.A00, this);
        MediaVCRTappableDataIntf mediaVCRTappableDataIntf = null;
        if (A0X != null) {
            A0X.E9E(r3);
        } else {
            A0X = null;
        }
        this.A00 = A0X;
        MediaVCRTappableDataIntf CDa = CDa();
        if (CDa != null) {
            CDa.E7a(r3);
            mediaVCRTappableDataIntf = CDa;
        }
        this.A01 = mediaVCRTappableDataIntf;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BFV F66(X.1E9 r26) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r19 = r1.A0d()
            java.lang.String r20 = r1.A0c()
            java.lang.String r21 = r1.A0b()
            java.lang.String r22 = r1.A0Z()
            java.lang.Float r6 = r1.A0E()
            java.lang.Float r7 = r1.A0C()
            java.lang.String r23 = r1.A0e()
            java.lang.Integer r14 = X.C41845B3m.A0e(r1)
            java.lang.Integer r15 = X.C41845B3m.A0f(r1)
            java.lang.Integer r16 = X.C41845B3m.A0g(r1)
            java.lang.Integer r17 = X.C41845B3m.A0h(r1)
            java.lang.String r24 = r1.A0a()
            java.lang.Float r8 = r1.A0F()
            java.lang.Float r9 = r1.A0D()
            java.lang.Integer r18 = X.C41845B3m.A0i(r1)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r0 = r1.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r0 = X.C41846B3n.A0X(r0, r1)
            r3 = 0
            r2 = r26
            com.instagram.api.schemas.SubscriptionStickerDict r5 = X.C41846B3n.A0U(r2, r0)
            X.DLB r0 = X.DLB.A00
            com.instagram.api.schemas.StickerTraySurface r4 = X.C41845B3m.A0Y(r1, r0)
            com.instagram.api.schemas.MediaVCRTappableDataIntf r0 = r1.CDa()
            if (r0 == 0) goto L_0x005b
            com.instagram.api.schemas.MediaVCRTappableData r3 = r0.F64(r2)
        L_0x005b:
            java.lang.Float r10 = r1.A0G()
            java.lang.Float r11 = r1.A0J()
            java.lang.Float r12 = r1.A0H()
            java.lang.Float r13 = r1.A0I()
            X.BFV r2 = new X.BFV
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CMD.F66(X.1E9):X.BFV");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD, X.YBd] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, XVp.A00(this));
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD] */
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMD] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final BFV F67(1E6 r2) {
        return F66(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaType() {
        return A0a();
    }
}
