package X;

import android.media.MediaCodec;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TKc  reason: case insensitive filesystem */
public final class C13072TKc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaCodec.BufferInfo A01;
    public final /* synthetic */ MediaCodec A02;
    public final /* synthetic */ S3Z A03;
    public final /* synthetic */ C10821Ryh A04;
    public final /* synthetic */ Semaphore A05;

    public C13072TKc(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, S3Z s3z, C10821Ryh ryh, Semaphore semaphore, int i) {
        this.A05 = semaphore;
        this.A01 = bufferInfo;
        this.A04 = ryh;
        this.A02 = mediaCodec;
        this.A00 = i;
        this.A03 = s3z;
    }

    public final void run() {
        Semaphore semaphore = this.A05;
        semaphore.acquire();
        MediaCodec.BufferInfo bufferInfo = this.A01;
        if ((bufferInfo.flags & 4) != 0) {
            this.A04.A02 = true;
        }
        this.A02.releaseOutputBuffer(this.A00, true);
        C10821Ryh ryh = this.A04;
        if (ryh.A01 == -1) {
            ryh.A01 = bufferInfo.presentationTimeUs;
            if (!ryh.A06.A0B.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                0f9 AEf = 0wj.A01.AEf(S3Z.class.getSimpleName(), 817892340);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "awaitNewImage failed");
                AEf.report();
            }
        }
        long j = bufferInfo.presentationTimeUs;
        ryh.A00 = j;
        S3Z s3z = this.A03;
        if (((double) ((j + ryh.A03) - ryh.A01)) >= ((double) s3z.A00) + (((double) s3z.A06) * 0.1d) || ryh.A02) {
            s3z.A08.post(new TEB(s3z));
        } else {
            semaphore.release();
        }
    }
}
