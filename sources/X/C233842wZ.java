package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2wZ  reason: invalid class name and case insensitive filesystem */
public final class C233842wZ implements C233072uu {
    public int A00 = -1;
    public C54077Gz1 A01;
    public final UserSession A02;
    public final C233072uu A03;

    public C233842wZ(UserSession userSession, C233072uu r3) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = r3;
    }

    public final void CsF(int i) {
    }

    public final void D67() {
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.Gku, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (r0.A00 != 7) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r5 == null) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268314dB Dlz(java.lang.Integer r26, java.util.List r27) {
        /*
            r25 = this;
            r15 = 0
            r0 = r27
            X.0qQ.A0B(r0, r15)
            r6 = 1
            r3 = r26
            X.0qQ.A0B(r3, r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fc
            r4 = r25
            X.Gz1 r0 = r4.A01
            java.lang.String r10 = "intentAwareAdPivotResponse"
            r12 = 0
            if (r0 == 0) goto L_0x0120
            java.util.List r0 = r0.A0B
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x010d
            com.instagram.common.session.UserSession r1 = r4.A02
            X.Gz1 r0 = r4.A01
            if (r0 == 0) goto L_0x0120
            boolean r0 = X.C55043HbE.A00(r1, r0)
            if (r0 == 0) goto L_0x010d
            X.Gz1 r5 = r4.A01
            if (r5 == 0) goto L_0x0120
            int r2 = r4.A00
            X.2vo r13 = r5.A01()
            r20 = 16382(0x3ffe, float:2.2956E-41)
            X.2vl r11 = new X.2vl
            r14 = r12
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Integer r1 = r5.A02()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0060
            r11.A0B(r2)
            r11.A02 = r6
        L_0x0060:
            java.util.List r0 = r5.A0B
            java.lang.Object r0 = r0.get(r15)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0118
            java.util.List r0 = r5.A0B
            java.lang.Object r0 = r0.get(r15)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r1 = r0.A00()
            X.1UQ r0 = X.1UQ.A0Y
            X.1Xg r6 = new X.1Xg
            r6.<init>(r1, r0, r2)
            X.3PG r5 = X.AnonymousClass3PG.NETWORK
            java.lang.String r2 = X.AnonymousClass1FM.A00()
            X.AnonymousClass1FM.A00()
            X.1FI r1 = X.1FI.A0M
            r9 = 2
            X.9J8 r0 = new X.9J8
            r0.<init>((X.1FI) r1, (java.lang.String) r2)
            X.4EB r7 = new X.4EB
            r7.<init>(r0, r6, r5, r11)
            X.1Xg r0 = r7.A01
            X.1Xn r0 = r0.A05
            X.1Xj r8 = X.1Xi.A02(r0)
            X.Gz1 r2 = r4.A01
            if (r2 == 0) goto L_0x0120
            X.BFc r0 = r2.A03
            if (r0 == 0) goto L_0x00b1
            int r1 = r0.A00
            r0 = 7
            r6 = 1
            if (r1 == r0) goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0106
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r0 = r2.A02
            if (r0 == 0) goto L_0x00be
            java.lang.String r5 = r0.A01
        L_0x00bc:
            if (r5 != 0) goto L_0x00bf
        L_0x00be:
            r5 = r1
        L_0x00bf:
            if (r6 == 0) goto L_0x00cb
            X.Gz1 r0 = r4.A01
            if (r0 == 0) goto L_0x0120
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r0 = r0.A02
            if (r0 == 0) goto L_0x00cb
            java.lang.String r12 = r0.A00
        L_0x00cb:
            if (r8 == 0) goto L_0x00ef
            X.Gz1 r1 = r4.A01
            if (r1 == 0) goto L_0x0120
            X.BFc r0 = r1.A03
            if (r0 == 0) goto L_0x0104
            int r2 = r0.A00
        L_0x00d7:
            java.lang.String r1 = r1.getId()
            X.0qQ.A0B(r1, r9)
            X.Gku r0 = new X.Gku
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r0.A03 = r5
            r0.A02 = r12
            r0.A04 = r6
            r8.A0B = r0
        L_0x00ef:
            X.2uu r1 = r4.A03
            X.4EB[] r0 = new X.AnonymousClass4EB[]{r7}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            r1.Dlz(r3, r0)
        L_0x00fc:
            X.0sn r1 = X.0sn.A00
            X.4dB r0 = new X.4dB
            r0.<init>(r1, r1)
            return r0
        L_0x0104:
            r2 = -1
            goto L_0x00d7
        L_0x0106:
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r0 = r2.A00()
            java.lang.String r5 = r0.A02
            goto L_0x00bc
        L_0x010d:
            X.Gz1 r1 = r4.A01
            if (r1 == 0) goto L_0x0120
            int r0 = r4.A00
            X.4EB r7 = X.C55042HbD.A00(r1, r0)
            goto L_0x00ef
        L_0x0118:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0120:
            X.0qQ.A0F(r10)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233842wZ.Dlz(java.lang.Integer, java.util.List):X.4dB");
    }

    public final Map Bk0() {
        return new LinkedHashMap();
    }

    public final /* synthetic */ C268314dB Dm0(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(C273654mx.A00(11));
    }
}
