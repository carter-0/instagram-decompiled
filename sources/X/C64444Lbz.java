package X;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* renamed from: X.Lbz  reason: case insensitive filesystem */
public final class C64444Lbz implements AnonymousClass8MA {
    public final C353838Jj A00;

    public final void AWm(C53394GnR gnR) {
        Bitmap A02 = this.A00.A02(true);
        if (A02 != null) {
            JTO.A0B((Bitmap) gnR.A01).drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
            A02.recycle();
        }
    }

    public C64444Lbz(C353838Jj r1) {
        this.A00 = r1;
    }
}
