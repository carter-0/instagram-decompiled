package X;

/* renamed from: X.4sD  reason: invalid class name and case insensitive filesystem */
public final class C275934sD extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275934sD(2Lk r7, int i) {
        super("reels_swipe_startup_job", 291498984, i, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r0 != null) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r7 = this;
            X.2Lk r1 = r7.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            com.instagram.common.session.UserSession r0 = r1.A04
            X.A9A r4 = X.C55069Hbe.A00(r0)
            X.02m r0 = r4.A01
            if (r0 != 0) goto L_0x0012
            X.02m r0 = X.02m.A0p
            r4.A01 = r0
        L_0x0012:
            r3 = 424087700(0x19471094, float:1.0291407E-23)
            if (r0 == 0) goto L_0x001a
            r0.markerStart(r3)
        L_0x001a:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x002f
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            java.lang.String r1 = r0.CCP()
            java.lang.String r0 = "use_case_name"
            r2.markerAnnotate(r3, r0, r1)
        L_0x002f:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x0044
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            java.lang.String r1 = r0.CCS()
            java.lang.String r0 = "use_case_version"
            r2.markerAnnotate(r3, r0, r1)
        L_0x0044:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "load_path"
            java.lang.String r0 = "load_signals"
            r2.markerAnnotate(r3, r1, r0)
        L_0x004f:
            X.0eM r0 = r4.A06     // Catch:{ Exception -> 0x006d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x006d }
            X.Th5 r0 = (X.C13790Th5) r0     // Catch:{ Exception -> 0x006d }
            int r2 = r0.CgU()     // Catch:{ Exception -> 0x006d }
            X.02m r1 = r4.A01     // Catch:{ Exception -> 0x006d }
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "signal_count"
            r1.markerAnnotate(r3, r0, r2)     // Catch:{ Exception -> 0x006d }
        L_0x0064:
            X.02m r1 = r4.A01     // Catch:{ Exception -> 0x006d }
            if (r1 == 0) goto L_0x008b
            r0 = 2
            r1.markerEnd(r3, r0)     // Catch:{ Exception -> 0x006d }
            goto L_0x008b
        L_0x006d:
            r0 = move-exception
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x0083
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x007e
            r0 = 62
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x007e:
            java.lang.String r0 = "failure_reason"
            r2.markerAnnotate(r3, r0, r1)
        L_0x0083:
            X.02m r1 = r4.A01
            if (r1 == 0) goto L_0x008b
            r0 = 3
            r1.markerEnd(r3, r0)
        L_0x008b:
            X.02m r0 = r4.A01
            if (r0 != 0) goto L_0x0095
            X.02m r0 = X.02m.A0p
            r4.A01 = r0
            if (r0 == 0) goto L_0x0098
        L_0x0095:
            r0.markerStart(r3)
        L_0x0098:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x00ad
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            java.lang.String r1 = r0.CCP()
            java.lang.String r0 = "use_case_name"
            r2.markerAnnotate(r3, r0, r1)
        L_0x00ad:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x00c2
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.94Q r0 = (X.AnonymousClass94Q) r0
            java.lang.String r1 = r0.CCS()
            java.lang.String r0 = "use_case_version"
            r2.markerAnnotate(r3, r0, r1)
        L_0x00c2:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x00cd
            java.lang.String r1 = "load_path"
            java.lang.String r0 = "load_constraint_identifier"
            r2.markerAnnotate(r3, r1, r0)
        L_0x00cd:
            com.instagram.common.session.UserSession r2 = r4.A03     // Catch:{ Exception -> 0x00f8 }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ Exception -> 0x00f8 }
            r0 = 41
            X.AwU r1 = new X.AwU     // Catch:{ Exception -> 0x00f8 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Class<X.A5c> r0 = X.C39686A5c.class
            java.lang.Object r0 = r2.A01(r0, r1)     // Catch:{ Exception -> 0x00f8 }
            X.A5c r0 = (X.C39686A5c) r0     // Catch:{ Exception -> 0x00f8 }
            X.45u r0 = r0.A00     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "reels_swipe_policy_id"
            r5 = 1
            android.content.SharedPreferences r2 = r0.A00     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r1 = "p_reels_swipe"
            r0 = 95
            java.lang.String r0 = X.002.A0T(r1, r6, r0)     // Catch:{ Exception -> 0x00f8 }
            int r0 = r2.getInt(r0, r5)     // Catch:{ Exception -> 0x00f8 }
            r4.A00 = r0     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0116
        L_0x00f8:
            r0 = move-exception
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x010e
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x0109
            r0 = 62
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x0109:
            java.lang.String r0 = "failure_reason"
            r2.markerAnnotate(r3, r0, r1)
        L_0x010e:
            X.02m r1 = r4.A01
            if (r1 == 0) goto L_0x0116
            r0 = 3
            r1.markerEnd(r3, r0)
        L_0x0116:
            X.02m r2 = r4.A01
            if (r2 == 0) goto L_0x0121
            int r1 = r4.A00
            java.lang.String r0 = "polcy_id"
            r2.markerAnnotate(r3, r0, r1)
        L_0x0121:
            X.02m r1 = r4.A01
            if (r1 == 0) goto L_0x0129
            r0 = 2
            r1.markerEnd(r3, r0)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C275934sD.loggedRun():void");
    }
}
