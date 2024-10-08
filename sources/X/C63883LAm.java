package X;

import android.graphics.Bitmap;
import com.instagram.ui.widget.balloonsview.BalloonsView;

/* renamed from: X.LAm  reason: case insensitive filesystem */
public final class C63883LAm {
    public Bitmap A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;

    public C63883LAm(C62490Kgf kgf, int i) {
        float f;
        float f2;
        float f3;
        double random = Math.random();
        this.A05 = random < 0.5d ? -1.0f : 1.0f;
        this.A07 = BalloonsView.A0C.nextInt(i * 2) - i;
        this.A06 = (int) (random * ((double) i));
        this.A01 = random;
        this.A02 = random;
        float f4 = (float) random;
        int ordinal = kgf.ordinal();
        if (ordinal == 0) {
            f = 1.3f;
            f2 = 0.5f;
        } else if (ordinal == 1) {
            f = 0.6f;
            f2 = 0.2f;
        } else if (ordinal == 2) {
            f = 2.6f;
            f2 = 1.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        float f5 = f4 * (f - f2);
        if (ordinal != 0) {
            f3 = 0.2f;
            if (ordinal != 1) {
                f3 = 1.0f;
            }
        } else {
            f3 = 0.5f;
        }
        this.A04 = f5 + f3;
        this.A03 = (float) ((((int) (random * 350.0d)) - 175) + 1100);
    }
}
