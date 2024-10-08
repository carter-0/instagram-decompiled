package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Choreographer;
import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.gltf.jni.GltfRenderSession;
import com.facebook.spherical.util.Quaternion;

public abstract class Q7x extends HandlerThread implements C13500TbR {
    public int A00;
    public int A01;
    public Handler A02;
    public C346067uX A03;
    public Quaternion A04;
    public C11247SHh A05;
    public int A06;
    public Throwable A07;
    public final int A08 = 20;
    public final SurfaceTexture A09;
    public final Choreographer.FrameCallback A0A;
    public final Choreographer A0B;
    public final C315826kc A0C;
    public final C315766kW A0D;
    public final C11446SVi A0E;
    public final boolean A0F = true;
    public volatile boolean A0G;
    public volatile boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7x(Context context, SurfaceTexture surfaceTexture, C11247SHh sHh, C315826kc r7, C315766kW r8, int i, int i2) {
        super("IgGlMediaRenderThread");
        0qQ.A0B(r7, 4);
        this.A09 = surfaceTexture;
        this.A0C = r7;
        this.A0D = r8;
        this.A0E = new C11446SVi(context, this);
        this.A0A = new C11468SaW(this);
        Choreographer instance = Choreographer.getInstance();
        0qQ.A07(instance);
        this.A0B = instance;
        this.A04 = new Quaternion();
        this.A05 = sHh;
        this.A0H = true;
        this.A01 = i;
        this.A00 = i2;
    }

    public final synchronized void start() {
        super.start();
        Q7r q7r = new Q7r(getLooper(), this, 2);
        this.A02 = q7r;
        q7r.sendEmptyMessage(0);
    }

    public final void A01() {
        if (this.A0H) {
            this.A0B.postFrameCallbackDelayed(this.A0A, 15);
            this.A0H = false;
            if (this.A0C.A02) {
                A02();
            }
        }
    }

    public final void A02() {
        Handler handler;
        this.A0C.A03 = false;
        C11446SVi sVi = this.A0E;
        if (this.A0F) {
            handler = this.A02;
        } else {
            handler = null;
        }
        sVi.A00 = 5;
        SensorManager sensorManager = sVi.A01;
        if (sensorManager != null) {
            try {
                Sensor defaultSensor = sensorManager.getDefaultSensor(C11446SVi.A06);
                boolean registerListener = sensorManager.registerListener(sVi, defaultSensor, 1, handler);
                if (registerListener) {
                    AnonymousClass0BW.A00.A05(sVi, defaultSensor);
                } else {
                    C11446SVi.A06 = 11;
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(11);
                    registerListener = sensorManager.registerListener(sVi, defaultSensor2, 1, handler);
                    if (registerListener) {
                        AnonymousClass0BW.A00.A05(sVi, defaultSensor2);
                    }
                }
                if (C11446SVi.A07 == null) {
                    C11446SVi.A07 = Boolean.valueOf(registerListener);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.7uX, X.7uK] */
    public void A03() {
        try {
            SurfaceTexture surfaceTexture = this.A09;
            int i = this.A08;
            C344587s6 r1 = new C344587s6((Object) null, 2);
            r1.A09(EGL14.EGL_NO_CONTEXT, i);
            ? r4 = new C345937uK(r1);
            C344587s6 r0 = r4.A01;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r0.A04, r0.A02, surfaceTexture, C344587s6.A08(r0), 0);
            C345907uH.A01("eglCreateWindowSurface");
            eglCreateWindowSurface.getClass();
            r4.A00 = eglCreateWindowSurface;
            this.A03 = r4;
            r4.A05();
            C11247SHh sHh = this.A05;
            if (sHh.A02 != null) {
                sHh.A01();
            }
            sHh.A02 = new C10325RqN();
            int i2 = this.A06;
            if (i2 != 0) {
                Throwable th = this.A07;
                if (th != null) {
                    this.A0D.Ew2(002.A0O("GlMediaRenderThread-", i2), 002.A0c("Succeeded creating an OutputSurface after ", " retries!", i2), th);
                }
                this.A07 = null;
            }
        } catch (RuntimeException e) {
            if (this.A06 == 0) {
                this.A0D.Ew2("IgGlMediaRenderThread", "Failed to create OutputSurface", e);
            }
            this.A07 = e;
            C346067uX r02 = this.A03;
            if (r02 != null) {
                r02.A02();
                this.A03 = null;
            }
            int i3 = this.A06 + 1;
            this.A06 = i3;
            if (i3 > 2) {
                this.A0D.Ew2(002.A0O("GlMediaRenderThread-", i3), 002.A0c("Failed to create OutputSurface after ", " retries! Aborting!", i3), e);
                this.A07 = null;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
            Handler handler = this.A02;
            if (handler != null) {
                handler.sendEmptyMessage(0);
            }
        }
    }

    public void A04() {
        C346067uX r5 = this.A03;
        if (r5 != null) {
            C11247SHh sHh = this.A05;
            C10325RqN rqN = sHh.A02;
            if (rqN != null && sHh.A04) {
                GLTFCameraOrientation gLTFCameraOrientation = sHh.A05.A07;
                ((GltfRenderSession) rqN.A00.getValue()).setCameraPosition((float) gLTFCameraOrientation.cx, (float) gLTFCameraOrientation.cy, (float) gLTFCameraOrientation.cz, (float) gLTFCameraOrientation.tx, (float) gLTFCameraOrientation.ty, (float) gLTFCameraOrientation.tz);
                float f = (float) gLTFCameraOrientation.fov;
                AnonymousClass0eM r8 = rqN.A00;
                ((GltfRenderSession) r8.getValue()).updateFieldOfView(f);
                ((GltfRenderSession) r8.getValue()).setClippingPlanes((float) gLTFCameraOrientation.near, (float) gLTFCameraOrientation.far);
                ((GltfRenderSession) r8.getValue()).render(sHh.A01, sHh.A00);
            }
            r5.A03();
        }
    }
}
