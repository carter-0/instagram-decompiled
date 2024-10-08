package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class AV6 implements C341047mF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public volatile C346027uT A06;
    public final /* synthetic */ C345827u9 A07;

    public final SurfaceTexture C3H(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A07.A0B.post(new C40958Am4(this, countDownLatch));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0KC.A0L("RendererSurfacePipeComponent", "Timeout when creating SurfaceNode: %s", e, new Object[]{e.getMessage()});
        }
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i6;
        this.A04 = i4;
        this.A00 = i5;
        boolean z = true;
        if (i7 != 1) {
            z = false;
        }
        this.A05 = z;
        A00();
        C346027uT r0 = this.A06;
        if (r0 != null) {
            return r0.A0B;
        }
        return null;
    }

    public final /* synthetic */ void Dh5(int i, int i2) {
    }

    public final /* synthetic */ void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final /* synthetic */ void Dh7(Surface surface, int i, int i2) {
    }

    public final /* synthetic */ void Dh8(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void Dh9(Surface surface) {
    }

    public final /* synthetic */ void EgZ(boolean z) {
    }

    public final boolean FNS() {
        return true;
    }

    public AV6(C345827u9 r1) {
        this.A07 = r1;
    }

    private void A00() {
        C346027uT r3 = this.A06;
        if (r3 != null) {
            C345827u9 r2 = this.A07;
            r2.A0B.post(new C41259Aqv(r2, r3, this.A03, this.A01, this.A02, this.A04, this.A00, this.A05));
        }
    }

    public final C343177pn Bc6() {
        return null;
    }

    public final C343177pn Bje() {
        return null;
    }

    public final /* synthetic */ Surface C3I() {
        return null;
    }

    public final /* synthetic */ SurfaceTexture C3J() {
        return null;
    }

    public final C341827na CEH() {
        return this.A07.A05;
    }

    public final /* synthetic */ C343177pn CHY() {
        return null;
    }

    public final void D0F(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00();
        }
    }

    public final void D8b(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }

    public final void ECm(SurfaceTexture surfaceTexture) {
        C346027uT r1 = this.A06;
        this.A06 = null;
        if (r1 != null) {
            r1.A01();
        }
        A00();
    }

    public final /* synthetic */ Object BYV(C341907ni r2) {
        return null;
    }
}
