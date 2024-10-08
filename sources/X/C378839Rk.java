package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.9Rk  reason: invalid class name and case insensitive filesystem */
public final class C378839Rk implements C341067mH {
    public final SurfaceTexture.OnFrameAvailableListener A00;
    public final Object A01;
    public final boolean A02;
    public volatile SurfaceTexture A03;
    public volatile C346267ut A04;
    public volatile int A05;

    private SurfaceTexture A00() {
        SurfaceTexture surfaceTexture;
        SurfaceTexture surfaceTexture2 = this.A03;
        if (surfaceTexture2 != null) {
            return surfaceTexture2;
        }
        synchronized (this.A01) {
            surfaceTexture = this.A03;
            int i = this.A05;
            if (surfaceTexture == null) {
                surfaceTexture = new SurfaceTexture(i);
                this.A03 = surfaceTexture;
            }
            if (i != 0 && this.A02) {
                surfaceTexture.setOnFrameAvailableListener(this.A00);
            }
        }
        return surfaceTexture;
    }

    public final long C7X() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0;
    }

    public final void C9S(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public final void Dr8(int i) {
        this.A05 = i;
        if (i != 0) {
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                surfaceTexture.attachToGLContext(i);
                if (this.A02) {
                    surfaceTexture.setOnFrameAvailableListener(this.A00);
                }
                surfaceTexture.updateTexImage();
                return;
            }
            A00();
        }
    }

    public final void Dr9() {
        if (this.A03 != null) {
            synchronized (this.A01) {
                SurfaceTexture surfaceTexture = this.A03;
                this.A03 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        this.A05 = 0;
    }

    public final void FLm() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture == null) {
            return A00();
        }
        return surfaceTexture;
    }

    public C378839Rk(boolean z) {
        this.A01 = new Object();
        this.A00 = new ALA(this, 1);
        this.A02 = z;
    }

    public final void EU1(int i, int i2) {
        getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    public final void EeQ(C346267ut r1) {
        this.A04 = r1;
    }

    public C378839Rk() {
        this(true);
    }
}
