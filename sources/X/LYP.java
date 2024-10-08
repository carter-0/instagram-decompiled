package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;

public final class LYP implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LYP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PunchedOverlayView punchedOverlayView;
        RectF rectF;
        float A0B;
        float f;
        if (this.A00 != 0) {
            float f2 = (float) i3;
            float f3 = f2 / 3.0f;
            if (((C61382K5a) this.A02).A04) {
                f = 1.3333334f * f3;
            } else {
                f = f3;
            }
            float f4 = (f2 - f3) / 2.0f;
            float f5 = ((float) i4) / 2.0f;
            float f6 = f / 2.0f;
            rectF = new RectF(f4, f5 - f6, f2 - f4, f5 + f6);
            punchedOverlayView = (PunchedOverlayView) this.A01;
            A0B = 0.0f;
        } else {
            float f7 = ((float) (i3 - i)) / ((K6J) this.A02).A00;
            punchedOverlayView = (PunchedOverlayView) this.A01;
            float A002 = C51967G9n.A00(AnonymousClass7TE.A03(punchedOverlayView), f7);
            rectF = new RectF(0.0f, ((float) i2) + A002, ((float) i3) - ((float) i), ((float) i4) - A002);
            A0B = (float) AnonymousClass7TE.A0B(punchedOverlayView.getResources());
        }
        punchedOverlayView.A00(new KI5(rectF, A0B));
    }
}
