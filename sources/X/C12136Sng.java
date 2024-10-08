package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Sng  reason: case insensitive filesystem */
public final class C12136Sng implements SurfaceTextureHolder {
    public int A00;
    public int A01;
    public C11182SEi A02;
    public C11333SNm A03;
    public final Handler A04;
    public final HandlerThread A05;
    public final C10401Rrd A06;
    public final Map A07 = AnonymousClass7TE.A1E();

    public final int getHeight() {
        return this.A00;
    }

    public final SurfaceTexture getSurfaceTexture() {
        C11333SNm sNm = this.A03;
        0qQ.A0A(sNm);
        SurfaceTexture surfaceTexture = sNm.A01;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getWidth() {
        return this.A01;
    }

    public C12136Sng(C10401Rrd rrd, int i, int i2) {
        this.A01 = i <= 0 ? 720 : i;
        this.A00 = i2 <= 0 ? 1280 : i2;
        this.A06 = rrd;
        HandlerThread A0I = Pxf.A0I("Frame handler thread");
        this.A05 = A0I;
        A0I.setUncaughtExceptionHandler(new TLI(this, 0));
        Handler A0N = Pxg.A0N(A0I);
        this.A04 = A0N;
        C12863TBd tBd = new C12863TBd(this);
        0qQ.A0B(A0N, 0);
        CountDownLatch A0y = Pxf.A0y();
        A0N.post(new C12955TFo(tBd, A0y));
        try {
            A0y.await();
        } catch (InterruptedException e) {
            0KC.A0F("HandlerUtils", "Interrupted awaiting latch", e);
            Pxe.A1F();
        }
    }
}
