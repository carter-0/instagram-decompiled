package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: X.SoD  reason: case insensitive filesystem */
public final class C12162SoD implements B31 {
    public int A00;
    public MediaMuxer A01;
    public volatile boolean A02;
    public volatile boolean A03;
    public volatile boolean A04;
    public volatile boolean A05;
    public volatile boolean A06;

    public final void Eev(int i) {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(0);
        }
    }

    public final void FOJ(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        MediaMuxer mediaMuxer;
        this.A02 = true;
        if ((bufferInfo.flags & 2) == 0 && (mediaMuxer = this.A01) != null) {
            mediaMuxer.writeSampleData(this.A00, byteBuffer, bufferInfo);
            this.A03 = true;
        }
    }

    public final void start() {
        this.A06 = true;
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            mediaMuxer.start();
            this.A05 = true;
        }
    }

    public final void AJ0(String str) {
        AJ1(str, AnonymousClass05K.A00);
    }

    public final void ASX() {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.A01.release();
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void EPD(MediaFormat mediaFormat) {
        throw AnonymousClass7TE.A15("VideoOnlyMuxer does not accept an audio format.");
    }

    public final void EqH(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A01;
        if (mediaMuxer != null) {
            this.A00 = mediaMuxer.addTrack(mediaFormat);
            this.A04 = true;
        }
    }

    public final int Ey3(int[] iArr) {
        int i;
        if (this.A01 != null) {
            if (!this.A04 || this.A03) {
                i = 0;
            } else {
                i = 4;
                if (this.A02) {
                    i = 5;
                }
            }
            if (i == 0) {
                this.A01.stop();
                this.A01.release();
            }
        } else {
            i = 1;
        }
        this.A03 = false;
        this.A01 = null;
        this.A00 = 0;
        if (i == 0 || this.A05) {
            return i;
        }
        if (this.A06) {
            return i + 20;
        }
        return i + 10;
    }

    public final void FNl(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        throw AnonymousClass7TE.A15("VideoOnlyMuxer does not have audio to write.");
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
        this.A01 = new MediaMuxer(str, i);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A06 = false;
        this.A05 = false;
    }
}
