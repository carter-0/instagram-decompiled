package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44K  reason: invalid class name */
public final class AnonymousClass44K implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44K(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        X.0wb.A03("invalid_inbox_setting_format", "Invalid InboxSetting format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        return new X.AnonymousClass6BR(r2, "invalid_inbox_setting_format", "Invalid InboxSetting format");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
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
            java.lang.Object r3 = r10.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0090
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "replace"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            java.lang.Object r2 = r11.invoke(r3, r7)
            X.2Eq r2 = (X.2Eq) r2
            if (r2 != 0) goto L_0x002f
            X.XPd r3 = X.C21215XPd.A00
            return r3
        L_0x002f:
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x0082 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0082 }
            X.3Te r0 = X.C242223Tc.parseFromJson(r0)     // Catch:{ IOException -> 0x0082 }
            boolean r5 = r0.A0I     // Catch:{ IOException -> 0x0082 }
            com.instagram.common.session.UserSession r1 = r6.A00     // Catch:{ IOException -> 0x0082 }
            r0 = 0
            X.C70148Ny2.A00(r1, r7, r3, r0)     // Catch:{ IOException -> 0x0082 }
            X.2Dm r4 = r6.A01     // Catch:{ IOException -> 0x0082 }
            com.instagram.model.direct.DirectThreadKey r3 = r2.BJy()     // Catch:{ IOException -> 0x0082 }
            X.2Dr r4 = (X.2Dr) r4     // Catch:{ IOException -> 0x0082 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0082 }
            r2 = 0
            X.48S r1 = r4.A0P(r3)     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = "Null thread entry"
            r0 = 556(0x22c, float:7.79E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x007f }
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x007f }
            goto L_0x007b
        L_0x005d:
            X.3Te r0 = r1.A0L()     // Catch:{ all -> 0x007f }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x007f }
            r0.A0I = r5     // Catch:{ all -> 0x007f }
            X.2Kb r0 = r1.A0M(r0)     // Catch:{ all -> 0x007f }
            X.2Dr.A0E(r0, r4, r2)     // Catch:{ all -> 0x007f }
            X.2ED r2 = r4.A0C     // Catch:{ all -> 0x007f }
            X.3U9 r1 = r1.A0I     // Catch:{ all -> 0x007f }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x007f }
            r0 = 1
            r2.A0Q(r1, r5, r5, r0)     // Catch:{ all -> 0x007f }
            r4.FLo(r3)     // Catch:{ all -> 0x007f }
        L_0x007b:
            monitor-exit(r4)     // Catch:{ IOException -> 0x0082 }
            X.6BL r3 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x0082 }
            return r3
        L_0x007f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0082 }
            throw r0     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            r2 = move-exception
            java.lang.String r1 = "invalid_inbox_setting_format"
            java.lang.String r0 = "Invalid InboxSetting format"
            X.0wb.A03(r1, r0)
            X.6BR r3 = new X.6BR
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0090:
            X.6BO r3 = X.AnonymousClass6BO.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44K.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
