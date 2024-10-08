package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.util.List;

/* renamed from: X.W5t  reason: case insensitive filesystem */
public final class C18849W5t implements SurfaceTexture.OnFrameAvailableListener {
    public final C3496981j A00;
    public final W1I A01;
    public final C18656VwB A02;
    public final C18647Vvx A03;
    public final Object A04;

    public final synchronized void A00() {
        if (!this.A02.A03()) {
            this.A03.A01();
        }
    }

    public final synchronized void A01() {
        SurfaceTexture surfaceTexture;
        C18656VwB vwB = this.A02;
        if (!vwB.A03()) {
            C18647Vvx vvx = this.A03;
            C346027uT r1 = vvx.A09;
            vvx.A09 = null;
            if (r1 != null) {
                synchronized (r1) {
                    if (vvx.A0A && (surfaceTexture = r1.A0B) != null) {
                        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                    }
                    r1.A01();
                    vvx.A0A = false;
                }
            }
            C3496981j r0 = this.A00;
            List list = r0.A00;
            r0.A00();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C18076Vl5) list.get(i)).A03();
            }
            W1I w1i = this.A01;
            C17613Vb5 vb5 = w1i.A00;
            if (vb5 != null) {
                GLES20.glDeleteProgram(vb5.A00);
                vb5.A00 = -1;
                w1i.A00 = null;
            }
            vwB.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r2.A0E == false) goto L_0x006c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onFrameAvailable(android.graphics.SurfaceTexture r21) {
        /*
            r20 = this;
            r7 = r20
            monitor-enter(r7)
            X.VwB r9 = r7.A02     // Catch:{ all -> 0x008c }
            boolean r0 = r9.A03()     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008a
            X.Vvx r6 = r7.A03     // Catch:{ all -> 0x008c }
            r0 = r21
            boolean r0 = r6.A03(r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            boolean r0 = r9.A03()     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008a
            X.81j r0 = r7.A00     // Catch:{ all -> 0x008c }
            java.util.List r8 = r0.A00     // Catch:{ all -> 0x008c }
            int r5 = r8.size()     // Catch:{ all -> 0x008c }
            r4 = 0
        L_0x0024:
            if (r4 >= r5) goto L_0x008a
            java.lang.Object r3 = r8.get(r4)     // Catch:{ all -> 0x008c }
            X.Vl5 r3 = (X.C18076Vl5) r3     // Catch:{ all -> 0x008c }
            X.7uT r2 = r3.A00     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x007f
            monitor-enter(r2)     // Catch:{ all -> 0x008c }
            boolean r0 = r2.A04()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x007e
            r3.A02()     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r14 = r6.A07     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r15 = r6.A06     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            float[] r10 = r6.A01     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r16 = r3.A01()     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r17 = r3.A00()     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            float[] r12 = r3.A03     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            r1 = 16
            r0 = 0
        L_0x004d:
            r11 = r10[r0]     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            r12[r0] = r11     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r0 = r0 + 1
            if (r0 < r1) goto L_0x004d
            X.7uT r0 = r3.A00     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            if (r0 == 0) goto L_0x005c
            r0.A03(r12)     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
        L_0x005c:
            X.W1I r11 = r7.A01     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r13 = r6.A00     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            int r1 = r2.A08     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            boolean r0 = r6.A0B     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            if (r0 == 0) goto L_0x006c
            boolean r0 = r2.A0E     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            r19 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            r19 = 0
        L_0x006e:
            r18 = r1
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            long r0 = r6.A08     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            r3.A05(r0)     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
            r3.A04()     // Catch:{ RuntimeException -> 0x007b, all -> 0x0082 }
        L_0x007b:
            r9.A01()     // Catch:{ all -> 0x0087 }
        L_0x007e:
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
        L_0x007f:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0082:
            r0 = move-exception
            r9.A01()     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18849W5t.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    public C18849W5t(Object obj) {
        this.A04 = obj;
        C18656VwB vwB = new C18656VwB(obj);
        this.A02 = vwB;
        this.A00 = new C3496981j();
        vwB.A01();
        this.A01 = new W1I();
        this.A03 = new C18647Vvx(vwB, obj);
    }

    public C18849W5t() {
        this(new Object());
    }
}
