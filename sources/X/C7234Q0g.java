package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;
import java.util.Locale;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Q0g  reason: case insensitive filesystem */
public final class C7234Q0g implements C13815Thi {
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public HandlerThread A03;
    public Surface A04;
    public C7236Q0i A05;
    public C14273Tsw A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final UserSession A0A;
    public final C14279TtC A0B;
    public final boolean A0C;

    public C7234Q0g(Context context, UserSession userSession, VideoFilter videoFilter, C14279TtC ttC, C59783JYc jYc) {
        this.A09 = context;
        this.A0B = ttC;
        UserSession userSession2 = userSession;
        this.A0A = userSession;
        C59783JYc jYc2 = jYc;
        Point point = jYc2.A03;
        this.A08 = point.x;
        this.A07 = point.y;
        boolean A002 = C305756Jk.A00(context);
        this.A0C = A002;
        if (A002) {
            synchronized (C343747qj.A06) {
                A00();
            }
        } else {
            A00();
        }
        if (this.A0C) {
            synchronized (C343747qj.A06) {
                EGLDisplay eGLDisplay = this.A01;
                EGLSurface eGLSurface = this.A02;
                EGLContext eGLContext = this.A00;
                eGLContext.getClass();
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                    throw AnonymousClass7TE.A15("eglMakeCurrent failed");
                }
            }
        } else {
            EGLDisplay eGLDisplay2 = this.A01;
            EGLSurface eGLSurface2 = this.A02;
            EGLContext eGLContext2 = this.A00;
            eGLContext2.getClass();
            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContext2)) {
                throw AnonymousClass7TE.A15("eglMakeCurrent failed");
            }
        }
        C14270Tst tst = C14273Tsw.A0X;
        Context context2 = this.A09;
        EGLContext eGLContext3 = this.A00;
        eGLContext3.getClass();
        C14273Tsw tsw = new C14273Tsw(context2, eGLContext3, userSession2, this.A0B, jYc2, this.A08, this.A07, true);
        this.A06 = tsw;
        SurfaceTexture A032 = tsw.A03(userSession, (BaseFilter) null, videoFilter);
        this.A05 = new C7236Q0i(videoFilter, this.A06);
        HandlerThread A0J = Pxf.A0J("gl-callback-runner", -19);
        this.A03 = A0J;
        A0J.start();
        Pxh.A16(this.A05, A032, this.A03);
        this.A04 = new Surface(A032);
    }

    private void A00() {
        String str;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A01 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.A01, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 3, 12344}, 0);
                    this.A00 = eglCreateContext;
                    if (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288) {
                        this.A00 = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                        str = "eglCreateContext Version 2 fallback";
                    } else {
                        str = String.format((Locale) null, "eglCreateContext Version %d", AnonymousClass7TF.A1b(3));
                    }
                    A02(str);
                    if (this.A00 != null) {
                        this.A02 = EGL14.eglCreatePbufferSurface(this.A01, eGLConfigArr[0], new int[]{12375, this.A08, 12374, this.A07, 12344}, 0);
                        A02("createEGLSurface");
                        if (this.A02 == null) {
                            throw AnonymousClass7TE.A15("surface was null");
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A15("null context");
                }
                throw AnonymousClass7TE.A15("unable to find RGB888+recordable ES2 EGL config");
            }
            this.A01 = null;
            throw AnonymousClass7TE.A15("unable to initialize EGL14");
        }
        throw AnonymousClass7TE.A15("unable to get EGL14 display");
    }

    public static void A02(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            0KC.A0O("TranscodeOutputSurfaceForJBMR2", "%s: EGL error: 0x%s", new Object[]{str, Integer.toHexString(eglGetError)});
            z = true;
        }
        if (z) {
            throw AnonymousClass7TE.A15("EGL error encountered (see log)");
        }
    }

    public final void Elt(boolean z) {
    }

    private void A01() {
        if (this.A00 != null && EGL14.eglGetCurrentContext().equals(this.A00)) {
            EGLDisplay eGLDisplay = this.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.A01, this.A02);
        EGL14.eglDestroyContext(this.A01, this.A00);
        Surface surface = this.A04;
        surface.getClass();
        surface.release();
        C14273Tsw tsw = this.A06;
        tsw.getClass();
        tsw.A04();
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A05 = null;
        HandlerThread handlerThread = this.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A03 = null;
        }
    }

    public final void ACz() {
        RuntimeException runtimeException;
        C7236Q0i q0i = this.A05;
        q0i.getClass();
        long nanoTime = System.nanoTime();
        long j = 2500000000L + nanoTime;
        synchronized (q0i) {
            while (!q0i.A00) {
                if (nanoTime < j) {
                    try {
                        q0i.wait(2500);
                        nanoTime = System.nanoTime();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        runtimeException = new RuntimeException(e);
                    }
                } else {
                    runtimeException = new RuntimeException("Surface frame wait timed out");
                    throw runtimeException;
                }
            }
            q0i.A00 = false;
        }
        AnonymousClass9S9.A05("before updateTexImage");
    }

    public final void AQa(long j) {
        C7236Q0i q0i = this.A05;
        q0i.getClass();
        q0i.A02.A05((BaseFilter) null, q0i.A01, j);
    }

    public final Surface getSurface() {
        Surface surface = this.A04;
        surface.getClass();
        return surface;
    }

    public final void release() {
        if (this.A0C) {
            synchronized (C343747qj.A06) {
                A01();
            }
            return;
        }
        A01();
    }
}
