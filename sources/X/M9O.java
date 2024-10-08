package X;

import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;

public final class M9O implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ PunchedOverlayView A02;
    public final /* synthetic */ JW7 A03;

    public M9O(PunchedOverlayView punchedOverlayView, JW7 jw7, float f, int i) {
        this.A02 = punchedOverlayView;
        this.A00 = f;
        this.A01 = i;
        this.A03 = jw7;
    }

    public final void run() {
        PunchedOverlayView punchedOverlayView = this.A02;
        float f = this.A00;
        punchedOverlayView.A00(new KI5(new RectF(f, 0.0f, ((float) this.A01) - f, (float) punchedOverlayView.getBottom()), AnonymousClass7TE.A01(this.A03.getResources(), R.dimen.abc_dialog_padding_material)));
    }
}
