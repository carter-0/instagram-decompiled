package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.Vzp  reason: case insensitive filesystem */
public final class C18754Vzp {
    public static final A8D A06 = new Object();
    public EGL10 A00;
    public EGLConfig A01;
    public EGLContext A02;
    public EGLDisplay A03;
    public EGLSurface A04;
    public final WeakReference A05;

    public C18754Vzp(WeakReference weakReference) {
        0qQ.A0B(weakReference, 1);
        this.A05 = weakReference;
    }

    public static final void A00(C18754Vzp vzp) {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = vzp.A04;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = vzp.A00;
            if (egl10 != null) {
                egl10.eglMakeCurrent(vzp.A03, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            GLDrawingView gLDrawingView = (GLDrawingView) vzp.A05.get();
            if (!(gLDrawingView == null || gLDrawingView.A03 == null)) {
                EGL10 egl102 = vzp.A00;
                EGLDisplay eGLDisplay = vzp.A03;
                EGLSurface eGLSurface3 = vzp.A04;
                if (egl102 != null) {
                    egl102.eglDestroySurface(eGLDisplay, eGLSurface3);
                }
            }
            vzp.A04 = null;
        }
    }

    public final void A01() {
        EGLContext eGLContext = this.A02;
        if (eGLContext != null) {
            GLDrawingView gLDrawingView = (GLDrawingView) this.A05.get();
            if (!(gLDrawingView == null || gLDrawingView.A02 == null)) {
                EGL10 egl10 = this.A00;
                EGLDisplay eGLDisplay = this.A03;
                if (egl10 != null && !egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("display:");
                    sb.append(eGLDisplay);
                    0KC.A0C("DefaultContextFactory", AnonymousClass7TG.A0m(eGLContext, " context: ", sb));
                    throw new RuntimeException(A06.A00("eglDestroyContex", egl10.eglGetError()));
                }
            }
            this.A02 = null;
        }
        EGLDisplay eGLDisplay2 = this.A03;
        if (eGLDisplay2 != null) {
            EGL10 egl102 = this.A00;
            if (egl102 != null) {
                egl102.eglTerminate(eGLDisplay2);
            }
            this.A03 = null;
        }
    }
}
