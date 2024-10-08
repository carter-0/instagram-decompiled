package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.view.Display;
import android.view.View;

public abstract class GFU {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, GJ6.A00);

    public static final void A00(View view, boolean z) {
        if (z) {
            if (view != null) {
                view.setLayerType(2, (Paint) A00.getValue());
            }
        } else if (view != null) {
            view.setLayerType(0, (Paint) null);
        }
    }

    public static final boolean A01(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT < 34 || (display = C61270mF.A00(context).getDisplay()) == null || !display.isHdrSdrRatioAvailable()) {
            return false;
        }
        return true;
    }
}
