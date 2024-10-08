package X;

/* renamed from: X.Rgt  reason: case insensitive filesystem */
public abstract class C9797Rgt {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (X.00l.A0W(r13) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r16, X.AnonymousClass6Tm r17) {
        /*
            r3 = 1
            r0 = 0
            r1 = r17
            java.util.List r2 = r1.A00
            java.lang.Object r1 = r2.get(r0)
            X.0qQ.A07(r1)
            X.4tV r1 = (X.C276544tV) r1
            X.4uI r8 = X.DbV.A0R(r2, r3)
            r0 = 2
            X.4uI r9 = X.DbV.A0R(r2, r0)
            r0 = 3
            X.4uI r10 = X.DbV.A0R(r2, r0)
            java.lang.String r13 = r1.A0F()
            java.lang.String r12 = r1.A0D()
            if (r13 == 0) goto L_0x002e
            boolean r1 = X.00l.A0W(r13)
            r0 = 0
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            r1 = 0
            if (r0 != 0) goto L_0x00b8
            if (r12 == 0) goto L_0x00b8
            boolean r0 = X.00l.A0W(r12)
            if (r0 != 0) goto L_0x00b8
            r7 = r16
            X.0lg r3 = X.C308206Td.A0B(r7)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00b8
            if (r3 == 0) goto L_0x00b8
            r0 = 15
            X.WxR r2 = new X.WxR
            r2.<init>(r3, r0)
            java.lang.Class<X.SOF> r0 = X.SOF.class
            java.lang.Object r11 = r3.A01(r0, r2)
            X.SOF r11 = (X.SOF) r11
            monitor-enter(r11)
            r0 = 1
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x00b5 }
            X.6Rm r0 = r7.A03     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b3
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x00b5 }
            android.content.Context r5 = r0.getApplicationContext()     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x00b3
            X.Rz4 r6 = new X.Rz4     // Catch:{ all -> 0x00b5 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00b5 }
            X.0JR r0 = r11.A01     // Catch:{ all -> 0x00b5 }
            long r2 = r0.now()     // Catch:{ all -> 0x00b5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00b5 }
            java.util.Map r0 = r11.A03     // Catch:{ all -> 0x00b5 }
            r0.put(r4, r6)     // Catch:{ all -> 0x00b5 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00b5 }
            X.Rz4 r4 = (X.C10844Rz4) r4     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x00b3
            com.facebook.secure.securewebview.SecureWebView r12 = new com.facebook.secure.securewebview.SecureWebView     // Catch:{ all -> 0x00b5 }
            r12.<init>(r5)     // Catch:{ all -> 0x00b5 }
            X.QcL r0 = new X.QcL     // Catch:{ all -> 0x00b5 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x00b5 }
            r12.A02(r0)     // Catch:{ all -> 0x00b5 }
            X.SOr r0 = new X.SOr     // Catch:{ all -> 0x00b5 }
            r0.<init>()     // Catch:{ all -> 0x00b5 }
            r0.A03()     // Catch:{ all -> 0x00b5 }
            X.S4j r0 = r0.A02()     // Catch:{ all -> 0x00b5 }
            r12.A01 = r0     // Catch:{ all -> 0x00b5 }
            com.instagram.common.session.UserSession r0 = r11.A02     // Catch:{ all -> 0x00b5 }
            X.SAG.A01(r12, r0, r1)     // Catch:{ all -> 0x00b5 }
            r4.A03 = r12     // Catch:{ all -> 0x00b5 }
            java.lang.String r13 = r4.A0A     // Catch:{ all -> 0x00b5 }
            java.lang.String r14 = r4.A0B     // Catch:{ all -> 0x00b5 }
            java.lang.String r15 = "text/html"
            java.lang.String r16 = "utf-8"
            r17 = r1
            r12.loadDataWithBaseURL(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00b5 }
        L_0x00b3:
            monitor-exit(r11)
            return r1
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9797Rgt.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
