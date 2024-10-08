package com.google.android.exoplayer2.video;

import X.Q7v;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

public final class DummySurface extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final Q7v A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A01() != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.video.DummySurface A00(boolean r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x000a
            boolean r1 = A01()
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C256703wD.A04(r0)
            X.Q7v r3 = new X.Q7v
            r3.<init>()
            if (r5 == 0) goto L_0x0017
            int r4 = A02
        L_0x0017:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.TLB r0 = new X.TLB
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x005e }
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch:{ all -> 0x005e }
            r0.sendToTarget()     // Catch:{ all -> 0x005e }
        L_0x0038:
            com.google.android.exoplayer2.video.DummySurface r0 = r3.A02     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            java.lang.RuntimeException r0 = r3.A04     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            java.lang.Error r0 = r3.A03     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004a
            r3.wait()     // Catch:{ InterruptedException -> 0x0048 }
            goto L_0x0038
        L_0x0048:
            r1 = 1
            goto L_0x0038
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0050
            X.Pxe.A1F()
        L_0x0050:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L_0x0060
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L_0x0060
            com.google.android.exoplayer2.video.DummySurface r0 = r3.A02
            r0.getClass()
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.A00(boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    public static synchronized boolean A01() {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A03) {
                int i = 0;
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                    i = 2;
                    if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
                        i = 1;
                    }
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public DummySurface(SurfaceTexture surfaceTexture, Q7v q7v) {
        super(surfaceTexture);
        this.A01 = q7v;
    }

    public final void release() {
        super.release();
        Q7v q7v = this.A01;
        synchronized (q7v) {
            if (!this.A00) {
                q7v.A00.getClass();
                q7v.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
