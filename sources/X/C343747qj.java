package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import java.util.Arrays;
import java.util.Locale;
import org.webrtc.EglBase10Impl;

/* renamed from: X.7qj  reason: invalid class name and case insensitive filesystem */
public final class C343747qj {
    public static final C343757qk A05 = new Object();
    public static final Object A06 = new Object();
    public EGLContext A00;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02;
    public EGLConfig A03;
    public final EGLContext A04;

    public final EGLSurface A00(Object obj) {
        EGLSurface eglCreatePbufferSurface;
        if (obj != null) {
            eglCreatePbufferSurface = EGL14.eglCreateWindowSurface(this.A01, this.A03, obj, new int[]{12344}, 0);
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A01, this.A03, new int[]{12375, 1, 12374, 1, 12344}, 0);
        }
        if (eglCreatePbufferSurface != null && eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return eglCreatePbufferSurface;
        }
        A05.A01("createEGLSurface");
        throw new RuntimeException("createEGL14Surface failed");
    }

    public final void A04() {
        EGLConfig eGLConfig;
        String A002;
        this.A01 = EGL14.eglGetDisplay(0);
        C343757qk r3 = A05;
        r3.A01("eglGetDisplay");
        EGLDisplay eGLDisplay = this.A01;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.A01, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12352, 4, 12344, 0, 12344, 0, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) || (eGLConfig = eGLConfigArr[0]) == null) {
                    r3.A01("eglChooseConfig");
                    throw new GLException(-1, "unable to find EGL config");
                }
                this.A03 = eGLConfig;
                int[] iArr2 = {EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 3, 12344};
                EGLDisplay eGLDisplay2 = this.A01;
                EGLContext eGLContext = this.A04;
                this.A00 = EGL14.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2, 0);
                int eglGetError = EGL14.eglGetError();
                EGLContext eGLContext2 = this.A00;
                if (eGLContext2 == null || eGLContext2 == EGL14.EGL_NO_CONTEXT || eglGetError != 12288) {
                    this.A00 = EGL14.eglCreateContext(this.A01, this.A03, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    A002 = Pxd.A00(209);
                } else {
                    A002 = String.format((Locale) null, "eglCreateContext Version %d", Arrays.copyOf(new Object[]{3}, 1));
                    0qQ.A07(A002);
                }
                r3.A01(A002);
                EGLContext eGLContext3 = this.A00;
                eGLContext3.getClass();
                EGL14.eglQueryContext(this.A01, eGLContext3, EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
                return;
            }
            r3.A01("eglInitialize");
            throw new GLException(-1, "unable to initialize EGL14, no GL Errors");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A01() {
        try {
            EGL14.eglDestroyContext(this.A01, this.A00);
            EGL14.eglDestroySurface(this.A01, this.A02);
            EGL14.eglTerminate(this.A01);
        } catch (Exception unused) {
        }
    }

    public final void A02() {
        EGLContext eGLContext = this.A00;
        if (eGLContext != null) {
            if (eGLContext.equals(EGL14.eglGetCurrentContext())) {
                EGLSurface eGLSurface = this.A02;
                if (eGLSurface == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (eGLSurface.equals(EGL14.eglGetCurrentSurface(12377))) {
                    return;
                }
            }
            EGLDisplay eGLDisplay = this.A01;
            EGLSurface eGLSurface2 = this.A02;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.A00)) {
                A05.A01("eglMakeCurrent");
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A03() {
        EGLDisplay eGLDisplay = this.A01;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            A05.A01("eglMakeCurrent");
        }
    }

    public C343747qj() {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A04 = eGLContext;
        this.A00 = eGLContext;
        this.A02 = EGL14.EGL_NO_SURFACE;
    }
}
