package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLSurfaceView;
import org.webrtc.EglBase10Impl;

/* renamed from: X.VgK  reason: case insensitive filesystem */
public final class C17807VgK {
    public GLSurfaceView.Renderer A00;
    public final C16736V3t A01;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.V3t] */
    public C17807VgK() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = {0, 0};
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 4, 12374, 4, 12344}, 0);
        0qQ.A0K(eglCreatePbufferSurface, EGL14.EGL_NO_SURFACE);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        0qQ.A0K(eglCreateContext, EGL14.EGL_NO_CONTEXT);
        0qQ.A0A(eglCreateContext);
        0qQ.A0A(eglGetDisplay);
        0qQ.A0A(eglCreatePbufferSurface);
        0qQ.A0B(eglCreateContext, 1);
        0qQ.A0B(eglGetDisplay, 2);
        0qQ.A0B(eglCreatePbufferSurface, 3);
        ? obj = new Object();
        obj.A00 = eglCreateContext;
        obj.A01 = eglGetDisplay;
        obj.A03 = eglCreatePbufferSurface;
        obj.A02 = eglCreatePbufferSurface;
        this.A01 = obj;
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
    }

    public final void A00() {
        C16736V3t v3t = this.A01;
        if (!0qQ.A0K(v3t.A02, EGL14.EGL_NO_SURFACE) || !0qQ.A0K(v3t.A03, EGL14.EGL_NO_SURFACE)) {
            EGLDisplay eGLDisplay = v3t.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (!0qQ.A0K(v3t.A02, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(v3t.A01, v3t.A02);
                v3t.A02 = EGL14.EGL_NO_SURFACE;
            }
            if (!0qQ.A0K(v3t.A03, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(v3t.A01, v3t.A03);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                0qQ.A0B(eGLSurface2, 0);
                v3t.A03 = eGLSurface2;
            }
        }
        if (!0qQ.A0K(v3t.A00, EGL14.EGL_NO_CONTEXT)) {
            EGLDisplay eGLDisplay2 = v3t.A01;
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(v3t.A01, v3t.A00);
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            0qQ.A0B(eGLContext, 0);
            v3t.A00 = eGLContext;
        }
        if (!0qQ.A0K(v3t.A01, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglTerminate(v3t.A01);
            EGLDisplay eGLDisplay3 = EGL14.EGL_NO_DISPLAY;
            0qQ.A0B(eGLDisplay3, 0);
            v3t.A01 = eGLDisplay3;
        }
    }
}
