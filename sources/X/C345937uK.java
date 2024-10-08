package X;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;

/* renamed from: X.7uK  reason: invalid class name and case insensitive filesystem */
public abstract class C345937uK {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public C344587s6 A01;
    public final C344587s6 A02;
    public final int[] A03 = new int[1];
    public final int[] A04 = new int[1];

    public final int A00() {
        C344587s6 r0 = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A03;
        EGL14.eglQuerySurface(r0.A04, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final int A01() {
        C344587s6 r0 = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A04;
        EGL14.eglQuerySurface(r0.A04, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void A02() {
        EGLSurface eGLSurface = this.A00;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A01.A04, eGLSurface);
        }
        this.A00 = EGL14.EGL_NO_SURFACE;
    }

    public final void A03() {
        C344587s6 r0 = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = r0.A07;
        if (obj != null) {
            synchronized (obj) {
                EGL14.eglSwapBuffers(r0.A04, eGLSurface);
            }
            return;
        }
        EGL14.eglSwapBuffers(r0.A04, eGLSurface);
    }

    public final void A04(long j) {
        C344587s6 r0 = this.A01;
        EGLExt.eglPresentationTimeANDROID(r0.A04, this.A00, j);
    }

    public final boolean A05() {
        boolean A07;
        C344587s6 r2 = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = r2.A07;
        if (obj == null) {
            return C344587s6.A07(eGLSurface, eGLSurface, r2);
        }
        synchronized (obj) {
            A07 = C344587s6.A07(eGLSurface, eGLSurface, r2);
        }
        return A07;
    }

    public C345937uK(C344587s6 r3) {
        this.A01 = r3;
        this.A02 = r3;
    }
}
