package X;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.AkR  reason: case insensitive filesystem */
public final class C40857AkR implements Runnable {
    public final /* synthetic */ C349037zU A00;

    public C40857AkR(C349037zU r1) {
        this.A00 = r1;
    }

    public final void run() {
        C17807VgK vgK = new C17807VgK();
        C349037zU r4 = this.A00;
        r4.A00 = new ALH(r4.A02, r4.A06);
        r4.A03.set(true);
        try {
            ALH alh = r4.A00;
            if (alh != null) {
                MMQ mmq = new MMQ(r4, 0);
                synchronized (alh) {
                    alh.A00 = mmq;
                }
                vgK.A00 = alh;
                alh.onSurfaceCreated((GL10) null, (EGLConfig) null);
                GLSurfaceView.Renderer renderer = vgK.A00;
                if (renderer != null) {
                    renderer.onSurfaceChanged((GL10) null, 4, 4);
                }
            }
            while (!r4.A05.get()) {
                GLSurfaceView.Renderer renderer2 = vgK.A00;
                if (renderer2 != null) {
                    renderer2.onDrawFrame((GL10) null);
                }
                C349257zq.A03(AnonymousClass000.A00(3279));
                GLES20.glFinish();
                C349257zq.A01();
            }
            C349037zU.A01(r4);
            vgK.A00();
            r4.A04.set(true);
            r4.A01 = null;
        } catch (Throwable th) {
            C349037zU.A01(r4);
            vgK.A00();
            r4.A04.set(true);
            r4.A01 = null;
            throw th;
        }
    }
}
