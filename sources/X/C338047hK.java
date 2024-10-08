package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7hK  reason: invalid class name and case insensitive filesystem */
public final class C338047hK extends C251343mx {
    public final C335907dj A00;
    public final C333777a7 A01;
    public final C52971GgO A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;
    public final Activity A06;
    public final C334297b2 A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C338047hK(Activity activity, C335907dj r3, C333777a7 r4, C334297b2 r5, C52971GgO ggO, UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(userSession, 4);
        0qQ.A0B(ggO, 5);
        0qQ.A0B(r5, 6);
        this.A06 = activity;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = userSession;
        this.A02 = ggO;
        this.A07 = r5;
        this.A0C = z;
        this.A05 = z2;
        this.A0A = z3;
        this.A0B = z4;
        this.A0F = z5;
        this.A08 = str;
        this.A04 = z6;
        this.A0E = z7;
        this.A0D = z8;
        this.A09 = z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0250, code lost:
        if (X.182.A06(X.0Tu.A05, r49, 36323032343784187L) != false) goto L_0x0252;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r51) {
        /*
            r50 = this;
            r6 = 0
            r7 = r51
            X.0qQ.A0B(r7, r6)
            r8 = r50
            com.instagram.common.session.UserSession r0 = r8.A03
            r49 = r0
            X.6nl r1 = new X.6nl
            r1.<init>(r0)
            boolean r19 = r1.A00()
            X.Ax8 r0 = X.C41594Ax8.A00
            X.3Zt r14 = X.C243633Zp.A00(r7, r0)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.Ax9 r0 = X.C41595Ax9.A00
            java.lang.Object r24 = X.AnonymousClass3Zw.A00(r7, r0, r1)
            r0 = r24
            X.5xz r0 = (X.C300835xz) r0
            r24 = r0
            X.AxA r0 = X.C41596AxA.A00
            X.3Zt r29 = X.C243633Zp.A00(r7, r0)
            X.AxB r0 = X.C41597AxB.A00
            X.3Zt r2 = X.C243633Zp.A00(r7, r0)
            X.AxC r0 = X.C41598AxC.A00
            X.3Zt r11 = X.C243633Zp.A00(r7, r0)
            X.7dj r5 = r8.A00
            boolean r0 = r8.A05
            r23 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0, r2}
            X.9Mb r0 = new X.9Mb
            r12 = r0
            r13 = r6
            r15 = r7
            r16 = r8
            r17 = r24
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r22 = X.AnonymousClass3Zw.A00(r7, r0, r1)
            r0 = r22
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            r22 = r0
            boolean r0 = r5.A0V
            r21 = r0
            r12 = 12
            if (r0 == 0) goto L_0x006b
            r12 = 54
        L_0x006b:
            boolean r0 = r8.A04
            r20 = r0
            if (r0 == 0) goto L_0x0073
            int r12 = r12 + -6
        L_0x0073:
            X.3XV r10 = X.2WX.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r1 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = new X.9JQ
            r0.<init>(r9, r1, r6)
            r4 = 0
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r0)
            double r0 = (double) r12
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A0u
            X.9JR r13 = new X.9JR
            r13.<init>(r12, r6, r0)
            X.2WX r12 = new X.2WX
            r12.<init>(r3, r13)
            r0 = 4631248529308778496(0x4045800000000000, double:43.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            X.9JR r3 = new X.9JR
            r3.<init>(r13, r6, r0)
            X.2WX r13 = new X.2WX
            r13.<init>(r12, r3)
            java.lang.Integer r19 = X.AnonymousClass05K.A08
            java.lang.String r12 = "row_comment_container"
            r3 = 4
            X.9JS r1 = new X.9JS
            r0 = r19
            r1.<init>(r0, r12, r3)
            X.2WX r12 = new X.2WX
            r12.<init>(r13, r1)
            r18 = 1
            X.9MZ r13 = new X.9MZ
            r25 = r13
            r26 = r18
            r27 = r2
            r28 = r8
            r30 = r22
            r31 = r14
            r25.<init>(r26, r27, r28, r29, r30, r31)
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r13, r3)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r0)
            r0 = 2130970064(0x7f0405d0, float:1.7548828E38)
            int r0 = X.C244013aV.A01(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2V5 r14 = X.C247343gB.A00(r7, r0)
            X.7dh r13 = r5.A04
            java.lang.Object[] r12 = new java.lang.Object[]{r13}
            r1 = 14
            X.9MH r0 = new X.9MH
            r0.<init>((int) r1, (java.lang.Object) r14, (java.lang.Object) r8, (java.lang.Object) r7)
            java.lang.Object r12 = X.AnonymousClass3Zw.A00(r7, r0, r12)
            X.RvJ r12 = (X.C10625RvJ) r12
            java.util.List r15 = r5.A0Q
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            X.9MR r0 = new X.9MR
            r25 = r0
            r27 = r7
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)
            X.C243773a4.A00(r7, r0, r1)
            if (r20 != 0) goto L_0x014b
            boolean r0 = r13 instanceof X.C338057hL
            if (r0 == 0) goto L_0x033a
            if (r12 == 0) goto L_0x033a
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x033a
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x033a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.9JS r1 = new X.9JS
            r1.<init>(r14, r0)
            X.2WX r0 = new X.2WX
            r0.<init>(r4, r1)
            X.2WX r14 = r2.A00(r0)
            boolean r0 = r8.A0E
            java.lang.String r1 = "key_row_comment_id"
            if (r0 == 0) goto L_0x0320
            java.lang.String r0 = r5.A0K
            java.lang.String r2 = X.002.A0R(r1, r0)
            r1 = 37
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7)
            X.2WX r0 = X.C244243as.A00(r11, r10, r2, r0)
        L_0x0147:
            X.2WX r2 = r14.A00(r0)
        L_0x014b:
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            r1 = 41
            X.9Kp r0 = new X.9Kp
            r0.<init>(r12, r1)
            X.C243773a4.A00(r7, r0, r13)
            X.7b2 r12 = r8.A07
            X.2WX r13 = X.C336827fF.A00(r10, r5, r12)
            X.7di r0 = r5.A01
            r44 = r0
            X.7di r17 = X.C335897di.PRODUCTION
            r1 = r0
            r0 = r17
            if (r1 == r0) goto L_0x031d
            if (r20 == 0) goto L_0x0315
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
        L_0x0172:
            java.lang.Integer r15 = X.AnonymousClass05K.A1F
            X.9JR r14 = new X.9JR
            r14.<init>(r15, r6, r0)
            X.2WX r0 = new X.2WX
            r0.<init>(r4, r14)
        L_0x017e:
            X.2WX r13 = r13.A00(r0)
            boolean r0 = r8.A0D
            r16 = r0
            if (r0 == 0) goto L_0x0199
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x0199
            r0 = 44
            X.J6O r1 = new X.J6O
            r1.<init>(r8, r0)
            java.lang.String r0 = "key_row_comment_prompt"
            X.2WX r10 = X.C244243as.A00(r11, r10, r0, r1)
        L_0x0199:
            X.2WX r45 = r13.A00(r10)
            X.2V1 r10 = r7.A05
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r1 = new X.2Wb
            r1.<init>(r10, r0)
            X.3Zh r41 = X.C243573Zh.FLEX_START
            X.2V1 r0 = r1.A00
            r48 = r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.2Wb r0 = new X.2Wb
            r10 = r48
            r0.<init>(r10, r11)
            java.lang.String r10 = r5.A0K
            r47 = r10
            com.instagram.user.model.User r13 = r5.A0C
            boolean r10 = r5.A0k
            X.4DU r11 = r12.A05
            r43 = r11
            X.GgO r11 = r8.A02
            r46 = r11
            X.7df r11 = r5.A00
            r42 = r11
            X.7df r15 = X.C335867df.APPROVED
            r33 = 0
            if (r11 == r15) goto L_0x01d7
            r33 = 1
        L_0x01d7:
            X.7fG r11 = new X.7fG
            r25 = r11
            r26 = r46
            r27 = r49
            r28 = r43
            r29 = r13
            r30 = r47
            r31 = r21
            r32 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A00(r11)
            X.2WX r10 = X.C336867fJ.A0F
            X.7a7 r10 = r8.A01
            r21 = r10
            r10 = 4622945017495814144(0x4028000000000000, double:12.0)
            long r10 = java.lang.Double.doubleToRawLongBits(r10)
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            X.9JR r12 = new X.9JR
            r12.<init>(r13, r6, r10)
            X.2WX r13 = new X.2WX
            r13.<init>(r4, r12)
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.9JQ r11 = new X.9JQ
            r10 = r18
            r11.<init>(r12, r14, r10)
            X.2WX r12 = new X.2WX
            r12.<init>(r13, r11)
            java.lang.String r11 = "row_comment_section_container"
            X.9JS r13 = new X.9JS
            r10 = r19
            r13.<init>(r10, r11, r3)
            X.2WX r11 = new X.2WX
            r11.<init>(r12, r13)
            r10 = 1772(0x6ec, float:2.483E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r10)
            r10 = r47
            java.lang.String r13 = X.002.A0R(r12, r10)
            java.lang.Integer r12 = X.AnonymousClass05K.A0D
            X.9JS r10 = new X.9JS
            r10.<init>(r12, r13, r3)
            X.2WX r12 = new X.2WX
            r12.<init>(r11, r10)
            boolean r3 = r8.A0C
            if (r3 == 0) goto L_0x0252
            X.0Tu r13 = X.0Tu.A05
            r10 = 36323032343784187(0x810b9b00042afb, double:3.034170143096079E-306)
            r3 = r49
            boolean r3 = X.182.A06(r13, r3, r10)
            r35 = 0
            if (r3 == 0) goto L_0x0254
        L_0x0252:
            r35 = 1
        L_0x0254:
            java.lang.String r13 = r8.A08
            boolean r11 = r8.A0A
            boolean r10 = r8.A0B
            X.7fJ r3 = new X.7fJ
            r29 = r21
            r30 = r46
            r31 = r49
            r32 = r43
            r33 = r24
            r34 = r13
            r36 = r20
            r37 = r11
            r38 = r10
            r39 = r16
            r40 = r23
            r25 = r3
            r26 = r22
            r27 = r12
            r28 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A00(r3)
            r10 = r44
            r3 = r17
            if (r10 != r3) goto L_0x02a7
            java.lang.Integer r3 = r5.A0H
            if (r3 != r9) goto L_0x02a7
            r3 = r42
            if (r3 != r15) goto L_0x02a7
            android.app.Activity r8 = r8.A06
            X.Guu r3 = new X.Guu
            r13 = r21
            r14 = r46
            r15 = r49
            r16 = r43
            r17 = r24
            r18 = r20
            r10 = r3
            r11 = r8
            r12 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A00(r3)
        L_0x02a7:
            r37 = r0
            r38 = r1
            r39 = r2
            r40 = r4
            r42 = r4
            r43 = r4
            r44 = r6
            X.2Tp r0 = X.C243563Zg.A0H(r37, r38, r39, r40, r41, r42, r43, r44)
            r1.A00(r0)
            X.7ft r11 = r5.A0B
            X.7fu r10 = r5.A0D
            if (r11 == 0) goto L_0x0304
            java.lang.Integer r0 = r11.A01
            if (r0 == 0) goto L_0x0304
            if (r9 != r0) goto L_0x0304
            if (r10 == 0) goto L_0x0304
            r2 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = new X.9JQ
            r0.<init>(r9, r2, r6)
            X.2WX r8 = new X.2WX
            r8.<init>(r4, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r3 = new X.2Wb
            r0 = r48
            r3.<init>(r0, r2)
            java.lang.String r2 = r5.A0J
            X.HMR r0 = r11.A00
            if (r0 == 0) goto L_0x0373
            X.Gwy r12 = new X.Gwy
            r13 = r46
            r14 = r49
            r15 = r11
            r16 = r10
            r17 = r0
            r18 = r47
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.A00(r12)
            X.2Tp r0 = X.C243563Zg.A0B(r3, r1, r8)
            r1.A00(r0)
        L_0x0304:
            r43 = r1
            r44 = r7
            r46 = r4
            r47 = r4
            r48 = r4
            r49 = r6
            X.2Tl r0 = X.C243563Zg.A06(r43, r44, r45, r46, r47, r48, r49)
            return r0
        L_0x0315:
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            goto L_0x0172
        L_0x031d:
            r0 = r10
            goto L_0x017e
        L_0x0320:
            boolean r0 = r5.A0a
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = r5.A0K
            java.lang.String r2 = X.002.A0R(r1, r0)
            r1 = 31
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7)
            X.2WX r0 = X.C244243as.A00(r11, r10, r2, r0)
            goto L_0x0147
        L_0x0337:
            r0 = r10
            goto L_0x0147
        L_0x033a:
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x014b
            X.0Tu r15 = X.0Tu.A05
            r0 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            r14 = r49
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r15, r14, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0353
            if (r23 == 0) goto L_0x014b
        L_0x0353:
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x014b
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            int r1 = X.C244013aV.A01(r7, r0)
            X.7gD r0 = new X.7gD
            r0.<init>(r1)
            X.9JS r1 = new X.9JS
            r1.<init>(r9, r0, r3)
            X.2WX r0 = new X.2WX
            r0.<init>(r4, r1)
            X.2WX r2 = r2.A00(r0)
            goto L_0x014b
        L_0x0373:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338047hK.A0X(X.3Y5):X.3mp");
    }
}
