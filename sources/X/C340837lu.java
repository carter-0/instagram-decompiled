package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7lu  reason: invalid class name and case insensitive filesystem */
public final class C340837lu {
    public static final Object A0U = new Object();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public Surface A06;
    public Surface A07;
    public C343187po A08;
    public C343297pz A09;
    public C342707p2 A0A;
    public C342737p5 A0B;
    public C340167ko A0C;
    public C341097mK A0D;
    public C341897nh A0E;
    public C342687p0 A0F;
    public boolean A0G;
    public MeteringRectangle[] A0H;
    public MeteringRectangle[] A0I;
    public final C340807lr A0J;
    public final C340857lw A0K = new C340867lx(this);
    public final C340857lw A0L = new C340847lv(this);
    public final C340887lz A0M = new C340887lz(new C340877ly(this));
    public final C3496981j A0N = new C3496981j();
    public final C3496981j A0O = new C3496981j();
    public final C340757lm A0P;
    public final List A0Q = new ArrayList();
    public volatile C341877nf A0R;
    public volatile boolean A0S;
    public volatile boolean A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (java.lang.Boolean.TRUE.equals(r2.A02(X.C342717p3.A03)) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (((java.lang.Number) r8.A0A.A02(r1)).intValue() != 1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C343297pz A00(X.C340837lu r8, java.lang.String r9, java.util.List r10, boolean r11) {
        /*
            r4 = r8
            X.7lr r1 = r8.A0J
            java.lang.String r0 = "Method createCaptureSession must be called on Optic Thread"
            r1.A01(r0)
            X.7p2 r0 = r8.A0A
            r3 = 1
            if (r0 == 0) goto L_0x0024
            X.7p4 r1 = X.C342717p3.A0e
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0024
            X.7p2 r0 = r8.A0A
            java.lang.Object r0 = r0.A02(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6 = 1
            if (r0 == r3) goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            X.7p2 r2 = r8.A0A
            if (r2 == 0) goto L_0x0038
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.7p4 r0 = X.C342717p3.A03
            java.lang.Object r0 = r2.A02(r0)
            boolean r0 = r1.equals(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            X.7lz r0 = r8.A0M
            r0.A03 = r3
            X.7lZ r2 = r0.A01
            r0 = 0
            r2.A02(r0)
            X.7lm r0 = r8.A0P
            X.7pw r3 = new X.7pw
            r5 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.A04(r9, r3)
            X.7pz r0 = (X.C343297pz) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340837lu.A00(X.7lu, java.lang.String, java.util.List, boolean):X.7pz");
    }

    public static boolean A03(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void A01(Rect rect, CaptureRequest.Builder builder, C342687p0 r4, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        if (Build.VERSION.SDK_INT >= 30 && ((Boolean) r4.A01(C342687p0.A0O)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f / 100.0f));
        } else if (((Boolean) r4.A01(C342687p0.A0f)).booleanValue()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (((Boolean) r4.A01(C342687p0.A0V)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (((Boolean) r4.A01(C342687p0.A0W)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    private boolean A02(int i) {
        CameraCharacteristics cameraCharacteristics = this.A00;
        cameraCharacteristics.getClass();
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r9 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        if (r2 != null) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C343297pz A04(X.C340857lw r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            X.7lr r5 = r10.A0J
            java.lang.String r0 = "Cannot start preview."
            r5.A00(r0)
            X.7po r1 = r10.A08
            r1.getClass()
            r7 = 1
            r1.A0H = r7
            r1.A08 = r11
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A0B = r0
            r0 = 0
            r1.A01 = r0
            X.7pz r0 = r10.A09
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r2 = 0
            if (r1 < r0) goto L_0x0107
            X.7p2 r0 = r10.A0A
            if (r0 == 0) goto L_0x0107
            X.7p4 r1 = X.C342717p3.A0v
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0107
            X.7p2 r0 = r10.A0A
            java.lang.Object r0 = r0.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L_0x0044:
            boolean r9 = r10.A0C()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            r8 = 0
            if (r9 == 0) goto L_0x0050
        L_0x004f:
            r8 = 1
        L_0x0050:
            java.lang.String r4 = "Cannot get output surfaces."
            r5.A00(r4)
            X.7mK r4 = r10.A0D
            if (r4 == 0) goto L_0x009b
            X.7nh r4 = r10.A0E
            if (r4 == 0) goto L_0x009b
            boolean r4 = r4.isARCoreEnabled()
            if (r4 == 0) goto L_0x009b
            X.7mK r1 = r10.A0D
            boolean r0 = r1.Cct()
            if (r0 == 0) goto L_0x0096
            android.view.Surface r0 = r1.getSurface()
            if (r0 == 0) goto L_0x0096
            X.7mK r0 = r10.A0D
            android.view.Surface r4 = r0.getSurface()
            r1 = 0
            X.7pv r0 = new X.7pv
            r0.<init>(r4, r1, r2)
            java.util.List r6 = java.util.Collections.singletonList(r0)
        L_0x0081:
            java.lang.String r0 = "start_preview_on_camera_handler_thread"
            X.7pz r0 = A00(r10, r0, r6, r8)
            r10.A09 = r0
            r10.A09(r12)
            java.lang.String r0 = "Preview session was closed while starting preview"
            r10.A0A(r13, r0)
            r10.A0S = r7
            X.7pz r0 = r10.A09
            return r0
        L_0x0096:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x0081
        L_0x009b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.view.Surface r5 = r10.A04
            if (r5 == 0) goto L_0x00ac
            X.7pv r4 = new X.7pv
            r4.<init>(r5, r9, r0)
            r6.add(r4)
        L_0x00ac:
            r4 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x00c6
            X.7ko r1 = r10.A0C
            if (r1 == 0) goto L_0x00c6
            X.7ks r0 = X.C340167ko.A0Q
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c6
            r4 = 2
        L_0x00c6:
            if (r12 == 0) goto L_0x00e7
            X.7mK r1 = r10.A0D
            if (r1 == 0) goto L_0x00e7
            boolean r0 = r1.Cct()
            if (r0 == 0) goto L_0x00e7
            android.view.Surface r0 = r1.getSurface()
            if (r0 == 0) goto L_0x00e7
            X.7mK r0 = r10.A0D
            android.view.Surface r9 = r0.getSurface()
            r1 = 0
            X.7pv r0 = new X.7pv
            r0.<init>(r9, r1, r2)
            r6.add(r0)
        L_0x00e7:
            android.view.Surface r2 = r10.A07
            if (r2 != 0) goto L_0x00fc
            android.view.Surface r2 = r10.A03
            if (r2 == 0) goto L_0x00f8
            r1 = 0
            X.7pv r0 = new X.7pv
            r0.<init>(r2, r1, r4)
            r6.add(r0)
        L_0x00f8:
            android.view.Surface r2 = r10.A05
            if (r2 == 0) goto L_0x0081
        L_0x00fc:
            r1 = 0
            X.7pv r0 = new X.7pv
            r0.<init>(r2, r1, r4)
            r6.add(r0)
            goto L_0x0081
        L_0x0107:
            r0 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340837lu.A04(X.7lw, boolean, boolean):X.7pz");
    }

    public final void A05() {
        this.A0J.A00("Cannot refresh camera preview.");
        try {
            A0A(false, (String) null);
        } catch (Exception unused) {
        }
    }

    public final void A06() {
        C346347v1 r1;
        this.A0J.A00("Cannot update frame metadata collection.");
        C342707p2 r12 = this.A0A;
        if (r12 != null && this.A0D != null && this.A08 != null) {
            Object A022 = r12.A02(C342717p3.A0U);
            A022.getClass();
            boolean booleanValue = ((Boolean) A022).booleanValue();
            C343187po r2 = this.A08;
            if (booleanValue) {
                r1 = this.A0D.B83();
                if (r2.A09 == null) {
                    r2.A09 = new C343567qQ();
                }
            } else {
                r1 = null;
            }
            r2.A0K = booleanValue;
            r2.A07 = r1;
        }
    }

    public final void A07(Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        CaptureRequest.Builder builder;
        C342687p0 r2;
        C340807lr r1 = this.A0J;
        r1.A01("Can only apply zoom on the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && (builder = this.A02) != null && (r2 = this.A0F) != null) {
            A01(rect, builder, r2, meteringRectangleArr, meteringRectangleArr2, f);
            if (this.A0S) {
                A05();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.view.Surface r11, X.C340677le r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            X.7lr r1 = r10.A0J
            java.lang.String r0 = "Cannot configure camera preview."
            r1.A00(r0)
            r10.A04 = r11
            r10.A0G = r13
            android.hardware.camera2.CameraDevice r1 = r10.A01
            r1.getClass()
            X.7nh r0 = r10.A0E
            r0.getClass()
            int r0 = r0.getPreviewTemplate()
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r0)
            r10.A02 = r1
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r10.A0I = r0
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r10.A0H = r0
            r9 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            if (r14 != 0) goto L_0x020f
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r3 = 0
            r6 = 1
            if (r8 < r0) goto L_0x0061
            X.7ko r1 = r10.A0C
            if (r1 == 0) goto L_0x02d4
            X.7ks r0 = X.C340167ko.A09
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02d4
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x005e:
            r2.set(r1, r0)
        L_0x0061:
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.set(r0, r5)
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r1.set(r0, r5)
            X.7ko r1 = r10.A0C
            r1.getClass()
            X.7ks r0 = X.C340167ko.A06
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0091
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.set(r1, r0)
        L_0x0091:
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r1.set(r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.set(r0, r3)
            X.7p5 r0 = r10.A0B
            if (r0 == 0) goto L_0x00c9
            r2 = 4
            boolean r0 = r10.A02(r2)
            if (r0 == 0) goto L_0x029e
            X.7p5 r9 = r10.A0B
            X.7p4 r1 = X.C342717p3.A0D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.7p7 r0 = r9.A00
            r0.A01(r1, r2)
            r9.A00()
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r2)
        L_0x00c9:
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.A02
            if (r0 == 0) goto L_0x02ee
            X.7p5 r0 = r10.A0B
            if (r0 == 0) goto L_0x02ee
            X.7p0 r1 = r10.A0F
            if (r1 == 0) goto L_0x00fa
            X.7p1 r0 = X.C342687p0.A0Q
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fa
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            r1.set(r0, r5)
            X.7p5 r9 = r10.A0B
            X.7p4 r2 = X.C342717p3.A0X
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.7p7 r0 = r9.A00
            r0.A01(r2, r1)
            r9.A00()
        L_0x00fa:
            X.7p0 r1 = r10.A0F
            if (r1 == 0) goto L_0x011f
            X.7p1 r0 = X.C342687p0.A0b
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011f
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r1.set(r0, r3)
            X.7p5 r2 = r10.A0B
            X.7p4 r1 = X.C342717p3.A0Z
            X.7p7 r0 = r2.A00
            r0.A01(r1, r4)
            r2.A00()
        L_0x011f:
            r0 = 33
            if (r8 < r0) goto L_0x0274
            X.7p0 r1 = r10.A0F
            if (r1 == 0) goto L_0x0274
            X.7p1 r0 = X.C342687p0.A0R
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0274
            X.7ko r1 = r10.A0C
            if (r1 == 0) goto L_0x0274
            X.7ks r0 = X.C340167ko.A08
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0274
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r0 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0150:
            r2.set(r1, r5)
            X.7p5 r4 = r10.A0B
            X.7p4 r2 = X.C342717p3.A0Y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.7p7 r0 = r4.A00
            r0.A01(r2, r1)
            r4.A00()
        L_0x0163:
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.A02
            if (r0 == 0) goto L_0x02e6
            X.7p0 r0 = r10.A0F
            if (r0 == 0) goto L_0x02e6
            X.7p5 r0 = r10.A0B
            if (r0 == 0) goto L_0x02e6
            X.7ko r1 = r10.A0C
            r1.getClass()
            X.7ks r0 = X.C340167ko.A0A
            java.lang.Object r2 = r1.AXG(r0)
            X.7kr r2 = (X.C340197kr) r2
            X.7p0 r1 = r10.A0F
            X.7p1 r0 = X.C342687p0.A12
            java.lang.Object r0 = r1.A01(r0)
            java.util.List r0 = (java.util.List) r0
            int[] r2 = r2.A00(r0)
            boolean r0 = A03(r0, r2)
            if (r0 == 0) goto L_0x01c8
            X.7p5 r4 = r10.A0B
            X.7p4 r1 = X.C342717p3.A0n
            X.7p7 r0 = r4.A00
            r0.A01(r1, r2)
            r4.A00()
            X.7p0 r1 = r10.A0F
            X.7p1 r0 = X.C342687p0.A0m
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            r0 = r2[r0]
            if (r1 == 0) goto L_0x0268
            int r0 = r0 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r6]
            int r0 = r0 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01bd:
            android.util.Range r2 = android.util.Range.create(r1, r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.set(r0, r2)
        L_0x01c8:
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.A02
            if (r0 == 0) goto L_0x02de
            X.7p0 r1 = r10.A0F
            if (r1 == 0) goto L_0x02de
            X.7p2 r0 = r10.A0A
            if (r0 == 0) goto L_0x02de
            X.7p1 r0 = X.C342687p0.A0F
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e9
            X.7p2 r1 = r10.A0A
            X.7p4 r0 = X.C342717p3.A0l
            r1.A02(r0)
        L_0x01e9:
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r1.set(r0, r3)
            X.7p0 r1 = r10.A0F
            r1.getClass()
            X.7p1 r0 = X.C342687p0.A0P
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x020f
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.set(r1, r0)
        L_0x020f:
            boolean r0 = r10.A0C()
            if (r0 == 0) goto L_0x021f
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            r1.getClass()
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r1.set(r0, r7)
        L_0x021f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 < r0) goto L_0x0256
            X.7p0 r1 = r10.A0F
            r1.getClass()
            X.7p1 r0 = X.C342687p0.A09
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0256
            X.7ko r1 = r10.A0C
            if (r1 == 0) goto L_0x0256
            X.7ks r0 = X.C340167ko.A0L
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0256
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.set(r1, r0)
        L_0x0256:
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.view.Surface r0 = r10.A04
            r1.addTarget(r0)
            X.7po r0 = r10.A08
            r0.getClass()
            r0.A03 = r12
            r10.A06()
            return
        L_0x0268:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01bd
        L_0x0274:
            X.7p0 r1 = r10.A0F
            if (r1 == 0) goto L_0x0163
            X.7p1 r0 = X.C342687p0.A0S
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0163
            X.7ko r1 = r10.A0C
            if (r1 == 0) goto L_0x0163
            X.7ks r0 = X.C340167ko.A07
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0163
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0150
        L_0x029e:
            boolean r0 = r10.A02(r9)
            if (r0 == 0) goto L_0x02b9
            X.7p5 r2 = r10.A0B
            X.7p4 r1 = X.C342717p3.A0D
            X.7p7 r0 = r2.A00
            r0.A01(r1, r7)
            r2.A00()
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r7)
            goto L_0x00c9
        L_0x02b9:
            boolean r0 = r10.A02(r6)
            if (r0 == 0) goto L_0x00c9
            X.7p5 r2 = r10.A0B
            X.7p4 r1 = X.C342717p3.A0D
            X.7p7 r0 = r2.A00
            r0.A01(r1, r5)
            r2.A00()
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r5)
            goto L_0x00c9
        L_0x02d4:
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x005e
        L_0x02de:
            java.lang.String r1 = "Cannot initialize custom capture settings, preview closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02e6:
            java.lang.String r1 = "Cannot initialize fps settings, preview closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02ee:
            java.lang.String r1 = "Cannot initialize stabilization settings, preview closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340837lu.A08(android.view.Surface, X.7le, boolean, boolean):void");
    }

    public final void A09(boolean z) {
        CaptureRequest.Builder builder;
        this.A0J.A00("Cannot update preview builder for CPU frames.");
        C341897nh r0 = this.A0E;
        boolean z2 = true;
        if (r0 != null && r0.isARCoreEnabled()) {
            z = true;
        }
        C341097mK r2 = this.A0D;
        if ((r2 == null || r2.Cct()) && (builder = this.A02) != null && r2 != null) {
            Surface surface = r2.getSurface();
            surface.getClass();
            if (z) {
                builder.addTarget(surface);
            } else {
                builder.removeTarget(surface);
                z2 = false;
            }
            this.A0T = z2;
        }
    }

    public final void A0A(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0J.A01("Method updatePreviewView must be invoked in the Optic background thread");
        C341897nh r0 = this.A0E;
        if (r0 == null || !r0.isCameraSessionActivated() || !this.A0E.isARCoreEnabled()) {
            synchronized (A0U) {
                C343297pz r3 = this.A09;
                if (r3 != null && (builder = this.A02) != null) {
                    r3.Eia(builder.build(), (Handler) null, this.A08);
                } else if (z) {
                    if (str == null) {
                        str = "Trying to update preview view while preview is closed";
                    }
                    throw new RuntimeException(str);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9uM, java.lang.Object] */
    public final void A0B(boolean z, boolean z2) {
        C340857lw r1;
        C340807lr r12 = this.A0J;
        r12.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            r12.A01("Can only check if the prepared on the Optic thread");
            if (r12.A00) {
                C343187po r2 = this.A08;
                if (!r2.A0J || r2.A0H != 1) {
                    if (z2) {
                        r1 = this.A0L;
                    } else {
                        r1 = this.A0K;
                    }
                    this.A09 = A04(r1, z, false);
                    return;
                }
                List list = this.A0Q;
                ? obj = new Object();
                obj.A00 = z;
                obj.A01 = z2;
                list.add(obj);
            }
        }
    }

    public final boolean A0C() {
        C342707p2 r2 = this.A0A;
        if (r2 == null || !Boolean.TRUE.equals(r2.A02(C342717p3.A0J))) {
            return false;
        }
        C341897nh r0 = this.A0E;
        if (r0 == null || !r0.isARCoreEnabled()) {
            return true;
        }
        return false;
    }

    public C340837lu(C340757lm r3) {
        this.A0P = r3;
        this.A0J = new C340807lr(r3);
    }
}
