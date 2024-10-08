package X;

import android.media.MediaFormat;
import android.os.Build;

/* renamed from: X.SNg  reason: case insensitive filesystem */
public final class C11328SNg {
    public static final C11328SNg A06 = new C11328SNg(-1, -1, -1, -1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public static final void A00(MediaFormat mediaFormat, C11328SNg sNg) {
        if (Build.VERSION.SDK_INT >= 31) {
            int i = sNg.A04;
            if (i > 0) {
                mediaFormat.setInteger("video-qp-i-min", i);
            }
            int i2 = sNg.A01;
            if (i2 > 0) {
                mediaFormat.setInteger("video-qp-i-max", i2);
            }
            int i3 = sNg.A05;
            if (i3 > 0) {
                mediaFormat.setInteger("video-qp-p-min", i3);
            }
            int i4 = sNg.A02;
            if (i4 > 0) {
                mediaFormat.setInteger("video-qp-p-max", i4);
            }
            int i5 = sNg.A03;
            if (i5 > 0) {
                mediaFormat.setInteger("video-qp-p-min", i5);
            }
            int i6 = sNg.A00;
            if (i6 > 0) {
                mediaFormat.setInteger("video-qp-p-max", i6);
            }
        }
    }

    public C11328SNg(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A04 = i;
        this.A01 = i2;
        this.A05 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A00 = i6;
    }
}
