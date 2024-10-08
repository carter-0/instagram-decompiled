package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.7lW  reason: invalid class name and case insensitive filesystem */
public final class C340597lW implements C340607lX {
    public static final Map A0t;
    public static volatile C340597lW A0u;
    public static volatile C340597lW A0v;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Matrix A04;
    public Rect A05;
    public CaptureRequest.Builder A06;
    public C342627ou A07;
    public C342707p2 A08;
    public C342737p5 A09;
    public C340167ko A0A;
    public C341097mK A0B;
    public C341897nh A0C;
    public C342687p0 A0D;
    public C343047pa A0E;
    public C342067nz A0F;
    public FutureTask A0G;
    public boolean A0H;
    public C343047pa A0I;
    public boolean A0J;
    public boolean A0K = true;
    public final int A0L;
    public final CameraManager A0M;
    public final C340617lY A0N = new C340627lZ();
    public final C340777lo A0O;
    public final C340827lt A0P;
    public final C340787lp A0Q;
    public final C340837lu A0R;
    public final C340817ls A0S;
    public final C340647lb A0T = new C340637la(this);
    public final C340667ld A0U = new C340657lc(this);
    public final C3496981j A0V = new C3496981j();
    public final C3496981j A0W = new C3496981j();
    public final C3496981j A0X = new C3496981j();
    public final C340767ln A0Y;
    public final C340757lm A0Z;
    public final Object A0a = new Object();
    public final Callable A0b = new C340747ll(this);
    public final Context A0c;
    public final C340707lh A0d = new C340697lg(this);
    public final C340737lk A0e = new C340727lj(this);
    public final C340677le A0f = new C340677le(this);
    public final C340687lf A0g = new C340687lf(this);
    public final C340717li A0h = new C340717li(this);
    public volatile int A0i;
    public volatile CameraDevice A0j;
    public volatile C343187po A0k;
    public volatile C341877nf A0l;
    public volatile C341047mF A0m;
    public volatile boolean A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public volatile boolean A0s;

