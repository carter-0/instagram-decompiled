package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.CPx  reason: case insensitive filesystem */
public final class C43999CPx extends 17P implements DV6 {
    public SubscriptionStickerDictIntf A00;
    public UpcomingEvent A01;

    public final UpcomingEventStickerSource Bxg() {
        return (UpcomingEventStickerSource) A0N(-896505829, C46115DMu.A00);
    }

    public final SubscriptionStickerDictIntf C2V() {
        return C41846B3n.A0X(this.A00, this);
    }

    public final StickerTraySurface C3E() {
        return C41845B3m.A0Y(this, C46116DMv.A00);
    }

    public final UpcomingEvent CBy() {
        UpcomingEvent upcomingEvent = this.A01;
        if (upcomingEvent == null) {
            return (UpcomingEvent) A05(-2094458441, ImmutablePandoUpcomingEvent.class);
        }
        return upcomingEvent;
    }

    public final UpcomingEventMedia CC0() {
        return (UpcomingEventMedia) A05(-1257076900, ImmutablePandoUpcomingEventMedia.class);
    }

    public final DV6 E9C(1E9 r3) {
        SubscriptionStickerDictIntf A0X = C41846B3n.A0X(this.A00, this);
        UpcomingEvent upcomingEvent = null;
        if (A0X != null) {
            A0X.E9E(r3);
        } else {
            A0X = null;
        }
        this.A00 = A0X;
        UpcomingEvent CBy = CBy();
        if (CBy != null) {
            CBy.EAd(r3);
            upcomingEvent = CBy;
        }
        this.A01 = upcomingEvent;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BHY FBu(X.1E9 r32) {
        /*
            r31 = this;
            r0 = r31
            java.lang.String r22 = r0.A0d()
            java.lang.String r23 = r0.A0c()
            r1 = -315456317(0xffffffffed3284c3, float:-3.453052E27)
            java.lang.String r24 = r0.A0i(r1)
            java.lang.String r25 = r0.A0b()
            java.lang.String r26 = r0.A0Z()
            java.lang.Float r9 = r0.A0E()
            java.lang.Float r10 = r0.A0C()
            java.lang.String r27 = r0.A0e()
            r1 = -12574059(0xffffffffff402295, float:-2.5539134E38)
            java.lang.Boolean r8 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.Integer r17 = X.C41845B3m.A0e(r0)
            java.lang.Integer r18 = X.C41845B3m.A0f(r0)
            java.lang.Integer r19 = X.C41845B3m.A0g(r0)
            java.lang.Integer r20 = X.C41845B3m.A0h(r0)
            java.lang.String r28 = r0.A0f()
            java.lang.String r29 = r0.A0a()
            java.lang.Float r11 = r0.A0F()
            com.instagram.api.schemas.UpcomingEventStickerSource r5 = r0.Bxg()
            java.lang.Float r12 = r0.A0D()
            java.lang.Integer r21 = X.C41845B3m.A0i(r0)
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = r0.A00
            com.instagram.api.schemas.SubscriptionStickerDictIntf r1 = X.C41846B3n.A0X(r1, r0)
            r6 = 0
            r2 = r32
            if (r1 == 0) goto L_0x009c
            com.instagram.api.schemas.SubscriptionStickerDict r4 = r1.FC2(r2)
        L_0x0063:
            X.DMv r1 = X.C46116DMv.A00
            com.instagram.api.schemas.StickerTraySurface r3 = X.C41845B3m.A0Y(r0, r1)
            r1 = 1825632156(0x6cd0ef9c, float:2.0207048E27)
            java.lang.String r30 = r0.A0i(r1)
            com.instagram.user.model.UpcomingEvent r1 = r0.CBy()
            if (r1 == 0) goto L_0x009a
            com.instagram.user.model.UpcomingEventImpl r7 = r1.FGy(r2)
        L_0x007a:
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia r1 = r0.CC0()
            if (r1 == 0) goto L_0x0084
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r6 = r1.FG4()
        L_0x0084:
            java.lang.Float r13 = r0.A0G()
            java.lang.Float r14 = r0.A0J()
            java.lang.Float r15 = r0.A0H()
            java.lang.Float r16 = r0.A0I()
            X.BHY r2 = new X.BHY
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r2
        L_0x009a:
            r7 = r6
            goto L_0x007a
        L_0x009c:
            r4 = r6
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43999CPx.FBu(X.1E9):X.BHY");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DV6, com.facebook.pando.TreeJNI, X.CPx] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44472CfU.A00(this));
    }

    public final String Ad0() {
        return A0d();
    }

    public final String AdC() {
        return A0c();
    }

    public final String AqA() {
        return A0i(-315456317);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Integer Bzj() {
        return C41845B3m.A0i(this);
    }

    public final String C75() {
        return A0i(1825632156);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Boolean CQW() {
        return getOptionalBooleanValueByHashCode(-12574059);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Integer CTN() {
        return C41845B3m.A0e(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Integer CUa() {
        return C41845B3m.A0f(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Integer CZ9() {
        return C41845B3m.A0g(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPx] */
    public final Integer CcV() {
        return C41845B3m.A0h(this);
    }

    public final BHY FBv(1E6 r2) {
        return FBu(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getMediaType() {
        return A0a();
    }
}
