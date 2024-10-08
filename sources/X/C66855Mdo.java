package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdo  reason: case insensitive filesystem */
public final class C66855Mdo implements C328347El {
    public final OFA A00;
    public final C66649MaI A01;
    public final C66858Mdr A02;
    public final C66857Mdq A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C73918Ply.A01(this, 32);

    public C66855Mdo(OFA ofa) {
        this.A00 = ofa;
        0eO r2 = 0eO.A02;
        this.A06 = AnonymousClass0eN.A00(r2, new C73918Ply(this, 31));
        this.A05 = AnonymousClass0eN.A00(r2, new C73918Ply(this, 30));
        this.A04 = AnonymousClass0eN.A00(r2, new C73918Ply(this, 29));
        UserSession userSession = ofa.A01;
        Context context = ofa.A00;
        this.A01 = C66653MaM.A00(context, userSession);
        this.A03 = new C66857Mdq(context, true, 182.A05(0Tu.A05, userSession), true);
        this.A02 = new C66858Mdr(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006a, code lost:
        if (r1.equals(r10) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (r3.A00(java.lang.Boolean.valueOf(r13)) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        if (((X.1Av) r4.A07.getValue()).A01.getInt("direct_thread_video_call_xma_start_call_confirmation_count", 0) >= 3) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        if (r1 != false) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C232262tL AWb(android.content.Context r113, com.instagram.common.session.UserSession r114, X.AnonymousClass9HC r115, X.C331837So r116, X.AnonymousClass7L2 r117, X.17i r118, boolean r119) {
        /*
            r112 = this;
            r2 = r116
            X.7LQ r2 = (X.AnonymousClass7LQ) r2
            r14 = 0
            r111 = r113
            r12 = r114
            r108 = r118
            r1 = r111
            r0 = r108
            X.C51973G9u.A1E(r1, r12, r0)
            r9 = 3
            r110 = r115
            r109 = r117
            r1 = r109
            r0 = r110
            X.C51973G9u.A0r(r9, r1, r2, r0)
            X.3su r0 = r2.A0e
            X.0qQ.A07(r0)
            X.7SD r1 = r2.A0G
            r83 = 0
            if (r1 == 0) goto L_0x024d
            X.3t3 r1 = r1.A0P
            if (r1 == 0) goto L_0x024d
            java.lang.String r87 = X.C66580MXl.A0x(r1)
        L_0x0031:
            X.7Rj r82 = X.C331537Rj.DIRECT_THREAD_XMA
            X.7SD r1 = r2.A0G
            java.lang.String r10 = r1.A0X
            boolean r15 = r1.A0r
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r12)
            boolean r13 = r0.A1j(r1)
            java.lang.Object r3 = r0.A1T
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.model.DirectVideoCallEvent"
            X.0qQ.A0C(r3, r1)
            X.55L r3 = (X.AnonymousClass55L) r3
            r4 = r112
            X.MaI r8 = r4.A01
            X.OFA r7 = r4.A00
            X.7Ri r5 = r7.A02
            X.0qQ.A0B(r3, r14)
            boolean r1 = r8.A0C(r5)
            if (r1 == 0) goto L_0x006c
            java.lang.Integer r6 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 != r1) goto L_0x006c
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x006c
            boolean r1 = r1.equals(r10)
            r6 = 1
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            boolean r1 = r8.A0C(r5)
            if (r1 == 0) goto L_0x0086
            if (r10 == 0) goto L_0x007b
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0086
        L_0x007b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            boolean r1 = r3.A00(r1)
            r11 = 1
            if (r1 != 0) goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            if (r11 != 0) goto L_0x0097
            boolean r1 = r8.A0C(r5)
            if (r1 == 0) goto L_0x0249
            if (r10 == 0) goto L_0x0097
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0249
        L_0x0097:
            r16 = 1
            if (r11 != 0) goto L_0x00af
            X.0eM r1 = r4.A07
            java.lang.Object r1 = r1.getValue()
            X.1Av r1 = (X.1Av) r1
            X.0xa r8 = r1.A01
            java.lang.String r1 = "direct_thread_video_call_xma_start_call_confirmation_count"
            int r1 = r8.getInt(r1, r14)
            r91 = 1
            if (r1 < r9) goto L_0x00b1
        L_0x00af:
            r91 = 0
        L_0x00b1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            boolean r1 = r3.A00(r1)
            boolean r11 = r3.A07
            X.Mdq r8 = r4.A03
            java.lang.Integer r10 = r3.A02
            X.0qQ.A07(r10)
            java.lang.String r9 = r3.A03
            X.0qQ.A07(r9)
            r17 = r8
            r18 = r10
            r19 = r9
            r20 = r11
            r21 = r1
            r22 = r6
            r23 = r15
            java.lang.String r85 = r17.A02(r18, r19, r20, r21, r22, r23)
            long r9 = r2.C7Z()
            java.lang.String r86 = r8.A01(r9, r6, r1)
            if (r6 != 0) goto L_0x00e7
            r92 = 0
            if (r1 == 0) goto L_0x0245
        L_0x00e7:
            r92 = 1
            if (r1 == 0) goto L_0x0245
            X.0eM r8 = r8.A04
        L_0x00ed:
            java.lang.String r88 = X.DbS.A0t(r8)
            X.0eM r8 = r7.A03
            X.2FW r7 = r0.A10
            r17 = r12
            r18 = r110
            r19 = r2
            r20 = r109
            r21 = r7
            r22 = r8
            X.7FE r81 = X.AnonymousClass7FD.A04(r17, r18, r19, r20, r21, r22)
            if (r11 == 0) goto L_0x022d
            if (r6 == 0) goto L_0x0228
            java.lang.Integer r83 = X.AnonymousClass05K.A0C
        L_0x010b:
            X.Nm9 r79 = X.C69465Nm9.ONGOING_CALL
            X.0eM r6 = r4.A06
        L_0x010f:
            int r89 = X.DbX.A07(r6)
            java.lang.Integer r6 = r3.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            boolean r6 = X.AnonymousClass7TF.A1W(r6, r3)
            X.Mdr r3 = r4.A02
            android.graphics.drawable.Drawable r78 = r3.A01(r11, r13, r6, r1)
            r1 = r119
            java.lang.String r84 = X.C66582MXn.A0s(r12, r0, r1)
            X.0qQ.A0A(r84)
            boolean r90 = r5.CVE()
            X.2FW r5 = r0.A10
            r1 = 4
            X.0qQ.A0B(r5, r1)
            X.7SD r1 = r2.A0G
            X.3Tu r3 = r1.A0H
            boolean r3 = X.C331057Pi.A02(r3)
            if (r3 != 0) goto L_0x014a
            boolean r3 = X.C308556Us.A08(r12, r1)
            if (r3 == 0) goto L_0x021f
            boolean r1 = X.C308556Us.A09(r12, r1)
            if (r1 == 0) goto L_0x021f
        L_0x014a:
            java.lang.String r3 = r0.A0h()
            java.lang.String r1 = r0.A0f()
            com.instagram.model.direct.messageid.MessageIdentifier r98 = X.C66580MXl.A0i(r3, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r3 = r0.C7c()
            long r101 = r1.toMillis(r3)
            r16 = 0
            java.lang.String r18 = ""
            X.7FR r15 = new X.7FR
            r17 = r16
            r19 = r18
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r14
            r30 = r14
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r14
            r35 = r14
            r36 = r14
            r37 = r14
            r38 = r14
            r39 = r14
            r40 = r14
            r41 = r14
            r42 = r14
            r43 = r14
            r44 = r14
            r45 = r14
            r46 = r14
            r47 = r14
            r48 = r14
            r49 = r14
            r50 = r14
            r51 = r14
            r52 = r14
            r53 = r14
            r54 = r14
            r55 = r14
            r56 = r14
            r57 = r14
            r58 = r14
            r59 = r14
            r60 = r14
            r61 = r14
            r62 = r14
            r63 = r14
            r64 = r14
            r65 = r14
            r66 = r14
            r67 = r14
            r68 = r14
            r69 = r14
            r70 = r14
            r71 = r14
            r72 = r14
            r73 = r14
            r74 = r14
            r75 = r14
            r76 = r14
            r77 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r12)
            boolean r106 = r0.A1j(r1)
            X.7Bo r96 = X.C327627Bo.NUX_TYPE_NONE
            X.7FT r80 = new X.7FT
            r93 = r80
            r94 = r16
            r95 = r15
            r97 = r5
            r99 = r16
            r100 = r16
            r103 = r14
            r104 = r14
            r105 = r14
            r107 = r14
            r93.<init>(r94, r95, r96, r97, r98, r99, r100, r101, r103, r104, r105, r106, r107)
        L_0x0204:
            X.Mds r0 = new X.Mds
            r77 = r0
            r77.<init>(r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92)
            r3 = r111
            r4 = r12
            r5 = r110
            r6 = r2
            r7 = r109
            r8 = r108
            X.7Fl r2 = X.AnonymousClass7FX.A03(r3, r4, r5, r6, r7, r8)
            X.Mdt r1 = new X.Mdt
            r1.<init>(r2, r0)
            return r1
        L_0x021f:
            r1 = r111
            r0 = r110
            X.7FT r80 = X.AnonymousClass7FG.A00(r1, r12, r0, r2, r5)
            goto L_0x0204
        L_0x0228:
            if (r16 == 0) goto L_0x0237
            java.lang.Integer r83 = X.AnonymousClass05K.A00
            goto L_0x0237
        L_0x022d:
            if (r6 == 0) goto L_0x0233
            java.lang.Integer r83 = X.AnonymousClass05K.A0N
            goto L_0x010b
        L_0x0233:
            if (r16 == 0) goto L_0x0237
            java.lang.Integer r83 = X.AnonymousClass05K.A01
        L_0x0237:
            if (r1 == 0) goto L_0x023f
            X.Nm9 r79 = X.C69465Nm9.MISSED_CALL
            X.0eM r6 = r4.A05
            goto L_0x010f
        L_0x023f:
            X.Nm9 r79 = X.C69465Nm9.END_CALL
            X.0eM r6 = r4.A04
            goto L_0x010f
        L_0x0245:
            X.0eM r8 = r8.A09
            goto L_0x00ed
        L_0x0249:
            r16 = 0
            goto L_0x00af
        L_0x024d:
            r87 = r83
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66855Mdo.AWb(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7So, X.7L2, X.17i, boolean):X.2tL");
    }
}
