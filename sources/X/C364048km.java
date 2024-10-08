package X;

import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.8km  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C364048km implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CameraManager A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C340787lp A05;
    public final /* synthetic */ C343187po A06;
    public final /* synthetic */ C341897nh A07;
    public final /* synthetic */ C364018kj A08;
    public final /* synthetic */ C363988kg A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ C364048km(CameraManager cameraManager, CaptureRequest.Builder builder, C340787lp r3, C343187po r4, C341897nh r5, C364018kj r6, C363988kg r7, Integer num, int i, int i2, int i3, boolean z) {
        this.A05 = r3;
        this.A09 = r7;
        this.A03 = cameraManager;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A0A = num;
        this.A04 = builder;
        this.A07 = r5;
        this.A0B = z;
        this.A06 = r4;
        this.A08 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009b, code lost:
        if (r5 != 1) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
        if (r5.A0C != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019b, code lost:
        if (r14 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a1, code lost:
        if (r18 == null) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05d7  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r36 = this;
            r1 = r36
            X.7lp r4 = r1.A05
            X.8kg r0 = r1.A09
            r35 = r0
            android.hardware.camera2.CameraManager r0 = r1.A03
            r34 = r0
            int r0 = r1.A00
            r33 = r0
            int r0 = r1.A01
            r24 = r0
            int r0 = r1.A02
            r32 = r0
            java.lang.Integer r0 = r1.A0A
            r20 = r0
            android.hardware.camera2.CaptureRequest$Builder r3 = r1.A04
            X.7nh r0 = r1.A07
            r23 = r0
            boolean r0 = r1.A0B
            r22 = r0
            X.7po r2 = r1.A06
            X.8kj r0 = r1.A08
            r31 = r0
            X.7p2 r1 = r4.A05
            r1.getClass()
            X.7p4 r0 = X.C342717p3.A0h
            java.lang.Object r0 = r1.A02(r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = 20
            r1 = 0
            X.C340577lU.A00(r0, r5, r1)
            X.7lr r8 = r4.A0C
            java.lang.String r0 = "Cannot capture photo, not prepared"
            r8.A00(r0)
            X.7lu r0 = r4.A02
            r10 = 0
            if (r0 == 0) goto L_0x0629
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x0629
            X.7lm r7 = r4.A0F
            X.7ln r0 = r4.A0E
            r30 = r0
            java.util.UUID r6 = r0.A03
            X.8ko r5 = new X.8ko
            r0 = r31
            r5.<init>(r0)
            r7.A05(r5, r6)
            X.7lu r0 = r4.A02
            X.7lr r5 = r0.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r5.A01(r0)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0081
            if (r22 == 0) goto L_0x0081
            X.7lu r0 = r4.A02
            r0.A09(r10)
            X.7lu r0 = r4.A02
            r0.A05()
        L_0x0081:
            X.7p2 r5 = r4.A05
            X.7p4 r0 = X.C342717p3.A0B
            java.lang.Object r0 = r5.A02(r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r9 = 2
            r0 = 1
            r16 = 1
            if (r5 == r9) goto L_0x009d
            r16 = 0
            r15 = 1
            if (r5 == r0) goto L_0x009e
        L_0x009d:
            r15 = 0
        L_0x009e:
            X.7p2 r6 = r4.A05
            X.7p4 r5 = X.C342717p3.A0D
            java.lang.Object r5 = r6.A02(r5)
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            int r6 = r5.intValue()
            X.7p2 r11 = r4.A05
            X.7p4 r5 = X.C342717p3.A0e
            java.lang.Object r5 = r11.A02(r5)
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            int r11 = r5.intValue()
            r5 = 0
            if (r6 != r0) goto L_0x00c4
            r5 = 1
        L_0x00c4:
            if (r16 != 0) goto L_0x033a
            if (r5 == 0) goto L_0x00d1
            X.7lt r5 = r4.A01
            r5.getClass()
            boolean r5 = r5.A0C
            if (r5 == 0) goto L_0x033a
        L_0x00d1:
            if (r11 == r0) goto L_0x00d9
            r5 = r33
            if (r5 != r0) goto L_0x0332
            if (r15 == 0) goto L_0x0166
        L_0x00d9:
            java.lang.String r5 = "Cannot run precapture sequence, not prepared"
            r8.A00(r5)
            if (r3 == 0) goto L_0x0619
            X.7p2 r5 = r4.A05
            if (r5 == 0) goto L_0x0619
            X.7p0 r5 = r4.A07
            if (r5 == 0) goto L_0x0619
            X.7lu r10 = r4.A02
            if (r10 == 0) goto L_0x0619
            X.7ou r5 = r4.A04
            if (r5 == 0) goto L_0x0619
            X.7lr r6 = r10.A0J
            java.lang.String r5 = "Cannot get camera operations callback."
            r6.A00(r5)
            X.7po r10 = r10.A08
            r11 = 0
            X.7p2 r6 = r4.A05
            X.7p0 r5 = r4.A07
            X.C343587qS.A01(r3, r6, r5, r11)
            X.7p2 r6 = r4.A05
            X.7p4 r5 = X.C342717p3.A09
            java.lang.Object r5 = r6.A02(r5)
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x011b
            X.7p2 r6 = r4.A05
            X.7p0 r5 = r4.A07
            X.C343587qS.A01(r3, r6, r5, r0)
        L_0x011b:
            X.7ou r5 = r4.A04
            int r5 = r5.A07()
            if (r5 != 0) goto L_0x012f
            X.7ou r5 = r4.A04
            float r6 = r5.A06()
            r5 = 1120403456(0x42c80000, float:100.0)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x014f
        L_0x012f:
            X.7ou r5 = r4.A04
            float r16 = r5.A06()
            X.7ou r11 = r4.A04
            android.graphics.Rect r6 = r11.A04
            android.hardware.camera2.params.MeteringRectangle[] r5 = r11.A0D
            android.hardware.camera2.params.MeteringRectangle[] r14 = X.C342627ou.A04(r11, r5)
            X.7ou r11 = r4.A04
            android.hardware.camera2.params.MeteringRectangle[] r5 = r11.A0C
            android.hardware.camera2.params.MeteringRectangle[] r15 = X.C342627ou.A04(r11, r5)
            X.7p0 r5 = r4.A07
            r11 = r6
            r12 = r3
            r13 = r5
            X.C340837lu.A01(r11, r12, r13, r14, r15, r16)
        L_0x014f:
            r10.getClass()
            r5 = 3
            r10.A0H = r5
            X.7lZ r11 = r10.A0F
            r5 = 3000(0xbb8, double:1.482E-320)
            r11.A02(r5)
            X.8u1 r6 = new X.8u1
            r6.<init>(r3, r4, r10)
            java.lang.String r5 = "run_precapture_sequence_on_camera_handler_thread"
            r7.A04(r5, r6)
        L_0x0166:
            java.lang.String r5 = "Cannot capture still picture, not prepared"
            r8.A00(r5)
            android.hardware.camera2.CameraDevice r6 = r4.A00
            r5 = 0
            if (r6 == 0) goto L_0x060f
            X.7p2 r6 = r4.A05
            if (r6 == 0) goto L_0x060f
            X.7pn r6 = r4.A08
            r19 = r6
            java.lang.String r6 = "Cannot get picture ImageReader, not prepared"
            r8.A00(r6)
            X.7pn r6 = r4.A08
            if (r6 == 0) goto L_0x032e
            android.view.Surface r18 = r6.getSurface()
        L_0x0185:
            boolean r12 = r4.A0B
            X.7pn r6 = r4.A0A
            r17 = r6
            java.lang.String r6 = "Cannot get YUV picture ImageReader, not prepared"
            r8.A00(r6)
            X.7pn r6 = r4.A0A
            if (r6 == 0) goto L_0x032b
            android.view.Surface r14 = r6.getSurface()
        L_0x0198:
            if (r17 == 0) goto L_0x019d
            r10 = 1
            if (r14 != 0) goto L_0x019e
        L_0x019d:
            r10 = 0
        L_0x019e:
            if (r19 == 0) goto L_0x01a3
            r6 = 1
            if (r18 != 0) goto L_0x01a4
        L_0x01a3:
            r6 = 0
        L_0x01a4:
            if (r12 == 0) goto L_0x0310
            if (r10 == 0) goto L_0x0312
        L_0x01a8:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            X.8kh r10 = X.C363988kg.A06
            r6 = r35
            java.lang.Object r6 = r6.A00(r10)
            boolean r16 = r11.equals(r6)
            X.7pn r6 = r4.A09
            if (r6 == 0) goto L_0x030c
            boolean r6 = r6.isEnabled()
            if (r6 == 0) goto L_0x030c
            java.lang.String r6 = "Cannot get raw picture ImageReader, not prepared"
            r8.A00(r6)
            X.7pn r6 = r4.A09
            if (r6 == 0) goto L_0x0309
            android.view.Surface r13 = r6.getSurface()
        L_0x01cd:
            X.7pn r6 = r4.A09
            r21 = r6
            boolean r6 = r6 instanceof X.C364078kp
            X.8kq r11 = new X.8kq
            r10 = r16
            r11.<init>(r6, r10)
            android.os.Handler r6 = r7.A02
            r10 = r6
            X.8kr r6 = r11.A04
            r15 = r10
            r10 = r21
            r10.E3x(r15, r6)
        L_0x01e5:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r12 != 0) goto L_0x0304
            r6 = r18
            r10.add(r6)
            r10.add(r13)
        L_0x01f4:
            java.lang.String r6 = "Cannot create still capture builder, not prepared"
            r8.A00(r6)
            if (r3 == 0) goto L_0x0607
            android.hardware.camera2.CameraDevice r13 = r4.A00
            if (r13 == 0) goto L_0x0607
            X.7ou r6 = r4.A04
            if (r6 == 0) goto L_0x0607
            X.7p2 r6 = r4.A05
            if (r6 == 0) goto L_0x0607
            X.7lu r6 = r4.A02
            if (r6 == 0) goto L_0x0607
            X.7p0 r6 = r4.A07
            if (r6 == 0) goto L_0x0607
            android.hardware.camera2.CaptureRequest$Builder r6 = r13.createCaptureRequest(r9)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r21 = java.lang.Integer.valueOf(r9)
            r13 = r21
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Object r13 = r3.get(r14)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r13 = r3.get(r14)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r13 = r3.get(r14)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Object r13 = r3.get(r14)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r13 = r3.get(r14)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Integer r13 = java.lang.Integer.valueOf(r24)
            r6.set(r14, r13)
            android.hardware.camera2.CaptureRequest$Key r14 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            if (r20 == 0) goto L_0x0300
            byte r13 = r20.byteValue()
        L_0x025c:
            java.lang.Byte r13 = java.lang.Byte.valueOf(r13)
            r6.set(r14, r13)
            X.7p2 r14 = r4.A05
            X.7p0 r13 = r4.A07
            X.C343587qS.A01(r6, r14, r13, r5)
            r15 = 3
            X.7p2 r14 = r4.A05
            X.7p0 r13 = r4.A07
            X.C343587qS.A01(r6, r14, r13, r15)
            r15 = 4
            X.7p2 r14 = r4.A05
            X.7p0 r13 = r4.A07
            X.C343587qS.A01(r6, r14, r13, r15)
            r15 = 7
            X.7p2 r14 = r4.A05
            X.7p0 r13 = r4.A07
            X.C343587qS.A01(r6, r14, r13, r15)
            X.7p2 r14 = r4.A05
            X.7p0 r13 = r4.A07
            X.C343587qS.A01(r6, r14, r13, r9)
            r14 = 6
            X.7p2 r13 = r4.A05
            X.7p0 r9 = r4.A07
            X.C343587qS.A01(r6, r13, r9, r14)
            r14 = 5
            X.7p2 r13 = r4.A05
            X.7p0 r9 = r4.A07
            X.C343587qS.A01(r6, r13, r9, r14)
            X.7p2 r13 = r4.A05
            X.7p4 r9 = X.C342717p3.A09
            java.lang.Object r9 = r13.A02(r9)
            r9.getClass()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == 0) goto L_0x02b3
            X.7p2 r13 = r4.A05
            X.7p0 r9 = r4.A07
            X.C343587qS.A01(r3, r13, r9, r0)
        L_0x02b3:
            X.7ou r9 = r4.A04
            int r9 = r9.A07()
            if (r9 != 0) goto L_0x02c7
            X.7ou r9 = r4.A04
            float r13 = r9.A06()
            r9 = 1120403456(0x42c80000, float:100.0)
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x02ea
        L_0x02c7:
            X.7ou r9 = r4.A04
            float r29 = r9.A06()
            X.7ou r13 = r4.A04
            android.graphics.Rect r14 = r13.A04
            android.hardware.camera2.params.MeteringRectangle[] r9 = r13.A0D
            android.hardware.camera2.params.MeteringRectangle[] r27 = X.C342627ou.A04(r13, r9)
            X.7ou r13 = r4.A04
            android.hardware.camera2.params.MeteringRectangle[] r9 = r13.A0C
            android.hardware.camera2.params.MeteringRectangle[] r28 = X.C342627ou.A04(r13, r9)
            X.7p0 r9 = r4.A07
            r24 = r14
            r25 = r6
            r26 = r9
            X.C340837lu.A01(r24, r25, r26, r27, r28, r29)
        L_0x02ea:
            java.util.Iterator r10 = r10.iterator()
        L_0x02ee:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x036e
            java.lang.Object r9 = r10.next()
            android.view.Surface r9 = (android.view.Surface) r9
            if (r9 == 0) goto L_0x02ee
            r6.addTarget(r9)
            goto L_0x02ee
        L_0x0300:
            r13 = 90
            goto L_0x025c
        L_0x0304:
            r10.add(r14)
            goto L_0x01f4
        L_0x0309:
            r13 = 0
            goto L_0x01cd
        L_0x030c:
            r13 = 0
            r11 = 0
            goto L_0x01e5
        L_0x0310:
            if (r6 != 0) goto L_0x01a8
        L_0x0312:
            r4.A0G = r5
            if (r12 == 0) goto L_0x0328
            java.lang.String r0 = "YUV"
        L_0x0318:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s ImageReader not setup before taking picture."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0328:
            java.lang.String r0 = "JPEG"
            goto L_0x0318
        L_0x032b:
            r14 = 0
            goto L_0x0198
        L_0x032e:
            r18 = 0
            goto L_0x0185
        L_0x0332:
            if (r15 != 0) goto L_0x00d9
            if (r16 == 0) goto L_0x0166
            if (r10 != 0) goto L_0x0166
            goto L_0x00d9
        L_0x033a:
            X.7lt r14 = r4.A01
            r14.getClass()
            X.7lu r5 = r4.A02
            X.7pz r13 = r5.A09
            X.7lr r6 = r14.A0A
            java.lang.String r5 = "Method lockFocusForCapture() must run on the Optic Background Thread."
            r6.A01(r5)
            if (r2 == 0) goto L_0x0621
            r2.A0H = r9
            X.7lZ r12 = r2.A0F
            r5 = 300(0x12c, double:1.48E-321)
            r12.A02(r5)
            X.7lm r12 = r14.A0B
            X.Asb r6 = new X.Asb
            r6.<init>(r3, r14, r2, r13)
            java.lang.String r5 = "lock_focus_for_capture_on_camera_handler_thread"
            r12.A04(r5, r6)
            java.lang.Integer r5 = r2.A0C
            if (r5 == 0) goto L_0x00d1
            int r5 = r5.intValue()
            if (r5 != r9) goto L_0x00d1
            r10 = 1
            goto L_0x00d1
        L_0x036e:
            android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r0)
            r9 = r20
            r6.set(r10, r9)
            X.7p0 r10 = r4.A07
            X.7p1 r9 = X.C342687p0.A0P
            java.lang.Object r9 = r10.A01(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0390
            android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r9 = r21
            r6.set(r10, r9)
        L_0x0390:
            X.7p0 r10 = r4.A07
            X.7p1 r9 = X.C342687p0.A0F
            r10.A01(r9)
            if (r12 != 0) goto L_0x0600
            r19.getClass()
        L_0x039c:
            r9 = r19
            boolean r10 = r9 instanceof X.C364078kp
            X.8kq r12 = new X.8kq
            r9 = r16
            r12.<init>(r10, r9)
            android.os.Handler r13 = r7.A02
            X.8kr r10 = r12.A04
            r9 = r19
            r9.E3x(r13, r10)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r9 = r31
            r10.<init>(r9)
            r12.A01 = r10
            X.8kt r10 = new X.8kt
            r10.<init>(r6, r4, r12)
            java.lang.String r9 = "capture_still_picture_on_camera_handler_thread"
            java.lang.Object r13 = r7.A04(r9, r10)
            X.8ku r13 = (X.C364128ku) r13
            if (r11 == 0) goto L_0x03d2
            X.Arj r10 = new X.Arj
            r10.<init>(r11)
            java.lang.String r9 = "process_still_picture_on_camera_handler_thread"
            r7.A04(r9, r10)
        L_0x03d2:
            r4.A0G = r5
            byte[] r14 = r13.A04
            X.8kR r9 = r13.A01
            r19 = r9
            if (r14 == 0) goto L_0x03df
            int r9 = r14.length
            if (r9 != 0) goto L_0x04aa
        L_0x03df:
            if (r19 != 0) goto L_0x04aa
            java.lang.String r6 = "Image data was null."
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            r6 = 22
            X.C340577lU.A00(r6, r5, r7)
            java.lang.String r6 = "Photo capture returned empty image data."
            X.7v2 r7 = new X.7v2
            r7.<init>(r6)
            r6 = r31
            r4.A01(r6, r7)
        L_0x03f9:
            X.8kh r7 = X.C363988kg.A08
            r6 = r35
            java.lang.Object r6 = r6.A00(r7)
            r6.getClass()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04a9
            java.lang.String r6 = "Cannot restore preview post capture, not prepared"
            r8.A00(r6)
            if (r23 == 0) goto L_0x04a9
            boolean r6 = r23.isCameraSessionActivated()
            if (r6 == 0) goto L_0x041f
            boolean r6 = r23.isARCoreEnabled()
            if (r6 != 0) goto L_0x04a9
        L_0x041f:
            X.7lu r8 = r4.A02
            if (r8 == 0) goto L_0x04a9
            X.7p0 r6 = r4.A07
            if (r6 == 0) goto L_0x04a9
            X.7p2 r6 = r4.A05
            if (r6 == 0) goto L_0x04a9
            X.7ou r6 = r4.A04
            if (r6 == 0) goto L_0x04a9
            X.7pz r7 = r8.A09
            if (r7 == 0) goto L_0x04a9
            if (r22 == 0) goto L_0x0438
            r8.A09(r0)
        L_0x0438:
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r6 = r21
            r3.set(r8, r6)
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r3.set(r8, r6)
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.set(r8, r6)
            X.7ou r6 = r4.A04
            float r14 = r6.A06()
            X.7ou r8 = r4.A04
            android.graphics.Rect r9 = r8.A04
            android.hardware.camera2.params.MeteringRectangle[] r6 = r8.A0D
            android.hardware.camera2.params.MeteringRectangle[] r12 = X.C342627ou.A04(r8, r6)
            X.7ou r8 = r4.A04
            android.hardware.camera2.params.MeteringRectangle[] r6 = r8.A0C
            android.hardware.camera2.params.MeteringRectangle[] r13 = X.C342627ou.A04(r8, r6)
            X.7p0 r6 = r4.A07
            r10 = r3
            r11 = r6
            X.C340837lu.A01(r9, r10, r11, r12, r13, r14)
            android.hardware.camera2.CameraDevice r6 = r4.A00
            r6.getClass()
            java.lang.String r13 = r6.getId()
            X.7p2 r8 = r4.A05
            X.7p0 r6 = r4.A07
            r9 = r34
            r11 = r8
            r12 = r6
            r14 = r5
            X.C343587qS.A00(r9, r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x0491
            X.7lu r6 = r4.A02
            X.7lw r6 = r6.A0L
            r2.A0H = r0
            r2.A08 = r6
            r0 = r20
            r2.A0B = r0
            r2.A01 = r1
        L_0x0491:
            android.hardware.camera2.CaptureRequest r0 = r3.build()
            r7.AGa(r0, r1, r1)
            r7.Eia(r0, r1, r2)
            X.7p2 r6 = r4.A05
            X.7p0 r0 = r4.A07
            X.C343587qS.A01(r3, r6, r0, r5)
            android.hardware.camera2.CaptureRequest r0 = r3.build()
            r7.Eia(r0, r1, r2)
        L_0x04a9:
            return r1
        L_0x04aa:
            java.lang.Integer r10 = r13.A03
            if (r10 == 0) goto L_0x05e7
            java.lang.Integer r9 = r13.A02
            if (r9 == 0) goto L_0x05e7
            int r11 = r10.intValue()
            int r9 = r9.intValue()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5, r5, r11, r9)
        L_0x04bf:
            X.7p2 r11 = r4.A05
            X.7p4 r9 = X.C342717p3.A0p
            java.lang.Object r15 = r11.A02(r9)
            r15.getClass()
            android.graphics.Rect r15 = (android.graphics.Rect) r15
            java.lang.Long r9 = r12.A00
            r18 = r9
            X.7qQ r12 = r12.A02
            int r9 = r12.A00
            int r9 = r9 + 3
            int r9 = r9 + -1
            int r11 = r9 % 3
            X.7qR[] r9 = r12.A01
            r12 = r9[r11]
            if (r12 == 0) goto L_0x05e1
            boolean r9 = r4.A0B
            if (r9 == 0) goto L_0x05de
            X.937 r9 = X.C343577qR.A0T
            java.lang.Object r11 = r12.A00(r9)
            java.lang.Number r11 = (java.lang.Number) r11
            if (r11 != 0) goto L_0x04f6
            android.hardware.camera2.CaptureRequest$Key r9 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r11 = r6.get(r9)
            java.lang.Number r11 = (java.lang.Number) r11
        L_0x04f6:
            if (r18 != 0) goto L_0x04fe
            X.937 r9 = X.C343577qR.A0K
            java.lang.Object r18 = r12.A00(r9)
        L_0x04fe:
            if (r11 == 0) goto L_0x05e1
            int r17 = r11.intValue()
        L_0x0504:
            r11 = r32
            r9 = r17
            X.C364148kw.A00(r10, r15, r11, r9)
            X.8kx r11 = new X.8kx
            r9 = r33
            r11.<init>(r10, r15, r5, r9)
            X.8kz r16 = X.C363858kS.A0d
            X.8kh r15 = X.C363988kg.A09
            r9 = r35
            java.lang.Object r15 = r9.A00(r15)
            r9 = r16
            r11.A01(r9, r15)
            X.8kz r15 = X.C363858kS.A0T
            r9 = r18
            r11.A01(r15, r9)
            int r13 = r13.A00
            r9 = 35
            if (r13 != r9) goto L_0x05d7
            X.8kz r13 = X.C363858kS.A0Y
            r9 = r19
            r11.A01(r13, r9)
        L_0x0535:
            if (r12 == 0) goto L_0x0586
            X.8kz r13 = X.C363858kS.A0Z
            X.937 r9 = X.C343577qR.A0R
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            X.8kz r13 = X.C363858kS.A0O
            X.937 r9 = X.C343577qR.A0F
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            X.8kz r13 = X.C363858kS.A0V
            X.937 r9 = X.C343577qR.A0M
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            X.8kz r13 = X.C363858kS.A0P
            X.937 r9 = X.C343577qR.A0G
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            X.8kz r13 = X.C363858kS.A0S
            X.937 r9 = X.C343577qR.A0J
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            X.8kz r13 = X.C363858kS.A0U
            X.937 r9 = X.C343577qR.A0L
            java.lang.Object r9 = r12.A00(r9)
            r11.A01(r13, r9)
            boolean r9 = r4.A0B
            if (r9 == 0) goto L_0x0586
            X.8kz r12 = X.C363858kS.A0a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r11.A01(r12, r9)
        L_0x0586:
            X.7ou r9 = r4.A04
            if (r9 == 0) goto L_0x0597
            X.8kz r12 = X.C363858kS.A0e
            int r9 = r9.A07()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.A01(r12, r9)
        L_0x0597:
            android.hardware.camera2.CaptureRequest$Key r9 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r6 = r6.get(r9)
            java.lang.Number r6 = (java.lang.Number) r6
            X.8kz r9 = X.C363858kS.A0c
            if (r6 == 0) goto L_0x05d5
            int r6 = r6.intValue()
            int r6 = X.C343027pY.A00(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x05af:
            r11.A01(r9, r6)
            int r9 = r10.width()
            int r6 = r10.height()
            int r9 = r9 * r6
            r6 = 21
            X.C340577lU.A00(r6, r9, r1)
            X.8kS r12 = new X.8kS
            r12.<init>(r11)
            r6 = r30
            java.util.UUID r10 = r6.A03
            X.8l0 r9 = new X.8l0
            r6 = r31
            r9.<init>(r6, r12)
            r7.A05(r9, r10)
            goto L_0x03f9
        L_0x05d5:
            r6 = 0
            goto L_0x05af
        L_0x05d7:
            X.8kz r9 = X.C363858kS.A0X
            r11.A01(r9, r14)
            goto L_0x0535
        L_0x05de:
            r11 = 0
            goto L_0x04f6
        L_0x05e1:
            int r17 = X.C364138kv.A00(r14)
            goto L_0x0504
        L_0x05e7:
            r14.getClass()
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
            r10.<init>()
            r10.inJustDecodeBounds = r0
            int r9 = r14.length
            X.0fP.A00(r14, r5, r9, r10)
            int r11 = r10.outWidth
            int r9 = r10.outHeight
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5, r5, r11, r9)
            goto L_0x04bf
        L_0x0600:
            r17.getClass()
            r19 = r17
            goto L_0x039c
        L_0x0607:
            java.lang.String r0 = "Trying to create capture settings after camera closed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x060f:
            r4.A0G = r5
            java.lang.String r0 = "Camera must be opened to capture still picture."
            X.7v2 r1 = new X.7v2
            r1.<init>(r0)
            throw r1
        L_0x0619:
            java.lang.String r1 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0621:
            java.lang.String r1 = "Preview closed while processing capture request."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        L_0x0629:
            r4.A0G = r10
            java.lang.String r1 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364048km.call():java.lang.Object");
    }
}
