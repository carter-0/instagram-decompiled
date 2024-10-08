package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.concurrent.Semaphore;

/* renamed from: X.Ryh  reason: case insensitive filesystem */
public final class C10821Ryh {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final long A03;
    public final MediaCodec A04;
    public final Handler A05;
    public final C10851RzB A06;
    public final Semaphore A07;
    public final MediaFormat A08;

    public C10821Ryh(MediaCodec mediaCodec, MediaFormat mediaFormat, Handler handler, C10851RzB rzB, Semaphore semaphore, long j) {
        this.A04 = mediaCodec;
        this.A08 = mediaFormat;
        this.A06 = rzB;
        this.A07 = semaphore;
        this.A05 = handler;
        this.A03 = j;
    }
}
