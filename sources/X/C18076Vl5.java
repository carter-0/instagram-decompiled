package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.Vl5  reason: case insensitive filesystem */
public final class C18076Vl5 {
    public C346027uT A00;
    public EGLSurface A01 = EGL14.EGL_NO_SURFACE;
    public C18656VwB A02;
    public final float[] A03;
    public final C346057uW A04;
    public final Object A05;
    public final int[] A06;

    public final int A00() {
        EGLSurface eGLSurface;
        C18656VwB vwB = this.A02;
        if (vwB == null || vwB.A03() || (eGLSurface = this.A01) == EGL14.EGL_NO_SURFACE) {
            return 0;
        }
        EGLDisplay eGLDisplay = vwB.A02;
        int[] iArr = this.A06;
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 1);
        return iArr[1];
    }

    public final int A01() {
        EGLSurface eGLSurface;
        C18656VwB vwB = this.A02;
        if (vwB == null || vwB.A03() || (eGLSurface = this.A01) == EGL14.EGL_NO_SURFACE) {
            return 0;
        }
        EGLDisplay eGLDisplay = vwB.A02;
        int[] iArr = this.A06;
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void A02() {
        C18656VwB vwB = this.A02;
        if (vwB != null && !vwB.A03() && this.A01 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A05) {
                C18656VwB vwB2 = this.A02;
                EGLDisplay eGLDisplay = vwB2.A02;
                EGLSurface eGLSurface = this.A01;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, vwB2.A01)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
            }
        }
    }

    public final void A03() {
        C18656VwB vwB = this.A02;
        if (!(vwB == null || vwB.A03() || this.A01 == EGL14.EGL_NO_SURFACE)) {
            synchronized (this.A05) {
                EGL14.eglDestroySurface(this.A02.A02, this.A01);
            }
        }
        C346027uT r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = EGL14.EGL_NO_SURFACE;
    }

    public final void A04() {
        C18656VwB vwB = this.A02;
        if (vwB != null && !vwB.A03() && this.A01 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A05) {
                EGL14.eglSwapBuffers(this.A02.A02, this.A01);
            }
        }
    }

    public final void A05(long j) {
        C346027uT r0;
        C18656VwB vwB = this.A02;
        if (vwB != null && !vwB.A03() && this.A01 != EGL14.EGL_NO_SURFACE && (r0 = this.A00) != null) {
            int i = r0.A09;
            if (i != 0) {
                if (i == 1) {
                    j = this.A04.A00(j);
                } else {
                    return;
                }
            }
            synchronized (this.A05) {
                EGLExt.eglPresentationTimeANDROID(this.A02.A02, this.A01, j);
            }
        }
    }

    public C18076Vl5(C18656VwB vwB, C346027uT r7, Object obj) {
        this.A05 = obj;
        this.A02 = vwB;
        this.A00 = r7;
        this.A03 = new float[16];
        this.A06 = new int[2];
        this.A04 = new C346057uW();
        if (!vwB.A03() && vwB.A00 != null) {
            int[] iArr = {12344};
            Surface A002 = r7.A00();
            if (A002 != null) {
                synchronized (obj) {
                    C18656VwB vwB2 = this.A02;
                    this.A01 = EGL14.eglCreateWindowSurface(vwB2.A02, vwB2.A00, A002, iArr, 0);
                }
            }
            if (this.A01 == null || EGL14.eglGetError() != 12288) {
                this.A01 = EGL14.EGL_NO_SURFACE;
            }
        }
    }
}
