package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: X.55T  reason: invalid class name */
public final class AnonymousClass55T {
    public final AnonymousClass55S A01(AnonymousClass55S r3, 1Cn r4, Throwable th) {
        0qQ.A0B(r3, 0);
        if (th == null) {
            return r3;
        }
        if (th instanceof FileNotFoundException) {
            return AnonymousClass55S.A0H;
        }
        if (!(th instanceof IOException)) {
            return A01(r3, r4, th.getCause());
        }
        if (r4.A05()) {
            return AnonymousClass55S.A08;
        }
        if ((th instanceof UnknownHostException) || !r4.A07(false)) {
            return AnonymousClass55S.A0T;
        }
        return AnonymousClass55S.A0A;
    }

    public final AnonymousClass55S A00(int i) {
        if (i != 511) {
            if (i >= 300) {
                if (i <= 308) {
                    return AnonymousClass55S.A0K;
                }
                if (i >= 500) {
                    if (i < 600) {
                        return AnonymousClass55S.A0O;
                    }
                } else if (i >= 400) {
                    if (i != 429) {
                        if (i == 422) {
                            return AnonymousClass55S.A09;
                        }
                        if (i == 400) {
                            return AnonymousClass55S.A0J;
                        }
                        return AnonymousClass55S.A0F;
                    }
                }
            }
            0wb.A03("ErrorType", 002.A0O("Unexpected status code ", i));
            return AnonymousClass55S.A0P;
        }
        return AnonymousClass55S.A0B;
    }
}
