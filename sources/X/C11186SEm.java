package X;

import android.os.Looper;
import java.util.Map;

/* renamed from: X.SEm  reason: case insensitive filesystem */
public final class C11186SEm {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Looper A02 = Looper.myLooper();

    public static void A00(C11186SEm sEm) {
        if (Looper.myLooper() != sEm.A02) {
            throw new RuntimeException();
        }
    }
}
