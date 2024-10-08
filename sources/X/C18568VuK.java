package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.VuK  reason: case insensitive filesystem */
public final class C18568VuK {
    public C17988VjQ A00;
    public C365388n1 A01;
    public C369008tg A02 = null;
    public C368798tL A03;
    public final C368538so A04 = new C368538so();
    public final AtomicBoolean A05 = JTQ.A0k();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1.A0L == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C368848tQ r7, X.C18568VuK r8, X.C17760VfW r9, X.C369008tg r10, X.C368538so r11) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r4 = r8.A05
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0013
            X.8gx r1 = r7.A05
            X.8gv r1 = (X.C361848gv) r1
            X.8xy r0 = r1.A0k
            if (r0 == 0) goto L_0x0013
            boolean r1 = r1.A0L
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r4.set(r0)
            X.7v0 r0 = r11.A00()
            int r1 = r0.A01
            int r0 = r0.A00
            android.opengl.GLES20.glBindTexture(r1, r0)
            int r0 = r10.A00
            r5 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r5, r0)
            int r1 = r10.A02
            int r0 = r10.A01
            r3 = 0
            android.opengl.GLES20.glViewport(r3, r3, r1, r0)
            X.8n1 r0 = r8.A01
            long r0 = r0.ANS()
            long r0 = X.AnonymousClass7TE.A0P(r0)
            X.8tL r6 = r8.A03
            boolean r2 = r7.A03
            if (r2 == 0) goto L_0x005b
            X.8gx r3 = r7.A05
            boolean r2 = r3 instanceof X.C361878gy
            if (r2 == 0) goto L_0x004e
            r2 = r3
            X.8gy r2 = (X.C361878gy) r2
            r2.EUE(r6)
        L_0x004e:
            boolean r2 = r3 instanceof X.C361848gv
            if (r2 == 0) goto L_0x0057
            r2 = r3
            X.8gv r2 = (X.C361848gv) r2
            r2.A03 = r9
        L_0x0057:
            boolean r3 = r3.DAo(r11, r0)
        L_0x005b:
            r1 = 0
            android.opengl.GLES20.glBindFramebuffer(r5, r1)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r1)
            r4.set(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18568VuK.A00(X.8tQ, X.VuK, X.VfW, X.8tg, X.8so):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4.A00 <= 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C368848tQ r13, X.C17760VfW r14, java.lang.String r15) {
        /*
            r12 = this;
            X.VjQ r0 = r12.A00
            r0.getClass()
            X.VjQ r4 = r12.A00
            monitor-enter(r4)
            int r0 = r4.A02     // Catch:{ all -> 0x0083 }
            if (r0 <= 0) goto L_0x0011
            int r0 = r4.A00     // Catch:{ all -> 0x0083 }
            r1 = 1
            if (r0 > 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r0 = "Frame buffer provider not initialized"
            X.0JA.A09(r1, r0)     // Catch:{ all -> 0x0085 }
            int r1 = r4.A01     // Catch:{ all -> 0x0085 }
            r0 = 4
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1T(r1, r0)
            java.lang.String r0 = "Using more than the expected # of framebuffers"
            X.0JA.A09(r1, r0)     // Catch:{ all -> 0x0085 }
            java.util.List r1 = r4.A03     // Catch:{ all -> 0x0085 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r3 = r1.remove(r2)     // Catch:{ all -> 0x0085 }
            X.8tg r3 = (X.C369008tg) r3     // Catch:{ all -> 0x0085 }
        L_0x0032:
            int r0 = r4.A01     // Catch:{ all -> 0x0085 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x0085 }
            goto L_0x004b
        L_0x0039:
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x0085 }
            int r1 = r4.A02     // Catch:{ all -> 0x0085 }
            int r0 = r4.A00     // Catch:{ all -> 0x0085 }
            X.8tg r3 = new X.8tg     // Catch:{ all -> 0x0085 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0085 }
            r3.A00()     // Catch:{ all -> 0x0085 }
            goto L_0x0032
        L_0x004b:
            monitor-exit(r4)
            X.8so r4 = r12.A04     // Catch:{ all -> 0x007a }
            boolean r0 = A00(r13, r12, r14, r3, r4)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x006d
            X.8tg r1 = r12.A02     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x005d
            X.VjQ r0 = r12.A00     // Catch:{ all -> 0x007a }
            r0.A01(r1)     // Catch:{ all -> 0x007a }
        L_0x005d:
            r12.A02 = r3     // Catch:{ all -> 0x007a }
            X.7v0 r5 = r3.A03     // Catch:{ all -> 0x006b }
            long r10 = r4.A00     // Catch:{ all -> 0x006b }
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r4.A03(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006b }
            goto L_0x0074
        L_0x006b:
            r1 = move-exception
            throw r1
        L_0x006d:
            if (r3 == 0) goto L_0x0074
            X.VjQ r0 = r12.A00
            r0.A01(r3)
        L_0x0074:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C345907uH.A02(r15, r0)
            return
        L_0x007a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0082
            X.VjQ r0 = r12.A00
            r0.A01(r3)
        L_0x0082:
            throw r1
        L_0x0083:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18568VuK.A01(X.8tQ, X.VfW, java.lang.String):void");
    }
}
