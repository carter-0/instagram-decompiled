package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;

public final class AXQ implements XBS, Y9N, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public SurfaceTexture A01;
    public int A02;
    public int A03;
    public final C40098ARk A04;
    public final C341897nh A05;
    public final Object A06 = new Object();
    public final WindowManager A07;
    public final C392239uR A08;
    public final C40183AUx A09;
    public final UserSession A0A;
    public final boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public static void A00(AXQ axq) {
        synchronized (axq.A06) {
            C40183AUx aUx = axq.A09;
            if (aUx != null) {
                aUx.A03 = null;
                C40183AUx.A00(aUx);
            }
            SurfaceTexture surfaceTexture = axq.A01;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                axq.A01 = null;
            }
            axq.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.A06
            monitor-enter(r5)
            X.7nh r1 = r6.A05     // Catch:{ all -> 0x0030 }
            boolean r0 = r6.A0C     // Catch:{ all -> 0x0030 }
            r3 = 0
            if (r0 == 0) goto L_0x000e
            if (r1 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r1 = 0
            goto L_0x0019
        L_0x0011:
            long r1 = r1.getFrameTimestamp()     // Catch:{ all -> 0x0030 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
        L_0x0019:
            boolean r0 = r6.A0C     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0020
            android.graphics.SurfaceTexture r0 = r6.A00     // Catch:{ all -> 0x0030 }
            goto L_0x0022
        L_0x0020:
            android.graphics.SurfaceTexture r0 = r6.A01     // Catch:{ all -> 0x0030 }
        L_0x0022:
            if (r0 == 0) goto L_0x0028
            long r1 = r0.getTimestamp()     // Catch:{ all -> 0x0030 }
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0030 }
            X.9uR r0 = r6.A08
            long r0 = r0.A00(r1)
            return r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXQ.A01():long");
    }

    public final void A02(C346337v0 r4) {
        Object obj = this.A06;
        synchronized (obj) {
            if (!this.A0B || this.A0C) {
                SurfaceTexture surfaceTexture = this.A01;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.A01 = null;
                }
                this.A00 = null;
                C341897nh r1 = this.A05;
                if (!this.A0C || r1 == null) {
                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(r4.A00);
                    this.A01 = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(this);
                    this.A0D = false;
                } else {
                    this.A00 = r1.getArSurfaceTexture(r4.A00, this);
                }
            } else {
                SurfaceTexture surfaceTexture3 = this.A01;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.detachFromGLContext();
                    surfaceTexture3.attachToGLContext(r4.A00);
                    surfaceTexture3.setOnFrameAvailableListener(this, this.A04.A0D);
                }
            }
            C40183AUx aUx = this.A09;
            if (aUx != null) {
                aUx.A03 = this;
                C40183AUx.A00(aUx);
            }
            obj.notifyAll();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7v7] */
    public final C346407v7 BHQ() {
        Integer num;
        if (this.A02 == 1) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        ? obj = new Object();
        obj.A00 = num;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.7v8] */
    public final C346417v8 BHV() {
        int rotation = this.A07.getDefaultDisplay().getRotation();
        int i = this.A03;
        ? obj = new Object();
        obj.A00 = rotation;
        obj.A01 = i;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.isARCoreEnabled() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.SurfaceTexture BHY() {
        /*
            r7 = this;
            boolean r2 = r7.A0C
            X.7nh r6 = r7.A05
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L_0x000f
            boolean r1 = r6.isARCoreEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r2 == r0) goto L_0x001b
            A00(r7)
            X.ARk r1 = r7.A04
            r0 = 0
            r1.A00(r0)
        L_0x001b:
            java.lang.Object r3 = r7.A06
            monitor-enter(r3)
            X.ARk r0 = r7.A04     // Catch:{ all -> 0x0071 }
            r0.A00(r7)     // Catch:{ all -> 0x0071 }
            android.graphics.SurfaceTexture r2 = r7.A01     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x002d
            boolean r0 = r7.A0D     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0070
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r5 = 0
            goto L_0x0038
        L_0x0032:
            boolean r0 = r6.isARCoreEnabled()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0030
        L_0x0038:
            r7.A0C = r5     // Catch:{ all -> 0x0071 }
            boolean r0 = r7.A0B     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r7.A0C     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x004f
            A00(r7)     // Catch:{ all -> 0x0071 }
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x0071 }
            r2.<init>(r4)     // Catch:{ all -> 0x0071 }
            r7.A01 = r2     // Catch:{ all -> 0x0071 }
            r7.A0D = r4     // Catch:{ all -> 0x0071 }
            goto L_0x002b
        L_0x004f:
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r2 = move-exception
            java.lang.String r1 = "IgCameraVideoInputV2"
            java.lang.String r0 = "Wait for SurfaceTexture was interrupted"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x0071 }
        L_0x005d:
            boolean r0 = r7.A0C     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0064
            android.graphics.SurfaceTexture r2 = r7.A00     // Catch:{ all -> 0x0071 }
            goto L_0x0066
        L_0x0064:
            android.graphics.SurfaceTexture r2 = r7.A01     // Catch:{ all -> 0x0071 }
        L_0x0066:
            if (r2 != 0) goto L_0x002b
            java.lang.String r1 = "IgCameraVideoInputV2"
            java.lang.String r0 = "MP: Failed SurfaceTexture creation for camera preview"
            X.0kD.A01(r1, r0)     // Catch:{ all -> 0x0071 }
            goto L_0x002b
        L_0x0070:
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXQ.BHY():android.graphics.SurfaceTexture");
    }

    public final C365408n3 CE6() {
        return this.A04;
    }

    public final void Cvq(SurfaceTexture surfaceTexture) {
        C40098ARk aRk = this.A04;
        C365438n7 r0 = aRk.A0H;
        if (r0 != null) {
            r0.Crt(aRk);
        }
    }

    public final void EQR(int i, int i2) {
        C40098ARk aRk = this.A04;
        aRk.A0G = new C365368mz(i2, i, i, i2, 0, 0);
        C346337v0 r2 = aRk.A02;
        if (r2 != null) {
            r2.A00(aRk.A0G.A02, aRk.A0G.A01);
        }
    }

    public final void onCameraClosed() {
        this.A04.A00((AXQ) null);
        synchronized (this.A06) {
            this.A0D = true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C40098ARk aRk = this.A04;
        C365438n7 r0 = aRk.A0H;
        if (r0 != null) {
            r0.Crt(aRk);
        }
    }

    public AXQ(Context context, WindowManager windowManager, C392239uR r7, C40183AUx aUx, C341897nh r9, UserSession userSession, boolean z) {
        this.A05 = r9;
        this.A09 = aUx;
        this.A07 = windowManager;
        this.A08 = r7;
        this.A0B = z;
        this.A0A = userSession;
        C340267kz.A02 = AnonymousClass7TF.A1V(aUx);
        this.A04 = new C40098ARk(context, C365378n0.DISABLE, C365138mb.A01, C365468nA.CROP);
    }

    public final void EQO(int i) {
        this.A02 = i;
    }

    public final void Ejw(int i) {
        this.A03 = i;
    }
}
