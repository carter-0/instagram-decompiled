package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Kj  reason: invalid class name and case insensitive filesystem */
public final class C59160Kj {
    public 0Ki A00 = null;
    public boolean A01 = false;
    public final Context A02;

    public final 0Ki A00(int i) {
        0Ki r0;
        if (this.A01) {
            return this.A00;
        }
        synchronized (this) {
            if (!this.A01) {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.A00 = 0Ki.A00(this.A02, i);
                    this.A01 = true;
                } else {
                    this.A01 = true;
                    r0 = null;
                }
            }
            r0 = this.A00;
        }
        return r0;
    }

    public C59160Kj(Context context) {
        this.A02 = context;
    }
}
