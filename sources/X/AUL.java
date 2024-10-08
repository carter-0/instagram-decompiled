package X;

import android.media.MediaCodec;
import android.os.SystemClock;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AUL implements C341717nP, C20971X7b {
    public static final ByteBuffer A06 = ByteBuffer.allocate(0);
    public C382409de A00;
    public C341667nK A01;
    public boolean A02;
    public final long A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public volatile boolean A05;

    public final Map Apr() {
        return null;
    }

    public final Map AvW() {
        return null;
    }

    public final Map BiV() {
        return null;
    }

    public final void D4I(ByteBuffer byteBuffer) {
    }

    public final void Dvz(0sP r1) {
    }

    public final void Ewx(A3P a3p) {
        this.A05 = true;
    }

    public final void Ey4(C341687nM r2) {
        this.A05 = false;
        r2.onSuccess();
    }

    public final void release() {
        this.A05 = false;
        this.A02 = false;
        this.A01 = null;
        this.A00 = null;
    }

    public final B15 BZW() {
        return new AUG(this);
    }

    public final C341767nU CAE() {
        return C341767nU.SUPERNOVA_AUDIO;
    }

    public final boolean CQQ() {
        return this.A02;
    }

    public final void DGt(X0x x0x) {
        if (this.A04.get() && (x0x instanceof UMm) && this.A05) {
            C341667nK r3 = this.A01;
            UMm uMm = (UMm) x0x;
            if (r3 != null) {
                ByteBuffer byteBuffer = uMm.A01;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), uMm.A00 - this.A03, 0);
                r3.A03(bufferInfo, C341767nU.SUPERNOVA_AUDIO, byteBuffer);
            }
        }
    }

    public final void E3u(C341737nR r2, C343477qH r3) {
        this.A00 = (C382409de) r3;
        this.A02 = true;
        r2.onSuccess();
        this.A05 = false;
    }

    public AUL() {
        long j = 0;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        this.A03 = (Long.valueOf(elapsedRealtimeNanos) != null ? 0 + elapsedRealtimeNanos : j) - (AwakeTimeSinceBootClock.INSTANCE.nowNanos() / 1000);
    }

    public final void EwK(C341687nM r2, C39777A8w a8w) {
        r2.onSuccess();
        this.A05 = false;
        a8w.A00();
    }

    public final void Ep5(C341667nK r1) {
        this.A01 = r1;
    }
}
