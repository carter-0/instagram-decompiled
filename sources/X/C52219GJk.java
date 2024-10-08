package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GJk  reason: case insensitive filesystem */
public final class C52219GJk extends C251343mx {
    public final 2V5 A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final JQX A04;
    public final WeakReference A05;
    public final boolean A06;
    public final int A07;
    public final int A08;
    public final boolean A09 = true;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C52219GJk(2V5 r3, C267324bN r4, C52058GDe gDe, UserSession userSession, JQX jqx, WeakReference weakReference, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C51969G9p.A1N(jqx, 5, r3);
        this.A01 = r4;
        this.A02 = gDe;
        this.A05 = weakReference;
        this.A03 = userSession;
        this.A04 = jqx;
        this.A07 = i;
        this.A0B = z;
        this.A06 = z2;
        this.A00 = r3;
        this.A0A = z3;
        this.A0C = z4;
        this.A08 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ef, code lost:
        if (r0.A1r() != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (X.1KU.A07(r4) == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014f, code lost:
        if (r1 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0154, code lost:
        if (r0 != false) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r32) {
        /*
            r31 = this;
            r6 = 0
            r2 = r32
            X.0qQ.A0B(r2, r6)
            r3 = r31
            X.GDe r1 = r3.A02
            java.lang.Integer r0 = r1.A0I
            r14 = 0
            if (r0 != 0) goto L_0x001b
            X.3W1 r0 = r1.A0E
            if (r0 == 0) goto L_0x0185
            int r0 = r0.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0185
        L_0x001b:
            int r0 = r0.intValue()
        L_0x001f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2V5 r15 = X.C247343gB.A00(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.2V5 r16 = X.C247343gB.A00(r2, r0)
            X.2V5 r19 = X.C247343gB.A00(r2, r14)
            X.4bN r5 = r3.A01
            boolean r0 = r5.CcK()
            com.instagram.common.session.UserSession r4 = r3.A03
            X.0Tu r7 = X.AnonymousClass7TF.A0H(r4)
            if (r0 == 0) goto L_0x017e
            r0 = 36605014126892203(0x820c11000814ab, double:3.212496558183091E-306)
        L_0x0046:
            long r0 = X.182.A01(r7, r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.2V5 r7 = X.C247343gB.A00(r2, r0)
            boolean r13 = r3.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            X.2V5 r0 = r3.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r7, r0}
            r0 = 29
            X.Iw1 r0 = X.C58692Iw1.A00(r7, r3, r0)
            X.C243773a4.A00(r2, r0, r1)
            X.GJm r9 = new X.GJm
            r17 = r9
            r18 = r15
            r20 = r7
            r21 = r16
            r22 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            X.3XV r0 = X.2WX.A02
            r0 = 23
            X.J6Q r8 = X.J6Q.A00(r9, r3, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.3at r0 = new X.3at
            r0.<init>(r1, r8, r14)
            X.2WX r8 = X.C51965G9l.A0X(r14, r0)
            r0 = 24
            X.J6Q r1 = X.J6Q.A00(r9, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2WX r11 = X.C51971G9r.A0Z(r8, r0, r1, r14)
            X.2Wb r10 = X.C51972G9s.A0Q(r2)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x015a
            boolean r8 = r3.A0C
            if (r8 != 0) goto L_0x00aa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.2V5 r15 = new X.2V5
            r15.<init>(r0)
        L_0x00aa:
            int r0 = r3.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2V5 r9 = new X.2V5
            r9.<init>(r0)
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r1 = r0.get()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.SeekBar.OnSeekBarChangeListener"
            X.0qQ.A0C(r1, r0)
            java.lang.ref.WeakReference r21 = X.C51965G9l.A0v(r1)
            X.0Tu r6 = X.DbS.A0J(r4, r6)
            r0 = 36317646455313829(0x8106b5000c15a5, double:3.0307640855401926E-306)
            boolean r25 = X.C51965G9l.A1a(r6, r4, r0)
            int r0 = r3.A07
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            boolean r1 = X.C52076GDw.A03(r5)
            r26 = 1
            if (r1 == 0) goto L_0x013d
            if (r12 == 0) goto L_0x013d
            java.util.List r1 = r5.A0R
            if (r1 == 0) goto L_0x0157
            X.1Xj r0 = X.DbZ.A0T(r1, r0)
            if (r0 == 0) goto L_0x0157
            com.instagram.model.mediasize.SpritesheetInfo r0 = r0.A1r()
            if (r0 == 0) goto L_0x0157
        L_0x00f1:
            if (r8 == 0) goto L_0x00fb
            boolean r0 = X.1KU.A07(r4)
            r27 = 1
            if (r0 != 0) goto L_0x00fd
        L_0x00fb:
            r27 = 0
        L_0x00fd:
            boolean r12 = r3.A0B
            boolean r8 = r3.A0A
            boolean r0 = r5.CcK()
            X.0Tu r6 = X.AnonymousClass7TF.A0H(r4)
            if (r0 == 0) goto L_0x0137
            r0 = 36605014126892203(0x820c11000814ab, double:3.212496558183091E-306)
        L_0x0110:
            long r23 = X.182.A01(r6, r4, r0)
            r1 = 27
            X.IwC r0 = new X.IwC
            r0.<init>(r3, r1)
            java.lang.ref.WeakReference r22 = X.C51965G9l.A0v(r0)
            X.GJn r14 = new X.GJn
            r28 = r12
            r29 = r13
            r30 = r8
            r20 = r4
            r19 = r5
            r18 = r7
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30)
        L_0x0132:
            X.2Tl r0 = X.C51967G9n.A0N(r14, r10, r2, r11)
            return r0
        L_0x0137:
            r0 = 36604107888333832(0x820b3e00011408, double:3.211923449269648E-306)
            goto L_0x0110
        L_0x013d:
            r0 = 36317646455182756(0x8106b5000a15a4, double:3.0307640854573015E-306)
            boolean r6 = X.182.A06(r6, r4, r0)
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x0151
            com.instagram.model.mediasize.SpritesheetInfo r1 = r0.A1r()
            r0 = 1
            if (r1 != 0) goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            if (r6 == 0) goto L_0x0157
            if (r0 == 0) goto L_0x0157
            goto L_0x00f1
        L_0x0157:
            r26 = 0
            goto L_0x00f1
        L_0x015a:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0132
            int r7 = r3.A08
            java.lang.ref.WeakReference r0 = r3.A05
            java.lang.Object r5 = r0.get()
            android.widget.SeekBar$OnSeekBarChangeListener r5 = (android.widget.SeekBar.OnSeekBarChangeListener) r5
            long r3 = X.C51969G9p.A0B()
            long r0 = X.C51970G9q.A0J()
            X.9JR r3 = X.C51967G9n.A0U(r6, r3)
            X.2WX r0 = X.C51973G9u.A0R(r14, r3, r6, r0)
            X.GxX r14 = new X.GxX
            r14.<init>(r5, r15, r0, r7)
            goto L_0x0132
        L_0x017e:
            r0 = 36604107888333832(0x820b3e00011408, double:3.211923449269648E-306)
            goto L_0x0046
        L_0x0185:
            X.4bN r0 = r3.A01
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0195
            int r0 = r0.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0195
            goto L_0x001b
        L_0x0195:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52219GJk.A0X(X.3Y5):X.3mp");
    }
}
