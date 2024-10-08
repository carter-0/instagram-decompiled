package X;

/* renamed from: X.44Z  reason: invalid class name */
public final class AnonymousClass44Z implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44Z(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r0 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r3.hasNext() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r1 = ((X.C45409Cvp) r3.next()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r1 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        X.0qQ.A0F("rangeEndItemId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        if (r3.hasNext() == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r1 = ((X.C45409Cvp) r3.next()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
        if (r1 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (r4.compareTo(r1) >= 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ef, code lost:
        X.0qQ.A0F("rangeEndItemId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        r9 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (r9.hasNext() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r8 = r9.next();
        r3 = (X.C254703su) r8;
        r1 = r3.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        if (r1 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r1.compareTo(r5) < 0) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (r1.compareTo(r4) > 0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011c, code lost:
        if (r1.compareTo(r6) > 0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0124, code lost:
        if (r3.A0b() != X.AnonymousClass05K.A01) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0126, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r0 = r3.A1N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        if (r0 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        r1 = java.lang.Long.valueOf(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0132, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.C254703su.A0C(r3, r1, r3.A1M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        X.0qQ.A0F("viewedItemRanges");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r12, X.AnonymousClass653 r13, java.util.List r14, java.util.Map r15, X.0sL r16, X.0sL r17, boolean r18) {
        /*
            r11 = this;
            java.lang.String r3 = "DirectMarkEphemeralRang"
            r0 = 0
            X.0qQ.A0B(r15, r0)
            r0 = 1
            X.0qQ.A0B(r12, r0)
            r0 = 2
            X.0qQ.A0B(r13, r0)
            r0 = 5
            r4 = r16
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r15.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x016e
            java.lang.String r1 = r13.A00
            java.lang.String r0 = "add"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r4.invoke(r2, r12)
            if (r0 != 0) goto L_0x0031
            X.XPd r2 = X.C21215XPd.A00
            return r2
        L_0x0031:
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x0162, Exception -> 0x0159 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ JSONException -> 0x0162, Exception -> 0x0159 }
            X.CvI r7 = X.C44647CiR.parseFromJson(r0)     // Catch:{ JSONException -> 0x0162, Exception -> 0x0159 }
            X.2Dm r5 = r11.A00
            r0 = 0
            com.instagram.model.direct.DirectThreadKey r4 = new com.instagram.model.direct.DirectThreadKey
            r4.<init>(r2, r0)
            X.2Dr r5 = (X.2Dr) r5
            r0 = 1
            X.0qQ.A0B(r7, r0)
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325665159591032(0x810e0000113478, double:3.035835146413826E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0156
            X.48S r2 = r5.A0P(r4)
            if (r2 == 0) goto L_0x0156
            monitor-enter(r2)
            X.3U9 r0 = r2.A0I     // Catch:{ all -> 0x0152 }
            java.util.HashMap r3 = r0.CCo()     // Catch:{ all -> 0x0152 }
            int r1 = r3.size()     // Catch:{ all -> 0x0152 }
            r0 = 2
            if (r1 < r0) goto L_0x0155
            java.util.List r8 = r2.A0K     // Catch:{ all -> 0x0152 }
            java.lang.Class<X.48U> r10 = X.AnonymousClass48U.class
            monitor-enter(r10)     // Catch:{ all -> 0x0152 }
            r0 = 0
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x014f }
            java.lang.String r6 = X.AnonymousClass48U.A06(r3)     // Catch:{ all -> 0x014f }
            if (r6 == 0) goto L_0x014d
            java.util.List r0 = r7.A03     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0140
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x014f }
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x014f }
            X.Cvp r0 = (X.C45409Cvp) r0     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x014f }
            if (r1 != 0) goto L_0x009a
            java.lang.String r0 = "rangeStartItemId"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0145
        L_0x009a:
            r5 = r1
        L_0x009b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x014f }
            X.Cvp r0 = (X.C45409Cvp) r0     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x00b2
            int r0 = r5.compareTo(r1)     // Catch:{ all -> 0x014f }
            if (r0 <= 0) goto L_0x009b
            goto L_0x009a
        L_0x00b2:
            java.lang.String r0 = "rangeStartItemId"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0145
        L_0x00b9:
            java.util.List r0 = r7.A03     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x013a
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x014f }
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x014f }
            X.Cvp r0 = (X.C45409Cvp) r0     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x014f }
            if (r1 != 0) goto L_0x00d7
            java.lang.String r0 = "rangeEndItemId"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0145
        L_0x00d7:
            r4 = r1
        L_0x00d8:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x014f }
            X.Cvp r0 = (X.C45409Cvp) r0     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x00ef
            int r0 = r4.compareTo(r1)     // Catch:{ all -> 0x014f }
            if (r0 >= 0) goto L_0x00d8
            goto L_0x00d7
        L_0x00ef:
            java.lang.String r0 = "rangeEndItemId"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0145
        L_0x00f5:
            java.util.Iterator r9 = r8.iterator()     // Catch:{ all -> 0x014f }
        L_0x00f9:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x014f }
            r3 = r8
            X.3su r3 = (X.C254703su) r3     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r3.A0g()     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x00f9
            int r0 = r1.compareTo(r5)     // Catch:{ all -> 0x014f }
            if (r0 < 0) goto L_0x00f9
            int r0 = r1.compareTo(r4)     // Catch:{ all -> 0x014f }
            if (r0 > 0) goto L_0x014d
            int r0 = r1.compareTo(r6)     // Catch:{ all -> 0x014f }
            if (r0 > 0) goto L_0x014d
            java.lang.Integer r1 = r3.A0b()     // Catch:{ all -> 0x014f }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x014f }
            if (r1 != r0) goto L_0x00f9
            monitor-enter(r8)     // Catch:{ all -> 0x014f }
            java.lang.Long r0 = r3.A1N     // Catch:{ all -> 0x014a }
            monitor-exit(r8)     // Catch:{ all -> 0x014f }
            if (r0 != 0) goto L_0x00f9
            long r0 = r7.A00     // Catch:{ all -> 0x014f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x014f }
            monitor-enter(r8)     // Catch:{ all -> 0x014f }
            java.lang.Long r0 = r3.A1M     // Catch:{ all -> 0x014a }
            X.C254703su.A0C(r3, r1, r0)     // Catch:{ all -> 0x014a }
            monitor-exit(r8)     // Catch:{ all -> 0x014f }
            goto L_0x00f9
        L_0x013a:
            java.lang.String r0 = "viewedItemRanges"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
            goto L_0x0145
        L_0x0140:
            java.lang.String r0 = "viewedItemRanges"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x014f }
        L_0x0145:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x014f }
        L_0x014c:
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014d:
            monitor-exit(r10)     // Catch:{ all -> 0x0152 }
            goto L_0x0155
        L_0x014f:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0155:
            monitor-exit(r2)
        L_0x0156:
            X.6BL r2 = X.AnonymousClass6BL.A00
            return r2
        L_0x0159:
            r1 = move-exception
            java.lang.String r0 = "Non-Json format exception from parser"
            X.0KC.A0F(r3, r0, r1)
            java.lang.String r0 = "Generic exception caught"
            goto L_0x0168
        L_0x0162:
            r1 = move-exception
            java.lang.String r0 = "Invalid JSON format"
            X.0KC.A0F(r3, r0, r1)
        L_0x0168:
            X.6BR r2 = new X.6BR
            r2.<init>(r1, r3, r0)
            return r2
        L_0x016e:
            java.lang.String r1 = "precondition fail: no thread id provided or unexpected delta operation"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.6BR r2 = new X.6BR
            r2.<init>(r0, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44Z.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
