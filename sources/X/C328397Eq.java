package X;

/* renamed from: X.7Eq  reason: invalid class name and case insensitive filesystem */
public abstract class C328397Eq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.4ou, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v36, types: [X.Cte, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.Cte, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v54, types: [X.4ou, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v63, types: [X.4ou, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f8, code lost:
        if (r1 == 0) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (X.AnonymousClass4KJ.A00(r12) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        if (android.text.TextUtils.isEmpty(r10.A01) != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0165, code lost:
        if (r15.booleanValue() != false) goto L_0x0167;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C328407Er A00(com.google.common.collect.ImmutableList r12, com.instagram.common.session.UserSession r13, X.AnonymousClass2Ep r14, java.lang.Boolean r15, java.lang.String r16, java.lang.String r17) {
        /*
            r4 = r14
            X.3su r7 = r14.BKv()
            r5 = 0
            r3 = r13
            if (r7 == 0) goto L_0x0023
            X.5Cg r0 = r7.A0k
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r0.A01
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x0023
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324776100442480(0x810d3100033170, double:3.035272901828328E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x0023
            r5 = 1
        L_0x0023:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0090
            r7.getClass()
            X.5Cg r4 = r7.A0k
            r5 = 0
            r4.getClass()
            java.util.List r0 = r4.A01
            if (r0 != 0) goto L_0x0048
            r10 = 0
        L_0x003b:
            r0 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            X.7Er r4 = new X.7Er
            r6 = r5
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0048:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0051:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r3.next()
            X.5Ci r0 = (X.C282245Ci) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String r2 = r0.A00
            r1 = 0
            if (r2 == 0) goto L_0x0051
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L_0x0074
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r1 = 1
        L_0x0075:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.4ou r0 = new X.4ou
            r0.<init>()
            r0.A05 = r2
            r0.A03 = r5
            r0.A00 = r1
            r0.A06 = r5
            r0.A04 = r5
            r0.A02 = r5
            r0.A01 = r5
            r10.add(r0)
            goto L_0x0051
        L_0x0090:
            r2 = r17
            if (r17 != 0) goto L_0x009b
            boolean r1 = X.AnonymousClass4KJ.A00(r12)
            r0 = 0
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0100
            r5 = 0
            if (r17 != 0) goto L_0x00ee
            r6 = r5
        L_0x00aa:
            r4 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            if (r17 == 0) goto L_0x00b2
            r4 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x00f8
            boolean r1 = r12.isEmpty()
            r0 = 1
            if (r1 == r0) goto L_0x00f8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.3kO r3 = r12.iterator()
            X.0qQ.A07(r3)
        L_0x00c7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            X.4ou r0 = new X.4ou
            r0.<init>()
            r0.A05 = r2
            r0.A03 = r5
            r0.A00 = r1
            r0.A06 = r5
            r0.A04 = r5
            r0.A02 = r5
            r0.A01 = r5
            r10.add(r0)
            goto L_0x00c7
        L_0x00ee:
            X.Cte r6 = new X.Cte
            r6.<init>()
            r6.A01 = r2
            r6.A00 = r5
            goto L_0x00aa
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            X.7Er r4 = new X.7Er
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0100:
            X.3U9 r4 = (X.AnonymousClass3U9) r4
            X.3S9 r1 = r4.A01
            X.9IV r9 = r1.A0T
            if (r7 != 0) goto L_0x0241
            X.Cte r0 = r1.A0d
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0241
            X.Cte r10 = r1.A0d
        L_0x0116:
            if (r7 != 0) goto L_0x0216
            java.util.List r0 = r1.A23
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x023e
            java.util.List r14 = r1.A23
        L_0x0122:
            r6 = 0
            if (r10 == 0) goto L_0x012e
            java.lang.String r0 = r10.A01
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 == 0) goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass4KJ.A00(r14)
            r5 = r0 ^ 1
            r4 = 0
            r2 = r16
            if (r16 == 0) goto L_0x0158
            X.1E8 r0 = X.1E7.A00(r13)
            X.1Xj r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0158
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r13, r0)
            if (r0 == 0) goto L_0x0158
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
            if (r0 == 0) goto L_0x0158
            boolean r4 = X.AnonymousClass3ZN.A02(r0)
        L_0x0158:
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0160
            if (r4 != 0) goto L_0x0167
        L_0x0160:
            boolean r1 = r15.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0168
        L_0x0167:
            r0 = 1
        L_0x0168:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            if (r5 != 0) goto L_0x0170
            if (r4 != 0) goto L_0x0176
        L_0x0170:
            boolean r0 = r15.booleanValue()
            if (r0 == 0) goto L_0x0177
        L_0x0176:
            r6 = 1
        L_0x0177:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x01ae
            X.1E8 r0 = X.1E7.A00(r3)
            X.1Xj r0 = r0.A02(r2)
            r10 = 0
            if (r0 == 0) goto L_0x01ae
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r3, r0)
            if (r0 == 0) goto L_0x01ae
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
            if (r0 == 0) goto L_0x01ae
            java.lang.String r1 = r0.B9l()
            if (r1 == 0) goto L_0x01ae
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01ae
            X.Cte r0 = new X.Cte
            r0.<init>()
            r0.A01 = r1
            r0.A00 = r10
            r10 = r0
        L_0x01ae:
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L_0x0244
            X.1E8 r0 = X.1E7.A00(r3)
            X.1Xj r0 = r0.A02(r2)
            r14 = 0
            if (r0 == 0) goto L_0x0244
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r3, r0)
            if (r0 == 0) goto L_0x0244
            com.instagram.api.schemas.OnFeedMessagesIntf r5 = r0.BTY()
            if (r5 == 0) goto L_0x0244
            java.util.List r0 = r5.BE6()
            if (r0 == 0) goto L_0x0244
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x01da:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r4.next()
            com.instagram.api.schemas.IceBreakerMessageIntf r0 = (com.instagram.api.schemas.IceBreakerMessageIntf) r0
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01da
            r2 = 0
            java.lang.String r0 = r5.B9l()
            if (r0 == 0) goto L_0x01fa
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x01fb
        L_0x01fa:
            r0 = 1
        L_0x01fb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.4ou r0 = new X.4ou
            r0.<init>()
            r0.A05 = r3
            r0.A03 = r2
            r0.A00 = r1
            r0.A06 = r2
            r0.A04 = r2
            r0.A02 = r2
            r0.A01 = r2
            r14.add(r0)
            goto L_0x01da
        L_0x0216:
            java.lang.String r1 = r13.A06
            java.lang.String r0 = r7.A1u
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x023e
            X.O7Y r1 = r7.A0K
            if (r1 == 0) goto L_0x023e
            java.util.List r0 = r1.A00
            if (r0 != 0) goto L_0x0239
            r0 = 0
        L_0x0229:
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x023e
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x023e
            java.util.List r14 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0122
        L_0x0239:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0229
        L_0x023e:
            r14 = 0
            goto L_0x0122
        L_0x0241:
            r10 = 0
            goto L_0x0116
        L_0x0244:
            X.7Er r4 = new X.7Er
            r8 = r4
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328397Eq.A00(com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, X.2Ep, java.lang.Boolean, java.lang.String, java.lang.String):X.7Er");
    }
}
