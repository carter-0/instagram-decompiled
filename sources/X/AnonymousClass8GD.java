package X;

/* renamed from: X.8GD  reason: invalid class name */
public abstract class AnonymousClass8GD {
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
        if (X.0JN.A01().A09() == false) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.Exception r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C364458lS
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C340567lT
            if (r0 == 0) goto L_0x0024
            r0 = r6
            X.7lT r0 = (X.C340567lT) r0
            X.7lR r4 = r0.A00
        L_0x000d:
            X.81j r0 = r4.A0M
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0016:
            if (r1 >= r2) goto L_0x068d
            java.lang.Object r0 = r3.get(r1)
            X.7lN r0 = (X.C340507lN) r0
            r0.D5l(r4, r7)
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0024:
            boolean r0 = r6 instanceof X.C346547vM
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "CameraViewController"
        L_0x002a:
            java.lang.String r0 = "Failed to set metering"
            android.util.Log.e(r1, r0)
            return
        L_0x0030:
            boolean r0 = r6 instanceof X.C341997ns
            if (r0 == 0) goto L_0x003d
            r0 = r6
            X.7ns r0 = (X.C341997ns) r0
            X.8GD r0 = r0.A00
        L_0x0039:
            r0.A01(r7)
            return
        L_0x003d:
            boolean r0 = r6 instanceof X.C364398lM
            if (r0 == 0) goto L_0x004b
            r0 = r6
            X.8lM r0 = (X.C364398lM) r0
            X.Jc1 r1 = r0.A00
            r0 = 0
            X.C59937Jc1.A00(r0, r1)
            return
        L_0x004b:
            boolean r0 = r6 instanceof X.C364408lN
            if (r0 == 0) goto L_0x0059
            r0 = r6
            X.8lN r0 = (X.C364408lN) r0
            X.JYD r1 = r0.A00
            r0 = 0
            X.JYD.A03(r0, r1, r0)
            return
        L_0x0059:
            boolean r0 = r6 instanceof X.C364418lO
            if (r0 == 0) goto L_0x0068
            r0 = r6
            X.8lO r0 = (X.C364418lO) r0
            X.81i r0 = r0.A00
        L_0x0062:
            X.81l r0 = r0.A0I
        L_0x0064:
            r0.DDD(r7)
            return
        L_0x0068:
            boolean r0 = r6 instanceof X.C364428lP
            if (r0 == 0) goto L_0x0072
            r0 = r6
            X.8lP r0 = (X.C364428lP) r0
            X.81i r0 = r0.A00
            goto L_0x0062
        L_0x0072:
            boolean r0 = r6 instanceof X.C353158Gm
            if (r0 == 0) goto L_0x00f2
            r0 = r6
            X.8Gm r0 = (X.C353158Gm) r0
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.8Gl r0 = r0.A02
            X.8Gi r3 = r0.A00
            X.8GA r0 = r3.A0K
            r0.A07()
            X.8W6 r0 = r3.A04
            r0.A03()
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r3.A0V
            r0 = 1
            r1.setButtonActionsEnabled(r0)
            android.app.Activity r2 = r3.A0A
            r1 = r7
            boolean r0 = r7 instanceof X.C391719tX
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r7 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x00ee
            java.lang.Throwable r0 = r7.getCause()
            boolean r0 = r0 instanceof X.C391719tX
            if (r0 == 0) goto L_0x00ee
            java.lang.Throwable r1 = r7.getCause()
        L_0x00a8:
            X.9tX r1 = (X.C391719tX) r1
            int r1 = r1.A01
            r0 = 21001(0x5209, float:2.9429E-41)
            if (r1 != r0) goto L_0x00d9
            r1 = 2131976506(0x7f13613a, float:1.9590134E38)
        L_0x00b3:
            java.lang.String r0 = "failed_to_stop_video_recording"
            X.C59689JTv.A01(r2, r0, r1, r4)
            com.instagram.common.session.UserSession r1 = r3.A0H
            java.lang.String r2 = "Failed to stop video recording"
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r2, r0)
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)
            java.lang.String r0 = r7.getMessage()
            if (r0 == 0) goto L_0x00d1
            java.lang.String r2 = r7.getMessage()
        L_0x00d1:
            java.lang.String r0 = X.C353118Gi.A00(r3)
            r1.A0M(r2, r0)
            return
        L_0x00d9:
            r0 = 21004(0x520c, float:2.9433E-41)
            if (r1 == r0) goto L_0x00e1
            r0 = 22001(0x55f1, float:3.083E-41)
            if (r1 != r0) goto L_0x00ee
        L_0x00e1:
            X.0JN r0 = X.0JN.A01()
            boolean r0 = r0.A09()
            r1 = 2131974227(0x7f135853, float:1.9585512E38)
            if (r0 != 0) goto L_0x00b3
        L_0x00ee:
            r1 = 2131974093(0x7f1357cd, float:1.958524E38)
            goto L_0x00b3
        L_0x00f2:
            boolean r0 = r6 instanceof X.AnonymousClass8GW
            if (r0 == 0) goto L_0x010f
            r0 = r6
            X.8GW r0 = (X.AnonymousClass8GW) r0
            X.8GT r1 = r0.A00
            java.lang.String r0 = "easingCallback::exception()"
            X.7l2 r2 = X.AnonymousClass8GT.A00(r1, r0)
            if (r2 == 0) goto L_0x068d
            java.util.concurrent.atomic.AtomicReference r1 = r1.A09
            X.8GV r0 = X.AnonymousClass8GV.NORMAL
            r1.set(r0)
            r0 = 1
            r2.A0S(r0)
            return
        L_0x010f:
            boolean r0 = r6 instanceof X.C364438lQ
            if (r0 == 0) goto L_0x012b
            r1 = r6
            X.8lQ r1 = (X.C364438lQ) r1
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.8Fr r1 = r1.A00
            boolean r0 = r1.A00
            X.C352948Fr.A01(r1, r0)
            java.lang.String r1 = "Failed to set low light mode"
        L_0x0123:
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r1, r0)
            return
        L_0x012b:
            boolean r0 = r6 instanceof X.C346537vL
            if (r0 == 0) goto L_0x0136
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.String r1 = "Failed to set flash mode"
            goto L_0x0123
        L_0x0136:
            boolean r0 = r6 instanceof X.AnonymousClass8GC
            if (r0 == 0) goto L_0x0150
            r1 = r6
            X.8GC r1 = (X.AnonymousClass8GC) r1
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.8GA r2 = r1.A00
            java.lang.String r1 = "Failed to bind flash"
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r1, r0)
            X.AnonymousClass8GA.A00(r2)
            return
        L_0x0150:
            boolean r0 = r6 instanceof X.C353138Gk
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = "Failed to stop video recording"
            goto L_0x0123
        L_0x0157:
            boolean r0 = r6 instanceof X.C353128Gj
            if (r0 == 0) goto L_0x0186
            r0 = r6
            X.8Gj r0 = (X.C353128Gj) r0
            X.8Gi r3 = r0.A00
            com.instagram.common.session.UserSession r1 = r3.A0H
            java.lang.String r2 = "Failed to start video recording"
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r2, r0)
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)
            java.lang.String r0 = r7.getMessage()
            if (r0 == 0) goto L_0x0179
            java.lang.String r2 = r7.getMessage()
        L_0x0179:
            java.lang.String r0 = X.C353118Gi.A00(r3)
            r1.A0M(r2, r0)
            X.8W6 r0 = r3.A04
            r0.A03()
            return
        L_0x0186:
            boolean r0 = r6 instanceof X.C346567vO
            if (r0 == 0) goto L_0x019b
            r0 = r6
            X.7vO r0 = (X.C346567vO) r0
            X.8Gb r0 = r0.A00
            X.8Fl r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A0f
            X.27r r0 = X.27p.A01(r0)
            r0.A0f()
            return
        L_0x019b:
            boolean r0 = r6 instanceof X.C341967np
            if (r0 == 0) goto L_0x01a2
            java.lang.String r1 = "Failed to get number of cameras"
            goto L_0x0123
        L_0x01a2:
            boolean r0 = r6 instanceof X.C364448lR
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C364258l8
            if (r0 == 0) goto L_0x01c3
            r3 = r6
            X.8l8 r3 = (X.C364258l8) r3
            X.8Fl r2 = r3.A00
            java.lang.String r1 = "Failed to switch camera"
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r1, r0)
            r0 = 0
            r2.A0K = r0
            java.lang.Runnable r0 = r3.A01
            if (r0 == 0) goto L_0x068d
            r0.run()
            return
        L_0x01c3:
            boolean r0 = r6 instanceof X.C341947nn
            if (r0 == 0) goto L_0x01d7
            r2 = r6
            X.7nn r2 = (X.C341947nn) r2
            java.lang.String r1 = "Failed to get number of cameras"
            java.lang.String r0 = X.C340217kt.A03(r7)
            X.0kD.A01(r1, r0)
            X.8GD r0 = r2.A00
            goto L_0x0039
        L_0x01d7:
            boolean r0 = r6 instanceof X.C364248l7
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C364228l5
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C364218l4
            if (r0 == 0) goto L_0x0203
            r4 = r6
            X.8l4 r4 = (X.C364218l4) r4
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r0 = 18
            int r1 = X.C344017rB.A02(r0)
            X.8GJ r2 = r4.A01
            X.02m r0 = X.02m.A0p
            r3 = 3
            r0.markerEnd(r1, r3)
            r1 = 17642914(0x10d35a2, float:2.593609E-38)
            X.02m r0 = X.02m.A0p
            r0.markerEnd(r1, r3)
            r1 = 0
            goto L_0x0502
        L_0x0203:
            boolean r0 = r6 instanceof X.C364368lJ
            if (r0 == 0) goto L_0x0217
            r0 = r6
            X.8lJ r0 = (X.C364368lJ) r0
            X.8kL r2 = r0.A00
            java.lang.String r1 = "Camera preview SurfaceTexture Unavailable!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r2.onFail(r0)
            return
        L_0x0217:
            boolean r0 = r6 instanceof X.C364468lT
            if (r0 == 0) goto L_0x0228
            java.lang.String r2 = "GLBoomerangCaptureController"
            java.lang.String r0 = "Could not lock camera values in completeCapture()"
            X.0kD.A0B(r2, r0, r7)
            java.lang.String r0 = "Could not unlock camera values"
        L_0x0224:
            X.0KC.A0F(r2, r0, r7)
            return
        L_0x0228:
            boolean r0 = r6 instanceof X.C364288lB
            if (r0 == 0) goto L_0x023f
            r1 = r6
            X.8lB r1 = (X.C364288lB) r1
            java.lang.String r2 = "GLBoomerangCaptureController"
            java.lang.String r0 = "Could not lock camera values in startRecording()"
            X.0kD.A0B(r2, r0, r7)
            X.8HF r1 = r1.A00
            r0 = 0
            r1.A08(r0)
            java.lang.String r0 = "Could not lock camera values"
            goto L_0x0224
        L_0x023f:
            boolean r0 = r6 instanceof X.C346577vP
            if (r0 == 0) goto L_0x024b
            java.lang.String r1 = "PreCaptureUICoordinator"
            java.lang.String r0 = "Exception while getting number of cameras in onLayoutCaptureStarted"
        L_0x0247:
            X.0kD.A07(r1, r0, r7)
            return
        L_0x024b:
            boolean r0 = r6 instanceof X.C364298lC
            if (r0 == 0) goto L_0x0254
            java.lang.String r1 = "PreCaptureUICoordinator"
            java.lang.String r0 = "Assign to nilesh: Exception while getting number of cameras in onEnterVideoRecording"
            goto L_0x0247
        L_0x0254:
            boolean r0 = r6 instanceof X.AnonymousClass8S3
            if (r0 == 0) goto L_0x0267
            r2 = r6
            X.8S3 r2 = (X.AnonymousClass8S3) r2
            java.lang.String r1 = "PreCaptureUICoordinator"
            java.lang.String r0 = "Tell nilesh: exception getting number of camerasin updateForCapture()."
            X.0kD.A07(r1, r0, r7)
            r0 = 0
            X.AnonymousClass8S3.A00(r2, r0)
            return
        L_0x0267:
            boolean r0 = r6 instanceof X.C364478lU
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C364488lV
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C346517vJ
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C346527vK
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C364498lW
            if (r0 == 0) goto L_0x0282
            r0 = r6
            X.8lW r0 = (X.C364498lW) r0
            X.8GD r0 = r0.A00
            goto L_0x0039
        L_0x0282:
            boolean r0 = r6 instanceof X.C364508lX
            if (r0 == 0) goto L_0x028b
            java.lang.String r1 = "OneCameraController"
            java.lang.String r0 = "enableExternalWorldTrackingEvent()"
            goto L_0x0247
        L_0x028b:
            boolean r0 = r6 instanceof X.C341977nq
            if (r0 == 0) goto L_0x0294
            java.lang.String r1 = "OneCameraController"
            java.lang.String r0 = "setFrameMetaDataEnabled()"
            goto L_0x0247
        L_0x0294:
            boolean r0 = r6 instanceof X.C364518lY
            if (r0 == 0) goto L_0x02a0
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to resume concurrent front-back camera"
        L_0x029c:
            X.C340577lU.A02(r1, r0)
            return
        L_0x02a0:
            boolean r0 = r6 instanceof X.C364528lZ
            if (r0 == 0) goto L_0x02a9
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "onPause failed"
            goto L_0x029c
        L_0x02a9:
            boolean r0 = r6 instanceof X.C364538la
            if (r0 == 0) goto L_0x02bb
            r2 = r6
            X.8la r2 = (X.C364538la) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to disconnect second camera for concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8GD r0 = r2.A00
            goto L_0x0039
        L_0x02bb:
            boolean r0 = r6 instanceof X.C364548lb
            if (r0 == 0) goto L_0x02cd
            r2 = r6
            X.8lb r2 = (X.C364548lb) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to disconnect first camera for concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8GD r0 = r2.A00
            goto L_0x0039
        L_0x02cd:
            boolean r0 = r6 instanceof X.C364558lc
            if (r0 == 0) goto L_0x02e7
            r3 = r6
            X.8lc r3 = (X.C364558lc) r3
            java.lang.String r2 = "ConcurrentFrontBackController"
            java.lang.String r1 = "Exception while stopping concurrent front-back mode:"
            java.lang.String r0 = r7.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.C340577lU.A02(r2, r0)
            X.8GD r0 = r3.A00
            goto L_0x0039
        L_0x02e7:
            boolean r0 = r6 instanceof X.C364568ld
            if (r0 == 0) goto L_0x02f9
            r2 = r6
            X.8ld r2 = (X.C364568ld) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to disconnect before starting concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8GD r0 = r2.A02
            goto L_0x0039
        L_0x02f9:
            boolean r0 = r6 instanceof X.C382549ds
            if (r0 == 0) goto L_0x030d
            r2 = r6
            X.9ds r2 = (X.C382549ds) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to connect for concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8ld r0 = r2.A00
            X.8GD r0 = r0.A02
            goto L_0x0039
        L_0x030d:
            boolean r0 = r6 instanceof X.C364578le
            if (r0 == 0) goto L_0x031f
            r1 = r6
            X.8le r1 = (X.C364578le) r1
            X.B2T r0 = r1.A02
            r0.DxB(r7)
            X.7m6 r1 = r1.A03
            r0 = 0
            r1.A03 = r0
            return
        L_0x031f:
            boolean r0 = r6 instanceof X.C364588lf
            if (r0 == 0) goto L_0x0331
            r2 = r6
            X.8lf r2 = (X.C364588lf) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to open first camera for concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8GD r0 = r2.A02
            goto L_0x0039
        L_0x0331:
            boolean r0 = r6 instanceof X.C364598lg
            if (r0 == 0) goto L_0x0345
            r2 = r6
            X.8lg r2 = (X.C364598lg) r2
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Failed to open second camera for concurrent front-back mode"
            X.C340577lU.A02(r1, r0)
            X.8lf r0 = r2.A01
            X.8GD r0 = r0.A02
            goto L_0x0039
        L_0x0345:
            boolean r0 = r6 instanceof X.C364308lD
            if (r0 == 0) goto L_0x0352
            r0 = r6
            X.8lD r0 = (X.C364308lD) r0
            X.B2T r0 = r0.A00
        L_0x034e:
            r0.DxB(r7)
            return
        L_0x0352:
            boolean r0 = r6 instanceof X.C364318lE
            if (r0 == 0) goto L_0x0362
            r1 = r6
            X.8lE r1 = (X.C364318lE) r1
            X.8GD r0 = r1.A00
            r0.A01(r7)
            X.7lR r4 = r1.A01
            goto L_0x000d
        L_0x0362:
            boolean r0 = r6 instanceof X.C364608lh
            if (r0 == 0) goto L_0x0372
            r1 = r6
            X.8lh r1 = (X.C364608lh) r1
            X.8GD r0 = r1.A00
            r0.A01(r7)
            X.7lR r4 = r1.A01
            goto L_0x000d
        L_0x0372:
            boolean r0 = r6 instanceof X.C341987nr
            if (r0 != 0) goto L_0x0688
            boolean r0 = r6 instanceof X.C346467vE
            if (r0 == 0) goto L_0x03a0
            r1 = r6
            X.7vE r1 = (X.C346467vE) r1
            X.7lR r4 = r1.A01
            r0 = 0
            r4.A08 = r0
            X.8GD r0 = r1.A00
            if (r0 == 0) goto L_0x0389
            r0.A01(r7)
        L_0x0389:
            X.81j r0 = r4.A0M
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0392:
            if (r1 >= r2) goto L_0x068d
            java.lang.Object r0 = r3.get(r1)
            X.7lN r0 = (X.C340507lN) r0
            r0.D9A(r4, r7)
            int r1 = r1 + 1
            goto L_0x0392
        L_0x03a0:
            boolean r0 = r6 instanceof X.C364618li
            if (r0 == 0) goto L_0x03af
            r1 = r6
            X.8li r1 = (X.C364618li) r1
            X.7lR r0 = r1.A01
            X.C340547lR.A02(r0)
            X.B2T r0 = r1.A00
            goto L_0x034e
        L_0x03af:
            boolean r0 = r6 instanceof X.C364328lF
            if (r0 == 0) goto L_0x03cd
            r1 = r6
            X.8lF r1 = (X.C364328lF) r1
            android.graphics.SurfaceTexture r0 = r1.A00
            r0.release()
            X.7pS r1 = r1.A01
            X.7pQ r1 = r1.A00
            X.7lR r1 = r1.A02
            X.7lQ r2 = r1.A0R
            boolean r1 = r1.A0S
            X.7mF r1 = r2.A00(r1)
        L_0x03c9:
            r1.Dh8(r0)
            return
        L_0x03cd:
            boolean r0 = r6 instanceof X.C364338lG
            if (r0 == 0) goto L_0x03e2
            r2 = r6
            X.8lG r2 = (X.C364338lG) r2
            boolean r0 = r7 instanceof X.C41524AvS
            if (r0 == 0) goto L_0x03de
            X.7m3 r1 = r2.A02
            X.7q6 r0 = r2.A01
            r1.A00 = r0
        L_0x03de:
            X.8GD r0 = r2.A00
            goto L_0x0039
        L_0x03e2:
            boolean r0 = r6 instanceof X.C346477vF
            if (r0 == 0) goto L_0x040c
            r2 = r6
            X.7vF r2 = (X.C346477vF) r2
            X.8GD r0 = r2.A00
            if (r0 == 0) goto L_0x0406
            r0.A01(r7)
        L_0x03f0:
            X.7m3 r4 = r2.A01
            X.7lS r1 = r4.A01
            int r0 = X.C340577lU.A00
            if (r1 == 0) goto L_0x03fd
            X.81j r0 = X.C340577lU.A01
            r0.A02(r1)
        L_0x03fd:
            X.7ln r3 = r4.A08
            X.7m5 r2 = r4.A06
            X.7lm r1 = r3.A02
            monitor-enter(r1)
            goto L_0x0539
        L_0x0406:
            r1 = 4
            r0 = 0
            X.C340577lU.A00(r1, r0, r7)
            goto L_0x03f0
        L_0x040c:
            boolean r0 = r6 instanceof X.C364628lj
            if (r0 == 0) goto L_0x0417
            r0 = r6
            X.8lj r0 = (X.C364628lj) r0
            X.8GD r0 = r0.A00
            goto L_0x0039
        L_0x0417:
            boolean r0 = r6 instanceof X.C364348lH
            if (r0 == 0) goto L_0x0439
            r5 = r6
            X.8lH r5 = (X.C364348lH) r5
            X.8GD r0 = r5.A01
            r0.A01(r7)
            X.7ls r0 = r5.A02
            X.7lm r4 = r0.A0A
            android.hardware.camera2.CaptureRequest$Builder r3 = r5.A00
            X.7po r1 = r5.A03
            boolean r0 = r5.A04
            X.Asc r2 = new X.Asc
            r2.<init>(r3, r5, r1, r0)
            java.lang.String r1 = "restart_preview_video_recording_failed"
            r0 = 0
            r4.A00(r0, r1, r2)
            return
        L_0x0439:
            boolean r0 = r6 instanceof X.C364238l6
            if (r0 == 0) goto L_0x0450
            r3 = r6
            X.8l6 r3 = (X.C364238l6) r3
            X.7lp r2 = r3.A00
            r1 = 0
            r2.A0G = r1
            r0 = 22
            X.C340577lU.A00(r0, r1, r7)
            X.8kj r0 = r3.A01
            r2.A01(r0, r7)
            return
        L_0x0450:
            boolean r0 = r6 instanceof X.C346557vN
            if (r0 == 0) goto L_0x0462
            r0 = r6
            X.7vN r0 = (X.C346557vN) r0
            X.7lW r0 = r0.A00
            X.7lt r2 = r0.A0P
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 0
            r2.A05(r1, r0)
            return
        L_0x0462:
            boolean r0 = r6 instanceof X.C364638lk
            if (r0 == 0) goto L_0x046f
            r0 = r6
            X.8lk r0 = (X.C364638lk) r0
            X.8kj r0 = r0.A01
            r0.DCn(r7)
            return
        L_0x046f:
            boolean r0 = r6 instanceof X.C364648ll
            if (r0 != 0) goto L_0x0688
            boolean r0 = r6 instanceof X.C341957no
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C382539dr
            if (r0 == 0) goto L_0x04aa
            r0 = r6
            X.9dr r0 = (X.C382539dr) r0
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x054a;
                case 1: goto L_0x068d;
                case 2: goto L_0x049e;
                default: goto L_0x0483;
            }
        L_0x0483:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Dual camera mode failed to stop "
        L_0x048e:
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "IgLiteCameraProxy"
            X.0KC.A0C(r0, r1)
            return
        L_0x049e:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Dual camera mode failed to start "
            goto L_0x048e
        L_0x04aa:
            boolean r0 = r6 instanceof X.C382579dv
            if (r0 == 0) goto L_0x04d0
            r2 = r6
            X.9dv r2 = (X.C382579dv) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x04bc;
                case 1: goto L_0x04b6;
                case 2: goto L_0x04b6;
                case 3: goto L_0x0567;
                case 4: goto L_0x068d;
                default: goto L_0x04b6;
            }
        L_0x04b6:
            java.lang.Object r0 = r2.A02
            X.8GD r0 = (X.AnonymousClass8GD) r0
            goto L_0x0039
        L_0x04bc:
            java.lang.Object r1 = r2.A01
            X.9Xs r1 = (X.C380369Xs) r1
            r0 = 0
            r1.A06 = r0
            java.lang.Object r0 = r2.A02
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            r0.release()
            X.7mF r1 = r1.A0A
            if (r1 == 0) goto L_0x068d
            goto L_0x03c9
        L_0x04d0:
            boolean r0 = r6 instanceof X.C382569du
            if (r0 == 0) goto L_0x05b9
            r1 = r6
            X.9du r1 = (X.C382569du) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0596;
                case 1: goto L_0x04fe;
                case 2: goto L_0x04f4;
                case 3: goto L_0x058e;
                case 4: goto L_0x0688;
                case 5: goto L_0x04ee;
                case 6: goto L_0x04e8;
                case 7: goto L_0x0583;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.Vul r0 = X.C65819M0l.A0M
            if (r0 == 0) goto L_0x068d
            r0.A03(r7)
            return
        L_0x04e8:
            java.lang.String r1 = "NewOpticDeviceController"
            java.lang.String r0 = "enableExternalWorldTrackingEvent()"
            goto L_0x0247
        L_0x04ee:
            java.lang.String r1 = "NewOpticDeviceController"
            java.lang.String r0 = "setFrameMetaDataEnabled()"
            goto L_0x0247
        L_0x04f4:
            java.lang.Object r0 = r1.A01
            X.9Xs r0 = (X.C380369Xs) r0
            X.81l r0 = r0.A08
            if (r0 == 0) goto L_0x068d
            goto L_0x0064
        L_0x04fe:
            java.lang.String r1 = "CameraPreviewView"
            goto L_0x002a
        L_0x0502:
            X.8Fl r0 = r2.A0B     // Catch:{ 8Fp -> 0x0510 }
            X.7l2 r0 = r0.A06     // Catch:{ 8Fp -> 0x0510 }
            if (r0 == 0) goto L_0x0510
            int r0 = r0.A07()     // Catch:{ 8Fp -> 0x0510 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 8Fp -> 0x0510 }
        L_0x0510:
            java.lang.String r1 = X.C363818kO.A00(r1)
            java.lang.String r0 = "camera"
            X.C360908fL.A04(r0, r1, r7, r5)
            X.8Fl r0 = r2.A0B
            X.7l2 r1 = r0.A06
            if (r1 == 0) goto L_0x0524
            X.8kf r0 = r4.A00
            r1.A0I(r0)
        L_0x0524:
            X.8GA r0 = r2.A0C
            r0.A07()
            X.80U r1 = r2.A0D
            X.80V r0 = X.AnonymousClass80V.PHOTO_CAPTURING
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x068d
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r2.A0F
            r0.A02()
            return
        L_0x0539:
            X.7m5 r0 = r3.A00     // Catch:{ all -> 0x0547 }
            if (r0 != r2) goto L_0x0540
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0547 }
        L_0x0540:
            monitor-exit(r1)     // Catch:{ all -> 0x0547 }
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x0547:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0547 }
            throw r0
        L_0x054a:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.0wj r2 = X.0wj.A01
            r1 = 817904119(0x30c039f7, float:1.3986313E-9)
            java.lang.String r0 = "PotatoPreCaptureFragment.CameraSwitchFailure"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "An exception happened while attempting to switch camera"
            r2.ABQ(r1, r0)
            r2.ERJ(r7)
            r2.report()
            return
        L_0x0567:
            java.lang.String r1 = "Camera not initialised in startRecording: "
            java.lang.Object r0 = r2.A02
            java.io.File r0 = (java.io.File) r0
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "BoomerangCaptureController"
            X.0kD.A0B(r0, r1, r7)
            java.lang.Object r1 = r2.A01
            X.8HG r1 = (X.AnonymousClass8HG) r1
            r0 = 0
            r1.A08(r0)
            return
        L_0x0583:
            java.lang.String r1 = "BoomerangCaptureController"
            java.lang.String r0 = "Could not unlock camera values"
            X.0kD.A0B(r1, r0, r7)
            X.0KC.A0F(r1, r0, r7)
            return
        L_0x058e:
            java.lang.Object r1 = r1.A01
            X.9Xs r1 = (X.C380369Xs) r1
            r0 = 0
            r1.A06 = r0
            return
        L_0x0596:
            java.lang.Object r3 = r1.A01
            X.7tv r3 = (X.C345687tv) r3
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r3.A05     // Catch:{ all -> 0x05b6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x05b6 }
            if (r1 != r0) goto L_0x05b4
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x05b6 }
            r3.A05 = r0     // Catch:{ all -> 0x05b6 }
            X.C345687tv.A00(r3)     // Catch:{ all -> 0x05b6 }
            X.B2M r1 = r3.A04     // Catch:{ all -> 0x05b6 }
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x05b6 }
            if (r1 == 0) goto L_0x05b4
            X.ALI.A04(r1, r7)     // Catch:{ all -> 0x05b6 }
        L_0x05b4:
            monitor-exit(r2)     // Catch:{ all -> 0x05b6 }
            return
        L_0x05b6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x05b6 }
            throw r0
        L_0x05b9:
            boolean r0 = r6 instanceof X.C370378wL
            if (r0 == 0) goto L_0x05d0
            r1 = r6
            X.8wL r1 = (X.C370378wL) r1
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r1.A00
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r2 = r0.Aja()
            X.8GD r0 = r1.A01
        L_0x05cc:
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A01(r2, r0, r7)
            return
        L_0x05d0:
            boolean r0 = r6 instanceof X.C370388wM
            if (r0 == 0) goto L_0x05e4
            r1 = r6
            X.8wM r1 = (X.C370388wM) r1
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r1.A00
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r2 = r0.Aja()
            X.8GD r0 = r1.A01
            goto L_0x05cc
        L_0x05e4:
            boolean r0 = r6 instanceof X.C364388lL
            if (r0 == 0) goto L_0x05f8
            r1 = r6
            X.8lL r1 = (X.C364388lL) r1
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r1.A01
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r2 = r0.Aja()
            X.8GD r0 = r1.A02
            goto L_0x05cc
        L_0x05f8:
            boolean r0 = r6 instanceof X.C364658lm
            if (r0 == 0) goto L_0x0605
            r0 = r6
            X.8lm r0 = (X.C364658lm) r0
            X.7t8 r1 = r0.A00
            r0 = 1
            r1.A02 = r0
            return
        L_0x0605:
            boolean r0 = r6 instanceof X.C364378lK
            if (r0 == 0) goto L_0x0628
            r1 = r6
            X.8lK r1 = (X.C364378lK) r1
            X.8GD r0 = r1.A01
            r0.A01(r7)
            X.7tP r0 = r1.A00
            X.7rD r4 = r0.A00
            java.lang.String r3 = "BasicPhotoCaptureCoordinator"
            int r2 = r1.hashCode()
            r0 = 10000(0x2710, float:1.4013E-41)
            X.9dR r1 = new X.9dR
            r1.<init>((int) r0, (java.lang.Throwable) r7)
            java.lang.String r0 = "high"
            X.C363808kN.A00(r1, r4, r3, r0, r2)
            return
        L_0x0628:
            boolean r0 = r6 instanceof X.C382559dt
            if (r0 == 0) goto L_0x0650
            r0 = r6
            X.9dt r0 = (X.C382559dt) r0
            X.7tv r3 = r0.A00
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r3.A05     // Catch:{ all -> 0x064d }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x064d }
            if (r1 != r0) goto L_0x064b
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x064d }
            r3.A05 = r0     // Catch:{ all -> 0x064d }
            X.C345687tv.A00(r3)     // Catch:{ all -> 0x064d }
            X.B2M r1 = r3.A04     // Catch:{ all -> 0x064d }
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x064d }
            if (r1 == 0) goto L_0x064b
            X.ALI.A04(r1, r7)     // Catch:{ all -> 0x064d }
        L_0x064b:
            monitor-exit(r2)     // Catch:{ all -> 0x064d }
            return
        L_0x064d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x064d }
            throw r0
        L_0x0650:
            boolean r0 = r6 instanceof X.C382529dq
            if (r0 != 0) goto L_0x068d
            boolean r0 = r6 instanceof X.C382519dp
            if (r0 == 0) goto L_0x0662
            r0 = r6
            X.9dp r0 = (X.C382519dp) r0
            X.7tx r1 = r0.A00
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x0673
            return
        L_0x0662:
            boolean r0 = r6 instanceof X.C382509do
            if (r0 == 0) goto L_0x067b
            r0 = r6
            X.9do r0 = (X.C382509do) r0
            X.7tx r1 = r0.A00
            boolean r0 = r1.A0Q
            if (r0 != 0) goto L_0x068d
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x068d
        L_0x0673:
            X.81j r0 = r1.A01
            java.util.List r0 = r0.A00
            X.ALI.A07(r7, r0)
            return
        L_0x067b:
            boolean r0 = r6 instanceof X.C382499dn
            if (r0 != 0) goto L_0x068d
            r0 = r6
            X.9dm r0 = (X.C382489dm) r0
            X.7tx r1 = r0.A00
            r0 = 0
            r1.A0L = r0
            return
        L_0x0688:
            r1 = 4
            r0 = 0
            X.C340577lU.A00(r1, r0, r7)
        L_0x068d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GD.A01(java.lang.Exception):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.7pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: X.7pa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: X.7q6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: X.7q6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.7pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: X.7km} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.7lI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.7pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: X.7q6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: X.7q6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: X.7q6} */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Object, X.AVB] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016a, code lost:
        if (r3.Atr() != X.AnonymousClass80V.VIDEO_LAYOUT_COMPLETE) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c6, code lost:
        if (r1.A00.A0C.A1W == false) goto L_0x01c8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.Object r58) {
        /*
            r57 = this;
            r1 = r57
            r4 = r58
            boolean r0 = r1 instanceof X.C341957no
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C341967np
            if (r0 == 0) goto L_0x0045
            r5 = r1
            X.7np r5 = (X.C341967np) r5
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0044
            X.8Fl r3 = r5.A00
            X.7qL r2 = new X.7qL
            r2.<init>(r3)
            android.app.Activity r0 = r3.A0P
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r0, r2)
            r1.setOnDoubleTapListener(r2)
            X.7l2 r0 = r3.A06
            r0.getClass()
            X.7qM r2 = new X.7qM
            r2.<init>(r1, r5)
            X.7rU r1 = r0.A0G
            X.7rc r0 = X.C345507td.A00
            X.7rb r0 = r1.A02(r0)
            X.7td r0 = (X.C345507td) r0
            com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController r0 = (com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController) r0
            X.7nc r0 = r0.A01
            if (r0 == 0) goto L_0x0044
            r0.A00 = r2
        L_0x0044:
            return
        L_0x0045:
            boolean r0 = r1 instanceof X.C341977nq
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C340567lT
            if (r0 == 0) goto L_0x00ac
            r0 = r1
            X.7lT r0 = (X.C340567lT) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.7lR r5 = r0.A00
            r5.A08 = r4
            X.7mB r1 = r5.A02
            if (r1 == 0) goto L_0x005f
            X.7lX r0 = r5.A0N
            r0.A8O(r1)
        L_0x005f:
            r5.A05()
            X.7lJ r0 = r5.A0O
            android.content.Context r1 = r0.getContext()
            android.view.OrientationEventListener r0 = r5.A01
            if (r0 != 0) goto L_0x0073
            X.7qA r0 = new X.7qA
            r0.<init>(r1, r5)
            r5.A01 = r0
        L_0x0073:
            boolean r0 = r0.canDetectOrientation()     // Catch:{ RuntimeException -> 0x007e }
            if (r0 == 0) goto L_0x007e
            android.view.OrientationEventListener r0 = r5.A01     // Catch:{ RuntimeException -> 0x007e }
            r0.enable()     // Catch:{ RuntimeException -> 0x007e }
        L_0x007e:
            X.7lX r1 = r5.A0N
            X.7m5 r0 = r5.A03
            if (r0 != 0) goto L_0x008b
            X.7qB r0 = new X.7qB
            r0.<init>(r5)
            r5.A03 = r0
        L_0x008b:
            r1.EeX(r0)
            X.81j r1 = r5.A0M
            java.util.List r0 = r1.A00
            r0.size()
            X.7q6 r4 = r5.A08
            java.util.List r3 = r1.A00
            int r2 = r3.size()
            r1 = 0
        L_0x009e:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r0 = r3.get(r1)
            X.7lN r0 = (X.C340507lN) r0
            r0.D5f(r4, r5)
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00ac:
            boolean r0 = r1 instanceof X.C341997ns
            if (r0 == 0) goto L_0x00be
            X.7ns r1 = (X.C341997ns) r1
            X.7q6 r4 = (X.C343367q6) r4
            X.7m3 r0 = r1.A01
            r0.A00 = r4
            X.8GD r0 = r1.A00
        L_0x00ba:
            r0.A02(r4)
            return
        L_0x00be:
            boolean r0 = r1 instanceof X.C341987nr
            if (r0 == 0) goto L_0x00d7
            r0 = r1
            X.7nr r0 = (X.C341987nr) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.7lR r2 = r0.A00
            X.7lJ r0 = r2.A0O
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.C340547lR.A01(r4, r2, r1, r0)
            return
        L_0x00d7:
            boolean r0 = r1 instanceof X.C346517vJ
            if (r0 == 0) goto L_0x00e9
            r0 = r1
            X.7vJ r0 = (X.C346517vJ) r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            X.8xw r0 = r0.A00
            r0.A00 = r1
            return
        L_0x00e9:
            boolean r0 = r1 instanceof X.C346527vK
            if (r0 == 0) goto L_0x00fb
            r0 = r1
            X.7vK r0 = (X.C346527vK) r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            X.8xw r0 = r0.A00
            r0.A01 = r1
            return
        L_0x00fb:
            boolean r0 = r1 instanceof X.C341947nn
            if (r0 == 0) goto L_0x0116
            r0 = r1
            X.7nn r0 = (X.C341947nn) r0
            java.lang.Number r4 = (java.lang.Number) r4
            X.8GD r2 = r0.A00
            int r1 = r4.intValue()
            r0 = 1
            if (r1 > r0) goto L_0x010e
            r0 = 0
        L_0x010e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02(r0)
            return
        L_0x0116:
            boolean r0 = r1 instanceof X.AnonymousClass8S3
            if (r0 == 0) goto L_0x019a
            r2 = r1
            X.8S3 r2 = (X.AnonymousClass8S3) r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            X.8Rz r3 = r2.A00
            com.instagram.common.session.UserSession r6 = r3.A09
            X.0Tu r5 = X.0Tu.A05
            r0 = 36314326444935689(0x8103b000020a09, double:3.028664497608448E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 != 0) goto L_0x016c
            X.80D r0 = r3.A0F
            boolean r0 = r0.A3j
            if (r0 == 0) goto L_0x0198
            X.8S2 r1 = r3.A0L
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0198
            X.8S1 r4 = r1.A01
            X.8Rz r5 = r4.A00
            X.8Fl r0 = r5.A0C
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0171
            java.lang.Integer r1 = r4.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x015a
            java.lang.Integer r1 = r4.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0198
        L_0x015a:
            X.80U r3 = r3.A0N
            X.80V r1 = r3.Atr()
            X.80V r0 = X.AnonymousClass80V.LAYOUT_COMPLETE
            if (r1 == r0) goto L_0x0198
            X.80V r1 = r3.Atr()
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_COMPLETE
            if (r1 == r0) goto L_0x0198
        L_0x016c:
            r0 = 1
        L_0x016d:
            X.AnonymousClass8S3.A00(r2, r0)
            return
        L_0x0171:
            X.8Yz r0 = r5.A0A
            X.80m r0 = r0.A09
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            X.8aL r0 = X.C358088aL.A0C
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0198
            X.8Hx r0 = r5.A0O
            X.8IY r0 = r0.AuT()
            X.8IX r1 = r0.A01
            X.8IX r0 = X.AnonymousClass8IX.CLIPS_REVIEW
            if (r1 == r0) goto L_0x0198
            X.4yO r0 = r4.A00()
            boolean r0 = r0 instanceof X.C3494080g
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0198
            goto L_0x015a
        L_0x0198:
            r0 = 0
            goto L_0x016d
        L_0x019a:
            boolean r0 = r1 instanceof X.C346537vL
            if (r0 == 0) goto L_0x01b0
            X.7vL r1 = (X.C346537vL) r1
            X.8GA r0 = r1.A01
            X.7l2 r2 = r0.A03
            if (r2 != 0) goto L_0x0bcb
            java.lang.String r0 = "cameraController"
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x01b0:
            boolean r0 = r1 instanceof X.C346577vP
            if (r0 == 0) goto L_0x01d9
            X.7vP r1 = (X.C346577vP) r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            r4 = 1
            if (r0 == 0) goto L_0x01c8
            X.8Rz r0 = r1.A00
            X.8Fl r0 = r0.A0C
            boolean r0 = r0.A1W
            r3 = 1
            if (r0 != 0) goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            X.8Rz r2 = r1.A00
            X.81m r0 = r2.A0K
            X.81t r1 = r0.A00()
            X.80D r0 = r2.A0F
            boolean r0 = r0.A3F
            r1.FMF(r0, r3, r4)
            return
        L_0x01d9:
            boolean r0 = r1 instanceof X.AnonymousClass8GC
            if (r0 == 0) goto L_0x0214
            r0 = r1
            X.8GC r0 = (X.AnonymousClass8GC) r0
            X.8GA r0 = r0.A00
            X.AnonymousClass8GA.A00(r0)
            X.81w r0 = r0.A04
            X.81v r0 = (X.C3497981v) r0
            X.A68 r0 = r0.A00
            if (r0 == 0) goto L_0x0044
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r0 = r0.A02
            X.A68 r3 = r0.A07
            r0 = 1
            r3.A00 = r0
            r2 = 2131100628(0x7f0603d4, float:1.7813643E38)
            android.widget.ImageView r1 = r3.A01
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r0 = r3.A02
            android.content.Context r0 = r0.getContext()
            int r0 = r0.getColor(r2)
            r1.setColorFilter(r0)
            X.AjS r2 = new X.AjS
            r2.<init>(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A01(r2)
            X.11Z.A04(r2, r0)
            return
        L_0x0214:
            boolean r0 = r1 instanceof X.C346557vN
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C346547vM
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C346467vE
            if (r0 == 0) goto L_0x0246
            r0 = r1
            X.7vE r0 = (X.C346467vE) r0
            r1 = 0
            X.7lR r4 = r0.A01
            r4.A08 = r1
            X.8GD r0 = r0.A00
            if (r0 == 0) goto L_0x022f
            r0.A02(r1)
        L_0x022f:
            X.81j r0 = r4.A0M
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0238:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r0 = r3.get(r1)
            X.7lN r0 = (X.C340507lN) r0
            r0.D99(r4)
            int r1 = r1 + 1
            goto L_0x0238
        L_0x0246:
            boolean r0 = r1 instanceof X.C346477vF
            if (r0 == 0) goto L_0x026a
            X.7vF r1 = (X.C346477vF) r1
            r5 = 0
            X.8GD r0 = r1.A00
            if (r0 == 0) goto L_0x0254
            r0.A02(r5)
        L_0x0254:
            X.7m3 r4 = r1.A01
            X.7lS r1 = r4.A01
            int r0 = X.C340577lU.A00
            if (r1 == 0) goto L_0x0261
            X.81j r0 = X.C340577lU.A01
            r0.A02(r1)
        L_0x0261:
            X.7ln r3 = r4.A08
            X.7m5 r2 = r4.A06
            X.7lm r1 = r3.A02
            monitor-enter(r1)
            goto L_0x0bd3
        L_0x026a:
            boolean r0 = r1 instanceof X.C364248l7
            if (r0 == 0) goto L_0x0278
            r0 = r1
            X.8l7 r0 = (X.C364248l7) r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.8GJ r0 = r0.A00
            r0.A00 = r4
            return
        L_0x0278:
            boolean r0 = r1 instanceof X.C364228l5
            if (r0 == 0) goto L_0x03cd
            X.8l5 r1 = (X.C364228l5) r1
            X.8kS r4 = (X.C363858kS) r4
            r19 = 0
            r0 = r19
            X.0qQ.A0B(r4, r0)
            X.8GJ r8 = r1.A00
            X.8ky r0 = X.C363858kS.A0K
            java.lang.Object r2 = r4.A03(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r18 = 1
            if (r2 == 0) goto L_0x03c9
            int r1 = r2.intValue()
            r0 = r18
            if (r0 != r1) goto L_0x03c9
        L_0x029d:
            com.instagram.common.session.UserSession r0 = r8.A07
            r56 = r0
            android.app.Activity r0 = r8.A05
            r55 = r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r8.A0A
            r43 = r0
            X.8Fl r0 = r8.A0B
            r42 = r0
            java.lang.String r44 = X.C363818kO.A00(r2)
            r20 = 0
            r0 = 0
            r26 = 0
            r1 = 0
            r3 = 4
            r2 = r42
            X.0qQ.A0B(r2, r3)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r29 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r30 = r0
            r31 = r0
            r32 = r0
            r33 = r0
            r34 = r0
            r35 = r0
            r36 = r0
            r37 = r0
            r38 = r0
            r39 = r0
            r40 = r0
            r41 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.8kz r7 = X.C363858kS.A0X
            java.lang.Object r17 = r4.A04(r7)
            r2 = r17
            byte[] r2 = (byte[]) r2
            r17 = r2
            X.8ky r2 = X.C363858kS.A0M
            java.lang.Object r16 = r4.A03(r2)
            r2 = r16
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r16 = r2
            X.82X r2 = r8.A06
            r25 = r2
            java.lang.String r46 = r25.A02()
            android.graphics.Bitmap r2 = r8.A00
            r24 = r2
            X.8GK r2 = r8.A0E
            r23 = r2
            X.8kz r2 = X.C363858kS.A0T
            java.lang.Object r15 = r4.A04(r2)
            java.lang.Long r15 = (java.lang.Long) r15
            X.8kz r2 = X.C363858kS.A0O
            java.lang.Object r14 = r4.A04(r2)
            java.lang.Float r14 = (java.lang.Float) r14
            X.8kz r2 = X.C363858kS.A0Z
            java.lang.Object r13 = r4.A04(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            X.8kz r2 = X.C363858kS.A0V
            java.lang.Object r12 = r4.A04(r2)
            java.lang.Float r12 = (java.lang.Float) r12
            X.8kz r2 = X.C363858kS.A0P
            java.lang.Object r11 = r4.A04(r2)
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Integer r2 = r8.A03
            r22 = r2
            boolean r2 = r8.A04
            r21 = r2
            X.8kz r2 = X.C363858kS.A0S
            java.lang.Object r10 = r4.A04(r2)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            X.8kz r2 = X.C363858kS.A0a
            java.lang.Object r9 = r4.A04(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.8kz r2 = X.C363858kS.A0e
            java.lang.Object r6 = r4.A04(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            X.8kz r2 = X.C363858kS.A0c
            java.lang.Object r5 = r4.A04(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            X.8kz r2 = X.C363858kS.A0Y
            java.lang.Object r3 = r4.A04(r2)
            X.8kR r3 = (X.C363848kR) r3
            com.instagram.camera.effect.models.CameraAREffect r28 = r25.A01()
            X.8Yz r2 = r8.A09
            java.lang.Integer r2 = r2.A08()
            java.lang.String r45 = X.C363828kP.A00(r2)
            X.8kz r2 = X.C363858kS.A0Q
            java.lang.Object r2 = r4.A04(r2)
            X.8kS r2 = (X.C363858kS) r2
            if (r2 == 0) goto L_0x0382
            r26 = r2
            java.lang.Object r1 = r2.A04(r7)
            byte[] r1 = (byte[]) r1
            X.8kz r0 = X.C363858kS.A0W
            java.lang.Object r0 = r2.A04(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x0382:
            X.4D6 r7 = r8.A08
            r51 = -1
            X.8kQ r2 = new X.8kQ
            r27 = r20
            r31 = r43
            r32 = r42
            r33 = r23
            r34 = r10
            r35 = r14
            r36 = r12
            r37 = r11
            r38 = r22
            r39 = r13
            r40 = r9
            r41 = r5
            r42 = r6
            r43 = r15
            r47 = r20
            r48 = r20
            r49 = r1
            r50 = r17
            r52 = r19
            r53 = r21
            r54 = r18
            r18 = r2
            r19 = r55
            r21 = r0
            r22 = r24
            r23 = r16
            r24 = r3
            r25 = r4
            r30 = r56
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r7.schedule(r2)
            return
        L_0x03c9:
            r18 = 0
            goto L_0x029d
        L_0x03cd:
            boolean r0 = r1 instanceof X.C364218l4
            if (r0 == 0) goto L_0x042f
            r5 = r1
            X.8l4 r5 = (X.C364218l4) r5
            X.8kS r4 = (X.C363858kS) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8GJ r3 = r5.A01
            X.8kz r0 = X.C363858kS.A0U
            java.lang.Object r0 = r4.A04(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            X.02m r4 = X.02m.A0p
            if (r0 == 0) goto L_0x03fd
            int r1 = r0.intValue()
            if (r1 != 0) goto L_0x0423
            java.lang.String r2 = "0"
        L_0x03f0:
            r1 = 17629195(0x10d000b, float:2.589764E-38)
            java.lang.String r0 = "flash_state"
            r4.markerAnnotate(r1, r0, r2)
            java.lang.String r0 = "image_received"
            r4.markerPoint(r1, r0)
        L_0x03fd:
            r0 = 18
            int r2 = X.C344017rB.A02(r0)
            X.02m r1 = X.02m.A0p
            r0 = 2
            r1.markerEnd(r2, r0)
            X.8Fl r0 = r3.A0B
            X.7l2 r2 = r0.A06
            if (r2 == 0) goto L_0x0a52
            X.8kf r1 = r5.A00
            X.7tb r0 = X.C340297l2.A02(r2)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x0420
            X.7lX r0 = r0.A0N
            r0.A9d(r1)
        L_0x0420:
            r0 = 0
            goto L_0x0a4f
        L_0x0423:
            r0 = 3
            if (r1 == r0) goto L_0x042c
            r0 = 4
            if (r1 == r0) goto L_0x042c
            java.lang.String r2 = "2"
            goto L_0x03f0
        L_0x042c:
            java.lang.String r2 = "1"
            goto L_0x03f0
        L_0x042f:
            boolean r0 = r1 instanceof X.C370378wL
            if (r0 == 0) goto L_0x044a
            r2 = r1
            X.8wL r2 = (X.C370378wL) r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r2.A00
            r0.A00 = r4
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r1 = r0.Aja()
            X.8GD r0 = r2.A01
        L_0x0446:
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A03(r1, r0, r4)
            return
        L_0x044a:
            boolean r0 = r1 instanceof X.C370388wM
            if (r0 == 0) goto L_0x0462
            r2 = r1
            X.8wM r2 = (X.C370388wM) r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r2.A00
            r0.A01 = r4
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r1 = r0.Aja()
            X.8GD r0 = r2.A01
            goto L_0x0446
        L_0x0462:
            boolean r0 = r1 instanceof X.C353158Gm
            if (r0 == 0) goto L_0x0489
            r6 = r1
            X.8Gm r6 = (X.C353158Gm) r6
            X.Xoh r4 = (X.C21986Xoh) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0nO r5 = X.0nY.A00()
            com.instagram.common.session.UserSession r3 = r6.A00
            X.888 r2 = r6.A01
            boolean r1 = r6.A03
            X.8Gl r0 = r6.A02
            X.9lO r6 = new X.9lO
            r7 = r4
            r8 = r3
            r9 = r2
            r10 = r0
            r11 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r5.ATE(r6)
            return
        L_0x0489:
            boolean r0 = r1 instanceof X.C353128Gj
            if (r0 == 0) goto L_0x04bf
            r0 = r1
            X.8Gj r0 = (X.C353128Gj) r0
            X.Xoh r4 = (X.C21986Xoh) r4
            X.8Gi r2 = r0.A00
            r2.A00 = r4
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r2.A0V
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A03(r0)
            X.8Gg r6 = r2.A0W
            android.hardware.Sensor r5 = r6.A02
            if (r5 == 0) goto L_0x0044
            long r3 = r6.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            long r0 = java.lang.System.currentTimeMillis()
            r6.A00 = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r6.A01 = r0
            android.hardware.SensorManager r1 = r6.A03
            r0 = 1
            X.C60240fb.A01(r5, r6, r1, r0)
            return
        L_0x04bf:
            boolean r0 = r1 instanceof X.C346567vO
            if (r0 == 0) goto L_0x04d8
            r0 = r1
            X.7vO r0 = (X.C346567vO) r0
            X.8Gb r0 = r0.A00
            X.8Fl r0 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A0f
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.27r r0 = X.27p.A01(r1)
            r0.A0f()
            return
        L_0x04d8:
            boolean r0 = r1 instanceof X.C364258l8
            if (r0 == 0) goto L_0x0557
            r5 = r1
            X.8l8 r5 = (X.C364258l8) r5
            X.7q6 r4 = (X.C343367q6) r4
            X.8Fl r6 = r5.A00
            X.7p3 r1 = r4.A03
            X.7p4 r0 = X.C342717p3.A0y
            java.lang.Object r0 = r1.A02(r0)
            X.7pa r0 = (X.C343047pa) r0
            X.C352888Fl.A03(r0, r6)
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0044
            X.81i r1 = r6.A17
            r1.A01 = r4
            X.81l r0 = r6.A0X
            r1.A03(r0)
            int r8 = r4.A01
            X.C352888Fl.A0B(r6, r8)
            X.8Yz r0 = r6.A0g
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r2 = r0 instanceof X.AnonymousClass80M
            r1 = 1
            com.instagram.common.session.UserSession r0 = r6.A0f
            X.1Av r7 = X.1Au.A00(r0)
            if (r2 == 0) goto L_0x054f
            r3 = 0
            if (r8 != r1) goto L_0x0517
            r3 = 1
        L_0x0517:
            X.0s0 r2 = r7.A0y
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 68
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.Epx(r7, r0, r1)
        L_0x0526:
            r0 = 0
            r6.A0K = r0
            X.8GA r3 = r6.A0n
            r3.A02 = r4
            java.util.ArrayList r2 = r3.A0I
            r2.clear()
            X.7p0 r1 = r4.A02
            X.7p1 r0 = X.C342687p0.A0v
            java.lang.Object r0 = r1.A01(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            X.AnonymousClass8GA.A00(r3)
            X.8Gi r0 = r6.A0m
            r0.A06(r4)
            java.lang.Runnable r0 = r5.A02
            if (r0 == 0) goto L_0x0044
            r0.run()
            return
        L_0x054f:
            r0 = 0
            if (r8 != r1) goto L_0x0553
            r0 = 1
        L_0x0553:
            r7.A1c(r0)
            goto L_0x0526
        L_0x0557:
            boolean r0 = r1 instanceof X.C364288lB
            if (r0 == 0) goto L_0x0583
            r0 = r1
            X.8lB r0 = (X.C364288lB) r0
            X.8HF r3 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0M
            r2 = 1
            r0.set(r2)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.A0A = r0
            java.io.File r0 = r3.A04
            if (r0 != 0) goto L_0x0a67
            java.lang.String r1 = "GLBoomerangCaptureController"
            java.lang.String r0 = "File object is null at startBoomerangRecordingInternal()"
            X.0kD.A03(r1, r0)
            X.8Fz r2 = r3.A0H
            r1 = 0
            r0 = 0
            r2.A01(r0, r1, r1, r1)
            return
        L_0x0583:
            boolean r0 = r1 instanceof X.C364298lC
            if (r0 == 0) goto L_0x05c2
            r3 = r1
            X.8lC r3 = (X.C364298lC) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            X.8Rz r6 = r3.A00
            com.instagram.common.session.UserSession r5 = r6.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314326444935689(0x8103b000020a09, double:3.028664497608448E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x05af
            X.80D r0 = r6.A0F
            boolean r0 = r0.A3j
            if (r0 == 0) goto L_0x05c0
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x05c0
            X.8Fl r0 = r6.A0C
            boolean r0 = r0.A1W
            if (r0 == 0) goto L_0x05c0
        L_0x05af:
            r4 = 1
        L_0x05b0:
            X.81m r0 = r6.A0K
            X.81t r0 = r0.A00()
            boolean r1 = r3.A02
            r2 = 0
            boolean r5 = r3.A01
            r3 = r2
            r0.FMJ(r1, r2, r3, r4, r5)
            return
        L_0x05c0:
            r4 = 0
            goto L_0x05b0
        L_0x05c2:
            boolean r0 = r1 instanceof X.C364308lD
            if (r0 == 0) goto L_0x05d1
            r0 = r1
            X.8lD r0 = (X.C364308lD) r0
            X.Xoh r4 = (X.C21986Xoh) r4
            X.B2T r0 = r0.A00
            r0.DxC(r4)
            return
        L_0x05d1:
            boolean r0 = r1 instanceof X.C364318lE
            if (r0 == 0) goto L_0x0601
            r6 = r1
            X.8lE r6 = (X.C364318lE) r6
            X.7q6 r4 = (X.C343367q6) r4
            X.7lR r5 = r6.A01
            r5.A08 = r4
            r5.A05()
            X.7q6 r0 = r5.A08
            int r0 = r0.A01
            r5.A08(r0)
            X.81j r0 = r5.A0M
            X.7q6 r4 = r5.A08
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x05f3:
            if (r1 >= r2) goto L_0x0be2
            java.lang.Object r0 = r3.get(r1)
            X.7lN r0 = (X.C340507lN) r0
            r0.D5P(r4, r5)
            int r1 = r1 + 1
            goto L_0x05f3
        L_0x0601:
            boolean r0 = r1 instanceof X.C364618li
            if (r0 == 0) goto L_0x0614
            X.8li r1 = (X.C364618li) r1
            X.Xoh r4 = (X.C21986Xoh) r4
            X.7lR r0 = r1.A01
            X.C340547lR.A02(r0)
            X.B2T r0 = r1.A00
            r0.DxD(r4)
            return
        L_0x0614:
            boolean r0 = r1 instanceof X.C364328lF
            if (r0 == 0) goto L_0x0632
            r0 = r1
            X.8lF r0 = (X.C364328lF) r0
            android.graphics.SurfaceTexture r2 = r0.A00
            r2.release()
            X.7pS r0 = r0.A01
            X.7pQ r0 = r0.A00
            X.7lR r0 = r0.A02
            X.7lQ r1 = r0.A0R
            boolean r0 = r0.A0S
            X.7mF r0 = r1.A00(r0)
            r0.Dh8(r2)
            return
        L_0x0632:
            boolean r0 = r1 instanceof X.C364338lG
            if (r0 == 0) goto L_0x0642
            X.8lG r1 = (X.C364338lG) r1
            X.7q6 r4 = (X.C343367q6) r4
            X.7m3 r0 = r1.A02
            r0.A00 = r4
            X.8GD r0 = r1.A00
            goto L_0x00ba
        L_0x0642:
            boolean r0 = r1 instanceof X.C364348lH
            if (r0 == 0) goto L_0x0655
            r3 = r1
            X.8lH r3 = (X.C364348lH) r3
            X.7ls r2 = r3.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A00 = r0
            X.8GD r0 = r3.A01
            goto L_0x00ba
        L_0x0655:
            boolean r0 = r1 instanceof X.C364238l6
            if (r0 == 0) goto L_0x0662
            r0 = r1
            X.8l6 r0 = (X.C364238l6) r0
            X.7lp r1 = r0.A00
            r0 = 0
            r1.A0G = r0
            return
        L_0x0662:
            boolean r0 = r1 instanceof X.C364388lL
            if (r0 == 0) goto L_0x0683
            r3 = r1
            X.8lL r3 = (X.C364388lL) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r3.A00
            r1 = 1
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = r3.A01
            if (r2 != r1) goto L_0x0680
            r0.A02 = r4
        L_0x0674:
            X.7lX r0 = com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController.A00(r0)
            android.os.Handler r1 = r0.Aja()
            X.8GD r0 = r3.A02
            goto L_0x0446
        L_0x0680:
            r0.A03 = r4
            goto L_0x0674
        L_0x0683:
            boolean r0 = r1 instanceof X.C364398lM
            if (r0 == 0) goto L_0x0692
            r0 = r1
            X.8lM r0 = (X.C364398lM) r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.Jc1 r0 = r0.A00
            X.C59937Jc1.A00(r4, r0)
            return
        L_0x0692:
            boolean r0 = r1 instanceof X.C364408lN
            if (r0 == 0) goto L_0x06a2
            r0 = r1
            X.8lN r0 = (X.C364408lN) r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.JYD r1 = r0.A00
            r0 = 0
            X.JYD.A03(r4, r1, r0)
            return
        L_0x06a2:
            boolean r0 = r1 instanceof X.C364418lO
            if (r0 == 0) goto L_0x06b5
            r0 = r1
            X.8lO r0 = (X.C364418lO) r0
            X.81i r0 = r0.A00
            X.7l2 r1 = r0.A02
            if (r1 == 0) goto L_0x0044
            X.81l r0 = r0.A0I
            r1.A0O(r0)
            return
        L_0x06b5:
            boolean r0 = r1 instanceof X.C364428lP
            if (r0 == 0) goto L_0x06c6
            r0 = r1
            X.8lP r0 = (X.C364428lP) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.81i r0 = r0.A00
            X.81l r0 = r0.A0I
        L_0x06c2:
            r0.DKf(r4)
            return
        L_0x06c6:
            boolean r0 = r1 instanceof X.AnonymousClass8GW
            if (r0 == 0) goto L_0x06f6
            r0 = r1
            X.8GW r0 = (X.AnonymousClass8GW) r0
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            X.8GT r3 = r0.A00
            java.lang.String r0 = "easingCallback::success()"
            X.7l2 r2 = X.AnonymousClass8GT.A00(r3, r0)
            if (r2 == 0) goto L_0x0044
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0ad8
            r0 = 50
            X.AnonymousClass8GT.A02(r2, r3, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Ending easing at %f smooth zoom"
            X.0mp.A06(r0, r1)
            return
        L_0x06f6:
            boolean r0 = r1 instanceof X.C364438lQ
            if (r0 == 0) goto L_0x0705
            r0 = r1
            X.8lQ r0 = (X.C364438lQ) r0
            X.8Fr r1 = r0.A00
            boolean r0 = r1.A00
            X.C352948Fr.A01(r1, r0)
            return
        L_0x0705:
            boolean r0 = r1 instanceof X.C353138Gk
            if (r0 == 0) goto L_0x0724
            r0 = r1
            X.8Gk r0 = (X.C353138Gk) r0
            X.8Gi r1 = r0.A00
            X.8GA r0 = r1.A0K
            r0.A07()
            X.8Gh r0 = r1.A0J
            X.8Fl r0 = r0.A00
            boolean r0 = r0.A0I
            if (r0 != 0) goto L_0x0044
            X.7l2 r0 = r1.A01
            r0.getClass()
            r0.A0D()
            return
        L_0x0724:
            boolean r0 = r1 instanceof X.C364448lR
            if (r0 == 0) goto L_0x0735
            r0 = r1
            X.8lR r0 = (X.C364448lR) r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.8Fl r0 = r0.A00
            X.8Fe r0 = r0.A0E
            r0.A01(r4)
            return
        L_0x0735:
            boolean r0 = r1 instanceof X.C364458lS
            if (r0 == 0) goto L_0x074d
            r0 = r1
            X.8lS r0 = (X.C364458lS) r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.8Fs r2 = r0.A00
            X.0nO r1 = X.0nY.A00()
            X.9l0 r0 = new X.9l0
            r0.<init>(r4, r2)
            r1.ATE(r0)
            return
        L_0x074d:
            boolean r0 = r1 instanceof X.C364368lJ
            if (r0 == 0) goto L_0x0763
            X.8lJ r1 = (X.C364368lJ) r1
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8kL r2 = r1.A00
            X.8GJ r1 = r2.A01
            java.lang.Integer r0 = r2.A00
            X.AnonymousClass8GJ.A00(r4, r2, r1, r0)
            return
        L_0x0763:
            boolean r0 = r1 instanceof X.C364468lT
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C364478lU
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C364488lV
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C364498lW
            if (r0 == 0) goto L_0x077f
            X.8lW r1 = (X.C364498lW) r1
            X.7q6 r4 = (X.C343367q6) r4
            X.7l2 r0 = r1.A01
            r0.A02 = r4
            X.8GD r0 = r1.A00
            goto L_0x00ba
        L_0x077f:
            boolean r0 = r1 instanceof X.C364508lX
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C364518lY
            if (r0 == 0) goto L_0x078f
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Resumed concurrent front-back camera"
        L_0x078b:
            X.C340577lU.A01(r1, r0)
            return
        L_0x078f:
            boolean r0 = r1 instanceof X.C364528lZ
            if (r0 == 0) goto L_0x0798
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "onPause completed"
            goto L_0x078b
        L_0x0798:
            boolean r0 = r1 instanceof X.C364538la
            if (r0 == 0) goto L_0x07ad
            r3 = r1
            X.8la r3 = (X.C364538la) r3
            r2 = 0
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Auxiliary camera disconnected successfully"
            X.C340577lU.A01(r1, r0)
            X.8GD r0 = r3.A00
        L_0x07a9:
            r0.A02(r2)
            return
        L_0x07ad:
            boolean r0 = r1 instanceof X.C364548lb
            if (r0 == 0) goto L_0x07c5
            r3 = r1
            X.8lb r3 = (X.C364548lb) r3
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Main camera disconnected successfully"
            X.C340577lU.A01(r1, r0)
            X.7m6 r2 = r3.A01
            java.lang.String r1 = r3.A02
            X.8GD r0 = r3.A00
            X.C340957m6.A02(r0, r2, r1)
            return
        L_0x07c5:
            boolean r0 = r1 instanceof X.C364558lc
            if (r0 == 0) goto L_0x07d8
            r3 = r1
            X.8lc r3 = (X.C364558lc) r3
            r2 = 0
            X.7m6 r0 = r3.A01
            X.7lR r1 = r0.A0F
            r0 = 1
            r1.A0F(r0)
            X.8GD r0 = r3.A00
            goto L_0x07a9
        L_0x07d8:
            boolean r0 = r1 instanceof X.C364568ld
            if (r0 == 0) goto L_0x0890
            X.8ld r1 = (X.C364568ld) r1
            java.lang.String r2 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Disconnection completed successfully"
            X.C340577lU.A01(r2, r0)
            X.7m6 r0 = r1.A03
            X.7lR r7 = r0.A04
            if (r7 != 0) goto L_0x0849
            int r6 = r1.A00
            android.view.View r7 = r1.A01
            java.lang.String r3 = "Creating auxiliary instance"
            X.C340577lU.A01(r2, r3)
            X.7lR r5 = r0.A0F
            X.7lJ r4 = r5.A0O
            android.content.Context r8 = r4.getContext()
            if (r7 == 0) goto L_0x087b
            boolean r3 = r7 instanceof android.view.TextureView
            if (r3 == 0) goto L_0x0875
            X.7pQ r12 = new X.7pQ
            r12.<init>(r7, r4)
        L_0x0807:
            X.7lP r13 = r5.A0Q
            java.lang.String r15 = r5.A0D
            X.7l0 r9 = r5.A0L
            r4 = 1
            r16 = 1
            if (r6 != r4) goto L_0x0814
            r16 = 0
        L_0x0814:
            X.7kp r10 = r5.A04
            X.7kp r11 = r5.A05
            boolean r6 = r5.A0F
            X.7lQ r14 = r5.A0R
            r3 = 0
            X.7lR r7 = new X.7lR
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A0C = r7
            X.7km r4 = r5.A07
            if (r4 != 0) goto L_0x0831
            X.AUr r4 = new X.AUr
            r4.<init>()
        L_0x0831:
            r7.A0C(r4)
            X.7ko r5 = X.C340547lR.A00(r5)
            X.7ks r4 = X.C340167ko.A0T
            java.lang.Object r4 = r5.AXG(r4)
            X.7ko r4 = (X.C340167ko) r4
            r7.A06 = r4
            r0.A04 = r7
            X.7lJ r4 = r7.A0O
            r4.EpA(r3)
        L_0x0849:
            int r4 = r1.A00
            r3 = 1
            if (r4 != r3) goto L_0x086d
            X.7lR r12 = r0.A0F
            X.8FP r9 = r0.A0B
            X.8FP r10 = r0.A0A
        L_0x0854:
            X.9ds r11 = new X.9ds
            r11.<init>(r1)
            java.lang.String r1 = "Opening concurrent cameras"
            X.C340577lU.A01(r2, r1)
            X.7lX r2 = r12.A0N
            java.lang.String r1 = r0.A0G
            X.8lf r8 = new X.8lf
            r13 = r7
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.E10(r8, r1, r3)
            return
        L_0x086d:
            r12 = r7
            X.8FP r9 = r0.A0A
            X.7lR r7 = r0.A0F
            X.8FP r10 = r0.A0B
            goto L_0x0854
        L_0x0875:
            X.7lI r12 = new X.7lI
            r12.<init>(r7, r4)
            goto L_0x0807
        L_0x087b:
            X.AVB r12 = new X.AVB
            r12.<init>()
            r12.A02 = r8
            int r3 = r4.getWidth()
            r12.A01 = r3
            int r3 = r4.getHeight()
            r12.A00 = r3
            goto L_0x0807
        L_0x0890:
            boolean r0 = r1 instanceof X.C382549ds
            if (r0 == 0) goto L_0x08c2
            X.9ds r1 = (X.C382549ds) r1
            java.lang.String r5 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Opening concurrent cameras completed successfully"
            X.C340577lU.A01(r5, r0)
            X.8ld r0 = r1.A00
            X.7m6 r4 = r0.A03
            X.8GD r3 = r0.A02
            java.lang.String r0 = "Initialising and connecting concurrent cameras"
            X.C340577lU.A01(r5, r0)
            X.7lR r2 = r4.A0F
            r0 = 1
            X.AVD r1 = new X.AVD
            r1.<init>(r0, r3, r4)
            r1.hashCode()
            X.81j r0 = r2.A0M
            r0.A01(r1)
            java.lang.String r0 = "Calling onResume for the main camera"
            X.C340577lU.A01(r5, r0)
            r0 = 0
            r2.A0F(r0)
            return
        L_0x08c2:
            boolean r0 = r1 instanceof X.C364578le
            if (r0 == 0) goto L_0x08f9
            r3 = r1
            X.8le r3 = (X.C364578le) r3
            X.Xoh r4 = (X.C21986Xoh) r4
            X.9dw r0 = X.C21986Xoh.A0J
            java.lang.Integer r0 = r4.A00(r0)
            int r1 = r0.intValue()
            X.7m6 r2 = r3.A03
            int r0 = r2.A00
            if (r1 != r0) goto L_0x08f6
            r3.A01 = r4
        L_0x08dd:
            X.Xoh r0 = r3.A01
            if (r0 == 0) goto L_0x0044
            X.Xoh r1 = r2.A03
            if (r1 == 0) goto L_0x0044
            X.Xoh r0 = r3.A00
            if (r0 != 0) goto L_0x08ed
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0044
        L_0x08ed:
            X.B2T r0 = r3.A02
            r0.DxD(r1)
            r0 = 0
            r2.A03 = r0
            return
        L_0x08f6:
            r3.A00 = r4
            goto L_0x08dd
        L_0x08f9:
            boolean r0 = r1 instanceof X.C364588lf
            if (r0 == 0) goto L_0x0936
            r6 = r1
            X.8lf r6 = (X.C364588lf) r6
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Front camera opened successfully"
            X.C340577lU.A01(r1, r0)
            X.7m6 r5 = r6.A05
            X.7lR r0 = r5.A0F
            X.7lR r2 = r6.A04
            if (r0 != r2) goto L_0x0915
            int r0 = r4.A01
            r5.A00 = r0
        L_0x0915:
            X.7lX r1 = r2.A0N
            X.8FP r0 = r6.A01
            r1.A9c(r0)
            X.7l7 r0 = r5.A0C
            r1.A9d(r0)
            int r0 = r4.A01
            r2.A08(r0)
            X.7lR r0 = r6.A03
            X.7lX r3 = r0.A0N
            java.lang.String r2 = r5.A0G
            r1 = 0
            X.8lg r0 = new X.8lg
            r0.<init>(r4, r6)
            r3.E10(r0, r2, r1)
            return
        L_0x0936:
            boolean r0 = r1 instanceof X.C364598lg
            if (r0 == 0) goto L_0x097e
            r6 = r1
            X.8lg r6 = (X.C364598lg) r6
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.String r1 = "ConcurrentFrontBackController"
            java.lang.String r0 = "Back camera opened successfully"
            X.C340577lU.A01(r1, r0)
            X.8lf r5 = r6.A01
            X.7m6 r3 = r5.A05
            X.7lR r0 = r3.A0F
            X.7lR r2 = r5.A03
            if (r0 != r2) goto L_0x0954
            int r0 = r4.A01
            r3.A00 = r0
        L_0x0954:
            X.7lX r1 = r2.A0N
            X.8FP r0 = r5.A00
            r1.A9c(r0)
            X.7l7 r0 = r3.A0C
            r1.A9d(r0)
            int r0 = r4.A01
            r2.A08(r0)
            X.7q6 r0 = r6.A00
            int r2 = r0.A01
            X.7p0 r7 = r0.A02
            X.7p3 r1 = r0.A03
            boolean r0 = r0.A04
            X.7q6 r6 = new X.7q6
            r8 = r4
            r9 = r1
            r10 = r2
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            X.8GD r0 = r5.A02
            r0.A02(r6)
            return
        L_0x097e:
            boolean r0 = r1 instanceof X.C364608lh
            if (r0 == 0) goto L_0x0989
            r0 = r1
            X.8lh r0 = (X.C364608lh) r0
            X.8GD r0 = r0.A00
            goto L_0x00ba
        L_0x0989:
            boolean r0 = r1 instanceof X.C364628lj
            if (r0 == 0) goto L_0x0999
            X.8lj r1 = (X.C364628lj) r1
            X.7q6 r4 = (X.C343367q6) r4
            X.7m3 r0 = r1.A01
            r0.A00 = r4
            X.8GD r0 = r1.A00
            goto L_0x00ba
        L_0x0999:
            boolean r0 = r1 instanceof X.C364638lk
            if (r0 == 0) goto L_0x09aa
            r0 = r1
            X.8lk r0 = (X.C364638lk) r0
            X.7lW r2 = r0.A00
            X.8kg r1 = r0.A02
            X.8kj r0 = r0.A01
            r2.A0A(r0, r1)
            return
        L_0x09aa:
            boolean r0 = r1 instanceof X.C364648ll
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C382539dr
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C382579dv
            if (r0 == 0) goto L_0x09f2
            r2 = r1
            X.9dv r2 = (X.C382579dv) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0ae0;
                case 1: goto L_0x0cb6;
                case 2: goto L_0x0ca9;
                case 3: goto L_0x0bf4;
                default: goto L_0x09be;
            }
        L_0x09be:
            java.lang.Object r0 = r2.A01
            X.7l3 r0 = (X.C340307l3) r0
            boolean r3 = r0.CPy()
            java.lang.Object r0 = r2.A02
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            X.0qQ.A07(r2)
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131974863(0x7f135acf, float:1.9586802E38)
            if (r3 == 0) goto L_0x09ea
            r0 = 2131974847(0x7f135abf, float:1.958677E38)
        L_0x09ea:
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            return
        L_0x09f2:
            boolean r0 = r1 instanceof X.C382569du
            if (r0 == 0) goto L_0x0a2a
            r2 = r1
            X.9du r2 = (X.C382569du) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0cd6;
                case 1: goto L_0x09fe;
                case 2: goto L_0x09ff;
                case 3: goto L_0x0d0a;
                case 4: goto L_0x0d12;
                case 5: goto L_0x09fe;
                case 6: goto L_0x09fe;
                case 7: goto L_0x09fe;
                case 8: goto L_0x0af6;
                default: goto L_0x09fe;
            }
        L_0x09fe:
            return
        L_0x09ff:
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.Object r2 = r2.A01
            X.9Xs r2 = (X.C380369Xs) r2
            r2.A06 = r4
            r2.setCameraDeviceRotation(r4)
            android.content.Context r1 = r2.getContext()
            android.view.OrientationEventListener r0 = r2.A02
            if (r0 != 0) goto L_0x0a19
            X.9Xp r0 = new X.9Xp
            r0.<init>(r1, r2)
            r2.A02 = r0
        L_0x0a19:
            boolean r0 = r0.canDetectOrientation()
            if (r0 == 0) goto L_0x0a24
            android.view.OrientationEventListener r0 = r2.A02
            r0.enable()
        L_0x0a24:
            X.81l r0 = r2.A08
            if (r0 == 0) goto L_0x0044
            goto L_0x06c2
        L_0x0a2a:
            boolean r0 = r1 instanceof X.C364658lm
            if (r0 == 0) goto L_0x0a37
            r0 = r1
            X.8lm r0 = (X.C364658lm) r0
            X.7t8 r1 = r0.A00
            r0 = 0
            r1.A02 = r0
            return
        L_0x0a37:
            boolean r0 = r1 instanceof X.C364378lK
            if (r0 == 0) goto L_0x0b35
            r3 = r1
            X.8lK r3 = (X.C364378lK) r3
            X.7tP r0 = r3.A00
            X.7rD r2 = r0.A00
            java.lang.String r1 = "BasicPhotoCaptureCoordinator"
            int r0 = r3.hashCode()
            X.C363808kN.A01(r2, r1, r0)
            X.8GD r0 = r3.A01
            goto L_0x00ba
        L_0x0a4f:
            r2.EyH(r0)     // Catch:{ 8Fp -> 0x0a52 }
        L_0x0a52:
            X.8GA r0 = r3.A0C
            r0.A07()
            X.80U r1 = r3.A0D
            X.80V r0 = X.AnonymousClass80V.PHOTO_CAPTURING
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0044
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r3.A0F
            r0.A02()
            return
        L_0x0a67:
            X.7pN r1 = r3.A05
            r1.getClass()
            X.8HX r10 = r3.A07
            java.io.File r0 = r3.A04
            java.lang.String r13 = r0.getAbsolutePath()
            boolean r14 = r3.A0A
            java.lang.String r12 = r3.A0A
            int r5 = r3.A01
            int r4 = r3.A00
            X.8HJ r7 = r3.A0T
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.0qQ.A0B(r13, r2)
            r0 = 3
            X.0qQ.A0B(r12, r0)
            r0 = 6
            X.0qQ.A0B(r7, r0)
            X.7tO r0 = X.C342917pN.A00(r1)
            java.lang.Object r11 = X.C343747qj.A06
            X.7tN r0 = (X.C345367tN) r0
            X.7rl r3 = r0.A00
            if (r3 == 0) goto L_0x0044
            X.7rk r3 = (X.C344367rk) r3
            X.7rv r0 = r3.A03
            if (r0 == 0) goto L_0x0044
            X.AJ3 r0 = r3.A02
            if (r0 == 0) goto L_0x0aa6
            r3.AOr()
        L_0x0aa6:
            X.7r3 r1 = X.C343967r6.A00
            X.7qt r0 = r3.A00
            X.7r1 r9 = r0.Apf(r1)
            X.7r6 r9 = (X.C343967r6) r9
            X.A3M r8 = new X.A3M
            r8.<init>(r3)
            X.AJ3 r6 = new X.AJ3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.A02 = r6
            X.A3N r1 = r6.A0M
            X.7ti r0 = r3.A01
            X.8mf r2 = new X.8mf
            r2.<init>(r0, r1, r5, r4)
            r3.A00 = r2
            X.7rv r0 = r3.A03
            if (r0 == 0) goto L_0x0044
            android.os.Handler r1 = r0.getHandler()
            X.Alz r0 = new X.Alz
            r0.<init>(r2, r3)
            r1.post(r0)
            return
        L_0x0ad8:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            X.AnonymousClass8GT.A01(r2, r3, r4)
            return
        L_0x0ae0:
            r1 = 0
            java.lang.Object r0 = r2.A01
            X.9Xs r0 = (X.C380369Xs) r0
            r0.A06 = r1
            java.lang.Object r1 = r2.A02
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            r1.release()
            X.7mF r0 = r0.A0A
            if (r0 == 0) goto L_0x0044
            r0.Dh8(r1)
            return
        L_0x0af6:
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.Object r2 = r2.A01
            X.9qF r2 = (X.C389809qF) r2
            r1 = 1
            if (r4 == 0) goto L_0x0b32
            int r0 = r4.A01
            if (r0 != r1) goto L_0x0b32
            com.facebook.rsys.camera.gen.Camera r0 = com.facebook.rsys.camera.gen.Camera.FRONT_FACING_CAMERA
        L_0x0b05:
            java.lang.String r0 = r0.identifier
            r2.A01 = r0
            if (r4 == 0) goto L_0x0d24
            X.7p3 r1 = r4.A03
            if (r1 == 0) goto L_0x0d24
            X.7p4 r0 = X.C342717p3.A0q
            java.lang.Object r0 = r1.A02(r0)
            X.7pa r0 = (X.C343047pa) r0
            if (r0 == 0) goto L_0x0d24
            int r3 = r0.A01
            int r4 = r0.A02
            X.7l3 r0 = r2.A03
            boolean r7 = r0.CPy()
            X.L9N r2 = new X.L9N
            r5 = r3
            r6 = r4
            r2.<init>(r3, r4, r5, r6, r7)
            X.Vul r0 = X.C65819M0l.A0M
            if (r0 == 0) goto L_0x0044
            r0.A04(r2)
            return
        L_0x0b32:
            com.facebook.rsys.camera.gen.Camera r0 = com.facebook.rsys.camera.gen.Camera.BACK_FACING_CAMERA
            goto L_0x0b05
        L_0x0b35:
            boolean r0 = r1 instanceof X.C382559dt
            if (r0 == 0) goto L_0x0b45
            r0 = r1
            X.9dt r0 = (X.C382559dt) r0
            X.Xoh r4 = (X.C21986Xoh) r4
            X.7tv r6 = r0.A00
            java.lang.Object r5 = r6.A03
            monitor-enter(r5)
            goto L_0x0d2c
        L_0x0b45:
            boolean r0 = r1 instanceof X.C382529dq
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1 instanceof X.C382519dp
            if (r0 == 0) goto L_0x0b87
            r0 = r1
            X.9dp r0 = (X.C382519dp) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.7tx r1 = r0.A00
            r1.A0L = r4
            boolean r0 = r1.A0Q
            if (r0 != 0) goto L_0x0044
            X.7lX r0 = r1.A0e
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0044
            int r0 = r4.A01
            int r0 = X.AEA.A00(r0)
            r1.A00 = r0
            X.C345707tx.A06(r1, r4)
            java.lang.Float r0 = r1.A0M
            if (r0 == 0) goto L_0x0b7a
            float r0 = r0.floatValue()
            r1.A0B(r0)
        L_0x0b7a:
            X.81j r1 = r1.A01
            java.util.List r0 = r1.A00
            X.ALI.A09(r0)
            java.util.List r0 = r1.A00
            X.ALI.A08(r0)
            return
        L_0x0b87:
            boolean r0 = r1 instanceof X.C382509do
            if (r0 == 0) goto L_0x0d9b
            r0 = r1
            X.9do r0 = (X.C382509do) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.7tx r3 = r0.A00
            r3.A0L = r4
            X.7mB r1 = r3.A0E
            if (r1 == 0) goto L_0x0b9d
            X.7lX r0 = r3.A0e
            r0.A8O(r1)
        L_0x0b9d:
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0044
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "camera_connect_callback_started"
            X.C345707tx.A08(r3, r0)
            int r0 = r4.A01
            int r0 = X.AEA.A00(r0)
            r3.A00 = r0
            X.C345707tx.A06(r3, r4)
            X.7lX r2 = r3.A0e
            X.7m5 r0 = r3.A0G
            if (r0 != 0) goto L_0x0bc2
            X.AUf r0 = new X.AUf
            r0.<init>(r3)
            r3.A0G = r0
        L_0x0bc2:
            r2.EeX(r0)
            X.TcQ r0 = r3.A07
            if (r0 == 0) goto L_0x0d83
            goto L_0x0d74
        L_0x0bcb:
            int r1 = r1.A00
            X.8GD r0 = r0.A0C
            r2.A0K(r0, r1)
            return
        L_0x0bd3:
            X.7m5 r0 = r3.A00     // Catch:{ all -> 0x0bdf }
            if (r0 != r2) goto L_0x0bd9
            r3.A00 = r5     // Catch:{ all -> 0x0bdf }
        L_0x0bd9:
            monitor-exit(r1)     // Catch:{ all -> 0x0bdf }
            r4.A01 = r5
            r4.A02 = r5
            return
        L_0x0bdf:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0bdf }
            throw r2
        L_0x0be2:
            X.8GD r1 = r6.A00
            X.7q6 r0 = r5.A08
            r1.A02(r0)
            X.8l9 r3 = X.C364268l9.A00()
            long r1 = r3.A04
            r0 = 1
            X.C364268l9.A01(r3, r0, r1)
            return
        L_0x0bf4:
            java.lang.Object r5 = r2.A01
            X.9m8 r5 = (X.C387389m8) r5
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0M
            r8 = 1
            r0.set(r8)
            X.7l2 r0 = r5.A04
            r0.getClass()
            android.graphics.Rect r0 = r0.A0B()
            r5.A03 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r5.A0G = r0
            X.7l2 r1 = r5.A04
            X.7tb r0 = X.C340297l2.A02(r1)
            int r2 = r1.A07()
            r1 = 0
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            X.0Sd.A00(r0)
            X.7lX r0 = r0.A0N
            int r0 = r0.AF4(r2, r1)
            r5.A00 = r0
            android.graphics.Rect r0 = r5.A03
            int r0 = r0.width()
            r5.A02 = r0
            android.graphics.Rect r0 = r5.A03
            int r0 = r0.height()
            r5.A01 = r0
            com.instagram.common.session.UserSession r3 = r5.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310688607502577(0x810061000000f1, double:3.0263639145673525E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0ca1
            int r0 = r5.A02
            double r6 = (double) r0
            r3 = r6
            int r0 = r5.A01
            double r0 = (double) r0
        L_0x0c53:
            double r6 = r6 / r0
            r1 = 4603241769126068224(0x3fe2000000000000, double:0.5625)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0c5e
            double r3 = r3 / r1
            int r0 = (int) r3
            r5.A01 = r0
        L_0x0c5e:
            X.7l2 r0 = r5.A04
            int r12 = r0.A07()
            if (r12 == r8) goto L_0x0c67
            r8 = 0
        L_0x0c67:
            r5.A09 = r8
            java.io.File r0 = r5.A08
            r0.getClass()
            java.lang.String r8 = r0.getAbsolutePath()
            r7 = 0
            int r9 = r5.A02
            int r10 = r5.A01
            int r11 = r5.A00
            X.Xnz r6 = new X.Xnz
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Xoh r0 = new X.Xoh
            r0.<init>(r6)
            r5.A06 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.A0D = r0
            java.lang.String r4 = r5.A0G
            int r3 = r5.A02
            int r2 = r5.A01
            X.0eM r0 = r5.A0B
            java.lang.Object r1 = r0.getValue()
            X.0vF r1 = (X.AnonymousClass0vF) r1
            X.RAT r0 = new X.RAT
            r0.<init>(r5, r4, r3, r2)
            r1.ATE(r0)
            return
        L_0x0ca1:
            int r0 = r5.A01
            double r6 = (double) r0
            int r0 = r5.A02
            double r0 = (double) r0
            r3 = r0
            goto L_0x0c53
        L_0x0ca9:
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.Object r0 = r2.A01
            X.AXI r0 = (X.AXI) r0
            r0.A00 = r4
            java.lang.Object r1 = r2.A02
            X.8GD r1 = (X.AnonymousClass8GD) r1
            goto L_0x0cd2
        L_0x0cb6:
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.Object r0 = r2.A01
            X.AXI r0 = (X.AXI) r0
            r0.A00 = r4
            X.7p3 r1 = r4.A03
            X.7p4 r0 = X.C342717p3.A0q
            java.lang.Object r4 = r1.A02(r0)
            java.lang.Object r1 = r2.A02
            X.8GD r1 = (X.AnonymousClass8GD) r1
            if (r4 != 0) goto L_0x0cd2
            r0 = 0
            X.7pa r4 = new X.7pa
            r4.<init>(r0, r0)
        L_0x0cd2:
            r1.A02(r4)
            return
        L_0x0cd6:
            X.Xoh r4 = (X.C21986Xoh) r4
            java.lang.Object r2 = r2.A01
            X.7tv r2 = (X.C345687tv) r2
            java.lang.Object r5 = r2.A03
            monitor-enter(r5)
            java.lang.Integer r1 = r2.A05     // Catch:{ all -> 0x0d07 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0d07 }
            if (r1 != r0) goto L_0x0cf6
            X.B2M r3 = r2.A04     // Catch:{ all -> 0x0d07 }
            if (r3 == 0) goto L_0x0cf6
            X.A9S r1 = X.AEA.A02(r4)     // Catch:{ all -> 0x0d07 }
            boolean r0 = X.ALI.A0A()     // Catch:{ all -> 0x0d07 }
            if (r0 == 0) goto L_0x0cf8
            r3.Dc2(r1)     // Catch:{ all -> 0x0d07 }
        L_0x0cf6:
            monitor-exit(r5)     // Catch:{ all -> 0x0d07 }
            goto L_0x0d06
        L_0x0cf8:
            android.os.Handler r2 = X.ALI.A00()     // Catch:{ all -> 0x0d07 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}     // Catch:{ all -> 0x0d07 }
            r0 = 11
            X.AnonymousClass7TE.A1S(r2, r1, r0)     // Catch:{ all -> 0x0d07 }
            goto L_0x0cf6
        L_0x0d06:
            return
        L_0x0d07:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0d07 }
            throw r2
        L_0x0d0a:
            r1 = 0
            java.lang.Object r0 = r2.A01
            X.9Xs r0 = (X.C380369Xs) r0
            r0.A06 = r1
            return
        L_0x0d12:
            X.7q6 r4 = (X.C343367q6) r4
            java.lang.Object r2 = r2.A01
            X.9Xs r2 = (X.C380369Xs) r2
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            X.C380369Xs.A01(r4, r2, r1, r0)
            return
        L_0x0d24:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0d2c:
            java.lang.Integer r1 = r6.A05     // Catch:{ all -> 0x0d71 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0d71 }
            if (r1 != r0) goto L_0x0d60
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0d71 }
            r6.A05 = r0     // Catch:{ all -> 0x0d71 }
            X.81j r0 = r6.A02     // Catch:{ all -> 0x0d71 }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x0d71 }
            int r1 = r2.size()     // Catch:{ all -> 0x0d71 }
            r0 = 0
            if (r0 >= r1) goto L_0x0d4c
            r2.get(r0)     // Catch:{ all -> 0x0d71 }
            java.lang.String r1 = "onVideoCaptureEnded"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0d71 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d71 }
            throw r0     // Catch:{ all -> 0x0d71 }
        L_0x0d4c:
            X.B2M r3 = r6.A04     // Catch:{ all -> 0x0d71 }
            r0 = 0
            r6.A04 = r0     // Catch:{ all -> 0x0d71 }
            if (r3 == 0) goto L_0x0d60
            X.A9S r1 = X.AEA.A02(r4)     // Catch:{ all -> 0x0d71 }
            boolean r0 = X.ALI.A0A()     // Catch:{ all -> 0x0d71 }
            if (r0 == 0) goto L_0x0d62
            r3.Dbz(r1)     // Catch:{ all -> 0x0d71 }
        L_0x0d60:
            monitor-exit(r5)     // Catch:{ all -> 0x0d71 }
            goto L_0x0d70
        L_0x0d62:
            android.os.Handler r2 = X.ALI.A00()     // Catch:{ all -> 0x0d71 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}     // Catch:{ all -> 0x0d71 }
            r0 = 10
            X.AnonymousClass7TE.A1S(r2, r1, r0)     // Catch:{ all -> 0x0d71 }
            goto L_0x0d60
        L_0x0d70:
            return
        L_0x0d71:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0d71 }
            throw r2
        L_0x0d74:
            X.B17 r1 = r3.A0H     // Catch:{ 8Fp -> 0x0d83 }
            if (r1 != 0) goto L_0x0d80
            r0 = 0
            X.AUh r1 = new X.AUh     // Catch:{ 8Fp -> 0x0d83 }
            r1.<init>(r3, r0)     // Catch:{ 8Fp -> 0x0d83 }
            r3.A0H = r1     // Catch:{ 8Fp -> 0x0d83 }
        L_0x0d80:
            r2.A9a(r1)     // Catch:{ 8Fp -> 0x0d83 }
        L_0x0d83:
            java.lang.Float r0 = r3.A0M
            if (r0 == 0) goto L_0x0d8e
            float r0 = r0.floatValue()
            r3.A0B(r0)
        L_0x0d8e:
            X.81j r0 = r3.A01
            java.util.List r0 = r0.A00
            X.ALI.A08(r0)
            java.lang.String r0 = "camera_connect_callback_finished"
            X.C345707tx.A08(r3, r0)
            return
        L_0x0d9b:
            boolean r0 = r1 instanceof X.C382499dn
            if (r0 == 0) goto L_0x0dae
            r0 = r1
            X.9dn r0 = (X.C382499dn) r0
            X.7q6 r4 = (X.C343367q6) r4
            X.7tx r2 = r0.A00
            int r1 = r2.A04
            int r0 = r2.A03
            X.C345707tx.A07(r2, r4, r1, r0)
            return
        L_0x0dae:
            r0 = r1
            X.9dm r0 = (X.C382489dm) r0
            r1 = 0
            X.7tx r0 = r0.A00
            r0.A0L = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GD.A02(java.lang.Object):void");
    }
}
