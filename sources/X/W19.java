package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

public final class W19 {
    public final VLU A00;
    public final W1P A01;
    public final boolean A02;
    public final Paint A03;

    public static boolean A02(W19 w19, int i) {
        if (i != 0) {
            C17554Va8[] va8Arr = w19.A01.A0B;
            C17554Va8 va8 = va8Arr[i];
            C17554Va8 va82 = va8Arr[i - 1];
            if (va8.A05 != AnonymousClass05K.A01 || !A01(va8, w19)) {
                return va82.A04 == C16489Uvk.DISPOSE_TO_BACKGROUND && A01(va82, w19);
            }
        }
        return true;
    }

    public static void A00(Canvas canvas, C17554Va8 va8, W19 w19) {
        int i = va8.A02;
        int i2 = va8.A03;
        canvas.drawRect((float) i, (float) i2, (float) (i + va8.A01), (float) (i2 + va8.A00), w19.A03);
    }

    public static boolean A01(C17554Va8 va8, W19 w19) {
        if (va8.A02 == 0 && va8.A03 == 0) {
            int i = va8.A01;
            Rect rect = w19.A01.A05;
            if (i == rect.width() && va8.A00 == rect.height()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public W19(VLU vlu, W1P w1p, boolean z) {
        this.A01 = w1p;
        this.A00 = vlu;
        this.A02 = z;
        Paint paint = new Paint();
        this.A03 = paint;
        C13988Tno.A0p(0, paint);
        Pxi.A0v(paint, PorterDuff.Mode.SRC);
    }
}
