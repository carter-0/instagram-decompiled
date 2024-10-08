package com.instagram.quicksnap.util;

import X.0qQ;
import X.0sr;
import X.C61380mr;
import X.C74359PtZ;
import X.PJE;
import X.T89;
import android.content.Context;
import java.util.List;

public final class QuickSnapRecapVideoGenerator {
    public final List A00;
    public final int A01;
    public final Context A02;

    public QuickSnapRecapVideoGenerator(Context context, int i) {
        0qQ.A0B(context, 1);
        this.A02 = context;
        this.A01 = i;
        this.A00 = 0sr.A1M(new C74359PtZ[]{new PJE(i), new T89(C61380mr.A01(context, 32))});
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r1 == r10) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.List r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = 36
            r4 = r20
            boolean r0 = X.C66138MDq.A02(r3, r4)
            r7 = r18
            if (r0 == 0) goto L_0x0094
            r6 = r4
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0094
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r6.A02
            X.1Hj r10 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            r5 = 0
            r4 = 2
            if (r0 == 0) goto L_0x005c
            if (r0 == r3) goto L_0x007e
            if (r0 != r4) goto L_0x0161
            java.lang.Object r0 = r6.A01
            com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator r0 = (com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator) r0
            X.0eS.A00(r1)
        L_0x0030:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 == 0) goto L_0x0166
            java.util.List r7 = X.00k.A0X(r1)
            android.content.Context r2 = r0.A02
            long r4 = java.lang.System.nanoTime()
            r13 = 0
            java.lang.String r1 = ".mp4"
            java.lang.String r10 = X.AnonymousClass457.A09(r2, r1, r4, r13)
            X.0qQ.A07(r10)
            X.SON r6 = new X.SON
            r6.<init>()
            int r12 = r7.size()
            java.util.ArrayList r11 = X.00k.A0S(r7, r7)
            int r0 = r0.A01
            r6.A02 = r0
            r6.A00 = r0
            goto L_0x009a
        L_0x005c:
            X.0eS.A00(r1)
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 1601186431(0x5f702a7f, float:1.7305784E19)
            r0 = 3
            X.0nV r2 = r2.CO6(r1, r0)
            r1 = 48
            X.MfO r0 = new X.MfO
            r8 = r19
            r0.<init>(r7, r8, r5, r1)
            r6.A01 = r7
            r6.A00 = r3
            java.lang.Object r1 = X.1Eo.A00(r6, r2, r0)
            if (r1 == r10) goto L_0x0093
            r0 = r7
            goto L_0x0085
        L_0x007e:
            java.lang.Object r0 = r6.A01
            com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator r0 = (com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator) r0
            X.0eS.A00(r1)
        L_0x0085:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0166
            r6.A01 = r0
            r6.A00 = r4
            java.lang.Object r1 = X.AnonymousClass42T.A00(r1, r6)
            if (r1 != r10) goto L_0x0030
        L_0x0093:
            return r10
        L_0x0094:
            X.MDq r6 = new X.MDq
            r6.<init>(r7, r4, r3)
            goto L_0x001a
        L_0x009a:
            X.SON.A01(r6, r10, r0, r0)     // Catch:{ all -> 0x0157 }
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0157 }
            r9.<init>(r3)     // Catch:{ all -> 0x0157 }
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0157 }
            r8.<init>()     // Catch:{ all -> 0x0157 }
            android.os.HandlerThread r7 = r6.A09     // Catch:{ all -> 0x0157 }
            r7.start()     // Catch:{ all -> 0x0157 }
            X.Q6d r2 = new X.Q6d     // Catch:{ all -> 0x0157 }
            r2.<init>(r6, r9, r8)     // Catch:{ all -> 0x0157 }
            android.media.MediaCodec r1 = r6.A04     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x00bc
            android.os.Handler r0 = X.Pxf.A0H(r7)     // Catch:{ all -> 0x0157 }
            r1.setCallback(r2, r0)     // Catch:{ all -> 0x0157 }
        L_0x00bc:
            android.media.MediaCodec r1 = r6.A04     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x00c6
            r0 = -725204566(0xffffffffd4c641aa, float:-6.8120415E12)
            X.0fX.A05(r1, r0)     // Catch:{ all -> 0x0157 }
        L_0x00c6:
            X.QLz r0 = r6.A06     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00cd
            r0.A00()     // Catch:{ all -> 0x0157 }
        L_0x00cd:
            int r2 = r6.A02     // Catch:{ all -> 0x0157 }
            int r1 = r6.A00     // Catch:{ all -> 0x0157 }
            X.S52 r0 = new X.S52     // Catch:{ all -> 0x0157 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0157 }
            r6.A07 = r0     // Catch:{ all -> 0x0157 }
            int r5 = r11.size()     // Catch:{ all -> 0x0157 }
            r4 = 0
            r17 = 0
        L_0x00df:
            if (r4 >= r5) goto L_0x0130
            java.lang.Object r1 = X.00k.A0O(r11, r4)     // Catch:{ all -> 0x0157 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x00f2
            X.S52 r0 = r6.A07     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00f2
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLUtils.texImage2D(r0, r13, r1, r13)     // Catch:{ all -> 0x0157 }
        L_0x00f2:
            r1 = 1051931443(0x3eb33333, float:0.35)
            if (r4 >= r12) goto L_0x00fa
            r1 = 1036831949(0x3dcccccd, float:0.1)
        L_0x00fa:
            r0 = 1106247680(0x41f00000, float:30.0)
            float r0 = r0 * r1
            int r3 = (int) r0     // Catch:{ all -> 0x0157 }
            r2 = 0
        L_0x00ff:
            if (r2 >= r3) goto L_0x012b
            X.S52 r0 = r6.A07     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0108
            r0.A01()     // Catch:{ all -> 0x0157 }
        L_0x0108:
            X.QLz r14 = r6.A06     // Catch:{ all -> 0x0157 }
            if (r14 == 0) goto L_0x011d
            int r0 = r17 + r2
            long r0 = (long) r0     // Catch:{ all -> 0x0157 }
            r15 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r15
            r15 = 30
            long r0 = r0 / r15
            android.opengl.EGLDisplay r15 = r14.A01     // Catch:{ all -> 0x0157 }
            android.opengl.EGLSurface r14 = r14.A02     // Catch:{ all -> 0x0157 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r15, r14, r0)     // Catch:{ all -> 0x0157 }
        L_0x011d:
            X.QLz r0 = r6.A06     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0128
            android.opengl.EGLDisplay r1 = r0.A01     // Catch:{ all -> 0x0157 }
            android.opengl.EGLSurface r0 = r0.A02     // Catch:{ all -> 0x0157 }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ all -> 0x0157 }
        L_0x0128:
            int r2 = r2 + 1
            goto L_0x00ff
        L_0x012b:
            int r17 = r17 + r3
            int r4 = r4 + 1
            goto L_0x00df
        L_0x0130:
            android.media.MediaCodec r0 = r6.A04     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0137
            r0.signalEndOfInputStream()     // Catch:{ all -> 0x0157 }
        L_0x0137:
            r9.await()     // Catch:{ InterruptedException -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r0 = move-exception
            r8.set(r0)     // Catch:{ all -> 0x0157 }
        L_0x013f:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x014c
            r7.quitSafely()
            X.SON.A00(r6)
            return r10
        L_0x014c:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x0157 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0157 }
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r1 = move-exception
            android.os.HandlerThread r0 = r6.A09
            r0.quitSafely()
            X.SON.A00(r6)
            throw r1
        L_0x0161:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0166:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator.A00(java.util.List, X.4D7):java.lang.Object");
    }
}
