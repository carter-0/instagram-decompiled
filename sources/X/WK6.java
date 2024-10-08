package X;

import android.graphics.Canvas;
import com.facebook.rendercore.text.RCTextView;

public final class WK6 implements C20881X2i {
    public final /* synthetic */ C20881X2i A00;
    public final /* synthetic */ C300985yH A01;
    public final /* synthetic */ RCTextView A02;

    public WK6(C20881X2i x2i, C300985yH r2, RCTextView rCTextView) {
        this.A02 = rCTextView;
        this.A01 = r2;
        this.A00 = x2i;
    }

    public final void AQG(Canvas canvas) {
        C300985yH r3 = this.A01;
        C20881X2i x2i = this.A00;
        WK7 wk7 = (WK7) r3;
        0qQ.A0B(canvas, 0);
        C17607Vaz vaz = wk7.A02;
        if (vaz != null) {
            WK7.A00(canvas, wk7.A00, vaz);
        }
        x2i.AQG(canvas);
        C17607Vaz vaz2 = wk7.A03;
        if (vaz2 != null) {
            WK7.A00(canvas, wk7.A01, vaz2);
        }
    }
}
