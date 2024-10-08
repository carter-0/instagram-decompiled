package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2e3  reason: invalid class name */
public final class AnonymousClass2e3 {
    public final int A00;
    public final int A01;
    public final C71532dv A02;
    public final AtomicReference A03 = new AtomicReference();

    public final void finalize() {
        Object obj;
        Pair pair = (Pair) this.A03.get();
        if (pair != null && (obj = pair.second) != null) {
            ((C249903kY) obj).close();
        }
    }

    public AnonymousClass2e3(C71532dv r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }
}
