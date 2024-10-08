package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.7nY  reason: invalid class name and case insensitive filesystem */
public final class C341807nY implements C341047mF {
    public final C341047mF A00;
    public final boolean A01;
    public final /* synthetic */ C340537lQ A02;

    public C341807nY(C341047mF r1, C340537lQ r2, boolean z) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = z;
    }

    public final Object BYV(C341907ni r2) {
        return this.A00.BYV(r2);
    }

    public final C343177pn Bc6() {
        return this.A00.Bc6();
    }

    public final C343177pn Bje() {
        return this.A00.Bje();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0102, code lost:
        if (r3.A00 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3.A08 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.SurfaceTexture C3H(int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            r20 = this;
            r2 = r20
            boolean r5 = r2.A01
            r4 = 0
            if (r5 != 0) goto L_0x0012
            X.7lQ r1 = r2.A02
            X.Vjr r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0.A00()
            r1.A00 = r4
        L_0x0012:
            X.7lQ r3 = r2.A02
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x001d
            boolean r0 = r3.A08
            r9 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            X.7mF r11 = r2.A00
            boolean r0 = r11 instanceof X.C343217pr
            if (r0 == 0) goto L_0x0034
            r2 = r11
            X.7pr r2 = (X.C343217pr) r2
            r1 = r9 ^ 1
            X.VuO r0 = r2.A00
            if (r0 == 0) goto L_0x0032
            r0.A01()
            r2.A00 = r4
        L_0x0032:
            r2.A01 = r1
        L_0x0034:
            r8 = r21
            r7 = r22
            r14 = r23
            r6 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            if (r9 == 0) goto L_0x010b
            if (r5 != 0) goto L_0x0100
            X.Vjr r10 = new X.Vjr
            r10.<init>()
            r3.A00 = r10
            float r9 = r3.A03
            float r2 = r3.A04
            float r1 = r3.A06
            float r0 = r3.A05
            r10.A01(r9, r2, r1, r0)
        L_0x005a:
            int r0 = r6 % 180
            r12 = r8
            r13 = r7
            if (r0 == 0) goto L_0x0062
            r12 = r7
            r13 = r8
        L_0x0062:
            r15 = 0
            android.graphics.SurfaceTexture r9 = r11.C3H(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x008f
            r9.setDefaultBufferSize(r12, r13)
            X.Vjr r2 = r3.A00
            monitor-enter(r2)
            X.VwB r1 = r2.A03     // Catch:{ all -> 0x0105 }
            boolean r0 = r1.A03()     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x008d
            if (r5 != 0) goto L_0x008d
            X.Vl5 r0 = r2.A00     // Catch:{ all -> 0x0105 }
            r2.A00 = r4     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0082
            r0.A03()     // Catch:{ all -> 0x0105 }
        L_0x0082:
            X.7uT r0 = new X.7uT     // Catch:{ all -> 0x0105 }
            r0.<init>((android.graphics.SurfaceTexture) r9, (boolean) r15)     // Catch:{ all -> 0x0105 }
            X.Vl5 r0 = r1.A00(r0)     // Catch:{ all -> 0x0105 }
            r2.A00 = r0     // Catch:{ all -> 0x0105 }
        L_0x008d:
            monitor-exit(r2)
            goto L_0x00b7
        L_0x008f:
            android.view.Surface r9 = r11.C3I()
            if (r9 == 0) goto L_0x00b7
            X.Vjr r2 = r3.A00
            monitor-enter(r2)
            X.VwB r1 = r2.A03     // Catch:{ all -> 0x0105 }
            boolean r0 = r1.A03()     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00b6
            if (r5 != 0) goto L_0x00b6
            X.Vl5 r0 = r2.A00     // Catch:{ all -> 0x0105 }
            r2.A00 = r4     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00ab
            r0.A03()     // Catch:{ all -> 0x0105 }
        L_0x00ab:
            X.7uT r0 = new X.7uT     // Catch:{ all -> 0x0105 }
            r0.<init>((android.view.Surface) r9, (boolean) r15)     // Catch:{ all -> 0x0105 }
            X.Vl5 r0 = r1.A00(r0)     // Catch:{ all -> 0x0105 }
            r2.A00 = r0     // Catch:{ all -> 0x0105 }
        L_0x00b6:
            monitor-exit(r2)
        L_0x00b7:
            X.Vjr r9 = r3.A00
            monitor-enter(r9)
            X.VwB r0 = r9.A03     // Catch:{ all -> 0x0108 }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00c4
            monitor-exit(r9)
            goto L_0x00fa
        L_0x00c4:
            if (r5 == 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            X.Vvx r3 = r9.A05     // Catch:{ all -> 0x0108 }
            goto L_0x00cc
        L_0x00ca:
            X.Vvx r3 = r9.A04     // Catch:{ all -> 0x0108 }
        L_0x00cc:
            X.7uT r0 = r3.A09     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00d6
            r3.A01()     // Catch:{ all -> 0x0108 }
            r0.A01()     // Catch:{ all -> 0x0108 }
        L_0x00d6:
            int r0 = r3.A00     // Catch:{ all -> 0x0108 }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x0108 }
            r2.<init>(r0)     // Catch:{ all -> 0x0108 }
            if (r5 == 0) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r9.A02     // Catch:{ all -> 0x0108 }
            goto L_0x00e5
        L_0x00e3:
            android.graphics.SurfaceTexture$OnFrameAvailableListener r0 = r9.A01     // Catch:{ all -> 0x0108 }
        L_0x00e5:
            r2.setOnFrameAvailableListener(r0)     // Catch:{ all -> 0x0108 }
            r1 = 1
            X.7uT r0 = new X.7uT     // Catch:{ all -> 0x0108 }
            r0.<init>((android.graphics.SurfaceTexture) r2, (boolean) r1)     // Catch:{ all -> 0x0108 }
            r0.A02(r8, r7, r6, r15)     // Catch:{ all -> 0x0108 }
            r3.A02(r4, r0)     // Catch:{ all -> 0x0108 }
            if (r5 == 0) goto L_0x00f8
            r9.A07 = r15     // Catch:{ all -> 0x0108 }
        L_0x00f8:
            monitor-exit(r9)
            r4 = r2
        L_0x00fa:
            if (r4 == 0) goto L_0x0104
            r4.setDefaultBufferSize(r8, r7)
            return r4
        L_0x0100:
            X.Vjr r0 = r3.A00
            if (r0 != 0) goto L_0x005a
        L_0x0104:
            return r4
        L_0x0105:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0108:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x010b:
            r0 = r11
            r1 = r8
            r2 = r7
            r3 = r14
            r4 = r6
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            android.graphics.SurfaceTexture r4 = r0.C3H(r1, r2, r3, r4, r5, r6, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341807nY.C3H(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }

    public final Surface C3I() {
        return this.A00.C3I();
    }

    public final SurfaceTexture C3J() {
        return this.A00.C3J();
    }

    public final C341827na CEH() {
        return this.A00.CEH();
    }

    public final C343177pn CHY() {
        return this.A00.CHY();
    }

    public final void D0F(int i) {
        this.A00.D0F(i);
    }

    public final void D8b(int i) {
        this.A00.D8b(i);
    }

    public final void Dh5(int i, int i2) {
        this.A00.Dh5(i, i2);
    }

    public final void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.Dh6(surfaceTexture, i, i2);
    }

    public final void Dh7(Surface surface, int i, int i2) {
        this.A00.Dh7(surface, i, i2);
    }

    public final void Dh8(SurfaceTexture surfaceTexture) {
        this.A00.Dh8(surfaceTexture);
    }

    public final void Dh9(Surface surface) {
        this.A00.Dh9(surface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r2.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ECm(android.graphics.SurfaceTexture r3) {
        /*
            r2 = this;
            X.7mF r0 = r2.A00
            r0.ECm(r3)
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0015
            X.7lQ r1 = r2.A02
            X.Vjr r0 = r1.A00
            if (r0 == 0) goto L_0x0015
            r0.A00()
            r0 = 0
            r1.A00 = r0
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341807nY.ECm(android.graphics.SurfaceTexture):void");
    }

    public final void EgZ(boolean z) {
        this.A00.EgZ(z);
    }

    public final boolean FNS() {
        return this.A00.FNS();
    }
}
