package X;

/* renamed from: X.HVq  reason: case insensitive filesystem */
public abstract class C54859HVq {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r18, X.AnonymousClass6Tm r19) {
        /*
            r5 = r18
            X.6Rm r0 = r5.A03
            if (r0 != 0) goto L_0x0011
            java.lang.ref.WeakReference r0 = r5.A0C
            r4 = 0
            java.lang.Object r0 = r0.get()
            X.6Rm r0 = (X.C307786Rm) r0
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            android.content.Context r4 = r0.A00
        L_0x0013:
            r10 = 0
            if (r4 != 0) goto L_0x0017
            return r10
        L_0x0017:
            X.0lg r8 = X.C308206Td.A0B(r5)
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.C56316HwT.A01(r8)
            androidx.fragment.app.FragmentActivity r7 = X.C308206Td.A04(r5)
            r3 = 0
            r0 = r19
            java.util.List r0 = r0.A00
            java.lang.Object r6 = r0.get(r3)
            X.4tV r6 = (X.C276544tV) r6
            if (r6 == 0) goto L_0x003b
            r6.A0O()
            java.lang.String r0 = r6.A0D()
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003b:
            r6 = r10
        L_0x003c:
            java.lang.String r0 = "memu_in_feed"
        L_0x003e:
            X.0qQ.A0A(r0)     // Catch:{ IllegalArgumentException -> 0x004a }
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x004a }
            X.HOj r9 = X.C54678HOj.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x004a }
            goto L_0x0054
        L_0x004a:
            r2 = move-exception
            java.lang.String r1 = "BKBloksActionMifuOpenMemuOnboardingImpl"
            java.lang.String r0 = "Invalid entry point passed. Defaulting to MEMU_IN_FEED."
            X.0KC.A0F(r1, r0, r2)
            X.HOj r9 = X.C54678HOj.MEMU_IN_FEED
        L_0x0054:
            if (r6 == 0) goto L_0x0087
            java.lang.String r2 = r6.A0H()
        L_0x005a:
            X.HrX r1 = new X.HrX
            r1.<init>(r7, r8)
            java.lang.String r12 = X.C51972G9s.A0n()
            if (r2 == 0) goto L_0x0084
            java.lang.String r0 = "ig_mifu_ifysession_id"
            java.util.Map r16 = X.AnonymousClass7TF.A0w(r0, r2)
        L_0x006b:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.HtW r8 = new X.HtW
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r3
            r19 = r3
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.Id0 r0 = new X.Id0
            r0.<init>(r3, r4, r5)
            r1.A01(r8, r0)
            return r10
        L_0x0084:
            r16 = r10
            goto L_0x006b
        L_0x0087:
            r2 = r10
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54859HVq.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