    public final boolean CJf(int i) {
        try {
            return this.A0O.A07(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void CMz(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        Rect rect = this.A05;
        if (rect == null) {
            rect = (Rect) C342647ow.A00(this.A0M, this.A0O.A07(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A082 = A08();
        if (A082 == 90 || A082 == 270) {
            rect.getClass();
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A00 == 1) {
            f = -1.0f;
        }
        matrix2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A082 / 90);
        Matrix matrix3 = new Matrix();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A04 = matrix2;
    }

    public final boolean Ccx() {
        int i;
        C342617ot[] r0;
        try {
            C340777lo r2 = this.A0O;
            if (C340777lo.A04(r2)) {
                i = C340777lo.A06;
            } else {
                if (r2.A05 != null) {
                    r0 = r2.A05;
                } else {
                    r2.A02.A06("Number of cameras must be loaded on background thread.");
                    C340777lo.A02(r2);
                    r0 = r2.A05;
                    r0.getClass();
                }
                i = r0.length;
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void Cru() {
    }

    public final void E24(AnonymousClass8GD r1) {
    }

    public final void EJ6(AnonymousClass8GD r1) {
    }

    static {
        HashMap hashMap = new HashMap();
        A0t = hashMap;
        hashMap.put(0, 0);
        hashMap.put(1, 90);
        hashMap.put(2, 180);
        hashMap.put(3, 270);
    }

    public static void A00(C340597lW r6) {
        C341897nh r0;
        r6.A0Z.A06("Method closeCamera() must run on the Optic Background Thread.");
        C340817ls r5 = r6.A0S;
        if (r5.A0D && (!r6.A0s || r5.A0C)) {
            r5.A00();
        }
        A05(r6, false);
        C340827lt r2 = r6.A0P;
        r2.A0A.A02(false, "Failed to release PreviewController.");
        r2.A03 = null;
        r2.A01 = null;
        r2.A00 = null;
        r2.A07 = null;
        r2.A06 = null;
        r2.A05 = null;
        r2.A04 = null;
        r2.A02 = null;
        C340787lp r22 = r6.A0Q;
        r22.A0C.A02(false, "Failed to release PhotoCaptureController.");
        r22.A00 = null;
        r22.A07 = null;
        r22.A05 = null;
        r22.A03 = null;
        r22.A04 = null;
        r22.A02 = null;
        r22.A01 = null;
        r22.A06 = null;
        C343177pn r02 = r22.A08;
        if (r02 != null) {
            r02.release();
            r22.A08 = null;
        }
        C343177pn r03 = r22.A09;
        if (r03 != null) {
            r03.release();
            r22.A09 = null;
        }
        C343177pn r04 = r22.A0A;
        if (r04 != null) {
            r04.release();
            r22.A0A = null;
        }
        r5.A09.A02(false, "Failed to release VideoCaptureController.");
        r5.A0B = null;
        r5.A05 = null;
        r5.A03 = null;
        r5.A04 = null;
        r5.A02 = null;
        r5.A01 = null;
        if (r6.A0j != null) {
            C340617lY r23 = r6.A0N;
            r23.A00 = r6.A0j.getId();
            r23.A02(0);
            AnonymousClass0fK.A00(r6.A0j);
            r23.A00();
        }
        r6.A0R.A0Q.clear();
        if (!r6.A0s && (r0 = r6.A0C) != null) {
            r0.setUseArCoreIfSupported(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C340597lW r15) {
        /*
            X.7ou r4 = r15.A07
            if (r4 == 0) goto L_0x009e
            X.7p0 r1 = r15.A0D
            r1.getClass()
            X.7p2 r2 = r15.A08
            X.7p5 r0 = r15.A09
            android.graphics.Rect r3 = r15.A05
            r3.getClass()
            boolean r7 = r15.A0n
            r4.A08 = r1
            r4.A06 = r2
            r4.A07 = r0
            r4.A05 = r3
            int r6 = r3.width()
            int r5 = r3.height()
            r2 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r2, r6, r5)
            r4.A04 = r0
            if (r7 == 0) goto L_0x01e4
            java.util.HashSet r0 = X.C343077pd.A03
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 == 0) goto L_0x01e4
            r4.A0B = r2
            r0 = 1
            r4.A03 = r0
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x003f:
            r4.A09 = r0
            X.7p1 r0 = X.C342687p0.A1D
            java.lang.Object r0 = r1.A01(r0)
            java.util.List r0 = (java.util.List) r0
            r4.A0A = r0
            X.7p1 r0 = X.C342687p0.A0j
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A02 = r0
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = r3.width()
            int r0 = r3.height()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            float r2 = r2 / r0
            r4.A00 = r2
            r2 = 0
            int r0 = r4.A03
            float r1 = (float) r0
            int r0 = r4.A02
            float r0 = (float) r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = X.C342627ou.A01(r2, r1, r0, r5, r6)
            r4.A01 = r0
            X.7p5 r3 = r4.A07
            if (r3 == 0) goto L_0x009e
            int r0 = r4.A07()
            float r2 = (float) r0
            int r0 = r4.A03
            float r1 = (float) r0
            int r0 = r4.A02
            float r0 = (float) r0
            float r0 = X.C342627ou.A01(r2, r1, r0, r5, r6)
            X.7p4 r2 = X.C342717p3.A0t
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.7p7 r0 = r3.A00
            r0.A01(r2, r1)
            r3.A00()
        L_0x009e:
            X.7lt r14 = r15.A0P
            X.7pl r7 = new X.7pl
            r7.<init>(r15)
            android.hardware.camera2.CameraManager r6 = r15.A0M
            android.hardware.camera2.CameraDevice r5 = r15.A0j
            X.7p0 r4 = r15.A0D
            X.7p2 r3 = r15.A08
            X.7ou r2 = r15.A07
            X.7lu r13 = r15.A0R
            X.7lr r1 = r14.A0A
            java.lang.String r0 = "Can only prepare the FocusController on the Optic thread."
            r1.A01(r0)
            r14.A03 = r7
            r14.A01 = r6
            r14.A00 = r5
            r14.A07 = r4
            r14.A06 = r3
            r14.A05 = r2
            r14.A04 = r13
            r10 = 0
            r14.A0E = r10
            r5 = 1
            r14.A0D = r5
            java.lang.String r0 = "Failed to prepare FocusController."
            r1.A02(r5, r0)
            X.7ls r12 = r15.A0S
            android.hardware.camera2.CameraDevice r4 = r15.A0j
            X.7p0 r3 = r15.A0D
            X.7p2 r2 = r15.A08
            X.7ko r0 = r15.A0A
            X.7lr r1 = r12.A09
            java.lang.String r11 = "Can prepare only on the Optic thread"
            r1.A01(r11)
            r12.A0B = r4
            r12.A05 = r3
            r12.A03 = r2
            r12.A04 = r0
            r12.A02 = r13
            r12.A01 = r14
            java.lang.String r0 = "Failed to prepare VideoCaptureController."
            r1.A02(r5, r0)
            X.7lp r4 = r15.A0Q
            android.hardware.camera2.CameraDevice r9 = r15.A0j
            X.7p0 r8 = r15.A0D
            X.7p2 r7 = r15.A08
            int r3 = r15.A02
            X.7mF r2 = r15.A0m
            X.7ou r0 = r15.A07
            X.7ko r1 = r15.A0A
            X.7lr r6 = r4.A0C
            r6.A01(r11)
            r4.A00 = r9
            r4.A07 = r8
            r4.A05 = r7
            r4.A03 = r12
            r4.A04 = r0
            r4.A02 = r13
            r4.A01 = r14
            r4.A06 = r1
            if (r2 == 0) goto L_0x012c
            X.7pn r0 = r2.Bc6()
            r4.A08 = r0
            X.7pn r0 = r2.Bje()
            r4.A09 = r0
            X.7pn r0 = r2.CHY()
            r4.A0A = r0
        L_0x012c:
            r2 = 0
            r4.A0B = r10
            if (r1 == 0) goto L_0x01ab
            r8.getClass()
            X.7p1 r0 = X.C342687p0.A0d
            java.lang.Object r0 = r8.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0153
            X.7ko r1 = r4.A06
            X.7ks r0 = X.C340167ko.A0J
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0153
            r2 = 1
        L_0x0153:
            r4.A0B = r2
            X.7ko r1 = r4.A06
            X.7ks r0 = X.C340167ko.A05
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0169
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x01ab
        L_0x0169:
            r0 = 0
            r4.A08 = r0
        L_0x016c:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x018e
            X.7pn r0 = r4.A0A
            if (r0 != 0) goto L_0x017b
            X.8kp r0 = new X.8kp
            r0.<init>()
            r4.A0A = r0
        L_0x017b:
            int r0 = r0.BG6()
            X.7pa r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x018e
            X.7pn r2 = r4.A0A
            int r1 = r0.A02
            int r0 = r0.A01
            r2.CMQ(r1, r0, r3)
        L_0x018e:
            X.7pn r0 = r4.A09
            if (r0 == 0) goto L_0x01a5
            int r0 = r0.BG6()
            X.7pa r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x01a5
            X.7pn r2 = r4.A09
            int r1 = r0.A02
            int r0 = r0.A01
            r2.CMQ(r1, r0, r3)
        L_0x01a5:
            java.lang.String r0 = "Failed to prepare PhotoCaptureController."
            r6.A02(r5, r0)
            return
        L_0x01ab:
            X.7pn r0 = r4.A08
            if (r0 != 0) goto L_0x01d0
            r2 = 256(0x100, float:3.59E-43)
            X.7p2 r0 = r4.A05
            if (r0 == 0) goto L_0x01c9
            X.7p4 r1 = X.C342717p3.A0i
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x01c9
            X.7p2 r0 = r4.A05
            java.lang.Object r0 = r0.A02(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
        L_0x01c9:
            X.7pm r0 = new X.7pm
            r0.<init>(r2)
            r4.A08 = r0
        L_0x01d0:
            int r0 = r0.BG6()
            X.7pa r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x020a
            X.7pn r2 = r4.A08
            int r1 = r0.A02
            int r0 = r0.A01
            r2.CMQ(r1, r0, r3)
            goto L_0x016c
        L_0x01e4:
            X.7p1 r0 = X.C342687p0.A0O
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.A0B = r0
            X.7p1 r0 = X.C342687p0.A0l
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A03 = r0
            X.7p1 r0 = X.C342687p0.A1C
            java.lang.Object r0 = r1.A01(r0)
            java.util.List r0 = (java.util.List) r0
            goto L_0x003f
        L_0x020a:
            java.lang.String r1 = "Invalid picture size"
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A01(X.7lW):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013b, code lost:
        if (A07(r6) != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015c, code lost:
        if (r6.A0C.isARCoreEnabled() != false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C340597lW r21, java.lang.Float r22, java.lang.String r23) {
        /*
            r6 = r21
            X.7lm r0 = r6.A0Z
            r20 = r0
            java.lang.String r1 = "Method configureAndStartCameraPreview() must run on the Optic Background Thread."
            r0.A06(r1)
            android.hardware.camera2.CameraDevice r0 = r6.A0j
            if (r0 == 0) goto L_0x03ed
            X.7p0 r0 = r6.A0D
            if (r0 == 0) goto L_0x03ed
            X.7nz r0 = r6.A0F
            if (r0 == 0) goto L_0x03ed
            X.7mF r0 = r6.A0m
            if (r0 == 0) goto L_0x03e5
            X.7nh r0 = r6.A0C
            if (r0 == 0) goto L_0x03dd
            X.7ko r0 = r6.A0A
            if (r0 == 0) goto L_0x03d5
            X.7p2 r0 = r6.A08
            java.lang.String r14 = "Camera params need to be configured before invoking configureAndStartCameraPreview()"
            if (r0 == 0) goto L_0x03cf
            X.7p5 r0 = r6.A09
            if (r0 == 0) goto L_0x03cf
            X.7lu r5 = r6.A0R
            boolean r0 = r5.A0S
            r4 = 0
            if (r0 == 0) goto L_0x0037
            A05(r6, r4)
        L_0x0037:
            X.7mF r2 = r6.A0m
            java.util.List r1 = java.util.Collections.emptyList()
            X.7mK r13 = r6.A0B
            if (r13 == 0) goto L_0x0048
            java.util.List r1 = r13.BNB()
            r13.AHf()
        L_0x0048:
            if (r2 == 0) goto L_0x0052
            X.7ni r0 = X.C341097mK.A00
            java.lang.Object r13 = r2.BYV(r0)
            X.7mK r13 = (X.C341097mK) r13
        L_0x0052:
            if (r13 != 0) goto L_0x0059
            X.AUw r13 = new X.AUw
            r13.<init>()
        L_0x0059:
            r13.AHf()
            r13.A9C(r1)
            r6.A0B = r13
            android.hardware.camera2.CameraDevice r0 = r6.A0j
            r16 = r0
            X.7p2 r15 = r6.A08
            X.7p5 r12 = r6.A09
            X.7ko r11 = r6.A0A
            X.7p0 r10 = r6.A0D
            android.hardware.camera2.CameraManager r1 = r6.A0M
            r17 = r23
            r0 = r17
            android.hardware.camera2.CameraCharacteristics r9 = X.C342647ow.A00(r1, r0)
            X.7nh r8 = r6.A0C
            X.7lp r2 = r6.A0Q
            X.7lr r1 = r2.A0C
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r1.A00(r0)
            X.7pn r0 = r2.A08
            if (r0 == 0) goto L_0x03b6
            android.view.Surface r7 = r0.getSurface()
        L_0x008a:
            java.lang.String r0 = "Cannot get raw picture ImageReader, not prepared"
            r1.A00(r0)
            X.7pn r0 = r2.A09
            if (r0 == 0) goto L_0x03b3
            android.view.Surface r3 = r0.getSurface()
        L_0x0097:
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r1.A00(r0)
            X.7pn r0 = r2.A0A
            if (r0 == 0) goto L_0x03b0
            android.view.Surface r2 = r0.getSurface()
        L_0x00a4:
            X.7lr r1 = r5.A0J
            java.lang.String r0 = "Can only prepare on the Optic thread"
            r1.A01(r0)
            r0 = r16
            r5.A01 = r0
            r5.A0A = r15
            r5.A0B = r12
            r5.A0C = r11
            r5.A0F = r10
            r5.A00 = r9
            r5.A0E = r8
            r5.A0D = r13
            r5.A03 = r7
            r5.A05 = r3
            r5.A07 = r2
            X.7po r0 = new X.7po
            r0.<init>()
            r5.A08 = r0
            r0 = 1
            java.lang.String r2 = "Failed to prepare PreviewController."
            r1.A02(r0, r2)
            X.7nh r8 = r6.A0C
            android.hardware.camera2.CameraDevice r7 = r6.A0j
            X.7lo r3 = r6.A0O
            r2 = r17
            int r2 = r3.A06(r2)
            r8.createSession(r7, r2)
            int r8 = r6.A00
            X.7nz r2 = r6.A0F
            int r7 = r2.A01
            int r3 = r2.A00
            X.7pa r2 = new X.7pa
            r2.<init>(r7, r3)
            r6.A0I = r2
            X.7pa r10 = r6.A0E
            if (r10 != 0) goto L_0x00f7
            X.7pa r10 = new X.7pa
            r10.<init>(r4, r4)
        L_0x00f7:
            int r9 = r6.A02
            X.7p2 r7 = r6.A08
            X.7ko r3 = r6.A0A
            X.7p0 r2 = r6.A0D
            r15 = r13
            r16 = r3
            r17 = r2
            r18 = r7
            r19 = r10
            r21 = r9
            r15.CMi(r16, r17, r18, r19, r20, r21)
            r6.A09()
            X.7pa r2 = r6.A0E
            if (r2 == 0) goto L_0x03c9
            java.lang.String r9 = "startCameraPreview "
            int r7 = r2.A02
            java.lang.String r3 = "x"
            int r2 = r2.A01
            java.lang.String r3 = X.002.A02(r7, r2, r9, r3)
            r2 = 128920155(0x7af2a5b, float:2.6355968E-34)
            X.0fg.A01(r3, r2)
            X.7ko r3 = r6.A0A
            X.7ks r2 = X.C340167ko.A0C
            java.lang.Object r2 = r3.AXG(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x013d
            boolean r2 = A07(r6)
            r3 = 0
            if (r2 == 0) goto L_0x013e
        L_0x013d:
            r3 = 1
        L_0x013e:
            X.7p2 r7 = r6.A08
            X.7p4 r2 = X.C342717p3.A0J
            java.lang.Object r2 = r7.A02(r2)
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x015e
            boolean r2 = r6.A0n
            if (r2 != 0) goto L_0x015e
            X.7nh r2 = r6.A0C
            boolean r2 = r2.isARCoreEnabled()
            r9 = 1
            if (r2 == 0) goto L_0x015f
        L_0x015e:
            r9 = 0
        L_0x015f:
            X.7mF r10 = r6.A0m
            X.7pa r2 = r6.A0E
            int r11 = r2.A02
            int r12 = r2.A01
            X.7p2 r7 = r6.A08
            X.7p4 r2 = X.C342717p3.A0m
            java.lang.Object r2 = r7.A02(r2)
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r13 = r2.intValue()
            int r14 = r6.A02
            int r15 = r6.A0i
            int r7 = r6.A01
            if (r7 == r0) goto L_0x03ac
            r2 = 2
            if (r7 == r2) goto L_0x03a8
            r2 = 3
            r16 = 270(0x10e, float:3.78E-43)
            if (r7 == r2) goto L_0x018a
            r16 = 0
        L_0x018a:
            r18 = 0
            if (r9 == 0) goto L_0x0190
            r18 = 7
        L_0x0190:
            r17 = r8
            android.graphics.SurfaceTexture r8 = r10.C3H(r11, r12, r13, r14, r15, r16, r17, r18)
            r6.A0q = r0
            r6.A0r = r4
            X.7lt r9 = r6.A0P
            r9.A0C = r4
            if (r8 == 0) goto L_0x0393
            X.7pa r2 = r6.A0E
            int r4 = r2.A02
            int r2 = r2.A01
            r8.setDefaultBufferSize(r4, r2)
            X.7le r7 = r6.A0f
            X.7nh r2 = r5.A0E
            r2.getClass()
            android.view.Surface r4 = r2.getPreviewSurface(r8)
            X.7nh r2 = r5.A0E
            r2.getClass()
            boolean r2 = r2.isARCoreEnabled()
            r5.A08(r4, r7, r0, r2)
        L_0x01c0:
            X.7ou r7 = r6.A07
            if (r7 == 0) goto L_0x026e
            java.lang.String r2 = "Cannot get default AF regions."
            r1.A00(r2)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r5.A0I
            java.lang.String r2 = "Cannot get default AE regions."
            r1.A00(r2)
            android.hardware.camera2.params.MeteringRectangle[] r2 = r5.A0H
            r7.A0D = r4
            r7.A0C = r2
            if (r22 == 0) goto L_0x026e
            X.7ou r7 = r6.A07
            float r8 = r22.floatValue()
            r14 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r14
            java.util.List r12 = r7.A0A
            if (r12 == 0) goto L_0x0390
            java.util.List r11 = r7.A09
            if (r11 == 0) goto L_0x0390
            int r10 = r7.A03
            int r4 = r7.A02
            int r2 = r11.size()
            int r2 = r2 + -1
            java.lang.Object r2 = r11.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 / r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0340
            int r2 = r7.A03
        L_0x0204:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r2, r2)
        L_0x020d:
            java.lang.Object r2 = r10.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r12 = r2.intValue()
            java.lang.Object r2 = r10.second
            java.lang.Number r2 = (java.lang.Number) r2
            int r11 = r2.intValue()
            if (r11 < 0) goto L_0x0329
            java.util.List r2 = r7.A0A
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            float r13 = r2.floatValue()
            float r13 = r13 / r14
            java.util.List r2 = r7.A0A
            java.lang.Object r2 = r2.get(r12)
        L_0x0232:
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            float r10 = r10 / r14
            float r4 = (float) r12
            float r2 = (float) r11
            float r11 = X.C342627ou.A01(r8, r10, r13, r4, r2)
            int r2 = r7.A03
            float r10 = (float) r2
            int r2 = r7.A02
            float r8 = (float) r2
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = X.C342627ou.A01(r11, r10, r8, r4, r2)
        L_0x024d:
            boolean r2 = r7.A09(r2, r0)
            if (r2 == 0) goto L_0x026e
            X.7ou r2 = r6.A07
            float r10 = r2.A06()
            X.7ou r4 = r6.A07
            android.graphics.Rect r8 = r4.A04
            android.hardware.camera2.params.MeteringRectangle[] r2 = r4.A0D
            android.hardware.camera2.params.MeteringRectangle[] r7 = X.C342627ou.A04(r4, r2)
            X.7ou r4 = r6.A07
            android.hardware.camera2.params.MeteringRectangle[] r2 = r4.A0C
            android.hardware.camera2.params.MeteringRectangle[] r2 = X.C342627ou.A04(r4, r2)
            r5.A07(r8, r7, r2, r10)
        L_0x026e:
            java.lang.String r2 = "Cannot get preview request builder."
            r1.A00(r2)
            android.hardware.camera2.CaptureRequest$Builder r2 = r5.A02
            if (r2 == 0) goto L_0x03b9
            r6.A06 = r2
            java.lang.String r2 = "Cannot get camera operations callback."
            r1.A00(r2)
            X.7po r1 = r5.A08
            r6.A0k = r1
            X.7lw r1 = r5.A0L
            r5.A04(r1, r3, r0)
            X.7p2 r1 = r6.A08
            X.7p4 r0 = X.C342717p3.A0Q
            java.lang.Object r0 = r1.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a2
            X.7po r0 = r6.A0k
            r0.getClass()
            r9.A04(r0)
        L_0x02a2:
            X.7p0 r1 = r6.A0D
            X.7p1 r0 = X.C342687p0.A08
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L_0x0321
            X.7ko r1 = r6.A0A
            X.7ks r0 = X.C340167ko.A0M
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0321
            X.7po r0 = r6.A0k
            r0.getClass()
            X.7ko r1 = r6.A0A
            X.7ks r0 = X.C340167ko.A0O
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            X.7ko r1 = r6.A0A
            X.7ks r0 = X.C340167ko.A0P
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            X.7ko r1 = r6.A0A
            X.7ks r0 = X.C340167ko.A0N
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.C343187po.A0N = r4
            X.C343187po.A0M = r2
            X.C343187po.A0L = r0
            X.7po r1 = r6.A0k
            r1.getClass()
            X.7lh r0 = r6.A0d
            r1.A02 = r0
        L_0x0301:
            X.7p0 r1 = r6.A0D
            X.7p1 r0 = X.C342687p0.A09
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            X.7po r0 = r6.A0k
            r0.getClass()
            if (r1 == 0) goto L_0x0318
            X.7li r3 = r6.A0h
        L_0x0318:
            r0.A04 = r3
            r0 = -349533526(0xffffffffeb2a8aaa, float:-2.0617221E26)
            X.0fg.A00(r0)
            return
        L_0x0321:
            X.7po r0 = r6.A0k
            r0.getClass()
            r0.A02 = r3
            goto L_0x0301
        L_0x0329:
            java.util.List r4 = r7.A09
            int r2 = -r11
            java.lang.Object r2 = r4.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r13 = r2.floatValue()
            float r13 = r13 / r14
            java.util.List r4 = r7.A09
            int r2 = -r12
            java.lang.Object r2 = r4.get(r2)
            goto L_0x0232
        L_0x0340:
            java.lang.Object r2 = r12.get(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 / r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0353
            int r2 = r7.A02
            goto L_0x0204
        L_0x0353:
            if (r10 >= r4) goto L_0x0378
            if (r10 > 0) goto L_0x0369
            int r2 = -r10
            java.lang.Object r2 = r11.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 / r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0378
            if (r10 < 0) goto L_0x038d
        L_0x0369:
            java.lang.Object r2 = r12.get(r10)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 / r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x038d
        L_0x0378:
            int r2 = r7.A03
            if (r10 <= r2) goto L_0x037e
            int r2 = r10 + -1
        L_0x037e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r4, r2)
            goto L_0x020d
        L_0x038d:
            int r10 = r10 + 1
            goto L_0x0353
        L_0x0390:
            r2 = 0
            goto L_0x024d
        L_0x0393:
            X.7mF r2 = r6.A0m
            android.view.Surface r8 = r2.C3I()
            if (r8 == 0) goto L_0x03c1
            X.7nh r2 = r6.A0C
            boolean r7 = r2.isARCoreEnabled()
            X.7le r2 = r6.A0f
            r5.A08(r8, r2, r4, r7)
            goto L_0x01c0
        L_0x03a8:
            r16 = 180(0xb4, float:2.52E-43)
            goto L_0x018a
        L_0x03ac:
            r16 = 90
            goto L_0x018a
        L_0x03b0:
            r2 = 0
            goto L_0x00a4
        L_0x03b3:
            r3 = 0
            goto L_0x0097
        L_0x03b6:
            r7 = 0
            goto L_0x008a
        L_0x03b9:
            java.lang.String r1 = "Trying to get mPreviewRequestBuilder before configuring preview."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03c1:
            java.lang.String r1 = "SurfacePipeCoordinator unable to provide surface texture and surface."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        L_0x03c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L_0x03cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L_0x03d5:
            java.lang.String r1 = "StartupSettings must be provided to configure preview."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03dd:
            java.lang.String r1 = "PreviewSetupDelegate must be provided to configure preview."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        L_0x03e5:
            java.lang.String r1 = "SurfacePipeCoordinator must be provided to configure preview."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        L_0x03ed:
            java.lang.String r1 = "Camera must be opened to configure preview."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A02(X.7lW, java.lang.Float, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (((java.lang.Boolean) r1.AXG(X.C340167ko.A0M)).booleanValue() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        if (((java.lang.Boolean) r1.AXG(X.C340167ko.A00)).booleanValue() == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C340597lW r9, java.lang.String r10) {
        /*
            X.7lm r8 = r9.A0Z
            java.lang.String r0 = "Method openCamera() must run on the Optic Background Thread."
            r8.A06(r0)
            android.content.Context r7 = r9.A0c
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r7.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0149
            android.hardware.camera2.CameraDevice r0 = r9.A0j
            if (r0 == 0) goto L_0x0024
            android.hardware.camera2.CameraDevice r0 = r9.A0j
            java.lang.String r0 = r0.getId()
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0148
            A00(r9)
        L_0x0024:
            X.7lu r0 = r9.A0R
            java.util.List r0 = r0.A0Q
            r0.clear()
            android.hardware.camera2.CameraManager r2 = r9.A0M
            android.hardware.camera2.CameraCharacteristics r3 = X.C342647ow.A00(r2, r10)
            r4 = 0
            X.7ko r1 = r9.A0A
            if (r1 == 0) goto L_0x0058
            X.7ks r0 = X.C340167ko.A0M
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0054
            X.7ko r1 = r9.A0A
            X.7ks r0 = X.C340167ko.A00
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0058
        L_0x0054:
            android.hardware.camera2.CameraExtensionCharacteristics r4 = X.C39839ABl.A00(r2, r10)
        L_0x0058:
            X.7lb r1 = r9.A0T
            X.7ld r0 = r9.A0U
            X.7ox r2 = new X.7ox
            r2.<init>(r1, r0)
            X.7oy r6 = new X.7oy
            r6.<init>(r9, r2, r10)
            java.lang.String r5 = "open_camera_on_camera_handler_thread"
            monitor-enter(r8)
            java.util.UUID r0 = r8.A01     // Catch:{ all -> 0x0145 }
            r0.getClass()     // Catch:{ all -> 0x0145 }
            X.7o3 r1 = new X.7o3     // Catch:{ all -> 0x0145 }
            r1.<init>(r8, r5, r0, r6)     // Catch:{ all -> 0x0145 }
            android.os.Handler r0 = r8.A02     // Catch:{ all -> 0x0145 }
            r0.post(r1)     // Catch:{ all -> 0x0145 }
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            X.7lo r0 = r9.A0O
            int r0 = r0.A06(r10)
            r9.A00 = r0
            X.7oz r1 = new X.7oz
            r1.<init>(r7, r3, r4, r0)
            r9.A0D = r1
            if (r4 == 0) goto L_0x00e0
            X.7p1 r0 = X.C342687p0.A08
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
            X.7ko r1 = r9.A0A
            if (r1 == 0) goto L_0x00ab
            X.7ks r0 = X.C340167ko.A0M
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 1
            if (r0 != 0) goto L_0x00ac
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            X.7p0 r1 = r9.A0D
            r1.getClass()
            X.7p1 r0 = X.C342687p0.A07
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d2
            X.7ko r1 = r9.A0A
            if (r1 == 0) goto L_0x00d2
            X.7ks r0 = X.C340167ko.A00
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r5 != 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00e0
        L_0x00d7:
            X.7p0 r1 = r9.A0D
            X.7qV r0 = new X.7qV
            r0.<init>(r4, r1)
            r9.A0D = r0
        L_0x00e0:
            X.7p0 r0 = r9.A0D
            X.7p2 r1 = new X.7p2
            r1.<init>(r0)
            r9.A08 = r1
            X.7p5 r0 = new X.7p5
            r0.<init>(r1)
            r9.A09 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.getClass()
            int r0 = r0.intValue()
            r9.A02 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r0 = r3.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r9.A05 = r0
            r2.ADv()
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x013d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x013a
            android.hardware.camera2.CameraDevice r0 = r2.A00
            r0.getClass()
            r9.A0j = r0
            X.7nf r2 = r9.A0l
            if (r2 == 0) goto L_0x0148
            X.7ln r0 = r9.A0Y
            java.lang.String r1 = r0.A02()
            java.util.concurrent.CopyOnWriteArraySet r0 = r2.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0148
            X.7pX r0 = new X.7pX
            r0.<init>(r2, r1)
            X.C342057ny.A00(r0)
            return
        L_0x013a:
            X.7v2 r1 = r2.A01
            throw r1
        L_0x013d:
            java.lang.String r0 = "Open Camera operation hasn't completed yet."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0145:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0145 }
            throw r1
        L_0x0148:
            return
        L_0x0149:
            java.lang.String r0 = "Open Camera 2 failed: No camera permissions!"
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A03(X.7lW, java.lang.String):void");
    }

    public static void A04(C340597lW r5, String str, int i) {
        List list = r5.A0V.A00;
        UUID uuid = r5.A0Y.A03;
        C341877nf r1 = r5.A0l;
        if (r1 != null && !r1.A00.isEmpty()) {
            C342057ny.A00(new C40746Aic(r1));
        }
        r5.A0Z.A05(new C41199Apx(new C41515AvI(i, str), r5, list, uuid), uuid);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
    public static void A05(X.C340597lW r8, boolean r9) {
        /*
            X.7lm r5 = r8.A0Z
            java.lang.String r0 = "Method stopCameraPreview() must run on the Optic Background Thread."
            r5.A06(r0)
            java.lang.Object r7 = X.C340837lu.A0U
            monitor-enter(r7)
            X.7lu r2 = r8.A0R     // Catch:{ all -> 0x00ea }
            X.7lr r1 = r2.A0J     // Catch:{ all -> 0x00ea }
            r4 = 0
            java.lang.String r0 = "Failed to release PreviewController."
            r1.A02(r4, r0)     // Catch:{ all -> 0x00ea }
            r2.A0S = r4     // Catch:{ all -> 0x00ea }
            X.7mK r0 = r2.A0D     // Catch:{ all -> 0x00ea }
            r3 = 0
            if (r0 == 0) goto L_0x0020
            r0.release()     // Catch:{ all -> 0x00ea }
            r2.A0D = r3     // Catch:{ all -> 0x00ea }
        L_0x0020:
            X.7po r0 = r2.A08     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0028
            r0.A0J = r4     // Catch:{ all -> 0x00ea }
            r2.A08 = r3     // Catch:{ all -> 0x00ea }
        L_0x0028:
            if (r9 != 0) goto L_0x0034
            X.7nh r0 = r2.A0E     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0075
            boolean r0 = r0.isARCoreEnabled()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0075
        L_0x0034:
            java.lang.String r0 = "Method closeCameraSession must be called on Optic Thread."
            r1.A01(r0)     // Catch:{ Exception -> 0x0075 }
            X.7pz r0 = r2.A09     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.CSu()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x005c
        L_0x0043:
            X.7lz r1 = r2.A0M     // Catch:{ Exception -> 0x0075 }
            r0 = 2
            r1.A03 = r0     // Catch:{ Exception -> 0x0075 }
            X.7lZ r6 = r1.A01     // Catch:{ Exception -> 0x0075 }
            r0 = 0
            r6.A02(r0)     // Catch:{ Exception -> 0x0075 }
            X.7lm r6 = r2.A0P     // Catch:{ Exception -> 0x0075 }
            X.Arl r1 = new X.Arl     // Catch:{ Exception -> 0x0075 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "camera_session_close_on_camera_handler_thread"
            r6.A04(r0, r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0075
        L_0x005c:
            X.7lz r1 = r2.A0M     // Catch:{ Exception -> 0x0075 }
            r0 = 3
            r1.A03 = r0     // Catch:{ Exception -> 0x0075 }
            X.7lZ r6 = r1.A01     // Catch:{ Exception -> 0x0075 }
            r0 = 0
            r6.A02(r0)     // Catch:{ Exception -> 0x0075 }
            X.7lm r6 = r2.A0P     // Catch:{ Exception -> 0x0075 }
            X.Ark r1 = new X.Ark     // Catch:{ Exception -> 0x0075 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "camera_session_abort_capture_on_camera_handler_thread"
            r6.A04(r0, r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0043
        L_0x0075:
            X.7nh r0 = r2.A0E     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x007e
            r0.closeSession()     // Catch:{ all -> 0x00ea }
            r2.A0E = r3     // Catch:{ all -> 0x00ea }
        L_0x007e:
            android.view.Surface r1 = r2.A04     // Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x008b
            boolean r0 = r2.A0G     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0089
            r1.release()     // Catch:{ all -> 0x00ea }
        L_0x0089:
            r2.A04 = r3     // Catch:{ all -> 0x00ea }
        L_0x008b:
            X.7pz r0 = r2.A09     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ all -> 0x00ea }
            r2.A09 = r3     // Catch:{ all -> 0x00ea }
        L_0x0094:
            r2.A06 = r3     // Catch:{ all -> 0x00ea }
            r2.A02 = r3     // Catch:{ all -> 0x00ea }
            r2.A0I = r3     // Catch:{ all -> 0x00ea }
            r2.A0H = r3     // Catch:{ all -> 0x00ea }
            r2.A01 = r3     // Catch:{ all -> 0x00ea }
            r2.A0A = r3     // Catch:{ all -> 0x00ea }
            r2.A0B = r3     // Catch:{ all -> 0x00ea }
            r2.A0C = r3     // Catch:{ all -> 0x00ea }
            r2.A0F = r3     // Catch:{ all -> 0x00ea }
            r2.A00 = r3     // Catch:{ all -> 0x00ea }
            java.lang.Object r1 = r8.A0a     // Catch:{ all -> 0x00ea }
            monitor-enter(r1)     // Catch:{ all -> 0x00ea }
            java.util.concurrent.FutureTask r0 = r8.A0G     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00b4
            r5.A08(r0)     // Catch:{ all -> 0x00e7 }
            r8.A0G = r3     // Catch:{ all -> 0x00e7 }
        L_0x00b4:
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            r8.A0k = r3     // Catch:{ all -> 0x00ea }
            r8.A06 = r3     // Catch:{ all -> 0x00ea }
            r8.A0I = r3     // Catch:{ all -> 0x00ea }
            X.7lp r0 = r8.A0Q     // Catch:{ all -> 0x00ea }
            r0.A0G = r4     // Catch:{ all -> 0x00ea }
            monitor-exit(r7)     // Catch:{ all -> 0x00ea }
            X.7nf r1 = r2.A0R
            if (r1 == 0) goto L_0x00d4
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d4
            X.8ns r0 = new X.8ns
            r0.<init>(r1)
            X.C342057ny.A00(r0)
        L_0x00d4:
            X.81j r0 = r2.A0O
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e6
            X.Aia r0 = new X.Aia
            r0.<init>(r2)
            X.C342057ny.A00(r0)
        L_0x00e6:
            return
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ea }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A05(X.7lW, boolean):void");
    }

    private boolean A06() {
        C341897nh r0;
        C340167ko r1;
        C342687p0 r12 = this.A0D;
        if (r12 == null || !((Boolean) r12.A01(C342687p0.A0J)).booleanValue() || this.A0n || (((r0 = this.A0C) != null && r0.isARCoreEnabled()) || (r1 = this.A0A) == null || !((Boolean) r1.AXG(C340167ko.A0B)).booleanValue())) {
            return false;
        }
        return true;
    }

    public static boolean A07(C340597lW r1) {
        C341097mK r0 = r1.A0B;
        if (r0 == null || !r0.CK2()) {
            return false;
        }
        return true;
    }

    public final int A08() {
        Number number = (Number) A0t.get(Integer.valueOf(this.A01));
        if (number != null) {
            return ((this.A02 - number.intValue()) + 360) % 360;
        }
        throw new IllegalArgumentException(002.A0O("Invalid display rotation value: ", this.A01));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r2 == 180) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r2 == 180) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        r3 = r3 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (r2 == 90) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r4 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        r4 = (float) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r2 == 270) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        r4 = r4 - r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r13 = this;
            X.7pa r1 = r13.A0E
            if (r1 == 0) goto L_0x00cb
            X.7pa r0 = r13.A0I
            if (r0 == 0) goto L_0x00cb
            android.graphics.Rect r0 = r13.A05
            if (r0 == 0) goto L_0x00cb
            int r4 = r1.A02
            int r3 = r1.A01
            int r12 = r0.width()
            android.graphics.Rect r0 = r13.A05
            int r9 = r0.height()
            int r2 = r13.A08()
            X.7pa r0 = r13.A0E
            X.7pa r10 = r13.A0I
            int r8 = r0.A02
            int r6 = r0.A01
            int r7 = r8 - r6
            int r5 = r10.A02
            int r1 = r10.A01
            int r0 = r5 - r1
            int r7 = r7 * r0
            if (r7 >= 0) goto L_0x0036
            X.7pa r10 = new X.7pa
            r10.<init>(r1, r5)
        L_0x0036:
            float r7 = (float) r8
            int r0 = r10.A01
            float r5 = (float) r0
            int r0 = r10.A02
            float r1 = (float) r0
            float r0 = r5 / r1
            float r7 = r7 * r0
            int r0 = (int) r7
            if (r0 > r6) goto L_0x00c0
            X.7pa r1 = new X.7pa
            r1.<init>(r8, r0)
        L_0x0048:
            int r0 = r1.A02
            int r0 = r4 - r0
            int r6 = r0 / 2
            int r0 = r1.A01
            int r0 = r3 - r0
            int r5 = r0 / 2
            int r1 = r13.A00
            r0 = 1
            r8 = 180(0xb4, float:2.52E-43)
            r11 = 270(0x10e, float:3.78E-43)
            r10 = 90
            if (r1 != r0) goto L_0x008a
            if (r2 == r10) goto L_0x00af
            if (r2 == r11) goto L_0x00af
            float r1 = (float) r4
            float r0 = (float) r12
            float r1 = r1 / r0
            int r0 = -r3
            float r7 = (float) r0
            float r0 = (float) r9
            float r7 = r7 / r0
            int r0 = -r6
            if (r2 != r8) goto L_0x006f
            int r0 = r4 - r6
        L_0x006f:
            float r9 = (float) r0
            if (r2 != r8) goto L_0x009c
        L_0x0072:
            int r3 = -r5
        L_0x0073:
            float r4 = (float) r3
        L_0x0074:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r13.A03 = r3
            float r0 = (float) r2
            r3.postRotate(r0)
            android.graphics.Matrix r0 = r13.A03
            r0.postScale(r1, r7)
            android.graphics.Matrix r0 = r13.A03
            r0.postTranslate(r9, r4)
            return
        L_0x008a:
            if (r2 == r10) goto L_0x009e
            if (r2 == r11) goto L_0x009e
            float r1 = (float) r4
            float r0 = (float) r12
            float r1 = r1 / r0
            float r7 = (float) r3
            float r0 = (float) r9
            float r7 = r7 / r0
            int r0 = -r6
            if (r2 != r8) goto L_0x0099
            int r0 = r4 - r6
        L_0x0099:
            float r9 = (float) r0
            if (r2 != r8) goto L_0x0072
        L_0x009c:
            int r3 = r3 - r5
            goto L_0x0073
        L_0x009e:
            float r1 = (float) r3
            float r0 = (float) r9
            float r1 = r1 / r0
            float r7 = (float) r4
            float r0 = (float) r12
            float r7 = r7 / r0
            int r0 = -r5
            if (r2 != r10) goto L_0x00a9
            int r0 = r3 - r5
        L_0x00a9:
            float r9 = (float) r0
            if (r2 != r10) goto L_0x00be
        L_0x00ac:
            int r4 = -r6
        L_0x00ad:
            float r4 = (float) r4
            goto L_0x0074
        L_0x00af:
            int r0 = -r3
            float r1 = (float) r0
            float r0 = (float) r9
            float r1 = r1 / r0
            float r7 = (float) r4
            float r0 = (float) r12
            float r7 = r7 / r0
            int r0 = -r5
            if (r2 != r11) goto L_0x00bb
            int r0 = r3 - r5
        L_0x00bb:
            float r9 = (float) r0
            if (r2 != r11) goto L_0x00ac
        L_0x00be:
            int r4 = r4 - r6
            goto L_0x00ad
        L_0x00c0:
            float r0 = (float) r6
            float r1 = r1 / r5
            float r0 = r0 * r1
            int r0 = (int) r0
            X.7pa r1 = new X.7pa
            r1.<init>(r0, r6)
            goto L_0x0048
        L_0x00cb:
            java.lang.String r1 = "Method updateDriverToPreviewMatrix() invoked without proper initialisation."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A09():void");
    }

    public final void A0A(C364018kj r20, C363988kg r21) {
        int i;
        Integer num;
        C340837lu r0;
        C340167ko r1 = this.A0A;
        if (r1 != null) {
            i = ((Number) r1.AXG(C340167ko.A0K)).intValue();
        } else {
            i = 0;
        }
        C340787lp r9 = this.A0Q;
        CameraManager cameraManager = this.A0M;
        int i2 = this.A00;
        int i3 = (((this.A0i + 45) / 90) * 90) % 360;
        int i4 = this.A00;
        int i5 = this.A02;
        int i6 = i5 + i3;
        if (i4 == 1) {
            i6 = (i5 - i3) + 360;
        }
        int i7 = i6 % 360;
        int A082 = A08();
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        CaptureRequest.Builder builder = this.A06;
        C341897nh r11 = this.A0C;
        boolean A072 = A07(this);
        C343187po r10 = this.A0k;
        C364018kj r12 = r20;
        if (r9.A00 == null || (r0 = r9.A02) == null || !r0.A0S) {
            r9.A01(r12, new RuntimeException("Camera not ready to take photo."));
        } else if (r9.A0G) {
            r9.A01(r12, new RuntimeException("Cannot take photo, another capture in progress."));
        } else {
            C340817ls r02 = r9.A03;
            r02.getClass();
            if (r02.A0D) {
                r9.A01(r12, new RuntimeException("Cannot take photo, video recording in progress."));
                return;
            }
            C342707p2 r13 = r9.A05;
            r13.getClass();
            Object A022 = r13.A02(C342717p3.A0h);
            A022.getClass();
            int intValue = ((Number) A022).intValue();
            C340577lU.A00 = 19;
            C340577lU.A00(19, intValue, (Object) null);
            r9.A0G = true;
            C340827lt r03 = r9.A01;
            r03.getClass();
            r03.A00();
            r9.A0F.A00(new C364238l6(r9, r12), "take_photo", new C364048km(cameraManager, builder, r9, r10, r11, r12, r21, num, i2, i7, A082, A072));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (((java.lang.Boolean) r4.A0A.AXG(X.C340167ko.A0E)).booleanValue() == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.lang.String r21) {
        /*
            r20 = this;
            if (r21 == 0) goto L_0x01c5
            r4 = r20
            X.7nz r0 = r4.A0F
            if (r0 == 0) goto L_0x01bd
            X.7ko r1 = r4.A0A
            if (r1 == 0) goto L_0x01b5
            X.7p0 r0 = r4.A0D
            if (r0 == 0) goto L_0x01ad
            X.7p2 r0 = r4.A08
            if (r0 == 0) goto L_0x01a5
            X.7p5 r0 = r4.A09
            if (r0 == 0) goto L_0x01a5
            X.7nh r0 = r4.A0C
            if (r0 == 0) goto L_0x019d
            X.7ks r0 = X.C340167ko.A0U
            java.lang.Object r10 = r1.AXG(r0)
            X.7km r10 = (X.C340147km) r10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r9 = 1
            if (r1 < r0) goto L_0x004c
            X.7p0 r1 = r4.A0D
            X.7p1 r0 = X.C342687p0.A0Y
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            X.7ko r1 = r4.A0A
            X.7ks r0 = X.C340167ko.A0E
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            X.7ko r1 = r4.A0A
            X.7ks r0 = X.C340167ko.A0R
            java.lang.Object r11 = r1.AXG(r0)
            X.7kp r11 = (X.C340177kp) r11
            X.7ko r1 = r4.A0A
            X.7ks r0 = X.C340167ko.A0W
            java.lang.Object r12 = r1.AXG(r0)
            X.7kp r12 = (X.C340177kp) r12
            X.7p0 r1 = r4.A0D
            X.7p1 r0 = X.C342687p0.A14
            java.lang.Object r15 = r1.A01(r0)
            java.util.List r15 = (java.util.List) r15
            X.7p0 r1 = r4.A0D
            if (r8 == 0) goto L_0x0189
            X.7p1 r0 = X.C342687p0.A19
        L_0x0071:
            java.lang.Object r13 = r1.A01(r0)
            java.util.List r13 = (java.util.List) r13
            X.7p0 r1 = r4.A0D
            X.7p1 r0 = X.C342687p0.A0t
            java.lang.Object r2 = r1.A01(r0)
            java.util.List r2 = (java.util.List) r2
            X.7p0 r1 = r4.A0D
            X.7p1 r0 = X.C342687p0.A1A
            java.lang.Object r14 = r1.A01(r0)
            java.util.List r14 = (java.util.List) r14
            boolean r0 = r4.A0n
            if (r0 == 0) goto L_0x009f
            X.7pa r1 = X.C343037pZ.A01
            java.util.List r15 = X.C343037pZ.A01(r1, r15)
            X.7pa r0 = X.C343037pZ.A00
            java.util.List r13 = X.C343037pZ.A01(r0, r13)
            java.util.List r14 = X.C343037pZ.A01(r1, r14)
        L_0x009f:
            X.7nz r0 = r4.A0F
            int r1 = r0.A01
            int r0 = r0.A00
            int r19 = r4.A08()
            r17 = r1
            r18 = r0
            r16 = r2
            X.7pj r6 = r10.Ap9(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.7pa r7 = r6.A01
            if (r7 == 0) goto L_0x0195
            X.7pa r3 = r6.A00
            if (r3 == 0) goto L_0x018d
            r4.A0E = r7
            X.7p5 r5 = r4.A09
            X.7p4 r1 = X.C342717p3.A0q
            X.7p7 r0 = r5.A00
            r0.A01(r1, r7)
            X.7p4 r2 = X.C342717p3.A0i
            r0 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x00ce
            r0 = 4101(0x1005, float:5.747E-42)
        L_0x00ce:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            X.7p4 r1 = X.C342717p3.A0k
            X.7p7 r0 = r5.A00
            r0.A01(r1, r3)
            X.7p4 r2 = X.C342717p3.A0y
            X.7pa r1 = r6.A02
            if (r1 != 0) goto L_0x00e5
            r1 = r7
        L_0x00e5:
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            X.7p4 r2 = X.C342717p3.A0U
            boolean r0 = r4.A0o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            X.7p4 r2 = X.C342717p3.A0Q
            r3 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            X.7p4 r2 = X.C342717p3.A0M
            X.7nh r0 = r4.A0C
            boolean r0 = r0.getUseArCoreIfSupported()
            if (r0 == 0) goto L_0x010e
            r3 = 1
        L_0x010e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            X.7p4 r2 = X.C342717p3.A02
            X.7nz r0 = r4.A0F
            java.util.HashMap r1 = r0.A03
            if (r1 != 0) goto L_0x0124
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0124:
            X.7p7 r0 = r5.A00
            r0.A01(r2, r1)
            r5.A00()
            X.7pa r2 = r6.A03
            if (r2 == 0) goto L_0x0139
            X.7p5 r0 = r4.A09
            X.7p4 r1 = X.C342717p3.A10
            X.7p7 r0 = r0.A00
            r0.A01(r1, r2)
        L_0x0139:
            X.7p0 r1 = r4.A0D
            X.7p1 r0 = X.C342687p0.A18
            java.lang.Object r3 = r1.A01(r0)
            java.util.List r3 = (java.util.List) r3
            r0 = 5
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x016a
            X.7ko r1 = r4.A0A
            if (r1 == 0) goto L_0x016a
            X.7ks r0 = X.C340167ko.A0V
            java.lang.Object r0 = r1.AXG(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016a
            X.7p5 r0 = r4.A09
            X.7p4 r1 = X.C342717p3.A0v
            X.7p7 r0 = r0.A00
            r0.A01(r1, r2)
        L_0x016a:
            X.7p5 r3 = r4.A09
            X.7p4 r2 = X.C342717p3.A0J
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0187
            boolean r0 = r4.A0p
            if (r0 == 0) goto L_0x0187
        L_0x0178:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            X.7p7 r0 = r3.A00
            r0.A01(r2, r1)
            X.7p5 r0 = r4.A09
            r0.A00()
            return
        L_0x0187:
            r9 = 0
            goto L_0x0178
        L_0x0189:
            X.7p1 r0 = X.C342687p0.A10
            goto L_0x0071
        L_0x018d:
            java.lang.String r1 = "Invalid picture size: 'null'"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0195:
            java.lang.String r1 = "Invalid preview size: 'null'"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x019d:
            java.lang.String r1 = "Trying to setup camera params without instantiating PreviewSetupDelegate."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01a5:
            java.lang.String r1 = "Trying to setup camera params without instantiating CameraSettings."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01ad:
            java.lang.String r1 = "Trying to setup camera params without a Capabilities."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01b5:
            java.lang.String r1 = "Trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            java.lang.String r1 = "Trying to setup camera params without a CameraDeviceConfig."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            java.lang.String r1 = "Camera ID must be provided to setup camera params."
            X.7v2 r0 = new X.7v2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.A0B(java.lang.String):void");
    }

    public final void A8O(C341007mB r2) {
        this.A0V.A01(r2);
    }

    public final void A8q(C340247kw r3) {
        if (this.A0l == null) {
            this.A0l = new C341877nf();
            this.A0R.A0R = this.A0l;
        }
        this.A0l.A00.add(r3);
    }

    public final boolean A9G(C340707lh r2) {
        return this.A0X.A01(r2);
    }

    public final void A9a(B17 b17) {
        C341097mK r2 = this.A0B;
        if (r2 != null) {
            boolean z = !A07(this);
            boolean A96 = r2.A96(b17);
            if (z && A96 && r2.Cct()) {
                this.A0Z.A07("restart_preview_to_resume_cpu_frames", new C41297Ard(this));
            }
        }
    }

    public final void A9b(B17 b17, int i) {
        if (b17 != null) {
            A9a(b17);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewFrameListener.");
    }

    public final void A9c(AnonymousClass8FP r3) {
        if (r3 != null) {
            this.A0R.A0N.A01(r3);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStartedListener.");
    }

    public final void A9d(C340347l7 r3) {
        if (r3 != null) {
            this.A0R.A0O.A01(r3);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStoppedListener.");
    }

    public final void AAm(AnonymousClass8GT r2) {
        C342627ou r0 = this.A07;
        if (r0 != null) {
            r0.A0F.A01(r2);
        }
    }

    public final int AF4(int i, int i2) {
        return this.A0O.A05(i, this.A02, i2);
    }

    public final void AJH(C342077o0 r11, AnonymousClass8GD r12, C340167ko r13, C340557lS r14, C342067nz r15, String str, int i, int i2) {
        C340577lU.A00 = 9;
        C340577lU.A00(9, 0, (Object) null);
        this.A0Z.A00(r12, "connect", new C342097o2(this, r13, r15, i2, i));
        C340577lU.A00(10, 0, (Object) null);
    }

    public final boolean APU(AnonymousClass8GD r6) {
        C340577lU.A00(23, 0, (Object) null);
        UUID uuid = this.A0Y.A03;
        C340837lu r1 = this.A0R;
        r1.A0N.A00();
        r1.A0O.A00();
        C341097mK r0 = this.A0B;
        this.A0B = null;
        if (r0 != null) {
            r0.AHf();
        }
        this.A0W.A00();
        this.A0X.A00();
        C342627ou r02 = this.A07;
        if (r02 != null) {
            r02.A0F.A00();
        }
        this.A0o = false;
        C340757lm r2 = this.A0Z;
        r2.A00(r6, "disconnect", new C365888nq(this, uuid));
        r2.A07("disconnect_guard", new C365898nr());
        return true;
    }

    public final void ARl(AnonymousClass8GD r4) {
        this.A0Z.A00(r4, "enable_video_focus", new C41298Are(this));
    }

    public final void AW6(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(new C346557vN(this), "focus", new C3724390v(rect, this));
    }

    public final Handler Aja() {
        Handler handler = this.A0Z.A00;
        if (handler == null) {
            return C342057ny.A00;
        }
        return handler;
    }

    public final int Ajk() {
        return this.A00;
    }

    public final void BXP(AnonymousClass8GD r5) {
        int length;
        C340777lo r3 = this.A0O;
        if (C340777lo.A04(r3)) {
            length = C340777lo.A06;
        } else if (r3.A05 != null) {
            length = r3.A05.length;
        } else {
            r3.A02.A01(r5, "get_number_of_cameras", new C41302Ari(r3));
            return;
        }
        r5.A02(Integer.valueOf(length));
    }

    public final void BXQ(AnonymousClass8GD r4, int i) {
        C340777lo r0 = this.A0O;
        r0.A02.A01(r4, "get_number_of_cameras_facing", new C41317Arx(r0, i));
    }

    public final int BsR() {
        return this.A02;
    }

    public final int CHf() {
        C342627ou r0 = this.A07;
        if (r0 == null) {
            return -1;
        }
        return r0.A07();
    }

    public final void CJd(AnonymousClass8GD r3) {
        this.A0O.A08(r3, 1);
    }

    public final void CJq(AnonymousClass8GD r3) {
        this.A0O.A08(r3, 0);
    }

    public final boolean CZk() {
        return !this.A0R.A0S;
    }

    public final boolean CaT() {
        return this.A0S.A0D;
    }

    public final boolean Cd1() {
        return this.A0Q.A0G;
    }

    public final void Cgd(AnonymousClass8GD r4, boolean z, boolean z2, boolean z3) {
        this.A0Z.A00(r4, "lock_camera_values", new C41315Arv(this, z3));
    }

    public final boolean Clf(float[] fArr) {
        Matrix matrix = this.A04;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    public final void CoY(AnonymousClass8GD r4, C343147pk r5) {
        this.A0Z.A00(r4, "modify_settings_on_background_thread", new C343557qP(this, r5));
    }

    public final void DVY(int i) {
        if (!this.A0J) {
            this.A0i = i;
            C341047mF r1 = this.A0m;
            if (r1 != null) {
                r1.D8b(this.A0i);
            }
        }
    }

    public final void E10(AnonymousClass8GD r5, String str, int i) {
        String str2;
        C340757lm r3 = this.A0Z;
        C41314Aru aru = new C41314Aru(this, i);
        if (i == 0) {
            str2 = "back";
        } else {
            str2 = "front";
        }
        r3.A00(r5, 002.A0R("open_concurrent_camera_", str2), aru);
    }

    public final void EAy(String str, View view) {
        if (this.A0l != null) {
            C341877nf r1 = this.A0l;
            if (view != null && !r1.A00.isEmpty()) {
                C342057ny.A00(new C342047nx(view, r1));
            }
        }
    }

    public final void EDc(C341007mB r2) {
        this.A0V.A02(r2);
    }

    public final void EDo(C340247kw r3) {
        if (this.A0l != null) {
            this.A0l.A00.remove(r3);
            if (!(!this.A0l.A00.isEmpty())) {
                this.A0l = null;
                this.A0R.A0R = null;
            }
        }
    }

    public final void EE2(C340707lh r2) {
        this.A0X.A02(r2);
    }

    public final void EEJ(B17 b17) {
        C341097mK r1 = this.A0B;
        if (b17 != null && r1 != null && r1.EDw(b17) && !A07(this) && r1.Cct()) {
            synchronized (this.A0a) {
                FutureTask futureTask = this.A0G;
                if (futureTask != null) {
                    this.A0Z.A08(futureTask);
                }
                this.A0G = this.A0Z.A02("restart_preview_if_to_stop_cpu_frames", this.A0b, 200);
            }
        }
    }

    public final void EEK(AnonymousClass8FP r2) {
        if (r2 != null) {
            this.A0R.A0N.A02(r2);
        }
    }

    public final void EEL(C340347l7 r2) {
        if (r2 != null) {
            this.A0R.A0O.A02(r2);
        }
    }

    public final void EWv(C365938nv r2) {
        this.A0P.A02 = r2;
    }

    public final void EXp(AnonymousClass8GD r5, boolean z) {
        boolean z2;
        if (z) {
            z2 = A06();
        } else {
            z2 = false;
        }
        C342707p2 r0 = this.A08;
        if (r0 != null) {
            C342727p4 r2 = C342717p3.A0J;
            if (r0.A02(r2) != null) {
                Object A022 = this.A08.A02(r2);
                A022.getClass();
                if (((Boolean) A022).booleanValue() != z2) {
                    C342757p7 r1 = new C342757p7();
                    r1.A01(r2, Boolean.valueOf(z2));
                    C343147pk A002 = r1.A00();
                    if (r5 == null) {
                        r5 = new C341957no();
                    }
                    CoY(r5, A002);
                }
            }
        }
    }

    public final void EdB(boolean z) {
        this.A0J = z;
        if (z) {
            this.A0i = 0;
            C341047mF r1 = this.A0m;
            if (r1 != null) {
                r1.D8b(this.A0i);
            }
        }
    }

    public final void EeX(C340947m5 r2) {
        this.A0Y.A04(r2);
    }

    public final void EgX(AnonymousClass8GD r4, int i) {
        this.A01 = i;
        this.A0Z.A00(r4, "set_rotation", new C343397q9(this));
    }

    public final void Er9(AnonymousClass8GD r4, int i) {
        this.A0Z.A00(r4, "set_zoom_level", new C41312Ars(this, i));
    }

    public final void ErA(float f, float f2) {
        this.A0Z.A07("set_zoom_percent", new C41343AsQ(this, f, f2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r4 == 180) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ErX(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0086
            X.7pa r0 = r6.A0E
            if (r0 == 0) goto L_0x007e
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A02
            if (r4 == 0) goto L_0x001b
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L_0x001d
        L_0x001b:
            float r1 = (float) r10
            float r0 = (float) r11
        L_0x001d:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0063
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L_0x0079
            float r0 = java.lang.Math.max(r2, r1)
        L_0x0060:
            r7.postScale(r0, r0, r5, r4)
        L_0x0063:
            int r3 = r6.A01
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x0074
            r0 = 3
            if (r3 == r0) goto L_0x0074
            if (r3 != r2) goto L_0x0073
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0070:
            r7.postRotate(r0, r5, r4)
        L_0x0073:
            return r1
        L_0x0074:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L_0x0070
        L_0x0079:
            float r0 = java.lang.Math.min(r2, r1)
            goto L_0x0060
        L_0x007e:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0086:
            java.lang.String r0 = "View transform matrix must be instantiated by the client."
            X.7v2 r1 = new X.7v2
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.ErX(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    public final void Evu(AnonymousClass8GD r4, float f) {
        this.A0Z.A00(r4, "smooth_zoom_to", new C41313Art(this, f));
    }

    public final void EwE(AnonymousClass8GD r4, int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0L;
        rect.inset(i3, i3);
        this.A0Z.A00(r4, "spot_meter", new C3724290u(rect, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.isARCoreEnabled() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Exq(X.AnonymousClass8GD r16, java.io.File r17, java.io.File r18) {
        /*
            r15 = this;
            X.7ls r1 = r15.A0S
            java.lang.String r8 = r17.getAbsolutePath()
            int r9 = r15.A00
            int r10 = r15.A02
            int r11 = r15.A0i
            boolean r12 = r15.A0K
            X.7nh r0 = r15.A0C
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.isARCoreEnabled()
            r13 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            X.7mF r6 = r15.A0m
            X.7lk r4 = r15.A0e
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.A06
            boolean r14 = A07(r15)
            X.7po r5 = r15.A0k
            r7 = 0
            r3 = r16
            r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.Exq(X.8GD, java.io.File, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0.isARCoreEnabled() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Exr(X.AnonymousClass8GD r16, java.io.FileDescriptor r17, java.io.FileDescriptor r18) {
        /*
            r15 = this;
            X.7ls r1 = r15.A0S
            int r9 = r15.A00
            int r10 = r15.A02
            int r11 = r15.A0i
            boolean r12 = r15.A0K
            X.7nh r0 = r15.A0C
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isARCoreEnabled()
            r13 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r13 = 0
        L_0x0016:
            X.7mF r6 = r15.A0m
            X.7lk r4 = r15.A0e
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.A06
            boolean r14 = A07(r15)
            X.7po r5 = r15.A0k
            r8 = 0
            r3 = r16
            r7 = r17
            r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.Exr(X.8GD, java.io.FileDescriptor, java.io.FileDescriptor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0.isARCoreEnabled() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Exs(X.AnonymousClass8GD r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            X.7ls r1 = r15.A0S
            int r9 = r15.A00
            int r10 = r15.A02
            int r11 = r15.A0i
            boolean r12 = r15.A0K
            X.7nh r0 = r15.A0C
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isARCoreEnabled()
            r13 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r13 = 0
        L_0x0016:
            X.7mF r6 = r15.A0m
            X.7lk r4 = r15.A0e
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.A06
            boolean r14 = A07(r15)
            X.7po r5 = r15.A0k
            r7 = 0
            r3 = r16
            r8 = r17
            r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340597lW.Exs(X.8GD, java.lang.String, java.lang.String):void");
    }

    public final void EyT(AnonymousClass8GD r11, boolean z) {
        C340817ls r4 = this.A0S;
        CaptureRequest.Builder builder = this.A06;
        boolean A072 = A07(this);
        C343187po r5 = this.A0k;
        if (!r4.A0D) {
            r11.A01(new IllegalStateException("Not recording video."));
            return;
        }
        r4.A0A.A00(r11, "stop_video_capture", new C41361Asi(builder, r4, r5, SystemClock.elapsedRealtime(), z, A072));
    }

    public final void EzI(AnonymousClass8GD r4) {
        int i = this.A00;
        C340577lU.A00 = 14;
        C340577lU.A00(14, i, (Object) null);
        this.A0Z.A00(r4, "switch_camera", new C41300Arg(this));
    }

    public final void EzY(C364018kj r4, C363988kg r5) {
        C342707p2 r0 = this.A08;
        if (r0 != null) {
            C342727p4 r2 = C342717p3.A0e;
            Number number = (Number) r0.A02(r2);
            if (number != null && number.intValue() == 2) {
                C342757p7 r1 = new C342757p7();
                r1.A01(r2, 1);
                CoY(new C364638lk(this, r4, r5), r1.A00());
                return;
            }
        }
        A0A(r4, r5);
    }

    public final void FIb(AnonymousClass8GD r4, boolean z, boolean z2, boolean z3) {
        this.A0Z.A00(r4, "unlock_camera_values", new C379939Vx(this, z3));
    }

    public final boolean isConnected() {
        if (this.A0j == null) {
            return false;
        }
        if (this.A0q || this.A0r) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.7lZ, X.7lY] */
    public C340597lW(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0c = applicationContext;
        C340757lm r4 = new C340757lm();
        this.A0Z = r4;
        C340767ln r3 = new C340767ln(r4);
        this.A0Y = r3;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0M = cameraManager;
        C340777lo r1 = new C340777lo(applicationContext.getPackageManager(), cameraManager, r3, r4);
        this.A0O = r1;
        this.A0Q = new C340787lp(r3, r4);
        this.A0S = new C340817ls(r1, r4);
        this.A0L = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        this.A0P = new C340827lt(r4);
        this.A0R = new C340837lu(r4);
    }

    public final C342687p0 AlD() {
        C342687p0 r0;
        if (isConnected() && (r0 = this.A0D) != null) {
            return r0;
        }
        throw new C352928Fp("Cannot get camera capabilities");
    }

    public final C342717p3 Bt2() {
        C342707p2 r0;
        if (isConnected() && (r0 = this.A08) != null) {
            return r0;
        }
        throw new C352928Fp("Cannot get camera settings");
    }

    public final void ARW(boolean z) {
        this.A0K = z;
    }
}
