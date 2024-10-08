package X;

import android.animation.ValueAnimator;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GwA  reason: case insensitive filesystem */
public final class C53904GwA extends C251343mx {
    public final Context A00;
    public final C267324bN A01;
    public final JTB A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;

    public C53904GwA(Context context, C267324bN r3, C52058GDe gDe, UserSession userSession, JTB jtb, boolean z, boolean z2) {
        DbW.A1N(userSession, 1, jtb);
        this.A04 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A03 = gDe;
        this.A02 = jtb;
        this.A06 = z;
        this.A05 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r11.A05 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r29) {
        /*
            r28 = this;
            r6 = 0
            r7 = r29
            X.0qQ.A0B(r7, r6)
            r11 = r28
            boolean r1 = r11.A06
            if (r1 == 0) goto L_0x0011
            boolean r0 = r11.A05
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.Float r0 = X.C51967G9n.A0g()
            X.2V5 r14 = X.C247343gB.A00(r7, r0)
            X.2V5 r13 = X.C247343gB.A00(r7, r0)
            X.2V5 r10 = X.C247343gB.A00(r7, r0)
            X.IvF r0 = X.C58644IvF.A00
            X.3Zt r24 = X.C243633Zp.A00(r7, r0)
            X.IvE r0 = X.C58643IvE.A00
            X.3Zt r26 = X.C243633Zp.A00(r7, r0)
            X.IvD r0 = X.C58642IvD.A00
            X.3Zt r22 = X.C243633Zp.A00(r7, r0)
            if (r2 == 0) goto L_0x011c
            r0 = 2131955364(0x7f130ea4, float:1.9547253E38)
        L_0x0039:
            java.lang.String r18 = X.C244013aV.A0E(r7, r0)
            if (r1 == 0) goto L_0x0118
            X.3Zi r17 = X.C243583Zi.FLEX_START
        L_0x0041:
            long r2 = X.C244013aV.A03(r7)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r1 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = X.C51965G9l.A0b(r9, r1, r6)
            r5 = 0
            X.2WX r0 = X.C51965G9l.A0X(r5, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.2WX r12 = X.C51971G9r.A0X(r0, r4, r1, r6)
            X.3b9 r8 = X.C244413b9.ABSOLUTE
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = 3
            X.2WX r8 = X.C51971G9r.A0Y(r12, r1, r8, r0)
            X.3Zh r16 = X.C243573Zh.FLEX_END
            r1 = r16
            X.2WX r8 = X.C51971G9r.A0Y(r8, r4, r1, r0)
            long r0 = X.C244013aV.A03(r7)
            X.9JR r0 = X.C51967G9n.A0S(r6, r0)
            X.2WX r3 = X.C51973G9u.A0Q(r8, r0, r6, r2)
            X.2V1 r1 = r7.A05
            android.content.Context r2 = r1.A0C
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r0 = X.2Yu.A0H(r2, r0)
            android.graphics.drawable.Drawable r2 = X.C244013aV.A0D(r7, r0)
            r0 = 4
            X.2WX r0 = X.C51971G9r.A0Y(r3, r4, r2, r0)
            r8 = 1
            X.2WX r2 = X.C51971G9r.A0W(r10, r0, r4)
            r0 = 42
            X.J6J r0 = X.J6J.A00(r11, r0)
            X.2WX r2 = X.C51972G9s.A0V(r2, r0)
            r20 = 5
            X.Ixv r0 = new X.Ixv
            r19 = r0
            r21 = r10
            r23 = r13
            r25 = r11
            r27 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            X.2WX r2 = X.C51971G9r.A0Z(r2, r4, r0, r5)
            r21 = 41
            X.IxF r0 = new X.IxF
            r23 = r24
            r24 = r26
            r25 = r22
            r20 = r0
            r22 = r13
            r20.<init>(r21, r22, r23, r24, r25)
            X.2WX r9 = X.C51971G9r.A0Z(r2, r9, r0, r5)
            X.2Wb r10 = X.AnonymousClass7TG.A0S(r1)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            long r0 = X.C244013aV.A0C(r10, r0)
            X.9JR r0 = X.C51966G9m.A0k(r6, r0)
            X.2WX r1 = X.C51974G9v.A0K(r5, r0, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.2WX r0 = X.C51971G9r.A0W(r14, r1, r0)
            X.2WX r14 = X.C51971G9r.A0W(r13, r0, r4)
            X.2V1 r15 = r10.A00
            int r13 = X.C51971G9r.A0C(r15, r10)
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            long r2 = X.C244013aV.A0C(r10, r0)
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT
            long r0 = X.C51969G9p.A0D()
            r11 = r18
            X.3ae r5 = X.C51971G9r.A0b(r15, r5, r11, r6)
            X.C51973G9u.A17(r10, r5, r13, r2)
            r5.A0R(r8)
            X.G9w.A12(r12, r10, r5, r0)
            r5.A0B()
            X.C51974G9v.A1A(r5, r4, r6, r8)
            X.C244123ag.A00(r5, r14)
            X.C51967G9n.A1G(r10, r5)
            r1 = r16
            r0 = r17
            X.2Tl r0 = X.C243563Zg.A07(r10, r7, r9, r1, r0)
            return r0
        L_0x0118:
            X.3Zi r17 = X.C243583Zi.FLEX_END
            goto L_0x0041
        L_0x011c:
            r0 = 2131955542(0x7f130f56, float:1.9547614E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131955543(0x7f130f57, float:1.9547616E38)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53904GwA.A0X(X.3Y5):X.3mp");
    }

    public static final void A00(2V5 r3, C243673Zt r4, long j) {
        C51973G9u.A18(r4);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.setDuration(j);
        C51970G9q.A11(new I84(r3, 36), ofFloat, r4);
    }
}
