package X;

/* renamed from: X.8GL  reason: invalid class name */
public final class AnonymousClass8GL implements Runnable {
    public final /* synthetic */ AnonymousClass8GJ A00;

    public AnonymousClass8GL(AnonymousClass8GJ r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.8kL, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r2 = r4.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.8GJ r4 = r10.A00
            X.8GA r6 = r4.A0C
            java.lang.Integer r0 = r6.A05()
            r4.A03 = r0
            X.8Yz r0 = r4.A09
            X.80m r7 = r0.A08
            java.lang.Object r1 = r7.A00
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0050
            com.instagram.common.session.UserSession r3 = r4.A07
            java.lang.Integer r8 = r4.A03
            X.27r r0 = X.27p.A01(r3)
            X.283 r0 = r0.A04
            java.lang.String r2 = r0.A0L
            java.lang.Object r1 = r7.A00
            X.4yO r1 = (X.C279284yO) r1
            X.27r r0 = X.27p.A01(r3)
            java.lang.String r0 = r0.A0R()
            r5 = 17629195(0x10d000b, float:2.589764E-38)
            X.C360908fL.A02(r3, r1, r2, r0, r5)
            X.02m r3 = X.02m.A0p
            java.lang.String r2 = "0"
            if (r8 == 0) goto L_0x01be
            r0 = 1
            int r1 = r8.intValue()
            if (r1 == r0) goto L_0x01ba
            r0 = 3
            if (r1 == r0) goto L_0x01ba
            r0 = 2
            if (r1 != r0) goto L_0x004b
            java.lang.String r2 = "2"
        L_0x004b:
            java.lang.String r0 = "flash_mode"
            r3.markerAnnotate(r5, r0, r2)
        L_0x0050:
            X.82X r3 = r4.A06
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A01()
            if (r0 != 0) goto L_0x015f
            X.8Fl r2 = r4.A0B
            X.7l2 r0 = r2.A06
            if (r0 == 0) goto L_0x006a
            X.8kX r0 = X.C340297l2.A01(r0)
            if (r0 == 0) goto L_0x006a
            X.9sA r1 = r0.A01
            X.9sA r0 = X.C390989sA.A03
            if (r1 != r0) goto L_0x015f
        L_0x006a:
            X.7l2 r5 = r2.A06
            if (r5 == 0) goto L_0x0149
            X.8Fr r0 = r4.A02
            r8 = 1
            if (r0 == 0) goto L_0x00ec
            X.7l2 r1 = r0.A04
            int r0 = r1.A09()
            if (r0 == r8) goto L_0x0082
            int r1 = r1.A09()
            r0 = 2
            if (r1 != r0) goto L_0x00ec
        L_0x0082:
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317762419299838(0x8106d0000a15fe, double:3.030837421631894E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            com.instagram.ui.widget.shutterbutton.ShutterButton r9 = r4.A0F
            android.os.Handler r0 = r9.A0B
            if (r0 != 0) goto L_0x00a0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r9.A0B = r0
        L_0x00a0:
            r9.A0I = r2
            X.5zn r0 = X.C301685zn.PHOTO_CAPTURE_IN_PROGRESS
            r9.setMode(r0)
            X.5zl r0 = r9.A0i
            X.8Ga r0 = r0.A05
            if (r0 == 0) goto L_0x00b9
            X.8GZ r0 = (X.AnonymousClass8GZ) r0
            X.8Fl r0 = r0.A00
            android.widget.TextView r1 = r0.A02
            if (r1 == 0) goto L_0x00b9
            r0 = 0
            r1.setVisibility(r0)
        L_0x00b9:
            X.2cs r2 = r9.A0g
            X.5zt r0 = r9.A0F
            float r0 = r0.CEI()
            double r0 = (double) r0
            r2.A06(r0)
            boolean r0 = r9.A0I
            r2 = 16
            if (r0 == 0) goto L_0x014c
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r9.A01 = r0
            android.os.Handler r1 = r9.A0B
            if (r1 == 0) goto L_0x00d9
            java.lang.Runnable r0 = r9.A0l
            r1.removeCallbacks(r0)
        L_0x00d9:
            android.os.Handler r1 = r9.A0B
            if (r1 == 0) goto L_0x00e2
            java.lang.Runnable r0 = r9.A0l
        L_0x00df:
            r1.postDelayed(r0, r2)
        L_0x00e2:
            X.80U r1 = r4.A0D
            X.8SH r0 = new X.8SH
            r0.<init>()
            r1.E3H(r0)
        L_0x00ec:
            java.lang.Integer r0 = r6.A05()
            r2 = 1
            if (r0 == 0) goto L_0x00fc
            int r1 = r0.intValue()
            if (r1 == r8) goto L_0x0106
            r0 = 3
            if (r1 == r0) goto L_0x0106
        L_0x00fc:
            boolean r0 = X.AnonymousClass8GA.A02(r6)
            if (r0 == 0) goto L_0x014a
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x014a
        L_0x0106:
            r4.A04 = r2
            r0 = 18
            int r6 = X.C344017rB.A02(r0)
            com.instagram.common.session.UserSession r3 = r4.A07
            X.27r r0 = X.27p.A01(r3)
            X.283 r0 = r0.A04
            java.lang.String r1 = r0.A0L
            java.lang.Object r0 = r7.A00
            X.4yO r0 = (X.C279284yO) r0
            r2 = 0
            X.C360908fL.A02(r3, r0, r1, r2, r6)
            X.8ke r0 = new X.8ke
            r0.<init>(r4)
            r5.A06 = r0
            X.8l4 r1 = new X.8l4
            r1.<init>(r4)
            X.8l5 r0 = new X.8l5
            r0.<init>(r4)
            r5.A0M(r1, r0)
            r4.A00 = r2
            X.7l1 r0 = r5.A0H
            android.view.SurfaceView r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x013e
            r0 = 1
        L_0x013e:
            r1 = 4
            if (r0 == 0) goto L_0x01c2
            X.8l7 r0 = new X.8l7
            r0.<init>(r4)
            r5.A0L(r0, r1, r1)
        L_0x0149:
            return
        L_0x014a:
            r2 = 0
            goto L_0x0106
        L_0x014c:
            r0 = 0
            r9.A00 = r0
            android.os.Handler r1 = r9.A0B
            if (r1 == 0) goto L_0x0158
            java.lang.Runnable r0 = r9.A0k
            r1.removeCallbacks(r0)
        L_0x0158:
            android.os.Handler r1 = r9.A0B
            if (r1 == 0) goto L_0x00e2
            java.lang.Runnable r0 = r9.A0k
            goto L_0x00df
        L_0x015f:
            android.app.Activity r0 = r4.A05
            android.content.Context r2 = r0.getApplicationContext()
            X.0qQ.A07(r2)
            X.0nO r1 = X.0nY.A00()
            X.0qQ.A07(r1)
            X.8kK r0 = new X.8kK
            r0.<init>(r2, r4)
            r1.ATE(r0)
            com.instagram.camera.effect.mq.IgCameraEffectsController r1 = r3.A05
            X.8gv r0 = r1.A07
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01c9
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A09
            if (r0 == 0) goto L_0x01c9
            java.util.Map r1 = r0.A0Z
            java.lang.String r0 = "previewCaptureOutput"
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = "cameraInfoScriptingModule"
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x01ab
            java.lang.String r0 = "internalScriptingAPI"
            java.lang.Object r0 = r1.get(r0)
            X.51F r0 = (X.AnonymousClass51F) r0
            if (r0 == 0) goto L_0x01c9
            X.55h r0 = r0.A00
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x01c9
        L_0x01ab:
            X.AUl r1 = new X.AUl
            r1.<init>(r4)
            X.81b r0 = r3.A04
            X.7lC r0 = r0.A04
            if (r0 == 0) goto L_0x0149
            r0.Eza(r1)
            return
        L_0x01ba:
            java.lang.String r2 = "1"
            goto L_0x004b
        L_0x01be:
            java.lang.String r2 = "null"
            goto L_0x004b
        L_0x01c2:
            android.graphics.Bitmap r0 = r5.A0A(r1, r1)
            r4.A00 = r0
            return
        L_0x01c9:
            X.8kL r6 = new X.8kL
            r6.<init>(r4)
            X.8GJ r1 = r6.A01
            r2 = 0
            X.8Fl r0 = r1.A0B     // Catch:{ 8Fp -> 0x01df }
            X.7l2 r0 = r0.A06     // Catch:{ 8Fp -> 0x01df }
            if (r0 == 0) goto L_0x01df
            int r0 = r0.A07()     // Catch:{ 8Fp -> 0x01df }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ 8Fp -> 0x01df }
        L_0x01df:
            r6.A00 = r2
            X.8Fl r0 = r1.A0B
            X.7l2 r7 = r0.A06
            if (r7 == 0) goto L_0x0242
            X.7l1 r0 = r7.A0H
            android.view.SurfaceView r0 = r0.A00
            if (r0 == 0) goto L_0x0242
            r0 = 17
            int r4 = X.C344017rB.A02(r0)
            com.instagram.common.session.UserSession r3 = r1.A07
            X.27r r0 = X.27p.A01(r3)
            X.283 r0 = r0.A04
            java.lang.String r2 = r0.A0L
            X.8Yz r0 = r1.A09
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
            r0 = 0
            X.C360908fL.A02(r3, r1, r2, r0, r4)
            X.8lJ r5 = new X.8lJ
            r5.<init>(r6)
            X.7rU r1 = r7.A0G
            X.7tE r0 = X.C345397tQ.A00
            X.7tD r4 = r1.A01(r0)
            X.7tQ r4 = (X.C345397tQ) r4
            X.7tP r4 = (X.C345387tP) r4
            X.7rD r3 = r4.A00
            java.lang.String r2 = "BasicPhotoCaptureCoordinator"
            int r1 = r4.hashCode()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C363798kM.A00(r3, r0, r2, r1)
            X.7lR r0 = r4.A04
            X.8lK r2 = new X.8lK
            r2.<init>(r4, r5)
            r1 = 0
            if (r0 != 0) goto L_0x023c
            java.lang.String r1 = "CameraViewController is null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r2.A01(r0)
            return
        L_0x023c:
            X.7lJ r0 = r0.A0O
            r0.Bet(r2, r1, r1)
            return
        L_0x0242:
            X.4D6 r0 = r1.A08
            r0.schedule(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GL.run():void");
    }
}
