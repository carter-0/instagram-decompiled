package X;

import java.util.List;

public final class MFm extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFm(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, AnonymousClass4D7 r9, int i) {
        super(2, r9);
        this.A01 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A06 = str;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A05 = str2;
        this.A07 = str3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MFm, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MFm, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Object obj2;
        String str;
        Object obj3;
        String str2;
        String str3;
        Object obj4;
        Object obj5;
        int i;
        AnonymousClass4D7 r10 = r14;
        switch (this.A01) {
            case 0:
                String str4 = this.A06;
                String str5 = this.A07;
                String str6 = this.A05;
                ? mFm = new MFm((C61071Jw9) this.A02, (C64826Lim) this.A04, str4, str5, str6, (List) this.A03, r14);
                mFm.A00 = obj;
                return mFm;
            case 1:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A02;
                str2 = this.A07;
                str3 = this.A06;
                obj4 = this.A00;
                obj5 = this.A03;
                i = 1;
                break;
            default:
                obj5 = this.A03;
                obj4 = this.A00;
                str3 = this.A06;
                obj2 = this.A04;
                obj3 = this.A02;
                str = this.A05;
                str2 = this.A07;
                i = 2;
                break;
        }
        return new MFm(obj5, obj4, obj2, obj3, str3, str, str2, r10, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.instagram.api.schemas.RepostRestrictedReason} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d3, code lost:
        if (r2 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d7, code lost:
        if (r2 != null) goto L_0x01bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0056;
                case 1: goto L_0x00e5;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r17)
            java.lang.Object r4 = r0.A03
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r7 = r0.A00
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.LCd r2 = new X.LCd
            r2.<init>(r4, r7)
            java.lang.String r8 = r0.A06
            java.lang.String r1 = "CAMERA"
            X.3Fb r3 = r2.A00(r8, r1)
            java.lang.Object r6 = r0.A04
            java.lang.String r2 = r7.A06
            r1 = 95
            java.lang.String r2 = X.002.A0T(r2, r8, r1)
            java.lang.String r1 = "effects_by_id_"
            java.lang.String r1 = X.002.A0R(r1, r2)
            r3.A05 = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r3.A03 = r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A04 = r1
            X.1OC r1 = r3.A06()
            java.lang.Object r5 = r0.A02
            java.lang.String r9 = r0.A05
            java.lang.String r10 = r0.A07
            r11 = 0
            X.H4y r3 = new X.H4y
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.A00 = r3
            r1.run()
        L_0x0053:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0056:
            X.0eS.A00(r17)
            java.lang.Object r6 = r0.A00
            X.MPm r6 = (X.C66380MPm) r6
            java.lang.Object r1 = r0.A04
            X.Lim r1 = (X.C64826Lim) r1
            X.05G r1 = r1.A01
            boolean r2 = r6 instanceof X.C61129Jxf
            if (r2 == 0) goto L_0x0098
            java.lang.Object r11 = r0.A03
            java.util.List r11 = (java.util.List) r11
            java.lang.String r8 = r0.A06
            java.lang.String r9 = r0.A07
            java.lang.String r10 = r0.A05
            X.Jxf r6 = (X.C61129Jxf) r6
            java.lang.String r5 = r6.A00
            r4 = 0
            r3 = 0
        L_0x0077:
            r2 = 5
            X.Jvb r6 = new X.Jvb
            r6.<init>(r5, r4, r3, r2)
            java.lang.Object r0 = r0.A02
            X.Jw9 r0 = (X.C61071Jw9) r0
            java.lang.Object r5 = r0.A01
            X.JwJ r5 = (X.C61081JwJ) r5
            java.lang.Object r7 = r0.A00
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.K2R r4 = new X.K2R
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2 = 0
        L_0x008f:
            X.JTj r0 = new X.JTj
            r0.<init>(r4, r2)
        L_0x0094:
            r1.Epw(r0)
            goto L_0x0053
        L_0x0098:
            boolean r2 = r6 instanceof X.C61130Jxg
            if (r2 == 0) goto L_0x00d3
            X.Jxg r6 = (X.C61130Jxg) r6
            X.RFl r3 = r6.A00
            X.RFl r2 = X.C8918RFl.USER_CANCELLED_PAYMENT
            if (r3 == r2) goto L_0x00b8
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r11 = r0.A03
            java.util.List r11 = (java.util.List) r11
            java.lang.String r8 = r0.A06
            java.lang.String r9 = r0.A07
            java.lang.String r10 = r0.A05
            java.lang.String r5 = r6.A02
            r4 = 0
            java.lang.String r3 = r6.A01
            goto L_0x0077
        L_0x00b8:
            java.lang.Object r9 = r0.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r3.A00
            java.lang.Object r0 = r0.A02
            X.Jw9 r0 = (X.C61071Jw9) r0
            java.lang.Object r5 = r0.A01
            X.JwJ r5 = (X.C61081JwJ) r5
            java.lang.Object r6 = r0.A00
            java.lang.Integer r6 = (java.lang.Integer) r6
            X.K2Q r4 = new X.K2Q
            r4.<init>(r5, r6, r7, r8, r9)
            r2 = 1
            goto L_0x008f
        L_0x00d3:
            boolean r2 = r6 instanceof X.C64483Lck
            if (r2 == 0) goto L_0x01ed
            java.lang.String r0 = r0.A06
            X.K2M r3 = new X.K2M
            r3.<init>(r0)
            r2 = 1
            X.JTj r0 = new X.JTj
            r0.<init>(r3, r2)
            goto L_0x0094
        L_0x00e5:
            X.0eS.A00(r17)
            r13 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = X.C51970G9q.A0S(r1)
            r14 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r14)
            r1.Epw(r7)
            java.lang.String r2 = r0.A05
            java.lang.String r1 = "like"
            boolean r1 = X.0qQ.A0K(r2, r1)
            r10 = 0
            if (r1 == 0) goto L_0x0127
            java.lang.Object r6 = r0.A02
            X.Xzh r6 = (X.C22332Xzh) r6
            java.lang.String r8 = r0.A07
            java.lang.String r1 = r0.A06
            boolean r1 = X.0qQ.A0K(r8, r1)
            if (r1 != 0) goto L_0x0113
            r10 = r8
        L_0x0113:
            r11 = 0
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.A5d()
            r15 = r0 ^ 1
            r9 = r8
            r12 = r11
            r13 = r11
            r14 = r11
            r6.DNV(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0053
        L_0x0127:
            java.lang.String r1 = "comment"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0187
            java.lang.Object r2 = r0.A02
            X.Xzh r2 = (X.C22332Xzh) r2
            java.lang.Object r1 = r0.A03
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r3 = r1.getModuleName()
            java.lang.String r4 = r0.A07
            java.lang.String r1 = r0.A06
            boolean r1 = X.0qQ.A0K(r4, r1)
            r6 = r10
            if (r1 != 0) goto L_0x0147
            r6 = r4
        L_0x0147:
            r7 = 0
            java.lang.Object r1 = r0.A00
            X.1Xj r1 = (X.1Xj) r1
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r1)
            if (r0 == 0) goto L_0x0156
            java.lang.String r10 = r0.getUsername()
        L_0x0156:
            X.1Xy r0 = r1.A0C
            X.4oA r0 = r0.C5R()
            if (r0 == 0) goto L_0x0185
            java.lang.Boolean r0 = r0.AkR()
            if (r0 == 0) goto L_0x0185
            boolean r11 = r0.booleanValue()
        L_0x0168:
            X.1Xy r0 = r1.A0C
            X.4oA r0 = r0.C5R()
            if (r0 == 0) goto L_0x0183
            java.lang.Boolean r0 = r0.AkK()
            if (r0 == 0) goto L_0x0183
            boolean r12 = r0.booleanValue()
        L_0x017a:
            r5 = r4
            r8 = r7
            r9 = r7
            r15 = r13
            r2.D6d(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0053
        L_0x0183:
            r12 = 0
            goto L_0x017a
        L_0x0185:
            r11 = 0
            goto L_0x0168
        L_0x0187:
            java.lang.String r1 = "repost"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x01da
            java.lang.Object r1 = r0.A00
            X.1Xj r1 = (X.1Xj) r1
            X.1Xy r1 = r1.A0C
            X.4oA r2 = r1.C5R()
            if (r2 == 0) goto L_0x01d2
            X.4o8 r1 = r2.BtE()
            if (r1 == 0) goto L_0x01d2
            java.lang.Boolean r1 = r1.AkS()
            if (r1 == 0) goto L_0x01d2
            boolean r14 = r1.booleanValue()
        L_0x01ab:
            X.4o8 r1 = r2.BtE()
            if (r1 == 0) goto L_0x01d6
            java.lang.Boolean r1 = r1.AkM()
            if (r1 == 0) goto L_0x01d6
            boolean r15 = r1.booleanValue()
        L_0x01bb:
            X.4o8 r1 = r2.BtE()
            if (r1 == 0) goto L_0x01c5
            com.instagram.api.schemas.RepostRestrictedReason r10 = r1.Bmz()
        L_0x01c5:
            java.lang.Object r9 = r0.A02
            X.Xzh r9 = (X.C22332Xzh) r9
            java.lang.String r11 = r0.A07
            r12 = 0
            r13 = r12
            r9.DeB(r10, r11, r12, r13, r14, r15)
            goto L_0x0053
        L_0x01d2:
            r14 = 0
            if (r2 == 0) goto L_0x01d6
            goto L_0x01ab
        L_0x01d6:
            r15 = 0
            if (r2 == 0) goto L_0x01c5
            goto L_0x01bb
        L_0x01da:
            java.lang.String r1 = "share"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.A02
            X.Xzh r1 = (X.C22332Xzh) r1
            java.lang.String r0 = r0.A07
            r1.Djw(r0, r10, r10)
            goto L_0x0053
        L_0x01ed:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFm) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFm(C61071Jw9 jw9, C64826Lim lim, String str, String str2, String str3, List list, AnonymousClass4D7 r8) {
        super(2, r8);
        this.A01 = 0;
        this.A04 = lim;
        this.A03 = list;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A02 = jw9;
    }
}
