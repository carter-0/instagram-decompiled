package X;

/* renamed from: X.7UM  reason: invalid class name */
public final class AnonymousClass7UM implements AnonymousClass7UN {
    public int A00;
    public final /* synthetic */ AnonymousClass7UL A01;

    public final void DMK(String str) {
        0qQ.A0B(str, 0);
        18g.A05(AnonymousClass9H3.A00(this.A01.A08), "thread_item_render_failed", str);
    }

    public AnonymousClass7UM(AnonymousClass7UL r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DMX(int r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            r6 = 1
            int r0 = r0 + 1
            r8.A00 = r0
            X.7UL r5 = r8.A01
            X.9H3 r4 = r5.A08
            boolean r1 = r5.A03
            java.lang.String r0 = "seen_message_id_in_model"
            r4.A02(r0, r1)
            java.lang.String r2 = r5.A0A
            java.lang.String r1 = "entry_point"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.AnonymousClass9H3.A00(r4)
            X.18g.A05(r0, r1, r2)
            java.lang.String r3 = r5.A0B
            r2 = r3
            if (r3 != 0) goto L_0x0024
            java.lang.String r2 = "empty"
        L_0x0024:
            java.lang.String r1 = "message_id_perf_tracking"
            X.0qQ.A0B(r2, r6)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.AnonymousClass9H3.A00(r4)
            X.18g.A05(r0, r1, r2)
            com.instagram.common.session.UserSession r7 = r5.A05
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324677316260063(0x810d1a000430df, double:3.0352104303135956E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Runnable r0 = r5.A09
        L_0x0041:
            r0.run()
        L_0x0044:
            if (r3 == 0) goto L_0x0068
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0068
            X.0eM r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            r6 = 0
            return r6
        L_0x005d:
            java.lang.ref.WeakReference r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0044
            goto L_0x0041
        L_0x0068:
            X.0eM r0 = r5.A0E
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0093
            int r0 = r8.A00
            X.AnonymousClass7UL.A01(r5, r9, r0)
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a1
            X.AnonymousClass7UL.A00(r5)
            return r6
        L_0x0093:
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            X.0qQ.A0A(r3)
            r0 = 0
            X.9M8 r1 = new X.9M8
            r1.<init>(r9, r0, r8, r5)
            goto L_0x00af
        L_0x00a1:
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            X.0qQ.A0A(r3)
            r0 = 46
            X.9Ko r1 = new X.9Ko
            r1.<init>(r5, r0)
        L_0x00af:
            X.7GI r2 = new X.7GI
            r2.<init>(r3, r5, r1)
            r0 = 36324677316325600(0x810d1a000530e0, double:3.0352104303550415E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x00c1
            r5.A00 = r2
        L_0x00c1:
            r3.postFrameCallback(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7UM.DMX(int):boolean");
    }
}
