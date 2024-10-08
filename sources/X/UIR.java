package X;

import android.graphics.Bitmap;

public abstract class UIR extends C226522gx {
    public abstract void A04(Bitmap bitmap);

    public final void A02(1TY r4) {
        if (r4.A08()) {
            C249903kY r2 = (C249903kY) r4.A02();
            Bitmap bitmap = null;
            if (r2 != null && (r2.A05() instanceof C240523Lf)) {
                bitmap = ((C240523Lf) r2.A05()).CBJ();
            }
            try {
                A04(bitmap);
            } finally {
                C249903kY.A01(r2);
            }
        }
    }
}
