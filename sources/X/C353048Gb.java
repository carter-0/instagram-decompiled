package X;

import android.content.Context;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.8Gb  reason: invalid class name and case insensitive filesystem */
public final class C353048Gb implements C353058Gc {
    public final /* synthetic */ C352888Fl A00;
    public final /* synthetic */ C3496481e A01;

    public final void Dmk(boolean z) {
        AnonymousClass8Ho r0;
        C3510387i r1;
        C353438Hq r7;
        C352888Fl r2 = this.A00;
        AnonymousClass8W6 r4 = r2.A0B;
        if (r4.A05.A08.A00 instanceof AnonymousClass80O) {
            r4.A0M.Dmj();
        } else {
            C352888Fl r12 = r4.A0B;
            if (r12.A0W() || r12.A18.A00().CVH()) {
                r4.A0K.A00().Dmk(false);
            }
        }
        C41832B2n b2n = r4.A0I.A01;
        AnonymousClass8Ho r72 = null;
        if (b2n != null) {
            r0 = b2n.BN9();
        } else {
            r0 = null;
        }
        if (r0 instanceof C353438Hq) {
            if (b2n != null) {
                r72 = b2n.BN9();
            }
            if ((r72 instanceof C353438Hq) && (r7 = (C353438Hq) r72) != null) {
                UserSession userSession = r7.A08;
                Context context = r7.A07;
                if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                    1pd.A00(C362988ir.A00()).A00(context, userSession, new C40616Afe(r7), "GlassesStoryViewListener_SEND_STREAM_STARTING_LIFECYCLE_EVENT_ON_VIDEO_START_CALLBACK");
                }
            }
        }
        AnonymousClass88F r13 = r4.A0N;
        if (r13 != null) {
            C369948va r02 = r13.A03;
            if (r02 != null) {
                r02.CLg();
            }
            r1 = r13.A0G;
        } else {
            r1 = r4.A06;
        }
        if (r1.A0B()) {
            r1.A0P.A05("start");
        }
        AnonymousClass8A1.A01(r2.A0f).A0E("recording_started");
    }

    public C353048Gb(C352888Fl r1, C3496481e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean CNh() {
        C352888Fl r2 = this.A00;
        AnonymousClass81C r1 = r2.A0u.A00;
        if (((C352568Dw) r1.A00()).Cc9()) {
            return r2.A1C.CQ0(AnonymousClass80V.VIDEO_LAYOUT_COMPLETE);
        }
        ((C352568Dw) r1.A00()).Dkg();
        return true;
    }

    public final void D0b(String str, String str2) {
        C352888Fl r3 = this.A00;
        String str3 = str;
        String str4 = str2;
        if (r3.A0g.A08.A00 == C363138jC.A00) {
            C59847JaN A002 = JW1.A00(r3.A0f);
            A002.A08 = A002.A0B.A06(str3, str4, 288428278, A002.A08);
        }
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(r3.A0f);
        A012.A05 = A012.A0K.A06(str3, str4, 17636574, A012.A05);
    }

    public final void Dke() {
        C340297l2 r0;
        Integer num;
        C352888Fl r3 = this.A00;
        if (r3.A1U && C352888Fl.A02(r3).booleanValue() && !AnonymousClass1GD.A03()) {
            ShutterButton shutterButton = r3.A1I;
            Context context = C60960kU.A00;
            shutterButton.setShutterButtonSingularColor(context.getColor(2Yu.A04(context)));
        }
        AnonymousClass8DD r02 = r3.A14;
        if (r02 != null) {
            AnonymousClass8DM r03 = r02.A0O;
            if (r03 != null) {
                r03.Dke();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        CameraConfiguration A06 = r3.A0g.A06();
        UserSession userSession = r3.A0f;
        if (C39908AIz.A06(A06)) {
            r3.A1I.setHandsFreeRecordingEnabled(false);
        }
        C343607qU r1 = r3.A0m.A03;
        if (r1 == null || (r0 = r3.A06) == null || !r0.CVP()) {
            27p.A01(userSession).A0f();
            return;
        }
        C340297l2 r04 = r3.A06;
        int i = r1.A00;
        C346567vO r32 = new C346567vO(this);
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) C340297l2.A02(r04);
        if (i == 1) {
            num = basicCameraOutputController.A02;
        } else {
            if (i == 0) {
                num = basicCameraOutputController.A03;
            }
            BasicCameraOutputController.A00(basicCameraOutputController).BXQ(new C364388lL(basicCameraOutputController, r32, i), i);
        }
        if (num != null) {
            BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Aja(), r32, num);
            return;
        }
        BasicCameraOutputController.A00(basicCameraOutputController).BXQ(new C364388lL(basicCameraOutputController, r32, i), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0370, code lost:
        r4 = r7.A00().A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        if (X.AnonymousClass38W.A00().A02(r6.A0A, r7) == false) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dmi(java.lang.String r28) {
        /*
            r27 = this;
            r1 = r27
            X.8Fl r0 = r1.A00
            X.8Gi r6 = r0.A0m
            X.81e r0 = r1.A01
            X.80R r0 = r0.A00
            X.28D r15 = r0.A01
            X.7l2 r0 = r6.A01
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r3 = r6.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322791825746341(0x810b63000629a5, double:3.034018038520457E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0026
            return
        L_0x0026:
            X.8Yz r5 = r6.A0I
            r4 = 1
            X.8aL r16 = X.C358088aL.A0M
            r3 = 0
            X.8aL[] r0 = new X.C358088aL[]{r16}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0044
            X.80m r0 = r5.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x0044
            boolean r0 = X.C353118Gi.A04(r6)
            if (r0 == 0) goto L_0x0052
        L_0x0044:
            android.app.Activity r0 = r6.A0A
            android.view.Window r1 = r0.getWindow()
            r1.getClass()
            r0 = 128(0x80, float:1.794E-43)
            r1.addFlags(r0)
        L_0x0052:
            X.8DD r0 = r6.A0Q
            if (r0 == 0) goto L_0x0086
            X.87G r0 = r0.A0D()
            if (r0 == 0) goto L_0x0086
            X.87I r1 = r0.A04
            X.87I r0 = X.AnonymousClass87I.DISCOVERY_SURFACE
            if (r1 != r0) goto L_0x0086
            X.8Gh r0 = r6.A0J
            X.8Fl r3 = r0.A00
            X.81e r0 = r3.A10
            X.80R r0 = r0.A00
            X.28D r2 = r0.A01
            X.28D r0 = X.28D.A2X
            r1 = 0
            if (r2 != r0) goto L_0x0072
            r1 = 1
        L_0x0072:
            X.86Y r0 = r3.A15
            if (r1 == 0) goto L_0x0082
            android.app.Activity r1 = r0.A00
            r0 = 60572(0xec9c, float:8.488E-41)
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0082:
            r0.A00(r4)
            return
        L_0x0086:
            com.instagram.common.session.UserSession r7 = r6.A0H
            X.8A2 r0 = X.AnonymousClass8A1.A01(r7)
            X.27r r1 = X.27p.A01(r7)
            X.283 r1 = r1.A04
            java.lang.String r1 = r1.A0L
            X.27r r2 = X.27p.A01(r7)
            X.283 r2 = r2.A04
            java.lang.String r13 = r2.A0K
            X.80m r2 = r5.A08
            java.lang.Object r8 = r2.A00
            X.4yO r8 = (X.C279284yO) r8
            java.lang.String r8 = r8.A02
            r24 = r8
            X.80m r10 = r5.A09
            java.lang.Object r12 = r10.A00
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.String r11 = ","
            X.Az3 r9 = X.C41712Az3.A00
            java.lang.String r8 = ""
            java.lang.String r23 = X.00k.A0P(r11, r8, r8, r12, r9)
            X.27r r8 = X.27p.A01(r7)
            java.lang.String r25 = r8.A0R()
            X.29E r8 = r0.A0K
            r17 = r8
            r14 = 0
            r20 = 17636574(0x10d1cde, float:2.591832E-38)
            r11 = 300000(0x493e0, double:1.482197E-318)
            r19 = r14
            r21 = r11
            r18 = r14
            long r8 = r17.A04(r18, r19, r20, r21)
            r0.A05 = r8
            java.lang.String r20 = "camera_destination"
            r21 = r24
            r22 = r4
            r18 = r8
            r17.A0B(r18, r20, r21, r22)
            long r8 = r0.A05
            java.lang.String r20 = "result_action_name"
            r21 = r28
            r18 = r8
            r17.A0B(r18, r20, r21, r22)
            long r8 = r0.A05
            java.lang.String r22 = "camera_tools"
            r19 = r17
            r20 = r8
            r24 = r3
            r19.A0B(r20, r22, r23, r24)
            if (r1 == 0) goto L_0x0107
            long r8 = r0.A05
            java.lang.String r20 = "camera_session_id"
            r18 = r8
            r21 = r1
            r22 = r4
            r17.A0B(r18, r20, r21, r22)
        L_0x0107:
            if (r13 == 0) goto L_0x0116
            long r8 = r0.A05
            java.lang.String r20 = "camera_precapture_session_id"
            r18 = r8
            r21 = r13
            r22 = r4
            r17.A0B(r18, r20, r21, r22)
        L_0x0116:
            if (r25 == 0) goto L_0x0125
            long r0 = r0.A05
            java.lang.String r24 = "transport_type"
            r21 = r17
            r22 = r0
            r26 = r4
            r21.A0B(r22, r24, r25, r26)
        L_0x0125:
            java.lang.Object r0 = r2.A00
            X.8jC r8 = X.C363138jC.A00
            if (r0 != r8) goto L_0x0145
            X.JaN r9 = X.JW1.A00(r7)
            X.29E r13 = r9.A0B
            r0 = 288428278(0x113110f6, float:1.3968065E-28)
            long r0 = r13.A03(r0, r11)
            r9.A08 = r0
            if (r15 == 0) goto L_0x0145
            java.lang.String r11 = r15.name()
            java.lang.String r9 = "entry_point"
            r13.A0A(r0, r9, r11)
        L_0x0145:
            X.1X9 r0 = X.1X9.A00
            if (r0 == 0) goto L_0x0156
            X.1X9 r1 = X.AnonymousClass38W.A00()
            android.app.Activity r0 = r6.A0A
            boolean r1 = r1.A02(r0, r7)
            r0 = 1
            if (r1 != 0) goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            java.lang.String r11 = "system_cancelled"
            if (r0 == 0) goto L_0x0166
            r6.A05()
            com.instagram.ui.widget.shutterbutton.ShutterButton r4 = r6.A0V
            java.lang.String r0 = "Active Video Call"
        L_0x0162:
            r4.A04(r11, r0)
            return
        L_0x0166:
            X.80x r0 = r6.A0U
            X.2Fj r0 = r0.A05
            java.lang.Object r0 = r0.A02()
            r0.getClass()
            X.80y r0 = (X.C3495880y) r0
            int r1 = r0.A01
            X.0yf r9 = r6.A0B
            java.lang.Object r0 = r2.A00
            java.lang.Object r9 = r9.get(r0)
            X.8G8 r9 = (X.AnonymousClass8G8) r9
            java.lang.Object r0 = r2.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0199
            X.8aL r12 = X.C358088aL.A0B
            X.8aL[] r0 = new X.C358088aL[]{r12}
            boolean r0 = r5.A0V(r0)
            if (r0 == 0) goto L_0x0199
            X.0yf r0 = r6.A0C
            java.lang.Object r9 = r0.get(r12)
            X.8G8 r9 = (X.AnonymousClass8G8) r9
        L_0x0199:
            if (r9 != 0) goto L_0x01cd
            java.lang.Object r0 = r10.A00
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r12 = r0.iterator()
        L_0x01a3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0218
            java.lang.Object r9 = r12.next()
            X.8Gh r0 = r6.A0J
            X.8Fl r10 = r0.A00
            boolean r0 = r10.A0W()
            if (r0 != 0) goto L_0x0211
            X.8E5 r0 = r10.A18
            X.8Zl r0 = r0.A00()
            boolean r0 = r0.CVH()
            if (r0 != 0) goto L_0x0211
            X.0yf r0 = r6.A0C
            java.lang.Object r9 = r0.get(r9)
            X.8G8 r9 = (X.AnonymousClass8G8) r9
        L_0x01cb:
            if (r9 == 0) goto L_0x01a3
        L_0x01cd:
            X.A3h r0 = new X.A3h
            r0.<init>(r6)
            X.A6C r10 = r9.Dy4(r0)
            int r1 = r10.A00
            if (r1 <= 0) goto L_0x021a
            r6.A05 = r9
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r6.A0V
            r0.setButtonActionsEnabled(r3)
            X.8A2 r11 = X.AnonymousClass8A1.A01(r7)
            java.lang.String r0 = "recording_wait_for_interceptor"
            r11.A0E(r0)
        L_0x01ea:
            X.80U r11 = r6.A0S
            X.8SJ r0 = new X.8SJ
            r0.<init>()
            r11.E3H(r0)
            X.85X r0 = r6.A0N
            r0.A0K = r4
            X.AnonymousClass85X.A06(r0)
            X.8E5 r0 = r6.A0R
            X.8Zl r0 = r0.A00()
            r0.Dmh()
            X.8AL r0 = r6.A0P
            android.view.View r0 = r0.A0J
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r3)
            r11 = 0
            goto L_0x022e
        L_0x0211:
            X.8E5 r0 = r6.A0R
            X.8Zl r9 = r0.A00()
            goto L_0x01cb
        L_0x0218:
            r10 = 0
            goto L_0x01ea
        L_0x021a:
            r6.A05 = r14
            com.instagram.ui.widget.shutterbutton.ShutterButton r4 = r6.A0V
            java.lang.String r3 = "Active Interceptor - "
            java.lang.String r2 = r9.getName()
            java.lang.String r1 = " "
            java.lang.String r0 = r10.A01
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)
            goto L_0x0162
        L_0x022e:
            X.7l2 r0 = r6.A01     // Catch:{ 8Fp -> 0x0242 }
            if (r0 == 0) goto L_0x0427
            boolean r0 = r0.CVP()     // Catch:{ 8Fp -> 0x0242 }
            if (r0 == 0) goto L_0x0427
            X.7l2 r0 = r6.A01     // Catch:{ 8Fp -> 0x0242 }
            int r0 = r0.A07()     // Catch:{ 8Fp -> 0x0242 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ 8Fp -> 0x0242 }
        L_0x0242:
            if (r11 == 0) goto L_0x0427
            int r11 = r11.intValue()
        L_0x0248:
            java.io.File r0 = X.LIM.A01(r7, r11)
            r6.A07 = r0
            r0.getPath()
            X.7l2 r0 = r6.A01
            if (r0 == 0) goto L_0x0265
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0265
            r0 = 0
            if (r11 != 0) goto L_0x025f
            r0 = 1
        L_0x025f:
            java.io.File r0 = X.LIM.A01(r7, r0)
            r6.A06 = r0
        L_0x0265:
            X.8GT r11 = r6.A0L
            if (r11 == 0) goto L_0x0283
            java.lang.String r0 = "resetStartZoomLevel()"
            X.7l2 r7 = X.AnonymousClass8GT.A00(r11, r0)
            if (r7 == 0) goto L_0x0283
            X.7p4 r0 = X.C342717p3.A11
            java.lang.Object r0 = X.C340297l2.A03(r0, r7)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            r11.A00 = r0
        L_0x0283:
            X.8aL[] r0 = new X.C358088aL[]{r16}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0293
            boolean r0 = X.C353118Gi.A04(r6)
            if (r0 == 0) goto L_0x02a4
        L_0x0293:
            boolean r0 = r6.A0X
            if (r0 == 0) goto L_0x02a4
            X.81w r7 = r6.A0M
            r7.getClass()
            r7.setEnabled(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            r7.EOX(r0)
        L_0x02a4:
            if (r9 != 0) goto L_0x0415
            X.8aL r0 = X.C358088aL.A0B
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r5.A0V(r0)
            if (r0 == 0) goto L_0x0410
            X.8Gh r0 = r6.A0J
            java.io.File r11 = r6.A07
            X.8Fl r7 = r0.A00
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r7.A1I
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A03(r0)
            X.8HG r10 = r7.A08
            r11.getClass()
            boolean r0 = r10 instanceof X.AnonymousClass8HF
            if (r0 == 0) goto L_0x03f3
            X.8HF r10 = (X.AnonymousClass8HF) r10
            X.80U r1 = r10.A08
            X.80b r0 = r10.A0K
            r1.A7z(r0)
            X.80b r0 = r10.A0J
            r1.A7w(r0)
            r10.A04 = r11
            X.7l2 r0 = r10.A04
            r0.getClass()
            int r0 = r0.A07()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A05 = r0
            java.lang.String r12 = "GLBoomerangCaptureController"
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = "startRecording() has null mCameraFacing"
            X.0kD.A03(r12, r0)
        L_0x02f0:
            X.7l2 r0 = r10.A04
            android.graphics.Rect r9 = r0.A0B()
            X.7l2 r1 = r10.A04
            X.7tb r0 = X.C340297l2.A02(r1)
            int r1 = r1.A07()
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            X.0Sd.A00(r0)
            X.7lX r0 = r0.A0N
            int r1 = r0.AF4(r1, r3)
            r0 = 90
            if (r1 == r0) goto L_0x03ec
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x03ec
            r1 = 1
            int r0 = r9.width()
        L_0x031a:
            r10.A01 = r0
            if (r1 == 0) goto L_0x03e6
            int r11 = r9.height()
        L_0x0322:
            r10.A00 = r11
            int r9 = r10.A01
            if (r9 == 0) goto L_0x03d6
            if (r11 == 0) goto L_0x03d6
            X.7l2 r9 = r10.A04
            X.8lB r1 = new X.8lB
            r1.<init>(r10)
        L_0x0331:
            boolean r0 = X.C340297l2.A06(r9)
            if (r0 == 0) goto L_0x0346
            X.7tb r0 = X.C340297l2.A02(r9)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x0346
            X.7lX r0 = r0.A0N
            r0.Cgd(r1, r4, r4, r4)
        L_0x0346:
            android.view.ViewGroup r0 = r7.A0T
            android.content.Context r0 = r0.getContext()
            X.0qQ.A0B(r0, r3)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x035c
            X.81w r0 = r7.A0s
            X.81v r0 = (X.C3497981v) r0
            r0.Eql(r3, r3)
        L_0x035c:
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r6.A0V
            X.5zl r0 = r1.A0i
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x03b0
            X.82W r7 = r6.A0G
            X.82X r0 = r7.A00()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A01()
            if (r0 == 0) goto L_0x03b0
            X.82X r0 = r7.A00()
            com.instagram.camera.effect.models.CameraAREffect r4 = r0.A01()
            java.lang.Integer r0 = r4.A09
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r0 == r3) goto L_0x0386
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x03b0
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x03b0
        L_0x0386:
            X.82X r0 = r7.A00()
            com.instagram.camera.effect.models.CameraAREffect r2 = r0.A01()
            java.lang.Integer r0 = r2.A09
            if (r0 != r3) goto L_0x03a7
            r0 = 4000(0xfa0, float:5.605E-42)
        L_0x0394:
            long r4 = (long) r0
            long r2 = r6.A09
            long r2 = java.lang.Math.min(r4, r2)
        L_0x039b:
            r1.A08 = r2
            X.846 r0 = r6.A0T
            X.7zw r0 = r0.A00()
            r0.A00()
            return
        L_0x03a7:
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x03ae
            int r0 = r2.A00
            goto L_0x0394
        L_0x03ae:
            r0 = 0
            goto L_0x0394
        L_0x03b0:
            java.lang.Object r0 = r2.A00
            if (r0 != r8) goto L_0x03b8
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L_0x039b
        L_0x03b8:
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x03d3
            X.8aL r0 = X.C358088aL.A0o
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x03d3
            long r2 = r6.A09
            goto L_0x039b
        L_0x03d3:
            r2 = 3000(0xbb8, double:1.482E-320)
            goto L_0x039b
        L_0x03d6:
            java.lang.String r1 = "recording: w or h == 0, w= "
            java.lang.String r0 = " h="
            java.lang.String r0 = X.002.A02(r9, r11, r1, r0)
            X.0kD.A03(r12, r0)
            r10.A08(r3)
            goto L_0x0346
        L_0x03e6:
            int r11 = r9.width()
            goto L_0x0322
        L_0x03ec:
            r1 = 0
            int r0 = r9.height()
            goto L_0x031a
        L_0x03f3:
            X.9m8 r10 = (X.C387389m8) r10
            X.80U r1 = r10.A08
            X.80b r0 = r10.A0K
            r1.A7z(r0)
            X.80b r0 = r10.A0J
            r1.A7w(r0)
            r10.A08 = r11
            X.7l2 r9 = r10.A04
            r9.getClass()
            r0 = 3
            X.9dv r1 = new X.9dv
            r1.<init>(r0, r11, r10)
            goto L_0x0331
        L_0x0410:
            X.C353118Gi.A01(r6)
            goto L_0x035c
        L_0x0415:
            if (r10 == 0) goto L_0x041e
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x041e
            X.C353118Gi.A01(r6)
        L_0x041e:
            int r0 = java.lang.Math.max(r4, r1)
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r6.A0V
            long r2 = (long) r0
            goto L_0x039b
        L_0x0427:
            r11 = 0
            goto L_0x0248
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353048Gb.Dmi(java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void DnV(int r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            X.8Fl r3 = r0.A00
            X.8Gi r5 = r3.A0m
            com.instagram.common.session.UserSession r4 = r5.A0H
            X.8A2 r0 = X.AnonymousClass8A1.A01(r4)
            r2 = 1
            X.29E r7 = r0.A0K
            long r9 = r0.A05
            java.lang.String r8 = "recording_stop_requested"
            r11 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r7.A0D(r8, r9, r11, r12, r13, r14)
            long r13 = r0.A05
            r8 = r19
            java.lang.String r16 = java.lang.String.valueOf(r8)
            java.lang.String r15 = "recorded_duration"
            r6 = 0
            r12 = r7
            r17 = r6
            r12.A0B(r13, r15, r16, r17)
            long r0 = r0.A05
            java.lang.String r15 = "stop_source"
            r16 = r20
            r13 = r0
            r12.A0B(r13, r15, r16, r17)
            android.app.Activity r0 = r5.A0A
            android.view.Window r1 = r0.getWindow()
            r1.getClass()
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r5.A0V
            r1.setButtonActionsEnabled(r2)
            X.8Yz r9 = r5.A0I
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r9.A06()
            boolean r0 = X.C39908AIz.A06(r0)
            if (r0 == 0) goto L_0x0057
            r1.setHandsFreeRecordingEnabled(r2)
        L_0x0057:
            X.8aL r10 = X.C358088aL.A0B
            X.8aL[] r0 = new X.C358088aL[]{r10}
            boolean r0 = r9.A0V(r0)
            if (r0 == 0) goto L_0x0066
            r1.setEnabled(r2)
        L_0x0066:
            X.8aL r0 = X.C358088aL.A0M
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r9.A0V(r0)
            if (r0 != 0) goto L_0x0078
            boolean r0 = X.C353118Gi.A04(r5)
            if (r0 == 0) goto L_0x0090
        L_0x0078:
            X.8GA r0 = r5.A0K
            r0.A09(r6)
            boolean r0 = r5.A0X
            if (r0 == 0) goto L_0x008e
            X.81w r1 = r5.A0M
            r1.getClass()
            r1.setEnabled(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.EOX(r0)
        L_0x008e:
            r5.A08 = r6
        L_0x0090:
            X.8G8 r0 = r5.A05
            if (r0 == 0) goto L_0x00d1
            java.lang.String r7 = r0.getName()
            r5.A05 = r11
            X.80U r1 = r5.A0S
            X.8Sb r0 = new X.8Sb
            r0.<init>()
            r1.E3H(r0)
            java.lang.String r0 = "Video Recording Stop - PendingVideoRecordingInterceptor "
            java.lang.String r7 = X.002.A0R(r0, r7)
            X.8A2 r1 = X.AnonymousClass8A1.A01(r4)
            java.lang.String r0 = X.C353118Gi.A00(r5)
            r1.A0M(r7, r0)
            X.80m r0 = r9.A08
            java.lang.Object r1 = r0.A00
            X.8jC r0 = X.C363138jC.A00
            if (r1 != r0) goto L_0x00c4
            X.JaN r0 = X.JW1.A00(r4)
            r0.A0C(r6, r7)
        L_0x00c4:
            X.8W6 r0 = r5.A04
            r0.A03()
        L_0x00c9:
            X.8W6 r0 = r3.A0B
            X.8Hl r0 = r0.A0I
            r0.A08(r2)
            return
        L_0x00d1:
            X.80m r7 = r9.A08
            java.lang.Object r1 = r7.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 == r0) goto L_0x00e3
            X.80U r1 = r5.A0S
            X.8Sa r0 = new X.8Sa
            r0.<init>(r8)
            r1.E3H(r0)
        L_0x00e3:
            X.8aL[] r0 = new X.C358088aL[]{r10}
            boolean r0 = r9.A0V(r0)
            if (r0 == 0) goto L_0x0128
            X.8Gh r0 = r5.A0J
            X.8Fl r1 = r0.A00
            X.8HG r8 = r1.A08
            r5 = r8
            boolean r0 = r8 instanceof X.AnonymousClass8HF
            if (r0 == 0) goto L_0x0113
            monitor-enter(r5)
            X.7pN r0 = r8.A05     // Catch:{ all -> 0x016f }
            r0.getClass()     // Catch:{ all -> 0x016f }
            X.7tO r0 = X.C342917pN.A00(r0)     // Catch:{ all -> 0x016f }
            X.7tN r0 = (X.C345367tN) r0     // Catch:{ all -> 0x016f }
            X.7rl r0 = r0.A00     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0145
            X.7rk r0 = (X.C344367rk) r0     // Catch:{ all -> 0x016f }
            X.AJ3 r0 = r0.A02     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0145
            r0.A0Y = r6     // Catch:{ all -> 0x016f }
            r0.A0I = r2     // Catch:{ all -> 0x016f }
            goto L_0x0145
        L_0x0113:
            X.9m8 r8 = (X.C387389m8) r8
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0M     // Catch:{ all -> 0x016f }
            int r0 = r0.get()     // Catch:{ all -> 0x016f }
            if (r0 != r2) goto L_0x0145
            int r0 = r8.A0C     // Catch:{ all -> 0x016f }
            r8.A0D = r0     // Catch:{ all -> 0x016f }
            r8.A0H = r2     // Catch:{ all -> 0x016f }
            X.C387389m8.A00(r8)     // Catch:{ all -> 0x016f }
            goto L_0x0145
        L_0x0128:
            X.8Gg r6 = r5.A0W
            android.hardware.SensorManager r0 = r6.A03
            X.C60240fb.A00(r6, r0)
            r0 = -1
            r6.A00 = r0
            X.7l2 r5 = r5.A01
            java.lang.String r1 = "IgCameraViewRecordingController"
            if (r5 != 0) goto L_0x013f
            java.lang.String r0 = "mCameraController was null when calling performStopVideoRecording()"
            X.0kD.A01(r1, r0)
            goto L_0x0160
        L_0x013f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A0R(r0)
            goto L_0x0160
        L_0x0145:
            monitor-exit(r5)
            boolean r0 = r1.A1S
            if (r0 == 0) goto L_0x0160
            android.view.ViewGroup r0 = r1.A0T
            android.content.Context r0 = r0.getContext()
            X.0qQ.A0B(r0, r6)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0160
            X.81w r0 = r1.A0s
            X.81v r0 = (X.C3497981v) r0
            r0.Eql(r2, r6)
        L_0x0160:
            java.lang.Object r1 = r7.A00
            X.8jC r0 = X.C363138jC.A00
            if (r1 != r0) goto L_0x00c9
            X.JaN r0 = X.JW1.A00(r4)
            r0.A0C(r2, r11)
            goto L_0x00c9
        L_0x016f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353048Gb.DnV(int, java.lang.String):void");
    }

    public final void Dy5(float f) {
        AnonymousClass8W6 r1 = this.A00.A0B;
        if (r1.A05.A08.A00 instanceof AnonymousClass80O) {
            r1.A0M.Dy5(f);
        }
    }
}
