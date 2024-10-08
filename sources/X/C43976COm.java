package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.COm  reason: case insensitive filesystem */
public final class C43976COm extends 17P implements C22569YBj {
    public SubscriptionStickerDictIntf A00;
    public DV4 A01;

    public final DV4 Arg() {
        DV4 dv4 = this.A01;
        if (dv4 == null) {
            return (DV4) A05(568411439, C43975COl.class);
        }
        return dv4;
    }

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, DM9.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42080BGj F9m(X.1E9 r25) {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r18 = r0.A0d()
            java.lang.String r19 = r0.A0c()
            X.DV4 r1 = r0.Arg()
            r3 = 0
            r2 = r25
            if (r1 == 0) goto L_0x0017
            X.BGi r3 = r1.F9k(r2)
        L_0x0017:
            java.lang.String r20 = r0.A0b()
            java.lang.String r21 = r0.A0Z()
            java.lang.Float r5 = r0.A0E()
            java.lang.Float r6 = r0.A0C()
            java.lang.String r22 = r0.A0e()
            java.lang.Integer r13 = X.C41845B3m.A0e(r0)
            java.lang.Integer r14 = X.C41845B3m.A0f(r0)
            java.lang.Integer r15 = X.C41845B3m.A0g(r0)
            java.lang.Integer r16 = X.C41845B3m.A0h(r0)
            java.lang.String r23 = r0.A0a()
            java.lang.Float r7 = r0.A0F()
            java.lang.Float r8 = r0.A0D()
            java.lang.Integer r17 = X.C41845B3m.A0i(r0)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = r0.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = X.C41846B3n.A0X(r1, r0)
            com.instagram.api.schemas.SubscriptionStickerDict r4 = X.C41846B3n.A0U(r2, r1)
            X.DM9 r1 = X.DM9.A00
            com.instagram.api.schemas.StickerTraySurface r2 = X.C41845B3m.A0Y(r0, r1)
            java.lang.Float r9 = r0.A0G()
            java.lang.Float r10 = r0.A0J()
            java.lang.Float r11 = r0.A0H()
            java.lang.Float r12 = r0.A0I()
            X.BGj r1 = new X.BGj
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43976COm.F9m(X.1E9):X.BGj");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm, X.YBj] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, XVx.A00(this));
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm] */
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COm] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final C22569YBj E8Q(1E9 r3) {
        DV4 Arg = Arg();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (Arg != null) {
            Arg.E8P(r3);
        } else {
            Arg = null;
        }
        this.A01 = Arg;
        SubscriptionStickerDictIntf A0X = C41846B3n.A0X(this.A00, this);
        if (A0X != null) {
            A0X.E9E(r3);
            subscriptionStickerDictIntf = A0X;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    public final C42080BGj F9n(1E6 r2) {
        return F9m(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaType() {
        return A0a();
    }
}
