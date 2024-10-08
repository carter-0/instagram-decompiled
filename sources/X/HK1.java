package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class HK1 extends GFO {
    public float A00;
    public float A01;
    public HnT A02;
    public final AnonymousClass3B3 A03;
    public final 2V5 A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final I02 A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HK1(android.content.Context r14, X.C267324bN r15, X.C52058GDe r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.AnonymousClass3W1 r19) {
        /*
            r13 = this;
            r0 = 3
            r8 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            X.C51974G9v.A0d(r0, r11, r10, r8, r12)
            r9 = 0
            r5 = r13
            r6 = r14
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.3yN r1 = r15.A0F
            X.I02 r0 = new X.I02
            r0.<init>(r1, r11)
            r13.A07 = r0
            com.instagram.common.session.UserSession r4 = r13.A0H
            X.1E8 r3 = X.1E7.A00(r4)
            X.4bN r0 = r13.A0D
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x0035
            java.lang.String r1 = r2.getId()
            X.1Xj r0 = r3.A02(r1)
            if (r0 != 0) goto L_0x006b
            r3.A03(r2)
        L_0x0035:
            int r0 = X.0nA.A09(r14)
            float r0 = (float) r0
            float r0 = X.0nA.A01(r14, r0)
            r13.A00 = r0
            X.0eO r1 = X.0eO.A02
            r0 = 40
            X.Iw6 r0 = X.C58697Iw6.A00(r10, r15, r11, r0)
            X.0eM r0 = X.AnonymousClass0eN.A00(r1, r0)
            r13.A05 = r0
            X.Iub r0 = X.C58604Iub.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r13.A06 = r0
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r13.A04 = r0
            r1 = 12
            X.Jlz r0 = new X.Jlz
            r0.<init>(r13, r1)
            r13.A03 = r0
            return
        L_0x006b:
            X.1Xj r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x0035
            r0 = 0
            r2.A3z(r4, r1, r0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK1.<init>(android.content.Context, X.4bN, X.GDe, X.0iw, com.instagram.common.session.UserSession, X.3W1):void");
    }

    public static final float A00(HK1 hk1, float f) {
        float f2;
        float f3;
        UserSession userSession = hk1.A0H;
        0Tu r3 = 0Tu.A05;
        double A002 = 182.A00(r3, userSession, 37166185964503462L);
        if (182.A00(r3, userSession, 37166185964437925L) > 0.0d) {
            return hk1.A00 - ((float) ((182.A00(r3, userSession, 37166185964437925L) + (A002 * 2.0d)) + 12.0d));
        }
        if (182.A00(r3, userSession, 37166185964372388L) > 0.0d || 182.A00(r3, userSession, 37166185964568999L) > 0.0d) {
            f2 = f - ((float) ((A002 * 2.0d) + 12.0d));
            f3 = 2.0f;
        } else {
            f2 = f - ((float) (12.0d + (A002 * 2.0d)));
            f3 = (float) hk1.A0F();
        }
        return f2 / f3;
    }

    public final int A0F() {
        if (!182.A06(0Tu.A05, this.A0H, 36321761033987782L) || C51971G9r.A0H(this.A0J) / 3 < 2) {
            return 2;
        }
        return 3;
    }

    public final List A0G() {
        int size;
        List list = this.A0J;
        if (list == null) {
            return 0sn.A00;
        }
        UserSession userSession = this.A0H;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36321761033266875L)) {
            size = 4;
        } else {
            boolean A062 = 182.A06(r2, userSession, 36321761033987782L);
            size = list.size();
            if (A062) {
                size = (size / 3) * 3;
            }
        }
        return 00k.A0d(list, size);
    }

    public final void A0H() {
        C52802Gcu gcu;
        2V5 r0 = this.A0B;
        Boolean A0v = AnonymousClass7TE.A0v();
        r0.A00(A0v);
        this.A04.A00(A0v);
        HnT hnT = this.A02;
        if (!(hnT == null || (gcu = hnT.A01) == null)) {
            gcu.cancel();
            hnT.A01 = null;
        }
        this.A02 = null;
    }
}
