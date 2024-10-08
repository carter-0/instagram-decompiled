package X;

import android.view.animation.BaseInterpolator;
import android.view.animation.PathInterpolator;

public final class GG4 extends C251343mx {
    public static final BaseInterpolator A08 = new PathInterpolator(0.35f, 0.0f, 0.65f, 1.0f);
    public static final C243533Zd A09 = C243533Zd.GLOBAL;
    public final C267324bN A00;
    public final AnonymousClass3W1 A01;
    public final JTB A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public GG4(C267324bN r2, AnonymousClass3W1 r3, JTB jtb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(jtb, 4);
        this.A07 = z;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = jtb;
        this.A06 = z2;
        this.A05 = z3;
        this.A04 = z4;
        this.A03 = z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r10.A04 != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r7 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r26) {
        /*
            r25 = this;
            r0 = 0
            r2 = 0
            r8 = 0
            r9 = r26
            X.0qQ.A0B(r9, r8)
            r10 = r25
            boolean r7 = r10.A03
            if (r7 != 0) goto L_0x0016
            boolean r4 = r10.A04
            r24 = 0
            if (r4 == 0) goto L_0x0018
        L_0x0016:
            r24 = 1
        L_0x0018:
            long r4 = X.C244013aV.A06(r9)
            r6 = 0
            if (r7 == 0) goto L_0x025f
            r2 = 2131165217(0x7f070021, float:1.7944645E38)
        L_0x0022:
            long r2 = X.C244013aV.A0C(r9, r2)
            r23 = 1
            r11 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r7 != 0) goto L_0x002f
        L_0x002d:
            r11 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x002f:
            long r11 = X.C244013aV.A0C(r9, r11)
            if (r24 == 0) goto L_0x025c
            r0 = 2131165487(0x7f07012f, float:1.7945193E38)
            long r0 = X.C244013aV.A0C(r9, r0)
            r15 = 1
        L_0x003d:
            X.3XV r13 = X.2WX.A02
            r14 = r13
            if (r15 == 0) goto L_0x0048
            java.lang.Integer r13 = X.AnonymousClass05K.A0A
            X.2WX r13 = X.AnonymousClass9JR.A00(r6, r13, r8, r0)
        L_0x0048:
            java.lang.Integer r22 = X.AnonymousClass05K.A0D
            r0 = r22
            X.9JR r0 = X.C51965G9l.A0c(r0, r8, r11)
            if (r13 != r14) goto L_0x0053
            r13 = r6
        L_0x0053:
            X.2WX r21 = X.C51965G9l.A0X(r13, r0)
            r0 = 2131963537(0x7f132e91, float:1.956383E38)
            java.lang.String r1 = X.C244013aV.A0E(r9, r0)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r14 = X.C51969G9p.A08(r9, r0)
            long r18 = X.C244013aV.A08(r9)
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            android.content.Context r0 = X.C243803a8.A00(r9)
            X.0qq r12 = X.AnonymousClass0qo.A00(r0)
            if (r24 == 0) goto L_0x0258
            X.0qm r0 = X.0qm.A0u
        L_0x0079:
            android.graphics.Typeface r17 = r12.A02(r0)
            long r15 = X.C51969G9p.A0D()
            X.2V1 r12 = r9.A05
            X.3ae r13 = X.C51971G9r.A0b(r12, r6, r1, r8)
            r0 = r18
            X.C51973G9u.A16(r9, r13, r14, r0)
            r13.A0R(r8)
            r14 = r17
            r0 = r15
            X.G9w.A11(r14, r9, r13, r0)
            r0 = r20
            X.C51974G9v.A16(r13, r0, r11)
            r13.A0E()
            r14 = 0
            r0 = 1
            r13.A0b(r0)
            r13.A0Y(r8)
            r13.A0Z(r8)
            r0 = r21
            X.2WW r19 = X.C51971G9r.A0c(r6, r0, r13)
            android.view.animation.BaseInterpolator r13 = A08
            r1 = 320(0x140, float:4.48E-43)
            X.3Zd r0 = X.2Vi.A04
            X.4Ex r15 = new X.4Ex
            r15.<init>(r13, r1)
            android.content.Context r0 = X.C243803a8.A00(r9)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r13 = r0.widthPixels
            X.3Zd r18 = A09
            java.lang.String r17 = "swipe_left_nudge"
            r1 = r18
            r0 = r17
            X.4Ey r1 = X.2Vi.A00(r1, r0)
            X.3du r0 = X.C246033ds.A00
            X.C51970G9q.A1H(r1, r0, r14)
            r1.A02 = r15
            if (r24 != 0) goto L_0x00f9
            X.3du r0 = X.C246033ds.A04
            r1.A03(r0)
            int r0 = X.C51969G9p.A07(r9, r4)
            int r0 = r13 - r0
            float r0 = (float) r0
            r1.A01(r0)
            int r0 = X.C51969G9p.A07(r9, r4)
            int r13 = r13 - r0
            float r0 = (float) r13
            r1.A02(r0)
            r1.A02 = r15
            X.3du r0 = X.C246033ds.A03
            X.C51970G9q.A1H(r1, r0, r14)
            r1.A02 = r15
        L_0x00f9:
            X.3W1 r0 = r10.A01
            r21 = r0
            boolean r0 = r0.A2L
            if (r0 == 0) goto L_0x010d
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x010d
            java.lang.String[] r1 = new java.lang.String[r8]
            X.3Zd r0 = X.2Vi.A04
            X.4Ey r1 = X.2Vi.A01(r0, r1)
        L_0x010d:
            X.AnonymousClass4F7.A00(r9, r1)
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0253
            if (r7 != 0) goto L_0x0253
            boolean r0 = r10.A04
            r1 = 2131100277(0x7f060275, float:1.781293E38)
            if (r0 == 0) goto L_0x0120
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
        L_0x0120:
            int r13 = X.C51969G9p.A08(r9, r1)
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r1 = new X.JVb
            r1.<init>(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            r1.setCornerRadius(r0)
            r1.setColor(r13)
            X.2V5 r13 = X.C247343gB.A00(r9, r1)
            if (r7 == 0) goto L_0x0247
            r1 = 2131165203(0x7f070013, float:1.7944616E38)
        L_0x013c:
            long r0 = X.C244013aV.A0C(r9, r1)
            boolean r14 = r10.A06
            r16 = r14
            if (r14 == 0) goto L_0x01d8
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            X.2WX r14 = X.C51973G9u.A0W(r6, r9, r11, r0, r8)
            long r0 = X.C51967G9n.A07(r9)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.2WX r15 = X.AnonymousClass9JR.A00(r14, r11, r8, r0)
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            long r0 = X.C244013aV.A0C(r9, r0)
            if (r23 == 0) goto L_0x0166
            java.lang.Integer r14 = X.AnonymousClass05K.A15
            X.2WX r15 = X.AnonymousClass9JR.A00(r15, r14, r8, r2)
        L_0x0166:
            java.lang.Integer r14 = X.AnonymousClass05K.A1F
            X.2WX r1 = X.AnonymousClass9JR.A00(r15, r14, r8, r0)
            if (r23 == 0) goto L_0x0174
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.2WX r1 = X.AnonymousClass9JR.A00(r1, r0, r8, r2)
        L_0x0174:
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            X.2WX r1 = X.AnonymousClass9JR.A00(r1, r0, r8, r4)
            r0 = r20
            X.2WX r3 = X.C51971G9r.A0W(r13, r1, r0)
            X.3b9 r2 = X.C244413b9.ABSOLUTE
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = 3
            X.9JS r0 = X.C51965G9l.A0d(r1, r2, r0)
            X.2WX r2 = X.C51974G9v.A0K(r3, r0, r11)
            r1 = r18
            r0 = r17
            X.2WX r1 = X.C51971G9r.A0V(r12, r2, r1, r0)
            r0 = 5
            X.J6E r0 = X.J6E.A00(r10, r0)
            X.2WX r1 = X.G9t.A10(r1, r14, r0)
            r0 = 6
            X.J6E r0 = X.J6E.A00(r10, r0)
            X.2WX r4 = X.C51971G9r.A0Z(r1, r11, r0, r6)
        L_0x01a7:
            boolean r2 = r10.A07
            if (r2 == 0) goto L_0x01c4
            r0 = r21
            boolean r0 = r0.A1q
            if (r0 == 0) goto L_0x01c4
            android.content.Context r0 = r12.A0C
            android.os.Looper r0 = r0.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.Ihs r0 = new X.Ihs
            r0.<init>(r9, r10)
            r1.post(r0)
        L_0x01c4:
            if (r2 != 0) goto L_0x026c
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r12)
            java.util.List r0 = r0.A01
            X.2Tp r1 = new X.2Tp
            r2 = r6
            r3 = r6
            r4 = r6
            r5 = r6
            r6 = r0
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x01d8:
            X.2WX r11 = X.AnonymousClass9JR.A00(r6, r11, r8, r0)
            if (r24 == 0) goto L_0x01e6
            long r0 = X.C244013aV.A03(r9)
            X.2WX r11 = X.C51972G9s.A0S(r11, r8, r0)
        L_0x01e6:
            java.lang.Integer r0 = X.AnonymousClass05K.A09
            X.2WX r1 = X.AnonymousClass9JR.A00(r11, r0, r8, r4)
            if (r23 == 0) goto L_0x01f6
            X.9JR r0 = X.C51967G9n.A0V(r2)
            X.2WX r1 = X.C51974G9v.A0E(r1, r0, r8, r2)
        L_0x01f6:
            r0 = r20
            X.2WX r1 = X.C51971G9r.A0W(r13, r1, r0)
            X.3b9 r0 = X.C244413b9.ABSOLUTE
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            r2 = 3
            X.2WX r1 = X.C51971G9r.A0Y(r1, r3, r0, r2)
            X.3Zh r0 = X.C243573Zh.CENTER
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.2WX r13 = X.C51971G9r.A0Y(r1, r11, r0, r2)
            r1 = r18
            r0 = r17
            X.2WX r14 = X.C51971G9r.A0V(r12, r13, r1, r0)
            java.lang.String r13 = "clips_swipe_left_nudge_component"
            r1 = 4
            r0 = r22
            X.2WX r1 = X.C51971G9r.A0Y(r14, r0, r13, r1)
            r0 = 7
            X.J6E r0 = X.J6E.A00(r10, r0)
            X.2WX r1 = X.C51972G9s.A0V(r1, r0)
            r0 = 8
            X.J6E r0 = X.J6E.A00(r10, r0)
            X.2WX r11 = X.C51971G9r.A0Z(r1, r11, r0, r6)
            if (r24 == 0) goto L_0x0245
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            X.2WX r1 = X.AnonymousClass9JR.A00(r6, r0, r8, r4)
            X.3b9 r0 = X.C244413b9.RELATIVE
            X.2WX r0 = X.C51971G9r.A0Y(r1, r3, r0, r2)
        L_0x023f:
            X.2WX r4 = r11.A00(r0)
            goto L_0x01a7
        L_0x0245:
            r0 = 0
            goto L_0x023f
        L_0x0247:
            boolean r0 = r10.A04
            r1 = 2131165219(0x7f070023, float:1.7944649E38)
            if (r0 == 0) goto L_0x013c
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            goto L_0x013c
        L_0x0253:
            r1 = 2131099788(0x7f06008c, float:1.781194E38)
            goto L_0x0120
        L_0x0258:
            X.0qm r0 = X.0qm.A13
            goto L_0x0079
        L_0x025c:
            r15 = 0
            goto L_0x003d
        L_0x025f:
            boolean r11 = r10.A04
            if (r11 == 0) goto L_0x0267
            r23 = 0
            goto L_0x002d
        L_0x0267:
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            goto L_0x0022
        L_0x026c:
            r9 = r24 ^ 1
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r12)
            X.2Wb r2 = X.G9t.A0w(r3)
            boolean r1 = r10.A04
            X.Gvx r0 = new X.Gvx
            r0.<init>(r1, r7, r8)
            r2.A00(r0)
            if (r16 != 0) goto L_0x0287
            r0 = r19
            r2.A00(r0)
        L_0x0287:
            X.C51967G9n.A1C(r2, r3, r4)
            java.util.List r0 = r3.A01
            X.2Tp r1 = new X.2Tp
            r4 = r6
            r5 = r6
            r7 = r6
            r8 = r0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG4.A0X(X.3Y5):X.3mp");
    }
}
