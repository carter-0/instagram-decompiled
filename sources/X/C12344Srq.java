package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* renamed from: X.Srq  reason: case insensitive filesystem */
public final class C12344Srq implements C13850TiT {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    public final void AJ0(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    public final String BVE() {
        return "Platform";
    }

    public final void EPD(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A00 = mediaMuxer.addTrack(mediaFormat);
    }

    public final void Eev(int i) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.setOrientationHint(i);
    }

    public final void EqH(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A01 = mediaMuxer.addTrack(mediaFormat);
    }

    public final void FNk(C13779Tgu tgu) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A00, tgu.AjB(), tgu.AiO());
    }

    public final void FOI(C13779Tgu tgu) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A01, tgu.AjB(), tgu.AiO());
    }

    public final boolean isStarted() {
        return this.A03;
    }

    public final void start() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.start();
        this.A03 = true;
    }

    public final void stop() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.stop();
        this.A03 = false;
        this.A02.release();
    }
}
