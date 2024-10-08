package X;

import com.instagram.common.ui.widget.imageview.PunchedOverlayView;

public final class KI6 extends C62738Klc {
    public final float A00;
    public final int A01;
    public final int A02;

    public KI6(int i, int i2, float f) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = f;
    }

    public static void A00(PunchedOverlayView punchedOverlayView) {
        int width = punchedOverlayView.getWidth() / 2;
        punchedOverlayView.A00(new KI6(width, width, (float) width));
    }
}
