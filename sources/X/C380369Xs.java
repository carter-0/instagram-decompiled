package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Xs  reason: invalid class name and case insensitive filesystem */
public final class C380369Xs extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00 = -1;
    public int A01 = 0;
    public OrientationEventListener A02;
    public C340177kp A03;
    public C340177kp A04;
    public C340147km A05;
    public C343367q6 A06;
    public C340557lS A07 = null;
    public C3497181l A08;
    public B0Y A09 = null;
    public C341047mF A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public int A0L;
    public TextureView.SurfaceTextureListener A0M;
    public C340167ko A0N;
    public C353008Fx A0O;
    public final GestureDetector.SimpleOnGestureListener A0P;
    public final GestureDetector A0Q;
    public final ScaleGestureDetector.SimpleOnScaleGestureListener A0R;
    public final ScaleGestureDetector A0S;
    public final AnonymousClass8GD A0T;
    public final C340607lX A0U;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C380369Xs(android.content.Context r19) {
        /*
            r18 = this;
            r9 = 0
            r8 = 0
            r5 = r19
            java.lang.Class r0 = r5.getClass()
            java.lang.String r2 = r0.getSimpleName()
            r6 = r18
            r6.<init>(r5, r9, r8)
            r6.A09 = r9
            r6.A07 = r9
            r6.A01 = r8
            r0 = -1
            r6.A00 = r0
            r10 = 1
            r6.A0J = r10
            r6.A0G = r10
            r6.A0C = r10
            r1 = 2
            X.9du r0 = new X.9du
            r0.<init>(r6, r1)
            r6.A0T = r0
            X.9Xn r7 = new X.9Xn
            r7.<init>(r6, r10)
            r6.A0P = r7
            X.9Xq r4 = new X.9Xq
            r4.<init>(r6)
            r6.A0R = r4
            r6.A0B = r2
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int[] r0 = X.A22.A00
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r9, r0, r8, r8)
            r0 = 4
            int r0 = r3.getInt(r0, r10)     // Catch:{ all -> 0x00dc }
            if (r0 == r10) goto L_0x004f
            if (r0 != r1) goto L_0x004f
            X.7l0 r2 = X.C340277l0.CAMERA2     // Catch:{ all -> 0x00dc }
            goto L_0x0051
        L_0x004f:
            X.7l0 r2 = X.C340277l0.CAMERA1     // Catch:{ all -> 0x00dc }
        L_0x0051:
            r0 = 6
            int r15 = r3.getInt(r0, r8)     // Catch:{ all -> 0x00dc }
            X.7kp[] r14 = X.C340177kp.values()     // Catch:{ all -> 0x00dc }
            int r13 = r14.length     // Catch:{ all -> 0x00dc }
            r12 = 0
        L_0x005c:
            if (r12 >= r13) goto L_0x00d0
            r11 = r14[r12]     // Catch:{ all -> 0x00dc }
            int r0 = r11.A00     // Catch:{ all -> 0x00dc }
            if (r0 != r15) goto L_0x0074
            r6.A04 = r11     // Catch:{ all -> 0x00dc }
            r11 = 3
            int r16 = r3.getInt(r11, r8)     // Catch:{ all -> 0x00dc }
            X.7kp[] r13 = X.C340177kp.values()     // Catch:{ all -> 0x00dc }
            int r0 = r13.length     // Catch:{ all -> 0x00dc }
            r17 = r0
            r14 = 0
            goto L_0x0077
        L_0x0074:
            int r12 = r12 + 1
            goto L_0x005c
        L_0x0077:
            r0 = r17
            if (r14 >= r0) goto L_0x00d6
            r15 = r13[r14]     // Catch:{ all -> 0x00dc }
            int r12 = r15.A00     // Catch:{ all -> 0x00dc }
            r0 = r16
            if (r12 != r0) goto L_0x00a0
            r6.A03 = r15     // Catch:{ all -> 0x00dc }
            boolean r0 = r3.getBoolean(r8, r10)     // Catch:{ all -> 0x00dc }
            r6.A0E = r0     // Catch:{ all -> 0x00dc }
            int r0 = r3.getInt(r10, r8)     // Catch:{ all -> 0x00dc }
            r6.setInitialCameraFacing(r0)     // Catch:{ all -> 0x00dc }
            r0 = 5
            int r11 = r3.getInt(r0, r11)     // Catch:{ all -> 0x00dc }
            r0 = r11 & 1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r10)
            r6.A0H = r0     // Catch:{ all -> 0x00dc }
            goto L_0x00a3
        L_0x00a0:
            int r14 = r14 + 1
            goto L_0x0077
        L_0x00a3:
            r0 = r11 & 2
            if (r0 == r1) goto L_0x00a8
            r10 = 0
        L_0x00a8:
            r6.A0I = r10     // Catch:{ all -> 0x00dc }
            boolean r1 = r3.getBoolean(r1, r8)     // Catch:{ all -> 0x00dc }
            r3.recycle()
            android.content.Context r0 = r6.getContext()
            X.7m3 r0 = X.C340587lV.A00(r0, r9, r2, r8)
            r6.A0U = r0
            r6.setMediaOrientationLocked(r1)
            super.setSurfaceTextureListener(r6)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r5, r7)
            r6.A0Q = r0
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r5, r4)
            r6.A0S = r0
            return
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            goto L_0x00db
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380369Xs.<init>(android.content.Context):void");
    }

    public final void A03() {
        this.A0D = true;
        this.A0F = false;
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        C340607lX r2 = this.A0U;
        r2.EAy("onPause", this);
        r2.APU(new C382569du(this, 3));
    }

    public final void A04(C364018kj r8) {
        C363988kg r4 = new C363988kg();
        r4.A01(C363988kg.A09, new Rect(0, 0, getWidth(), getHeight()));
        r4.A01(C363988kg.A05, false);
        r4.A01(C363988kg.A08, true);
        this.A0U.EzY(new AV1(r8, this), r4);
    }

    public static void A01(C343367q6 r10, C380369Xs r11, int i, int i2) {
        C342717p3 r2 = r10.A03;
        C343047pa r0 = (C343047pa) r2.A02(C342717p3.A0q);
        if (r0 != null) {
            int i3 = r0.A02;
            int i4 = r0.A01;
            Matrix transform = r11.getTransform(AnonymousClass7TE.A0U());
            C340607lX r3 = r11.A0U;
            if (r3.ErX(transform, i, i2, i3, i4, r11.A0C)) {
                if (r11.A0J) {
                    r11.setTransform(transform);
                }
                r3.CMz(transform, r11.getWidth(), r11.getHeight(), r10.A01);
                if (r11.A0G) {
                    r11.A0F = true;
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A15("CameraService doesn't support setting up preview matrix.");
        }
        throw AnonymousClass7TE.A15(002.A0R("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n", (String) r2.A02(C342717p3.A0u)));
    }

    public static void A02(C380369Xs r12) {
        C340607lX r3 = r12.A0U;
        r3.EAy("initialise", r12);
        String str = r12.A0B;
        int i = r12.A01;
        C340167ko runtimeParameters = r12.getRuntimeParameters();
        int i2 = r12.A0L;
        C342067nz r8 = new C342067nz(r12.getSurfacePipeCoordinator(), (HashMap) null, r12.A0K, i2);
        int displayRotation = r12.getDisplayRotation();
        r3.AJH((C342077o0) null, r12.A0T, runtimeParameters, r12.A07, r8, str, i, displayRotation);
        r12.getSurfacePipeCoordinator().Dh6(r12.getSurfaceTexture(), r12.A0L, r12.A0K);
    }

    private C340177kp getPhotoCaptureQuality() {
        C340177kp r0 = this.A03;
        if (r0 == null) {
            return C340177kp.HIGH;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7kr, java.lang.Object] */
    private C340167ko getRuntimeParameters() {
        C340167ko r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        Map map = C340157kn.A01;
        return new C340157kn(new Object(), getPhotoCaptureQuality(), getVideoCaptureQuality(), getSizeSetter(), false, false, false);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7km] */
    private C340147km getSizeSetter() {
        C340147km r0 = this.A05;
        if (r0 == null) {
            return new Object();
        }
        return r0;
    }

    private C341047mF getSurfacePipeCoordinator() {
        C341047mF r1 = this.A0A;
        if (r1 != null) {
            return r1;
        }
        AV5 av5 = new AV5(getSurfaceTexture());
        this.A0A = av5;
        return av5;
    }

    private C340177kp getVideoCaptureQuality() {
        C340177kp r0 = this.A04;
        if (r0 == null) {
            return C340177kp.HIGH;
        }
        return r0;
    }

    /* access modifiers changed from: private */
    public void setCameraDeviceRotation(C343367q6 r5) {
        C340607lX r3 = this.A0U;
        if (r3.isConnected()) {
            int displayRotation = getDisplayRotation();
            if (this.A00 != displayRotation) {
                this.A00 = displayRotation;
                r3.EgX(new C382569du(this, 4), displayRotation);
            } else if (r5 != null && r5.A03.A02(C342717p3.A0q) != null) {
                A01(r5, this, getWidth(), getHeight());
            }
        }
    }

    public C340607lX getCameraService() {
        return this.A0U;
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return this.A0M;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0L = i;
        this.A0K = i2;
        if (!this.A0D) {
            A02(this);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A0F = false;
        C340607lX r1 = this.A0U;
        r1.EAy("onSurfaceTextureDestroyed", this);
        r1.APU(new C382579dv(0, surfaceTexture, this));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0L = i;
        this.A0K = i2;
        if (!this.A0D) {
            getSurfacePipeCoordinator().Dh5(i, i2);
            setCameraDeviceRotation(this.A06);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C353008Fx r0 = this.A0O;
        if (r0 != null) {
            r0.Dpo();
            this.A0O = null;
        }
        this.A0U.Cru();
        C364268l9.A00().A03();
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0S.setQuickScaleEnabled(z);
    }

    public void setInitialCameraFacing(int i) {
        this.A01 = i;
        C340577lU.A01("CameraPreviewView", 002.A0O("Initial camera facing set to: ", i));
    }

    public void setMediaOrientationLocked(boolean z) {
        this.A0U.EdB(z);
    }

    public void setOnInitialisedListener(C3497181l r2) {
        if (!(r2 == null || this.A06 == null || !this.A0U.isConnected())) {
            r2.DKf(this.A06);
        }
        this.A08 = r2;
    }

    private int getDisplayRotation() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    private Activity getParentActivity() {
        Context baseContext;
        Context context = getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return (Activity) context;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1124652081);
        super.onAttachedToWindow();
        AnonymousClass0fD.A0D(574050395, A062);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCameraDeviceRotation(this.A06);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1122086947);
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A08 = null;
        AnonymousClass0fD.A0D(-1972273118, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(2112489534);
        boolean z = false;
        if (!this.A0F || !this.A0U.isConnected()) {
            i = 1507126315;
        } else {
            boolean onTouchEvent = this.A0Q.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = this.A0S.onTouchEvent(motionEvent);
            if (onTouchEvent || onTouchEvent2) {
                z = true;
            }
            i = 1333841855;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }

    public void setCameraEventLogger(C340557lS r1) {
        this.A07 = r1;
    }

    public void setCropEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOnSurfaceTextureUpdatedListener(C353008Fx r1) {
        this.A0O = r1;
    }

    public void setPhotoCaptureQuality(C340177kp r1) {
        this.A03 = r1;
    }

    public void setPinchZoomEnabled(boolean z) {
        this.A0E = z;
    }

    public void setPinchZoomListener(B0Y b0y) {
        this.A09 = b0y;
    }

    public void setProductName(String str) {
        this.A0B = str;
    }

    public void setRuntimeParameters(C340167ko r1) {
        this.A0N = r1;
    }

    public void setSingleTapFocusEnabled(boolean z) {
        this.A0H = z;
    }

    public void setSingleTapMeteringEnabled(boolean z) {
        this.A0I = z;
    }

    public void setSizeSetter(C340147km r1) {
        this.A05 = r1;
    }

    public void setSurfacePipeCoordinator(C341047mF r1) {
        this.A0A = r1;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A0M = surfaceTextureListener;
    }

    public void setTransformMatrixEnabled(boolean z) {
        this.A0J = z;
    }

    public void setVideoCaptureQuality(C340177kp r1) {
        this.A04 = r1;
    }
}
