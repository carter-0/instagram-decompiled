package com.google.android.exoplayer2.video;

import X.Q7w;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class PlaceholderSurface extends Surface {
    public static int A03;
    public static boolean A04;
    public boolean A00;
    public final boolean A01;
    public final Q7w A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A01() != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.video.PlaceholderSurface A00(boolean r5) {
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
            X.Q7w r3 = new X.Q7w
            r3.<init>()
            if (r5 == 0) goto L_0x0017
            int r4 = A03
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
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r3.A02     // Catch:{ all -> 0x005e }
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
            com.google.android.exoplayer2.video.PlaceholderSurface r0 = r3.A02
            r0.getClass()
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005e }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.PlaceholderSurface.A00(boolean):com.google.android.exoplayer2.video.PlaceholderSurface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1.contains("EGL_KHR_surfaceless_context") == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A01() {
        /*
            java.lang.Class<com.google.android.exoplayer2.video.PlaceholderSurface> r5 = com.google.android.exoplayer2.video.PlaceholderSurface.class
            monitor-enter(r5)
            boolean r0 = A04     // Catch:{ all -> 0x003e }
            r4 = 1
            if (r0 != 0) goto L_0x0037
            r3 = 0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch:{ all -> 0x003e }
            r2 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r0, r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0032
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r0, r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x003e }
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0030:
            r0 = 2
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            A03 = r0     // Catch:{ all -> 0x003e }
            A04 = r4     // Catch:{ all -> 0x003e }
        L_0x0037:
            int r0 = A03     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003c
            r4 = 0
        L_0x003c:
            monitor-exit(r5)
            return r4
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.PlaceholderSurface.A01():boolean");
    }

    public PlaceholderSurface(SurfaceTexture surfaceTexture, Q7w q7w, boolean z) {
        super(surfaceTexture);
        this.A02 = q7w;
        this.A01 = z;
    }

    public final void release() {
        super.release();
        Q7w q7w = this.A02;
        synchronized (q7w) {
            if (!this.A00) {
                q7w.A00.getClass();
                q7w.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
