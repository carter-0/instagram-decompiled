package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.COk  reason: case insensitive filesystem */
public final class C43974COk extends 17P implements XB1 {
    public SubscriptionStickerDictIntf A00;
    public XB3 A01;

    public final XB3 BJh() {
        XB3 xb3 = this.A01;
        if (xb3 == null) {
            return (XB3) A05(-254399413, C16123UpA.class);
        }
        return xb3;
    }

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, DM8.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.UNX F9i(X.1E9 r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r17 = r0.A0d()
            java.lang.String r18 = r0.A0c()
            java.lang.String r19 = r0.A0b()
            java.lang.String r20 = r0.A0Z()
            java.lang.Float r4 = r0.A0E()
            java.lang.Float r5 = r0.A0C()
            java.lang.String r21 = r0.A0e()
            java.lang.Integer r12 = X.C41845B3m.A0e(r0)
            java.lang.Integer r13 = X.C41845B3m.A0f(r0)
            java.lang.Integer r14 = X.C41845B3m.A0g(r0)
            java.lang.Integer r15 = X.C41845B3m.A0h(r0)
            X.XB3 r1 = r0.BJh()
            r3 = 0
            r2 = r24
            if (r1 == 0) goto L_0x003b
            X.UOB r3 = r1.FGB(r2)
        L_0x003b:
            java.lang.String r22 = r0.A0a()
            java.lang.Float r6 = r0.A0F()
            java.lang.Float r7 = r0.A0D()
            java.lang.Integer r16 = X.C41845B3m.A0i(r0)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = r0.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = X.C41846B3n.A0X(r1, r0)
            com.instagram.api.schemas.SubscriptionStickerDict r2 = X.C41846B3n.A0U(r2, r1)
            X.DM8 r1 = X.DM8.A00
            com.instagram.api.schemas.StickerTraySurface r1 = X.C41845B3m.A0Y(r0, r1)
            java.lang.Float r8 = r0.A0G()
            java.lang.Float r9 = r0.A0J()
            java.lang.Float r10 = r0.A0H()
            java.lang.Float r11 = r0.A0I()
            X.UNX r0 = new X.UNX
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43974COk.F9i(X.1E9):X.UNX");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk, X.XB1] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, V8C.A00(this));
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk] */
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COk] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final XB1 E8O(1E9 r3) {
        XB3 BJh = BJh();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (BJh != null) {
            BJh.EAH(r3);
        } else {
            BJh = null;
        }
        this.A01 = BJh;
        SubscriptionStickerDictIntf A0X = C41846B3n.A0X(this.A00, this);
        if (A0X != null) {
            A0X.E9E(r3);
            subscriptionStickerDictIntf = A0X;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    public final UNX F9j(1E6 r2) {
        return F9i(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaType() {
        return A0a();
    }
}
