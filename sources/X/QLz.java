package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

public final class QLz extends SIX {
    public final void A00() {
        SIX.A00("before makeCurrent");
        EGLDisplay eGLDisplay = this.A01;
        EGLSurface eGLSurface = this.A02;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A00)) {
            throw AnonymousClass7TE.A15("eglMakeCurrent failed");
        }
    }

    public QLz(Surface surface) {
        surface.getClass();
        this.A03 = surface;
        this.A02 = EGL14.eglCreateWindowSurface(this.A01, this.A04[0], surface, new int[]{12344}, 0);
        SIX.A00("eglCreateWindowSurface");
        if (this.A02 == null) {
            throw AnonymousClass7TE.A15("surface was null");
        }
    }
}
