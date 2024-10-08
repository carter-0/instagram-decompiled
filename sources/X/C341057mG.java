package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.7mG  reason: invalid class name and case insensitive filesystem */
public final class C341057mG implements C341067mH {
    public int A00;
    public C341897nh A01;
    public boolean A02;
    public final SurfaceTexture.OnFrameAvailableListener A03 = new C341077mI(this);
    public volatile SurfaceTexture A04;
    public volatile SurfaceTexture A05;
    public volatile C346267ut A06;

    public final void Dr9() {
        this.A00 = 0;
    }

    public final void A00() {
        SurfaceTexture surfaceTexture = this.A05;
        this.A05 = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.A04 = null;
        this.A02 = false;
    }

    public final long C7X() {
        C341897nh r0;
        if (this.A02 && (r0 = this.A01) != null) {
            long frameTimestamp = r0.getFrameTimestamp();
            if (frameTimestamp != 0) {
                return frameTimestamp;
            }
        }
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        return surfaceTexture.getTimestamp();
    }

    public final void FLm() {
        C341897nh r0;
        SurfaceTexture surfaceTexture = this.A05;
        if (this.A02 && (r0 = this.A01) != null) {
            r0.update();
        } else if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final SurfaceTexture getSurfaceTexture() {
        if (this.A02) {
            return this.A04;
        }
        return this.A05;
    }

    public final void C9S(float[] fArr) {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        surfaceTexture.getTransformMatrix(fArr);
    }

    public final void EU1(int i, int i2) {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(i, i2);
    }

    public final void Dr8(int i) {
        this.A00 = i;
    }

    public final void EeQ(C346267ut r1) {
        this.A06 = r1;
    }
}
