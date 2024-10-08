package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6UK  reason: invalid class name */
public final class AnonymousClass6UK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2365134a A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ AnonymousClass3BQ A03;

    public AnonymousClass6UK(C2365134a r1, Reel reel, AnonymousClass3BQ r3, int i) {
        this.A01 = r1;
        this.A02 = reel;
        this.A00 = i;
        this.A03 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af A[Catch:{ all -> 0x015f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r0 = r23
            X.34a r3 = r0.A01
            com.instagram.model.reels.Reel r5 = r0.A02
            int r2 = r0.A00
            X.3BQ r4 = r0.A03
            r14 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x001a
            r1 = -2118997357(0xffffffff81b2aa93, float:-6.5631635E-38)
            java.lang.String r0 = "MainFeedReelTrayController.preloadAndLaunchViewer"
            X.0fS.A01(r0, r1)
        L_0x001a:
            X.34c r0 = r3.A0P     // Catch:{ all -> 0x015f }
            X.3kE r1 = r0.A00(r5)     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x002d
            androidx.recyclerview.widget.RecyclerView r1 = r0.A03     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x0028
            r1 = 0
            goto L_0x002d
        L_0x0028:
            r0 = 0
            X.3kE r1 = r1.A0X(r2, r0)     // Catch:{ all -> 0x015f }
        L_0x002d:
            X.3N2 r1 = (X.AnonymousClass3N2) r1     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0152
            X.2kn r0 = r3.A0O     // Catch:{ all -> 0x015f }
            r0.A0E()     // Catch:{ all -> 0x015f }
            X.2lL r8 = r3.A0K     // Catch:{ all -> 0x015f }
            X.34i r0 = r8.A02     // Catch:{ all -> 0x015f }
            X.34h r0 = (X.C2365834h) r0     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x015f }
            if (r2 <= r0) goto L_0x0066
            boolean r0 = r8.A0P     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x0066
            X.2wV r0 = r8.A03     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x0066
            android.os.Handler r6 = X.C228322lL.A0d     // Catch:{ all -> 0x015f }
            X.2lN r0 = r8.A0E     // Catch:{ all -> 0x015f }
            r6.removeCallbacks(r0)     // Catch:{ all -> 0x015f }
            X.34i r0 = r8.A02     // Catch:{ all -> 0x015f }
            X.34h r0 = (X.C2365834h) r0     // Catch:{ all -> 0x015f }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x015f }
            int r0 = r0 + 1
            int r12 = r2 - r0
            X.3Ce r9 = X.C238523Ce.A04     // Catch:{ all -> 0x015f }
            java.lang.Integer r10 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x015f }
            r7 = 0
            r11 = r7
            X.C228322lL.A03(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x015f }
        L_0x0066:
            boolean r9 = r3.A0S     // Catch:{ all -> 0x015f }
            if (r9 == 0) goto L_0x00b6
            X.2wV r12 = r8.A03     // Catch:{ all -> 0x015f }
            boolean r0 = r8.A0O     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00bb
            if (r12 == 0) goto L_0x00bb
            X.HKm r7 = X.C54603HKm.A02     // Catch:{ all -> 0x015f }
            com.instagram.common.session.UserSession r6 = r8.A0D     // Catch:{ all -> 0x015f }
            X.1PA r0 = X.AnonymousClass1PA.A00     // Catch:{ all -> 0x015f }
            boolean r0 = r7.A00(r6, r12, r0)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00bb
            X.1Ph r13 = r12.A0O     // Catch:{ all -> 0x015f }
            boolean r0 = r12.A0h     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00d1
            if (r13 == 0) goto L_0x00d1
            X.3kU r11 = r12.A0Y     // Catch:{ all -> 0x015f }
            java.util.LinkedList r0 = r11.A02     // Catch:{ all -> 0x015f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x015f }
            java.lang.String r10 = "hp0_unavailable"
            if (r0 != 0) goto L_0x00c6
            X.3n0 r0 = r11.A00()     // Catch:{ all -> 0x015f }
            java.lang.Object r8 = r0.BTb()     // Catch:{ all -> 0x015f }
            X.2mN r0 = r12.A0R     // Catch:{ all -> 0x015f }
            X.1Pi r7 = r0.BXm(r8)     // Catch:{ all -> 0x015f }
            if (r7 == 0) goto L_0x00bd
            r6 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x015f }
            boolean r0 = r13.A03(r7, r0, r6)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00bd
        L_0x00ab:
            X.3mM r8 = (X.C250973mM) r8     // Catch:{ all -> 0x015f }
            if (r8 == 0) goto L_0x00bb
            r0 = 1
            r8.A09 = r0     // Catch:{ all -> 0x015f }
            com.instagram.model.reels.Reel r0 = r8.A0H     // Catch:{ all -> 0x015f }
        L_0x00b4:
            r3.A01 = r0     // Catch:{ all -> 0x015f }
        L_0x00b6:
            com.instagram.model.reels.Reel r8 = r3.A01     // Catch:{ all -> 0x015f }
            if (r8 == 0) goto L_0x00d6
            goto L_0x00d3
        L_0x00bb:
            r0 = 0
            goto L_0x00b4
        L_0x00bd:
            X.2vG r7 = r12.A0X     // Catch:{ all -> 0x015f }
            java.util.Collection r6 = r11.A03()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "extreme_ux_protection_check_failed"
            goto L_0x00ce
        L_0x00c6:
            X.2vG r7 = r12.A0X     // Catch:{ all -> 0x015f }
            java.util.Collection r6 = r11.A03()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "no_available_ad"
        L_0x00ce:
            r7.Cgx(r6, r10, r0)     // Catch:{ all -> 0x015f }
        L_0x00d1:
            r8 = 0
            goto L_0x00ab
        L_0x00d3:
            if (r9 == 0) goto L_0x00d6
            goto L_0x010c
        L_0x00d6:
            android.view.View r0 = r1.BkN()     // Catch:{ all -> 0x015f }
            android.content.Context r16 = r0.getContext()     // Catch:{ all -> 0x015f }
            com.instagram.common.session.UserSession r8 = r3.A0F     // Catch:{ all -> 0x015f }
            X.1OP r0 = X.1OP.$redex_init_class     // Catch:{ all -> 0x015f }
            X.3PP r20 = X.AnonymousClass3PO.A00(r8)     // Catch:{ all -> 0x015f }
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r1.Bkt()     // Catch:{ all -> 0x015f }
            boolean r6 = r5.A1P     // Catch:{ all -> 0x015f }
            X.6UL r0 = new X.6UL     // Catch:{ all -> 0x015f }
            r0.<init>(r3, r5, r4, r1)     // Catch:{ all -> 0x015f }
            X.6VH r4 = new X.6VH     // Catch:{ all -> 0x015f }
            r4.<init>(r0, r7, r6)     // Catch:{ all -> 0x015f }
            X.0iw r0 = r3.A0E     // Catch:{ all -> 0x015f }
            java.lang.String r21 = r0.getModuleName()     // Catch:{ all -> 0x015f }
            r18 = r5
            r19 = r4
            r22 = r2
            r17 = r8
            X.6VJ r2 = X.1OP.A04(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x015f }
            r2.A04()     // Catch:{ all -> 0x015f }
            goto L_0x0148
        L_0x010c:
            com.instagram.common.session.UserSession r7 = r3.A0F     // Catch:{ all -> 0x015f }
            r0 = 1
            boolean r0 = X.C233832wY.A04(r7, r0)     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x00d6
            android.view.View r0 = r1.BkN()     // Catch:{ all -> 0x015f }
            android.content.Context r16 = r0.getContext()     // Catch:{ all -> 0x015f }
            X.1OP r0 = X.1OP.$redex_init_class     // Catch:{ all -> 0x015f }
            X.3PP r20 = X.AnonymousClass3PO.A00(r7)     // Catch:{ all -> 0x015f }
            com.instagram.ui.widget.gradientspinner.GradientSpinner r6 = r1.Bkt()     // Catch:{ all -> 0x015f }
            boolean r5 = r8.A1P     // Catch:{ all -> 0x015f }
            X.6UL r0 = new X.6UL     // Catch:{ all -> 0x015f }
            r0.<init>(r3, r8, r4, r1)     // Catch:{ all -> 0x015f }
            X.6VH r4 = new X.6VH     // Catch:{ all -> 0x015f }
            r4.<init>(r0, r6, r5)     // Catch:{ all -> 0x015f }
            X.0iw r0 = r3.A0E     // Catch:{ all -> 0x015f }
            java.lang.String r21 = r0.getModuleName()     // Catch:{ all -> 0x015f }
            r18 = r8
            r19 = r4
            r22 = r2
            r17 = r7
            X.6VJ r2 = X.1OP.A04(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x015f }
            r2.A04()     // Catch:{ all -> 0x015f }
        L_0x0148:
            r3.A06 = r2     // Catch:{ all -> 0x015f }
            r1.Ei5(r2)     // Catch:{ all -> 0x015f }
            X.2kt r0 = r3.A0H     // Catch:{ all -> 0x015f }
            r0.EBt(r2)     // Catch:{ all -> 0x015f }
        L_0x0152:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x015e
            r0 = 795787199(0x2f6ebfbf, float:2.1714096E-10)
            X.0fS.A00(r0)
        L_0x015e:
            return
        L_0x015f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x016c
            r0 = 680661235(0x289210f3, float:1.6216607E-14)
            X.0fS.A00(r0)
        L_0x016c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6UK.run():void");
    }
}
