package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Rz9  reason: case insensitive filesystem */
public final class C10849Rz9 {
    public int A00;
    public long A01 = 0;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public C10246Rp6 A05;
    public C11354SOn A06;
    public C10780Ry1 A07;
    public C10809RyV A08;
    public C9134RQj A09;
    public Q1W A0A;
    public List A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final float[] A0D = new float[16];
    public final C345557ti A0E;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.RQj] */
    public C10849Rz9(Surface surface, C345557ti r14, C11354SOn sOn) {
        this.A0E = r14;
        this.A06 = sOn;
        this.A05 = sOn.A0F;
        this.A0B = AnonymousClass7TE.A1C();
        ? obj = new Object();
        obj.A02 = EGL14.EGL_NO_DISPLAY;
        obj.A01 = EGL14.EGL_NO_CONTEXT;
        obj.A03 = EGL14.EGL_NO_SURFACE;
        obj.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        obj.A02 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(obj.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    obj.A01 = EGL14.eglCreateContext(obj.A02, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    C345907uH.A01("eglCreateContext");
                    if (obj.A01 != null) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        obj.A00 = eGLConfig;
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(obj.A02, eGLConfig, surface, new int[]{12344}, 0);
                        C345907uH.A01("eglCreateWindowSurface");
                        if (eglCreateWindowSurface != null) {
                            obj.A03 = eglCreateWindowSurface;
                            this.A09 = obj;
                            if (EGL14.eglMakeCurrent(obj.A02, eglCreateWindowSurface, eglCreateWindowSurface, obj.A01)) {
                                int[] iArr2 = new int[1];
                                GLES20.glGenTextures(1, iArr2, 0);
                                C345907uH.A02("glGenTextures", new Object[0]);
                                int i = iArr2[0];
                                GLES20.glBindTexture(36197, i);
                                C345907uH.A02(002.A0O("glBindTexture ", i), new Object[0]);
                                Pxk.A0L();
                                C345907uH.A02("glTexParameter", new Object[0]);
                                this.A00 = i;
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                this.A02 = surfaceTexture;
                                this.A0A = new Q1W(surfaceTexture);
                                HandlerThread A0J = Pxf.A0J("videotranscoder-framecallback-boomerang", -19);
                                this.A03 = A0J;
                                A0J.start();
                                SurfaceTexture surfaceTexture2 = this.A02;
                                Q1W q1w = this.A0A;
                                HandlerThread handlerThread = this.A03;
                                handlerThread.getClass();
                                Pxh.A16(q1w, surfaceTexture2, handlerThread);
                                this.A04 = new Surface(this.A02);
                                this.A07 = new C10780Ry1(r14);
                                this.A08 = new C10809RyV(r14, sOn);
                                return;
                            }
                            throw AnonymousClass7TE.A15("eglMakeCurrent failed");
                        }
                        throw AnonymousClass7TE.A15("surface was null");
                    }
                    throw AnonymousClass7TE.A15("null context");
                }
                throw AnonymousClass7TE.A15("unable to find RGB888+recordable ES2 EGL config");
            }
            throw AnonymousClass7TE.A15("unable to initialize EGL14");
        }
        throw AnonymousClass7TE.A15("unable to get EGL14 display");
    }
}
