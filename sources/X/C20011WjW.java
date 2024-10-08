package X;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.WjW  reason: case insensitive filesystem */
public final class C20011WjW implements Runnable {
    public final /* synthetic */ C19320WUc A00;

    public C20011WjW(C19320WUc wUc) {
        this.A00 = wUc;
    }

    public final void run() {
        C19320WUc wUc = this.A00;
        wUc.A01 = new C17807VgK();
        ALH alh = wUc.A02;
        if (alh != null) {
            alh.A03();
        }
        wUc.A05.set(true);
        ALH alh2 = new ALH(wUc.A03, wUc.A07);
        wUc.A02 = alh2;
        C17807VgK vgK = wUc.A01;
        if (vgK != null) {
            vgK.A00 = alh2;
            alh2.onSurfaceCreated((GL10) null, (EGLConfig) null);
            GLSurfaceView.Renderer renderer = vgK.A00;
            if (renderer != null) {
                renderer.onSurfaceChanged((GL10) null, 4, 4);
            }
            while (true) {
                if (wUc.A04.get()) {
                    C17807VgK vgK2 = wUc.A01;
                    if (vgK2 == null) {
                        break;
                    }
                    GLSurfaceView.Renderer renderer2 = vgK2.A00;
                    if (renderer2 != null) {
                        renderer2.onDrawFrame((GL10) null);
                    }
                    C349257zq.A03(AnonymousClass000.A00(3279));
                    GLES20.glFinish();
                    C349257zq.A01();
                } else {
                    C19320WUc.A00(wUc);
                    C17807VgK vgK3 = wUc.A01;
                    if (vgK3 != null) {
                        vgK3.A00();
                        wUc.A06.set(true);
                        wUc.A00 = null;
                        return;
                    }
                }
            }
        }
        0qQ.A0F("eglSurface");
        throw AnonymousClass00P.createAndThrow();
    }
}
