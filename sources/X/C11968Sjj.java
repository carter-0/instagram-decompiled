package X;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: X.Sjj  reason: case insensitive filesystem */
public final class C11968Sjj implements C13699TfH {
    public final RC9 A00;
    public final C8851RCr A01;

    public final void D7y(Bitmap bitmap, C13813Thg thg) {
        IOException iOException = this.A01.A00;
        if (iOException != null) {
            if (bitmap != null) {
                thg.E5H(bitmap);
            }
            throw iOException;
        }
    }

    public final void DUv() {
        RC9 rc9 = this.A00;
        synchronized (rc9) {
            rc9.A00 = rc9.A05.length;
        }
    }

    public C11968Sjj(RC9 rc9, C8851RCr rCr) {
        this.A00 = rc9;
        this.A01 = rCr;
    }
}
