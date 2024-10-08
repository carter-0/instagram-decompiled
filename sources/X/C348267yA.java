package X;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: X.7yA  reason: invalid class name and case insensitive filesystem */
public final class C348267yA {
    public 0ng A00;
    public final CancellationSignal A01;

    public C348267yA() {
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 29) {
            cancellationSignal = new CancellationSignal();
        } else {
            cancellationSignal = null;
        }
        this.A01 = cancellationSignal;
    }
}
