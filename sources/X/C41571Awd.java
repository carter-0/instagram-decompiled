package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Awd  reason: case insensitive filesystem */
public final class C41571Awd extends 0Yg implements C62320sa {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ C333537Zi A01;
    public final /* synthetic */ OCA A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41571Awd(C53401GnY gnY, C333537Zi r3, OCA oca, DirectThreadKey directThreadKey, String str, String str2, String str3, List list, boolean z) {
        super(0);
        this.A01 = r3;
        this.A03 = directThreadKey;
        this.A07 = list;
        this.A08 = z;
        this.A06 = str;
        this.A02 = oca;
        this.A05 = str2;
        this.A00 = gnY;
        this.A04 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3.A00 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r42 = this;
            r3 = r42
            X.7Zi r1 = r3.A01
            com.instagram.model.direct.DirectThreadKey r2 = r3.A03
            java.util.List r7 = r3.A07
            boolean r13 = r3.A08
            java.lang.String r6 = r3.A06
            X.OCA r12 = r3.A02
            java.lang.String r5 = r3.A05
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x001a
            X.GnY r0 = r3.A00
            r28 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r28 = 0
        L_0x001c:
            java.lang.String r11 = r3.A04
            com.instagram.common.session.UserSession r0 = r1.A03
            X.7UH r4 = X.AnonymousClass7UG.A00(r0)
            r3 = 0
            r4.A03(r5, r3)
            int r8 = r5.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r8 = X.C328727Fx.A00(r0, r8)
            if (r8 == 0) goto L_0x003c
            r8.onLogTransportMessageEnd()
            r8.onLogSendServiceStart()
        L_0x003c:
            java.lang.String r29 = X.C333537Zi.A03(r1, r3)
            X.ODs r8 = X.OQO.A00(r0, r2)
            if (r8 == 0) goto L_0x010a
            boolean r8 = X.C70054NwW.A00(r8)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r8)
        L_0x004e:
            java.lang.Integer r19 = X.AnonymousClass05K.A0A
            r15 = 0
            r16 = r0
            r17 = r2
            r20 = r13
            r21 = r3
            r22 = r3
            X.797 r8 = X.AnonymousClass796.A02(r16, r17, r18, r19, r20, r21, r22)
            boolean r41 = r8.A00()
            java.lang.Class<X.1fi> r18 = X.1fi.class
            boolean r8 = r1.A00
            X.ODs r17 = X.OQO.A00(r0, r2)
            r19 = r15
            r20 = r6
            r21 = r5
            r22 = r13
            r23 = r8
            X.MaY r6 = X.C66669Mac.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r8 = r6.A03
            r21 = 15
            int r22 = r7.size()
            r16 = r1
            r17 = r2
            r18 = r8
            r19 = r29
            r20 = r15
            r23 = r13
            r24 = r41
            X.C333537Zi.A08(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.pendingmedia.model.constants.ShareType r18 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.1ud r10 = X.1ua.A0G
            android.content.Context r9 = r1.A02
            X.1ua r19 = r10.A01(r9, r0)
            int r8 = r8.hashCode()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r8)
            r16 = r0
            r21 = r7
            r22 = r41
            X.5yB r20 = X.LTU.A04(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Long r24 = X.OQO.A01(r0, r2)
            long r26 = X.AnonymousClass7TG.A0H()
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r3)
            X.1fi r14 = new X.1fi
            r16 = r15
            r19 = r15
            r22 = r15
            r21 = r2
            r25 = r11
            r18 = r12
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r6 = 1
            r4.A05(r5, r6)
            boolean r4 = X.AnonymousClass7TE.A1b(r7)
            if (r4 == 0) goto L_0x0100
            java.lang.String r30 = r14.A06()
            java.lang.String r4 = r2.A00
            java.lang.Object r2 = r7.get(r3)
            X.L4P r2 = (X.L4P) r2
            boolean r2 = r2.A01
            r32 = 2
            if (r2 == 0) goto L_0x00eb
            r32 = 4
        L_0x00eb:
            int r33 = r7.size()
            r34 = 0
            r27 = r1
            r28 = r15
            r31 = r4
            r36 = r34
            r38 = r34
            r40 = r13
            X.C333537Zi.A09(r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40, r41)
        L_0x0100:
            X.1Ou r0 = X.1Ou.A01(r0)
            r0.A0A(r14)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x010a:
            r18 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41571Awd.invoke():java.lang.Object");
    }
}
