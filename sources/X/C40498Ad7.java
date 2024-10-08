package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Ad7  reason: case insensitive filesystem */
public final /* synthetic */ class C40498Ad7 implements B1V {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C254933tI A01;
    public final /* synthetic */ AnonymousClass7Z6 A02;
    public final /* synthetic */ C69343Nji A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ AnonymousClass3Q2 A05;
    public final /* synthetic */ C352218Cl A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ C40498Ad7(Context context, C254933tI r2, AnonymousClass7Z6 r3, C69343Nji nji, DirectShareTarget directShareTarget, AnonymousClass3Q2 r6, C352218Cl r7, String str, String str2, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = directShareTarget;
        this.A0A = z;
        this.A05 = r6;
        this.A00 = context;
        this.A06 = r7;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = nji;
        this.A09 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r12.A05() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1bp AXP(X.C70621ODs r42, com.instagram.model.direct.DirectThreadKey r43, java.lang.Boolean r44, java.lang.Long r45) {
        /*
            r41 = this;
            r0 = r41
            X.7Z6 r10 = r0.A02
            X.3tI r12 = r0.A01
            com.instagram.model.direct.DirectShareTarget r5 = r0.A04
            boolean r8 = r0.A0A
            X.3Q2 r4 = r0.A05
            android.content.Context r3 = r0.A00
            X.8Cl r2 = r0.A06
            java.lang.String r7 = r0.A07
            java.lang.String r6 = r0.A08
            X.Nji r15 = r0.A03
            boolean r9 = r0.A09
            r1 = 1
            if (r12 == 0) goto L_0x0023
            boolean r0 = r12.A05()
            r21 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r21 = 0
        L_0x0025:
            com.instagram.common.session.UserSession r0 = r10.A00
            com.instagram.model.direct.DirectThreadKey r17 = r5.A00()
            r11 = 0
            r36 = r42
            if (r42 == 0) goto L_0x00ec
            boolean r10 = X.C70054NwW.A00(r36)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r10)
        L_0x0038:
            java.lang.Integer r19 = X.AnonymousClass05K.A0N
            r24 = 0
            r16 = r0
            r20 = r8
            r22 = r24
            X.797 r27 = X.AnonymousClass796.A02(r16, r17, r18, r19, r20, r21, r22)
            r17 = r43
            if (r4 == 0) goto L_0x00d0
            com.instagram.model.direct.DirectThreadKey r5 = r5.A00()
            X.1ua r3 = X.1ua.A00(r3, r0)
            X.5yB r3 = X.LTU.A03(r0, r5, r4, r3)
        L_0x0056:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r2.A01()
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L_0x00c7
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x00c7
            X.0qQ.A0B(r0, r1)
            X.0sn r1 = X.0sn.A00
            X.Kp0 r1 = X.C59737JVv.A01(r0, r2, r1)
        L_0x006d:
            if (r1 == 0) goto L_0x00c2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r3.A00
            java.lang.String r2 = r1.A01()
            r4.A03 = r2
            java.lang.String r2 = r4.A05
            boolean r2 = X.0mp.A0B(r2)
            if (r2 == 0) goto L_0x0087
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r3.A00
            java.lang.String r1 = r1.A02()
            r2.A05 = r1
        L_0x0087:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r3.A00
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x0093
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x009d
        L_0x0093:
            java.lang.String r1 = r3.A02()
            java.lang.String r1 = X.C364678lo.A05(r1)
            r2.A0A = r1
        L_0x009d:
            java.lang.Class<X.1cX> r37 = X.1cX.class
            r35 = r0
            r38 = r7
            r39 = r6
            r40 = r8
            X.MaY r13 = X.C66669Mac.A04(r35, r36, r37, r38, r39, r40)
            long r22 = X.AnonymousClass7TG.A0H()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r9)
            X.1fi r10 = new X.1fi
            r20 = r45
            r14 = r11
            r18 = r11
            r21 = r11
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            return r10
        L_0x00c2:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r3.A00
            r1.A03 = r2
            goto L_0x0087
        L_0x00c7:
            java.lang.String r4 = r3.A02()
            X.Kp0 r1 = X.C59737JVv.A00(r11, r0, r4, r1)
            goto L_0x006d
        L_0x00d0:
            com.instagram.pendingmedia.model.constants.ShareType r30 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ua r31 = X.1ua.A00(r3, r0)
            r25 = r3
            r26 = r0
            r28 = r17
            r29 = r11
            r32 = r2
            r33 = r11
            r34 = r11
            r35 = r7
            X.5yB r3 = X.LTU.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0056
        L_0x00ec:
            r18 = r11
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40498Ad7.AXP(X.ODs, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1bp");
    }
}
