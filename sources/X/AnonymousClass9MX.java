package X;

/* renamed from: X.9MX  reason: invalid class name */
public final class AnonymousClass9MX extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MX(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = z;
        this.A01 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (X.00p.A0j(r10.getString(2131970457), r6.C4o(r10, r5, r4, r3).toString(), true) != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r20
            r10 = r21
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0112
            android.content.Context r10 = (android.content.Context) r10
            r7 = 0
            X.0qQ.A0B(r10, r7)
            java.lang.Object r0 = r2.A04
            X.5Es r0 = (X.C282785Es) r0
            java.lang.Object r6 = r2.A01
            X.3YT r6 = (X.AnonymousClass3YT) r6
            com.instagram.common.session.UserSession r5 = r0.A00
            java.lang.Object r4 = r2.A02
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r2.A03
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            boolean r2 = r2.A05
            java.lang.String r14 = r6.BSq(r10, r4, r3)
            if (r14 != 0) goto L_0x006c
            int r0 = r3.A02
            com.instagram.model.androidlink.AndroidLink r8 = X.AnonymousClass47K.A02(r10, r5, r4, r0, r7)
            java.util.EnumSet r0 = X.1sx.A01
            r0 = 2
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x010f
            int r1 = r3.A02
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x010c
            X.1Xj r9 = r4.A1c(r1)
        L_0x0046:
            boolean r0 = X.1sx.A0S(r8)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r8 = X.C231122qu.A07(r5, r4)
            r0 = 32
            X.Ini r1 = new X.Ini
            r1.<init>(r5, r0)
            java.lang.Class<X.5F1> r0 = X.AnonymousClass5F1.class
            java.lang.Object r0 = r5.A01(r0, r1)
            X.5F1 r0 = (X.AnonymousClass5F1) r0
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x00a5
            r0 = 2131964677(0x7f133305, float:1.9566142E38)
            java.lang.String r14 = r10.getString(r0)
        L_0x006c:
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r4.A60()
            if (r0 != 0) goto L_0x00a2
            int r0 = r3.A02
            com.instagram.model.androidlink.AndroidLink r0 = X.AnonymousClass47K.A02(r10, r5, r4, r0, r7)
            if (r0 == 0) goto L_0x00a0
            X.47L r1 = X.C271714jT.A01(r0)
        L_0x0084:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE
            if (r1 != r0) goto L_0x00a2
            r0 = 2131970457(0x7f134999, float:1.9577866E38)
            java.lang.String r7 = r10.getString(r0)
            java.lang.CharSequence r0 = r6.C4o(r10, r5, r4, r3)
            java.lang.String r1 = r0.toString()
            r0 = 1
            boolean r0 = X.00p.A0j(r7, r1, r0)
            if (r0 == 0) goto L_0x00a2
        L_0x009e:
            r14 = 0
        L_0x009f:
            return r14
        L_0x00a0:
            r1 = 0
            goto L_0x0084
        L_0x00a2:
            if (r2 == 0) goto L_0x009f
            goto L_0x009e
        L_0x00a5:
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            r1 = 1
            if (r0 == 0) goto L_0x00e7
            com.instagram.api.schemas.CallAdsInfoDictIntf r0 = r0.AjU()
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r0.BuT()
            if (r0 != r1) goto L_0x00e7
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00e7
            com.instagram.api.schemas.CallAdsInfoDictIntf r0 = r0.AjU()
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r0.Bai()
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00e7
            X.1Xy r0 = r4.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x010f
            com.instagram.api.schemas.CallAdsInfoDictIntf r0 = r0.AjU()
            if (r0 == 0) goto L_0x010f
            java.lang.String r14 = r0.Bai()
            goto L_0x006c
        L_0x00e7:
            r14 = 0
            if (r9 == 0) goto L_0x006c
            java.util.List r1 = r9.A3P()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r1.get(r7)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            boolean r0 = X.1sx.A0T(r0)
            if (r0 == 0) goto L_0x0106
            boolean r0 = X.0oI.A0G(r10)
            if (r0 == 0) goto L_0x006c
        L_0x0106:
            java.lang.String r14 = X.C247643gg.A02(r9)
            goto L_0x006c
        L_0x010c:
            r9 = r4
            goto L_0x0046
        L_0x010f:
            r14 = 0
            goto L_0x006c
        L_0x0112:
            X.4Gu r10 = (X.C262994Gu) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r1 = r2.A04
            X.4Gv r1 = (X.C263004Gv) r1
            java.lang.Object r12 = r2.A03
            X.3W1 r12 = (X.AnonymousClass3W1) r12
            java.lang.Object r11 = r2.A02
            X.1Xj r11 = (X.1Xj) r11
            boolean r14 = r2.A05
            java.lang.Object r0 = r2.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r13 = r0.A2n()
            com.instagram.common.session.UserSession r15 = r1.A00
            X.AyF r9 = new X.AyF
            r9.<init>(r10, r11, r12, r13, r14)
            r16 = 0
            r19 = 1
            X.3aW r14 = new X.3aW
            r17 = r16
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MX.invoke(java.lang.Object):java.lang.Object");
    }
}
