package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

public final class AUT implements B31 {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public volatile boolean A03;
    public volatile boolean A04;
    public volatile boolean A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public final void Eev(int i) {
        this.A02.setOrientationHint(0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|(3:20|21|22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r4 != 0) goto L_0x0049;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Ey3(int[] r6) {
        /*
            r5 = this;
            r3 = 0
            r2 = 0
            android.media.MediaMuxer r0 = r5.A02     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 == 0) goto L_0x0049
            boolean r0 = r5.A05     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r5.A04     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            boolean r0 = r5.A03     // Catch:{ all -> 0x006a }
            r4 = 2
            if (r0 == 0) goto L_0x0046
            goto L_0x0045
        L_0x0015:
            boolean r0 = r5.A08     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5.A07     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r5.A06     // Catch:{ all -> 0x006a }
            r4 = 4
            if (r0 == 0) goto L_0x0046
            r4 = 5
            goto L_0x0046
        L_0x0024:
            r4 = 0
            r6[r2] = r1     // Catch:{ all -> 0x006a }
            int r1 = X.C343627qW.A00     // Catch:{ all -> 0x006a }
            int r0 = r1 + -1
            X.C343627qW.A00 = r0     // Catch:{ all -> 0x006a }
            if (r1 <= 0) goto L_0x0034
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0034 }
        L_0x0034:
            android.media.MediaMuxer r0 = r5.A02     // Catch:{ all -> 0x006a }
            r0.stop()     // Catch:{ all -> 0x006a }
            r0 = 2
            r6[r2] = r0     // Catch:{ all -> 0x006a }
            android.media.MediaMuxer r0 = r5.A02     // Catch:{ all -> 0x006a }
            r0.release()     // Catch:{ all -> 0x006a }
            r0 = 3
            r6[r2] = r0     // Catch:{ all -> 0x006a }
            goto L_0x0046
        L_0x0045:
            r4 = 3
        L_0x0046:
            r1 = r4
            if (r4 == 0) goto L_0x0057
        L_0x0049:
            boolean r0 = r5.A09     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0057
            boolean r0 = r5.A0A     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            int r1 = r1 + 10
            goto L_0x0057
        L_0x0055:
            int r1 = r1 + 20
        L_0x0057:
            r5.A04 = r2
            r5.A07 = r2
            r5.A03 = r2
            r5.A06 = r2
            r5.A0A = r2
            r5.A09 = r2
            r5.A02 = r3
            r5.A00 = r2
            r5.A01 = r2
            return r1
        L_0x006a:
            r0 = move-exception
            r5.A04 = r2
            r5.A07 = r2
            r5.A03 = r2
            r5.A06 = r2
            r5.A0A = r2
            r5.A09 = r2
            r5.A02 = r3
            r5.A00 = r2
            r5.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AUT.Ey3(int[]):int");
    }

    public final void start() {
        this.A0A = true;
        this.A02.start();
        this.A09 = true;
    }

    public final void AJ0(String str) {
        AJ1(str, AnonymousClass05K.A00);
    }

    public final void ASX() {
        MediaMuxer mediaMuxer = this.A02;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.A02.release();
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void EPD(MediaFormat mediaFormat) {
        this.A00 = this.A02.addTrack(mediaFormat);
        this.A05 = true;
    }

    public final void EqH(MediaFormat mediaFormat) {
        this.A01 = this.A02.addTrack(mediaFormat);
        this.A08 = true;
    }

    public final void FNl(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        C349257zq.A03("nativeWriteAudio");
        this.A03 = true;
        this.A02.writeSampleData(this.A00, byteBuffer, bufferInfo);
        this.A04 = true;
    }

    public final void FOJ(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        C349257zq.A03("nativeWriteVideo");
        this.A06 = true;
        if ((bufferInfo.flags & 2) == 0) {
            this.A02.writeSampleData(this.A01, byteBuffer, bufferInfo);
            this.A07 = true;
        }
    }

    public final void AJ1(String str, Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = -1;
                break;
            default:
                i = 0;
                break;
        }
        this.A02 = new MediaMuxer(str, i);
        this.A04 = false;
        this.A07 = false;
        this.A03 = false;
        this.A06 = false;
        this.A0A = false;
        this.A09 = false;
    }
}
