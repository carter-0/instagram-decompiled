package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.instagram.common.session.UserSession;

/* renamed from: X.WIf  reason: case insensitive filesystem */
public final class C19053WIf implements C341047mF {
    public SurfaceTexture A00;
    public final C341097mK A01;
    public final C341897nh A02;
    public final C19202WPi A03;
    public final UserSession A04;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1.A0H == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.SurfaceTexture C3H(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.WPi r2 = r6.A03     // Catch:{ all -> 0x008e }
            monitor-enter(r2)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r7 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            X.7l3 r1 = r2.A0C     // Catch:{ all -> 0x008b }
            boolean r0 = r1 instanceof X.C340297l2     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0032
            X.7l2 r1 = (X.C340297l2) r1     // Catch:{ all -> 0x008b }
            X.7tb r0 = X.C340297l2.A02(r1)     // Catch:{ all -> 0x008b }
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0     // Catch:{ all -> 0x008b }
            X.7lR r1 = r0.A04     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0026
            boolean r1 = r1.A0H     // Catch:{ all -> 0x008b }
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x0032
            int r0 = r10 % 180
            if (r0 != 0) goto L_0x0032
            r2.A01 = r8     // Catch:{ all -> 0x008b }
            r2.A00 = r7     // Catch:{ all -> 0x008b }
            goto L_0x0036
        L_0x0032:
            r2.A01 = r7     // Catch:{ all -> 0x008b }
            r2.A00 = r8     // Catch:{ all -> 0x008b }
        L_0x0036:
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            r0 = -1
            if (r9 == r0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r5 = 0
            goto L_0x0041
        L_0x003f:
            r2.A02 = r9     // Catch:{ all -> 0x008b }
        L_0x0041:
            X.C19202WPi.A01(r2)     // Catch:{ all -> 0x008b }
            boolean r1 = r2.A0O     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "SurfaceTexture must be present with non-zero size!"
            X.17k.A0H(r1, r0)     // Catch:{ all -> 0x008b }
            X.XBS r0 = r2.A0D     // Catch:{ all -> 0x008b }
            r0.Ejw(r10)     // Catch:{ all -> 0x008b }
            r0.EQO(r13)     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x0071
            X.Vhm r4 = r2.A0E     // Catch:{ all -> 0x008b }
            int r1 = r2.A01     // Catch:{ all -> 0x008b }
            int r0 = r2.A00     // Catch:{ all -> 0x008b }
            X.XBS r3 = r4.A04     // Catch:{ all -> 0x008b }
            r3.EQR(r1, r0)     // Catch:{ all -> 0x008b }
            java.lang.ref.WeakReference r0 = r4.A05     // Catch:{ all -> 0x008b }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x008b }
            X.VwH r1 = (X.C18660VwH) r1     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0071
            X.8n3 r0 = r3.CE6()     // Catch:{ all -> 0x008b }
            r1.A03(r0, r3)     // Catch:{ all -> 0x008b }
        L_0x0071:
            if (r5 == 0) goto L_0x0080
            X.A7S r0 = r2.A0F     // Catch:{ all -> 0x008b }
            X.A97 r1 = r0.A04     // Catch:{ all -> 0x008b }
            int r0 = r1.A00     // Catch:{ all -> 0x008b }
            if (r9 == r0) goto L_0x007d
            r1.A00 = r9     // Catch:{ all -> 0x008b }
        L_0x007d:
            r1.A00()     // Catch:{ all -> 0x008b }
        L_0x0080:
            X.Vhm r0 = r2.A0E     // Catch:{ all -> 0x008b }
            X.XBS r0 = r0.A04     // Catch:{ all -> 0x008b }
            android.graphics.SurfaceTexture r0 = r0.BHY()     // Catch:{ all -> 0x008b }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            monitor-exit(r6)
            return r0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19053WIf.C3H(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }

    public final synchronized SurfaceTexture C3J() {
        return this.A00;
    }

    public final synchronized C341827na CEH() {
        return null;
    }

    public final /* synthetic */ void D0F(int i) {
    }

    public final /* synthetic */ void D8b(int i) {
    }

    public final synchronized void Dh5(int i, int i2) {
        C19202WPi wPi = this.A03;
        if (!(wPi.A04 == i && wPi.A03 == i2)) {
            wPi.A09 = true;
        }
        wPi.A04 = i;
        wPi.A03 = i2;
        C19202WPi.A01(wPi);
    }

    public final synchronized void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = surfaceTexture;
        C19202WPi wPi = this.A03;
        wPi.A05 = surfaceTexture;
        wPi.A04 = i;
        wPi.A03 = i2;
        C19202WPi.A01(wPi);
    }

    public final /* synthetic */ void Dh7(Surface surface, int i, int i2) {
    }

    public final synchronized void Dh8(SurfaceTexture surfaceTexture) {
        this.A00 = null;
        C19202WPi wPi = this.A03;
        synchronized (wPi) {
            if (wPi.A05 == surfaceTexture) {
                C365208mi r1 = wPi.A0E.A00;
                if (!(r1 == null || r1.A03 == null)) {
                    C365228mk r0 = r1.A04;
                    if (r0 != null) {
                        r0.EzD(r1);
                    }
                    r1.A03 = null;
                }
                wPi.A05 = null;
            }
        }
    }

    public final /* synthetic */ void Dh9(Surface surface) {
    }

    public final synchronized void ECm(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.A03.A02();
        }
    }

    public final /* synthetic */ void EgZ(boolean z) {
    }

    public final boolean FNS() {
        return true;
    }

    public final Object BYV(C341907ni r2) {
        if (r2 == C341897nh.A00) {
            return this.A02;
        }
        if (r2 == C341097mK.A00) {
            return this.A01;
        }
        return null;
    }

    public final /* synthetic */ C343177pn Bc6() {
        return null;
    }

    public final /* synthetic */ C343177pn Bje() {
        return null;
    }

    public final /* synthetic */ Surface C3I() {
        return null;
    }

    public final C343177pn CHY() {
        return null;
    }

    public C19053WIf(C341097mK r1, C341897nh r2, C19202WPi wPi, UserSession userSession) {
        this.A02 = r2;
        this.A03 = wPi;
        this.A01 = r1;
        this.A04 = userSession;
    }
}
