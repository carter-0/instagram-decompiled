package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ARj  reason: case insensitive filesystem */
public final class C40097ARj implements C365408n3 {
    public int A00;
    public long A01;
    public SurfaceTexture A02;
    public C346337v0 A03;
    public int A04;
    public final Object A05 = new Object();
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final SurfaceTexture.OnFrameAvailableListener A07 = new ALA(this, 0);
    public final C392239uR A08;
    public final C365378n0 A09;
    public final C365388n1 A0A;
    public final AnonymousClass8n4 A0B = new AnonymousClass8n4();
    public final C365468nA A0C;
    public final AXP A0D;
    public final String A0E;
    public final boolean A0F;
    public volatile C365368mz A0G = new C365368mz(0, 0, 0, 0, 0, 0);
    public volatile C365438n7 A0H;
    public volatile boolean A0I;

    public C40097ARj(C392239uR r11, C365378n0 r12, C365388n1 r13, C365468nA r14, AXP axp) {
        this.A0D = axp;
        this.A0A = r13;
        this.A08 = r11;
        this.A09 = r12;
        this.A0C = r14;
        this.A0F = true;
        this.A0E = "IgCameraVideoInputV1";
        this.A0I = true;
    }

    public final C365388n1 AoM() {
        return this.A0A;
    }

    public final int Ap3() {
        return this.A0G.A00;
    }

    public final AnonymousClass8n4 B81() {
        this.A03.getClass();
        this.A02.getClass();
        int andSet = this.A06.getAndSet(0);
        try {
            synchronized (this.A05) {
                if (this.A0I) {
                    for (int i = 0; i < andSet; i++) {
                        this.A02.updateTexImage();
                    }
                }
            }
            if (andSet > 0) {
                this.A04 = 0;
            }
        } catch (RuntimeException e) {
            int i2 = this.A04 + 1;
            this.A04 = i2;
            if (i2 >= 10) {
                throw e;
            }
        }
        C345907uH.A02("SurfaceVideoInput::updateTexImage", new Object[0]);
        AnonymousClass8n4 r1 = this.A0B;
        r1.A06(this, this.A03);
        return r1;
    }

    public final int BHR() {
        return this.A0G.A01;
    }

    public final int BHc() {
        return this.A0G.A02;
    }

    public final String BO5() {
        return this.A0E;
    }

    public final long Beq() {
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            return 0;
        }
        return this.A08.A00(surfaceTexture.getTimestamp());
    }

    public final int Bez() {
        return this.A0G.A03;
    }

    public final int BfA() {
        return this.A0G.A04;
    }

    public final C365468nA Bnc() {
        return this.A0C;
    }

    public final void C9S(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            Matrix.setIdentityM(fArr, 0);
        } else {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public final boolean CKh() {
        return false;
    }

    public final void CMV(C365438n7 r6) {
        SurfaceTexture surfaceTexture;
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        0JA.A07(z);
        synchronized (this.A05) {
            r6.EXB(this.A09, this);
            this.A01 = 0;
            this.A00 = 0;
            if (C344237rX.A00()) {
                C381079b8 r2 = new C381079b8("SurfaceVideoInput");
                this.A03 = r2;
                r2.A00(this.A0G.A02, this.A0G.A01);
                surfaceTexture = new SurfaceTexture(r2.A00.A00);
            } else {
                C346327uz r1 = new C346327uz("SurfaceVideoInput");
                r1.A03 = 36197;
                C346337v0 r22 = new C346337v0(r1);
                this.A03 = r22;
                r22.A00(this.A0G.A02, this.A0G.A01);
                surfaceTexture = new SurfaceTexture(this.A03.A00);
            }
            this.A02 = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this.A07);
            this.A0H = r6;
            try {
                this.A0I = true;
                AXP axp = this.A0D;
                SurfaceTexture surfaceTexture2 = this.A02;
                Object obj = axp.A03;
                synchronized (obj) {
                    try {
                        axp.A00 = surfaceTexture2;
                        obj.notifyAll();
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final boolean EFG() {
        return this.A0F;
    }

    public final boolean EFH() {
        return !this.A0F;
    }

    public final void release() {
        synchronized (this.A05) {
            try {
                this.A0I = false;
                if (this.A02 != null) {
                    this.A03.getClass();
                    AXP axp = this.A0D;
                    synchronized (axp.A03) {
                        try {
                            axp.A00 = null;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    this.A02.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                    this.A02.release();
                    this.A02 = null;
                    this.A06.set(0);
                    this.A03.A01();
                    this.A03 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void destroy() {
        release();
    }
}
