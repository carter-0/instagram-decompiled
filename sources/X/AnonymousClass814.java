package X;

/* renamed from: X.814  reason: invalid class name */
public final class AnonymousClass814 {
    public final AnonymousClass80R A00;

    private void A00() {
        AnonymousClass80R r2 = this.A00;
        C338837ic r0 = r2.A0v.A0m;
        if (r0 != null) {
            r0.A00.A08((String) null);
        }
        AnonymousClass8XA A002 = r2.A1N.A00();
        C361948h5 r02 = (C361948h5) A002.A0k.getValue();
        if (r02 != null) {
            r02.A00("init_show_gallery");
        }
        A002.A0O(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        if (((X.AnonymousClass8VN) r1).A01 != X.C358988bn.A00) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r14 = this;
            java.lang.String r1 = "CameraSetupDelegateImpl"
            java.lang.String r0 = "#setupCamera"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0lq.A02(r0)
            X.80R r2 = r14.A00     // Catch:{ all -> 0x0148 }
            X.8WK r8 = r2.A16     // Catch:{ all -> 0x0148 }
            X.28D r7 = r2.A01     // Catch:{ all -> 0x0148 }
            X.8WJ r8 = (X.AnonymousClass8WJ) r8     // Catch:{ all -> 0x0148 }
            r0 = 0
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x0148 }
            boolean r0 = r8.A0G     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x004c
            X.9PU r6 = new X.9PU     // Catch:{ all -> 0x0148 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0148 }
            android.graphics.RectF r5 = r8.A09     // Catch:{ all -> 0x0148 }
            if (r5 == 0) goto L_0x00a8
            X.4DH r1 = r8.A0C     // Catch:{ all -> 0x0148 }
            android.view.View r0 = r1.mView     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r8.A01     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x00a8
            r0 = 1
            r8.A01 = r0     // Catch:{ all -> 0x0148 }
            android.view.View r4 = r1.requireView()     // Catch:{ all -> 0x0148 }
            r0 = 4
            r4.setVisibility(r0)     // Catch:{ all -> 0x0148 }
            X.9Pi r3 = new X.9Pi     // Catch:{ all -> 0x0148 }
            r3.<init>(r5, r4, r8, r6)     // Catch:{ all -> 0x0148 }
            long r0 = r8.A07     // Catch:{ all -> 0x0148 }
            r4.postDelayed(r3, r0)     // Catch:{ all -> 0x0148 }
            X.8Vl r0 = r8.A0E     // Catch:{ all -> 0x0148 }
            X.8Vm r0 = r0.A00()     // Catch:{ all -> 0x0148 }
            r0.A09(r7)     // Catch:{ all -> 0x0148 }
        L_0x004c:
            X.80U r3 = r2.A1f     // Catch:{ all -> 0x0148 }
            r5 = r3
            X.80T r5 = (X.AnonymousClass80T) r5     // Catch:{ all -> 0x0148 }
            X.80W r1 = r5.A01     // Catch:{ all -> 0x0148 }
            X.8SB r0 = new X.8SB     // Catch:{ all -> 0x0148 }
            r0.<init>()     // Catch:{ all -> 0x0148 }
            r1.A04(r0)     // Catch:{ all -> 0x0148 }
            boolean r0 = r3.CZe()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0117
            X.8Vl r0 = r2.A18     // Catch:{ all -> 0x0148 }
            X.8Vm r0 = r0.A00()     // Catch:{ all -> 0x0148 }
            r0.A04()     // Catch:{ all -> 0x0148 }
            X.8Fl r3 = r2.A0l     // Catch:{ all -> 0x0148 }
            androidx.fragment.app.Fragment r0 = r3.A0V     // Catch:{ all -> 0x0148 }
            android.os.Bundle r1 = r0.requireArguments()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "ARGS_CAMERA_TOOL_ID"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0087
            X.8aL r1 = X.C352618Eb.A03(r0)     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x0087
            X.8aL r0 = X.C358088aL.A0s     // Catch:{ all -> 0x0148 }
            if (r1 != r0) goto L_0x0087
            r14.A00()     // Catch:{ all -> 0x0148 }
        L_0x0087:
            X.8Hx r6 = r2.A1j     // Catch:{ all -> 0x0148 }
            if (r6 == 0) goto L_0x00be
            X.87s r1 = r2.A1o     // Catch:{ all -> 0x0148 }
            X.2Fk r0 = r1.A0H     // Catch:{ all -> 0x0148 }
            java.lang.Object r0 = r0.A02()     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x00be
            X.4gw r0 = r1.A04     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00be
            X.80D r0 = r2.A0v     // Catch:{ all -> 0x0148 }
            X.9Qn r0 = r0.A13     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.A0G     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00ac
            r1.A0E()     // Catch:{ all -> 0x0148 }
            goto L_0x0144
        L_0x00a8:
            r6.onFinish()     // Catch:{ all -> 0x0148 }
            goto L_0x004c
        L_0x00ac:
            boolean r0 = r1.A0K()     // Catch:{ all -> 0x0148 }
            X.05G r1 = r1.A0Q     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00bb
            X.8YK r0 = X.AnonymousClass8YK.LANDING_PAGE     // Catch:{ all -> 0x0148 }
        L_0x00b6:
            r1.Epw(r0)     // Catch:{ all -> 0x0148 }
            goto L_0x0144
        L_0x00bb:
            X.8YK r0 = X.AnonymousClass8YK.EMPTY_TIMELINE     // Catch:{ all -> 0x0148 }
            goto L_0x00b6
        L_0x00be:
            X.4DH r8 = r2.A0J     // Catch:{ all -> 0x0148 }
            X.28D r7 = r2.A01     // Catch:{ all -> 0x0148 }
            X.8Yz r0 = r2.A0W     // Catch:{ all -> 0x0148 }
            X.80m r4 = r0.A08     // Catch:{ all -> 0x0148 }
            java.lang.Object r10 = r4.A00     // Catch:{ all -> 0x0148 }
            X.4yO r10 = (X.C279284yO) r10     // Catch:{ all -> 0x0148 }
            com.instagram.common.session.UserSession r9 = r2.A0R     // Catch:{ all -> 0x0148 }
            boolean r11 = r6.CKX()     // Catch:{ all -> 0x0148 }
            boolean r12 = r6.CYQ()     // Catch:{ all -> 0x0148 }
            X.80D r1 = r2.A0v     // Catch:{ all -> 0x0148 }
            boolean r13 = r1.A3R     // Catch:{ all -> 0x0148 }
            boolean r0 = X.AnonymousClass8X8.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00fc
            X.9Qn r0 = r1.A13     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.A0G     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x00f8
            X.80W r0 = r5.A02     // Catch:{ all -> 0x0148 }
            android.util.Pair r0 = r0.A00     // Catch:{ all -> 0x0148 }
            java.lang.Object r1 = r0.second     // Catch:{ all -> 0x0148 }
            boolean r0 = r1 instanceof X.AnonymousClass8VN     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0144
            X.8VN r1 = (X.AnonymousClass8VN) r1     // Catch:{ all -> 0x0148 }
            X.8bo r1 = r1.A01     // Catch:{ all -> 0x0148 }
            X.8bn r0 = X.C358988bn.A00     // Catch:{ all -> 0x0148 }
            if (r1 == r0) goto L_0x0144
        L_0x00f8:
            r14.A00()     // Catch:{ all -> 0x0148 }
            goto L_0x0144
        L_0x00fc:
            boolean r0 = r2.A07     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0148 }
            X.4yO r0 = (X.C279284yO) r0     // Catch:{ all -> 0x0148 }
            boolean r0 = r0 instanceof X.C363138jC     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0113
            com.instagram.common.session.UserSession r0 = r1.A0S     // Catch:{ all -> 0x0148 }
            X.JaN r1 = X.JW1.A00(r0)     // Catch:{ all -> 0x0148 }
            X.28D r0 = r2.A01     // Catch:{ all -> 0x0148 }
            r1.A02(r0)     // Catch:{ all -> 0x0148 }
        L_0x0113:
            r3.onResume()     // Catch:{ all -> 0x0148 }
            goto L_0x0144
        L_0x0117:
            boolean r0 = r3.CZU()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0144
            X.82p r0 = r2.A0o     // Catch:{ all -> 0x0148 }
            X.82o r0 = r0.A02     // Catch:{ all -> 0x0148 }
            X.8nd r1 = r0.A01()     // Catch:{ all -> 0x0148 }
            X.8nd r0 = X.C365758nd.A04     // Catch:{ all -> 0x0148 }
            if (r1 != r0) goto L_0x012f
            X.8K4 r0 = r2.A0c     // Catch:{ all -> 0x0148 }
            r0.onResume()     // Catch:{ all -> 0x0148 }
            goto L_0x0144
        L_0x012f:
            X.80V r0 = X.AnonymousClass80V.RECIPIENT_PICKER     // Catch:{ all -> 0x0148 }
            boolean r0 = r3.CQ0(r0)     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0144
            X.80V r0 = X.AnonymousClass80V.CLIPS_SHARESHEET     // Catch:{ all -> 0x0148 }
            boolean r0 = r3.CQ0(r0)     // Catch:{ all -> 0x0148 }
            if (r0 != 0) goto L_0x0144
            X.8LU r0 = r2.A0g     // Catch:{ all -> 0x0148 }
            r0.onResume()     // Catch:{ all -> 0x0148 }
        L_0x0144:
            X.0lq.A01()
            return
        L_0x0148:
            r0 = move-exception
            X.0lq.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass814.A01():void");
    }

    public AnonymousClass814(AnonymousClass80R r1) {
        this.A00 = r1;
    }
}
