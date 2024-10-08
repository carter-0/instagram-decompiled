package X;

/* renamed from: X.R8n  reason: case insensitive filesystem */
public final class C8762R8n extends 1P0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C8762R8n(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r5) {
        if (this.A00 != 0) {
            C8762R8n.super.onFail(r5);
            return;
        }
        int A0D = AnonymousClass7TG.A0D(r5, -1717759804);
        C8762R8n.super.onFail(r5);
        C12744T5e t5e = (C12744T5e) this.A03;
        synchronized (t5e) {
            try {
                if (!t5e.A00) {
                    t5e.A00 = true;
                    ((C11002S4w) this.A02).A00();
                }
            } finally {
                AnonymousClass0fD.A0A(-714977307, A0D);
            }
        }
    }

    public final void onStart() {
        if (1 - this.A00 != 0) {
            C8762R8n.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(-1512526093);
        C8762R8n.super.onStart();
        AnonymousClass0fD.A0A(-492261780, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        if (r0.length() == 0) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            r26 = this;
            r5 = r26
            r8 = r27
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x008b;
                case 1: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C8762R8n.super.onSuccess(r8)
            return
        L_0x000d:
            r0 = 2044484878(0x79dc5d0e, float:1.4302409E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.CFa r8 = (X.C43834CFa) r8
            r0 = -859754078(0xffffffffccc131a2, float:-1.01289232E8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r12 = 0
            X.0qQ.A0B(r8, r12)
            X.C8762R8n.super.onSuccess(r8)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0087
            java.lang.Object r7 = r5.A03
            X.37D r7 = (X.AnonymousClass37D) r7
            X.1as r0 = X.1as.A04
            X.1ap r6 = r0.A02
            java.lang.Object r2 = r5.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2FW r1 = X.2FW.A1O
            java.lang.String r0 = ""
            X.F3w r6 = r6.A08(r2, r1, r0)
            java.lang.String r0 = r5.A04
            r6.A06(r0)
            X.28D r2 = X.28D.A0b
            android.os.Bundle r1 = r6.A07
            java.lang.String r0 = "DirectShareSheetConstants.story_reshare_entry_point"
            r1.putSerializable(r0, r2)
            r9 = 0
            int r11 = r5.A01
            com.instagram.direct.intf.DirectShareSheetAppearance r8 = new com.instagram.direct.intf.DirectShareSheetAppearance
            r10 = r9
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 42
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putParcelable(r0, r8)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r6.A00()
            r7.A0J(r0)
            r0 = 178160462(0xa9e834e, float:1.5264238E-32)
        L_0x007d:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -52316353(0xfffffffffce1b73f, float:-9.375868E36)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0087:
            r0 = -1896945975(0xffffffff8eeee6c9, float:-5.8893768E-30)
            goto L_0x007d
        L_0x008b:
            r0 = 88789435(0x54ad1bb, float:9.536516E-36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.R8w r8 = (X.C8771R8w) r8
            r0 = -1344038287(0xffffffffafe39a71, float:-4.1400797E-10)
            int r2 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C8762R8n.super.onSuccess(r8)
            java.lang.Object r3 = r5.A03
            X.T5e r3 = (X.C12744T5e) r3
            java.lang.String r7 = r5.A04
            int r6 = r5.A01
            java.lang.Object r5 = r5.A02
            X.S4w r5 = (X.C11002S4w) r5
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00b4
            monitor-exit(r3)
            r0 = 1063241846(0x3f5fc876, float:0.87415254)
            goto L_0x00ec
        L_0x00b4:
            boolean r0 = r8.A02     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00f6
            int r0 = r0.length()     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00c8
        L_0x00c2:
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x0106 }
            r5.A00()     // Catch:{ all -> 0x0106 }
        L_0x00c8:
            java.util.Map r1 = r3.A02     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00fc
            r1.put(r7, r0)     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x00d8
            r1.put(r7, r0)     // Catch:{ all -> 0x0106 }
        L_0x00d8:
            int r0 = r1.size()     // Catch:{ all -> 0x0106 }
            if (r0 < r6) goto L_0x00e8
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x0106 }
            java.util.Map r0 = X.0Yt.A0B(r1)     // Catch:{ all -> 0x0106 }
            r5.A01(r0)     // Catch:{ all -> 0x0106 }
        L_0x00e8:
            monitor-exit(r3)
            r0 = -1808113508(0xffffffff943a609c, float:-9.409653E-27)
        L_0x00ec:
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -746800322(0xffffffffd37cbb3e, float:-1.08547316E12)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x00f6:
            java.lang.String r0 = "entId1"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "entId1"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x0106 }
        L_0x0101:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r1 = move-exception
            monitor-exit(r3)
            r0 = -1842938027(0xffffffff9226ff55, float:-5.2695085E-28)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8762R8n.onSuccess(java.lang.Object):void");
    }
}
