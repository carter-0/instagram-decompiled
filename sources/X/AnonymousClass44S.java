package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44S  reason: invalid class name */
public final class AnonymousClass44S implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44S(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r2 = r6.A01;
        r3 = X.AnonymousClass6W4.A01(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r7, X.AnonymousClass653 r8, java.util.List r9, java.util.Map r10, X.0sL r11, X.0sL r12, boolean r13) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r0 = 5
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r5 = r10.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            com.instagram.common.session.UserSession r4 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342162648533638703(0x2081088500091e2f, double:4.065280054146161E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00a6
            if (r5 == 0) goto L_0x00a6
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r8.A02
            X.0qQ.A06(r1)
            java.lang.Object r0 = r11.invoke(r5, r7)
            if (r0 != 0) goto L_0x0041
            X.XPd r3 = X.C21215XPd.A00
            return r3
        L_0x0041:
            X.3t0 r3 = new X.3t0     // Catch:{ IOException -> 0x0090 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0090 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0090 }
            X.0c9 r0 = r0.A01(r4, r1)     // Catch:{ IOException -> 0x0090 }
            X.5xS r0 = X.C300595xT.parseFromJson(r0)     // Catch:{ IOException -> 0x0090 }
            if (r0 == 0) goto L_0x008d
            java.lang.Long r0 = r0.A19     // Catch:{ IOException -> 0x0090 }
            if (r0 == 0) goto L_0x008d
            long r4 = r0.longValue()     // Catch:{ IOException -> 0x0090 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            X.2Dm r2 = r6.A01     // Catch:{ IOException -> 0x0090 }
            X.2Dr r2 = (X.2Dr) r2     // Catch:{ IOException -> 0x0090 }
            com.instagram.model.direct.DirectThreadKey r3 = X.AnonymousClass6W4.A01(r3)     // Catch:{ IOException -> 0x0090 }
            X.48S r1 = r2.A0P(r3)     // Catch:{ IOException -> 0x0090 }
            if (r1 == 0) goto L_0x008d
            monitor-enter(r1)     // Catch:{ IOException -> 0x0090 }
            X.3U9 r0 = r1.A0I     // Catch:{ all -> 0x0076 }
            X.3S9 r0 = r0.A01     // Catch:{ all -> 0x0076 }
            r0.A0N = r4     // Catch:{ all -> 0x0076 }
            goto L_0x0079
        L_0x0076:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0090 }
            throw r0     // Catch:{ IOException -> 0x0090 }
        L_0x0079:
            monitor-exit(r1)     // Catch:{ IOException -> 0x0090 }
            r2.FLo(r3)     // Catch:{ IOException -> 0x0090 }
            X.1bC r2 = r2.A0H     // Catch:{ IOException -> 0x0090 }
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ IOException -> 0x0090 }
            X.0nO r1 = r2.A02     // Catch:{ IOException -> 0x0090 }
            X.NS3 r0 = new X.NS3     // Catch:{ IOException -> 0x0090 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0090 }
            r1.ATE(r0)     // Catch:{ IOException -> 0x0090 }
        L_0x008d:
            X.6BL r3 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x0090 }
            return r3
        L_0x0090:
            r2 = move-exception
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Invalid bumpThread payload"
            X.0KC.A0F(r0, r1, r2)
            java.lang.String r0 = "BatchedPollsMessageDeltaProcessor"
            X.6BQ r3 = new X.6BQ
            r3.<init>(r2, r0, r1)
            return r3
        L_0x00a6:
            X.6BO r3 = X.AnonymousClass6BO.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44S.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
