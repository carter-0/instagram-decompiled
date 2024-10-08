package X;

import android.content.Context;
import com.instagram.pendingmedia.model.ClipInfo;

public final /* synthetic */ class PEL implements B1V {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ QP5 A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ AnonymousClass7Z6 A03;
    public final /* synthetic */ C69343Nji A04;
    public final /* synthetic */ ClipInfo A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;

    public /* synthetic */ PEL(Context context, QP5 qp5, C254933tI r4, AnonymousClass7Z6 r5, C69343Nji nji, ClipInfo clipInfo, AnonymousClass3Q2 r8, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = r5;
        this.A0D = z;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = clipInfo;
        this.A0A = str;
        this.A00 = context;
        this.A0B = str2;
        this.A0G = z2;
        this.A0C = str3;
        this.A04 = nji;
        this.A0E = z3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0F = z4;
        this.A01 = qp5;
        this.A07 = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r11.A05() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1bp AXP(X.C70621ODs r41, com.instagram.model.direct.DirectThreadKey r42, java.lang.Boolean r43, java.lang.Long r44) {
        /*
            r40 = this;
            r12 = r40
            X.7Z6 r5 = r12.A03
            boolean r0 = r12.A0D
            r37 = r0
            X.3tI r11 = r12.A02
            X.3Q2 r9 = r12.A06
            com.instagram.pendingmedia.model.ClipInfo r4 = r12.A05
            java.lang.String r0 = r12.A0A
            android.content.Context r7 = r12.A00
            java.lang.String r1 = r12.A0B
            r35 = r1
            boolean r6 = r12.A0G
            java.lang.String r1 = r12.A0C
            r36 = r1
            X.Nji r15 = r12.A04
            boolean r1 = r12.A0E
            r39 = r1
            java.lang.String r10 = r12.A08
            java.lang.String r8 = r12.A09
            boolean r3 = r12.A0F
            X.QP5 r2 = r12.A01
            java.lang.Boolean r1 = r12.A07
            r32 = r1
            com.instagram.common.session.UserSession r1 = r5.A00
            r31 = r41
            if (r41 == 0) goto L_0x0119
            boolean r5 = X.C70054NwW.A00(r31)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r5)
        L_0x003c:
            java.lang.Integer r19 = X.AnonymousClass05K.A0Y
            if (r11 == 0) goto L_0x0048
            boolean r5 = r11.A05()
            r21 = 1
            if (r5 == 0) goto L_0x004a
        L_0x0048:
            r21 = 0
        L_0x004a:
            r12 = 0
            r23 = r42
            r16 = r1
            r17 = r23
            r20 = r37
            r22 = r12
            X.797 r22 = X.AnonymousClass796.A02(r16, r17, r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x00ff
            X.1ua r13 = X.1ua.A00(r7, r1)
            r9.A33 = r0
            r0 = 1
            r9.A6C = r0
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r9.A0e(r5)
            X.Q0X.A04(r4, r9)
            X.0Tu r14 = X.0Tu.A05
            r4 = 36325733878084777(0x810e10000234a9, double:3.035878604265978E-306)
            boolean r4 = X.182.A06(r14, r1, r4)
            if (r4 == 0) goto L_0x00fb
            r9.A53 = r0
        L_0x007b:
            r13.A0F(r9)
            r13.A0B(r9)
            X.5yB r0 = X.C63326Kv9.A00(r9)
        L_0x0085:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r5.<init>()
            java.lang.String r4 = r0.A02()
            X.Kp0 r7 = X.C59737JVv.A00(r7, r1, r4, r12)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r4 = r7.A01()
            r5.A03 = r4
            java.lang.String r4 = r7.A02()
            r5.A05 = r4
        L_0x00a0:
            java.lang.String r4 = r0.A02()
            java.lang.String r4 = X.C59737JVv.A03(r4)
            r5.A0A = r4
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r0.A00
            r4.A00(r5)
            r26 = r44
            if (r6 == 0) goto L_0x011d
            java.lang.Class<X.1cX> r18 = X.1cX.class
            r17 = r31
            r19 = r35
            r20 = r36
            r21 = r37
            X.MaY r19 = X.C66669Mac.A04(r16, r17, r18, r19, r20, r21)
            long r28 = X.AnonymousClass7TG.A0H()
            r7 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r39)
            X.Nbv r1 = new X.Nbv
            r18 = r7
            r20 = r7
            r21 = r15
            r22 = r0
            r24 = r7
            r25 = r6
            r27 = r7
            r30 = r12
            r17 = r7
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            java.lang.String r5 = r0.A06
            java.lang.String r4 = "Invalid DirectPendingMedia object with null PendingMedia"
            X.17k.A07(r5, r4)
            r1.A04 = r0
            r1.A02 = r7
            r1.A03 = r15
            r1.A06 = r6
            r1.A02 = r10
            r1.A01 = r8
            r1.A03 = r3
            r1.A00 = r2
            return r1
        L_0x00fb:
            r9.A4x = r0
            goto L_0x007b
        L_0x00ff:
            com.instagram.pendingmedia.model.constants.ShareType r25 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ua r26 = X.1ua.A00(r7, r1)
            r27 = 0
            r20 = r7
            r21 = r1
            r24 = r4
            r28 = r0
            r29 = r27
            r30 = r35
            X.5yB r0 = X.LTU.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0085
        L_0x0119:
            r18 = 0
            goto L_0x003c
        L_0x011d:
            java.lang.Class<X.1cX> r33 = X.1cX.class
            java.lang.String r34 = ""
            r30 = r1
            r38 = r12
            X.MaY r19 = X.C66669Mac.A01(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            long r28 = X.AnonymousClass7TG.A0H()
            r17 = 0
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r39)
            X.1fi r1 = new X.1fi
            r20 = r17
            r21 = r15
            r22 = r0
            r24 = r17
            r27 = r17
            r30 = r12
            r18 = r11
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PEL.AXP(X.ODs, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1bp");
    }
}
