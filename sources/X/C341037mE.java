package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.7mE  reason: invalid class name and case insensitive filesystem */
public final class C341037mE implements C341047mF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C346027uT A05;
    public boolean A06;
    public final C341057mG A07 = new C341057mG();
    public final /* synthetic */ C344387rm A08;

    public final void Dh8(SurfaceTexture surfaceTexture) {
        this.A05 = null;
        C344387rm.A04(this.A08, (C346027uT) null);
    }

    public final void Dh9(Surface surface) {
        this.A05 = null;
        C344387rm.A04(this.A08, (C346027uT) null);
    }

    public final boolean FNS() {
        return true;
    }

    public C341037mE(C344387rm r2) {
        this.A08 = r2;
    }

    public static void A00(C341037mE r8) {
        if (r8.A07.getSurfaceTexture() != null) {
            C344387rm r2 = r8.A08;
            r2.A0L.post(new C343237pt(r2, r8.A03, r8.A01, r8.A02, r8.A04, r8.A00, r8.A06));
        }
    }

    public final Object BYV(C341907ni r2) {
        if (r2 == C341897nh.A00) {
            return this.A07.A01;
        }
        if (r2 == C341097mK.A00) {
            return this.A08.A0P;
        }
        return null;
    }

    public final C343177pn Bc6() {
        return null;
    }

    public final C343177pn Bje() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r1 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r7.A07.A02 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.SurfaceTexture C3H(int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r7 = this;
            r7.A03 = r8
            r7.A01 = r9
            r7.A02 = r13
            r7.A04 = r11
            r7.A00 = r12
            r2 = 1
            r0 = 0
            if (r14 != r2) goto L_0x000f
            r0 = 1
        L_0x000f:
            r7.A06 = r0
            r1 = 7
            if (r15 == r1) goto L_0x0015
            r1 = 0
        L_0x0015:
            X.7rm r6 = r7.A08
            int r0 = r6.A00
            if (r1 == r0) goto L_0x002f
            r6.A00 = r1
            r0 = 7
            if (r1 == r0) goto L_0x0021
            r2 = 0
        L_0x0021:
            r6.A0T = r2
            X.7uT r0 = r7.A05
            if (r0 == 0) goto L_0x002f
            r6.EEN(r0)
            X.7uT r0 = r7.A05
            X.C344387rm.A04(r6, r0)
        L_0x002f:
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            boolean r5 = r6.A0Q
            if (r5 == 0) goto L_0x005d
            X.7mG r4 = r7.A07
            r4.A00()
            X.7nh r0 = r4.A01
            r2 = 0
            if (r0 == 0) goto L_0x004a
            boolean r1 = r0.isARCoreEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r4.A02 = r0
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = "ar-session"
            java.lang.String r0 = "regular surface used - async"
            X.0KC.A0C(r1, r0)
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r2)
            r4.A05 = r0
        L_0x005d:
            android.os.Handler r1 = r6.A0L
            X.7ps r0 = new X.7ps
            r0.<init>(r7, r3)
            r1.post(r0)
            if (r5 == 0) goto L_0x006f
            X.7mG r0 = r7.A07     // Catch:{ InterruptedException -> 0x0077 }
            boolean r0 = r0.A02     // Catch:{ InterruptedException -> 0x0077 }
            if (r0 == 0) goto L_0x0087
        L_0x006f:
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0077 }
            r3.await(r1, r0)     // Catch:{ InterruptedException -> 0x0077 }
            goto L_0x0087
        L_0x0077:
            r3 = move-exception
            java.lang.String r2 = X.C344387rm.A0V
            java.lang.String r0 = r3.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Timeout when creating SurfaceNode: %s"
            X.0KC.A0L(r2, r0, r3, r1)
        L_0x0087:
            A00(r7)
            X.7mG r0 = r7.A07
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341037mE.C3H(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }

    public final /* synthetic */ Surface C3I() {
        return null;
    }

    public final /* synthetic */ SurfaceTexture C3J() {
        return null;
    }

    public final C341827na CEH() {
        return this.A08.A0H;
    }

    public final /* synthetic */ C343177pn CHY() {
        return null;
    }

    public final void D0F(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00(this);
        }
    }

    public final void D8b(int i) {
        Handler handler = this.A08.A0K;
        if (handler != null) {
            handler.post(new C378399Pq(this, i));
        }
    }

    public final void Dh5(int i, int i2) {
        C344387rm r2 = this.A08;
        r2.A05 = i;
        r2.A04 = i2;
        r2.A0L.post(new C342117o4(r2));
    }

    public final void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        C346027uT r0 = this.A05;
        if (r0 == null || !(surfaceTexture == null || r0.A0B == surfaceTexture)) {
            C346027uT r1 = new C346027uT(surfaceTexture, false);
            this.A05 = r1;
            C344387rm.A04(this.A08, r1);
        }
        C344387rm r2 = this.A08;
        r2.A05 = i;
        r2.A04 = i2;
        r2.A0L.post(new C342987pU(r2));
    }

    public final void Dh7(Surface surface, int i, int i2) {
        if (surface != null) {
            C346027uT r0 = this.A05;
            if (r0 == null || r0.A00() != surface) {
                C346027uT r1 = new C346027uT(surface, false);
                this.A05 = r1;
                C344387rm.A04(this.A08, r1);
            }
            C344387rm r2 = this.A08;
            r2.A05 = i;
            r2.A04 = i2;
            r2.A0L.post(new C342037nw(r2));
        }
    }

    public final void ECm(SurfaceTexture surfaceTexture) {
        this.A07.A00();
        A00(this);
    }

    public final void EgZ(boolean z) {
        C346027uT r0 = this.A05;
        if (r0 != null) {
            r0.A0D = z;
        }
    }
}
