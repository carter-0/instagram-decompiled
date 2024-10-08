package X;

import com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor;

/* renamed from: X.Rx9  reason: case insensitive filesystem */
public final class C10730Rx9 {
    public C13706TfQ A00;
    public final int A01;
    public final long A02;
    public final AudioPostProcessor A03;
    public volatile boolean A04 = false;

    public C10730Rx9(float f, int i, int i2, int i3) {
        this.A01 = i;
        int i4 = (i2 / i3) / 2;
        this.A03 = new AudioPostProcessor(i, i4, f, 3, i3);
        this.A02 = (long) Math.round(((float) (i4 * 1000000)) / f);
    }
}
