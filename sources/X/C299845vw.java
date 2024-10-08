package X;

import android.media.AudioTrack;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.5vw  reason: invalid class name and case insensitive filesystem */
public final class C299845vw {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C299855vx A05;

    public final void A00() {
        this.A00 = 0;
        this.A03 = 0;
        this.A01 = -1;
        this.A02 = System.nanoTime() / 1000;
        this.A04 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
    }

    public C299845vw(AudioTrack audioTrack) {
        this.A05 = new C299855vx(audioTrack);
        A00();
    }
}
