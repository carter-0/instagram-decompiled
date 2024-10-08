package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.music.common.model.ImmutablePandoMusicOverlayStickerModel;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;

public final class CPE extends 17P implements C255693uZ {
    public SubscriptionStickerDictIntf A00;
    public OriginalSoundDataIntf A01;
    public MusicOverlayStickerModelIntf A02;

    public final MusicOverlayStickerModelIntf BUl() {
        MusicOverlayStickerModelIntf musicOverlayStickerModelIntf = this.A02;
        if (musicOverlayStickerModelIntf == null) {
            return (MusicOverlayStickerModelIntf) A05(541071095, ImmutablePandoMusicOverlayStickerModel.class);
        }
        return musicOverlayStickerModelIntf;
    }

    public final OriginalSoundDataIntf BZB() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A01;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, DMT.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C255683uY FAZ(X.1E9 r27) {
        /*
            r26 = this;
            r2 = r26
            java.lang.String r20 = r2.A0d()
            java.lang.String r21 = r2.A0c()
            java.lang.String r22 = r2.A0b()
            java.lang.String r23 = r2.A0Z()
            java.lang.Float r7 = r2.A0E()
            java.lang.Float r8 = r2.A0C()
            java.lang.String r24 = r2.A0e()
            java.lang.Integer r15 = X.C41845B3m.A0e(r2)
            java.lang.Integer r16 = X.C41845B3m.A0f(r2)
            java.lang.Integer r17 = X.C41845B3m.A0g(r2)
            java.lang.Integer r18 = X.C41845B3m.A0h(r2)
            java.lang.String r25 = r2.A0a()
            com.instagram.music.common.model.MusicOverlayStickerModelIntf r1 = r2.BUl()
            r3 = 0
            r0 = r27
            if (r1 == 0) goto L_0x007b
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r1.FG8(r0)
        L_0x003f:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r2.BZB()
            if (r1 == 0) goto L_0x0049
            com.instagram.api.schemas.OriginalSoundData r3 = r1.F7E(r0)
        L_0x0049:
            java.lang.Float r9 = r2.A0F()
            java.lang.Float r10 = r2.A0D()
            java.lang.Integer r19 = X.C41845B3m.A0i(r2)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = r2.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = X.C41846B3n.A0X(r1, r2)
            com.instagram.api.schemas.SubscriptionStickerDict r5 = X.C41846B3n.A0U(r0, r1)
            X.DMT r0 = X.DMT.A00
            com.instagram.api.schemas.StickerTraySurface r4 = X.C41845B3m.A0Y(r2, r0)
            java.lang.Float r11 = r2.A0G()
            java.lang.Float r12 = r2.A0J()
            java.lang.Float r13 = r2.A0H()
            java.lang.Float r14 = r2.A0I()
            X.3uY r2 = new X.3uY
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r2
        L_0x007b:
            r6 = r3
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CPE.FAZ(X.1E9):X.3uY");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE, X.3uZ] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B5P.A00(this));
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE] */
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPE] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final C255693uZ E8m(1E9 r3) {
        MusicOverlayStickerModelIntf BUl = BUl();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (BUl != null) {
            BUl.EAG(r3);
        } else {
            BUl = null;
        }
        this.A02 = BUl;
        OriginalSoundDataIntf BZB = BZB();
        if (BZB != null) {
            BZB.E7q(r3);
        } else {
            BZB = null;
        }
        this.A01 = BZB;
        SubscriptionStickerDictIntf A0X = C41846B3n.A0X(this.A00, this);
        if (A0X != null) {
            A0X.E9E(r3);
            subscriptionStickerDictIntf = A0X;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    public final C255683uY FAa(1E6 r2) {
        return FAZ(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaType() {
        return A0a();
    }
}
