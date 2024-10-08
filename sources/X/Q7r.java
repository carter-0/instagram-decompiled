package X;

import android.hardware.SensorManager;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

public final class Q7r extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7r(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    public final void handleMessage(Message message) {
        C10326RqO rqO;
        C10711Rwp rwp;
        C315796kZ r0;
        switch (this.A00) {
            case 0:
                if (message.what == 1) {
                    SHT sht = (SHT) this.A01;
                    Executor executor = SHT.A04;
                    sht.A03.set(false);
                    SHT.A04.execute(new TCP(sht));
                    return;
                }
                return;
            case 1:
                if (message.what == 1) {
                    C12231Spl spl = (C12231Spl) this.A01;
                    C12231Spl.A01(spl, new TCR(spl));
                    C12231Spl.A01(spl, new TCS(spl));
                    return;
                }
                return;
            default:
                0qQ.A0B(message, 0);
                Q7x q7x = (Q7x) this.A01;
                if (!q7x.isInterrupted()) {
                    C8836RBw rBw = (C8836RBw) q7x;
                    int i = message.what;
                    if (i == 8) {
                        Object obj = message.obj;
                        if (!(!(obj instanceof C10711Rwp) || (rwp = (C10711Rwp) obj) == null || (r0 = (C315796kZ) rBw.A02.get()) == null)) {
                            C315826kc r1 = r0.A03;
                            switch (rwp.A03.intValue()) {
                                case 0:
                                    r1.A00.E1f();
                                    return;
                                case 1:
                                    r1.A00.E1e(rwp.A01, rwp.A02);
                                    return;
                                case 2:
                                    r1.A00.E1d(rwp.A01, rwp.A02);
                                    return;
                                case 3:
                                    r1.A00.E2m();
                                    return;
                                case 4:
                                    r1.A00.E2l(rwp.A00, rwp.A01, rwp.A02, 0.0f, 0.0f, 0.0f);
                                    return;
                                default:
                                    r1.A00.E2k();
                                    return;
                            }
                        }
                    } else if (i == 9 && C8836RBw.A00(rBw)) {
                        return;
                    }
                    switch (message.what) {
                        case 0:
                            q7x.A03();
                            return;
                        case 1:
                            if (!q7x.A0H) {
                                long j = 0;
                                Object obj2 = message.obj;
                                if ((obj2 instanceof C10326RqO) && (rqO = (C10326RqO) obj2) != null) {
                                    j = rqO.A00;
                                }
                                q7x.A0B.postFrameCallback(q7x.A0A);
                                C315826kc r9 = q7x.A0C;
                                C315866ki r12 = r9.A08;
                                synchronized (r12) {
                                    00k.A0L(r12.A00);
                                }
                                C315836kd r7 = r9.A09;
                                float f = r7.A00;
                                if (!(f == 0.0f && r7.A02 == 0.0f && r7.A01 == 0.0f)) {
                                    r9.A00.Ezl(f, r7.A01, r7.A02);
                                }
                                r9.A00.FJN(r9.A07, ((double) j) / 1.0E9d);
                                r9.A00.CHW();
                                r9.A00.Bcb();
                                r9.A00.BoZ();
                                q7x.A04();
                                return;
                            }
                            return;
                        case 2:
                            break;
                        case 3:
                            q7x.A05.A01();
                            return;
                        case 4:
                            C11247SHh sHh = q7x.A05;
                            int i2 = q7x.A01;
                            int i3 = q7x.A00;
                            sHh.A01 = (int) (((float) i2) / 2.0f);
                            sHh.A00 = (int) (((float) i3) / 2.0f);
                            if (sHh.A04) {
                                C11247SHh.A00(sHh);
                                return;
                            }
                            return;
                        case 5:
                            C315826kc r13 = q7x.A0C;
                            r13.A02 = true;
                            r13.A01 = true;
                            q7x.A02();
                            return;
                        case 6:
                            C11446SVi sVi = q7x.A0E;
                            SensorManager sensorManager = sVi.A01;
                            if (sensorManager != null) {
                                C60240fb.A00(sVi, sensorManager);
                            }
                            q7x.A0C.A02 = false;
                            return;
                        case 7:
                            C11247SHh sHh2 = q7x.A05;
                            sHh2.A01();
                            C346067uX r14 = q7x.A03;
                            if (r14 != null) {
                                try {
                                    r14.A05();
                                    GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                                    r14.A03();
                                } catch (RuntimeException e) {
                                    q7x.A0D.Ew2(002.A0R("IgGlMediaRenderThread", ".reuseResource"), "Error encountered in clearing and reusing the SurfaceTexture", e);
                                }
                            }
                            if (sHh2.A02 != null) {
                                sHh2.A01();
                            }
                            sHh2.A02 = new C10325RqN();
                            return;
                        default:
                            return;
                    }
                }
                q7x.quit();
                q7x.A0B.removeFrameCallback(q7x.A0A);
                C11446SVi sVi2 = q7x.A0E;
                SensorManager sensorManager2 = sVi2.A01;
                if (sensorManager2 != null) {
                    C60240fb.A00(sVi2, sensorManager2);
                }
                q7x.A05.A01();
                C346067uX r6 = q7x.A03;
                if (r6 != null) {
                    try {
                        r6.A05();
                        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                        r6.A03();
                    } catch (RuntimeException e2) {
                        q7x.A0D.Ew2(002.A0R("IgGlMediaRenderThread", ".releaseResources"), "Error encountered in clearing the SurfaceTexture", e2);
                    }
                    EGLSurface eGLSurface = r6.A00;
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(r6.A01.A04, eGLSurface);
                    }
                    r6.A00 = EGL14.EGL_NO_SURFACE;
                    r6.A01.release();
                    q7x.A03 = null;
                }
                q7x.A02 = null;
                return;
        }
    }
}
