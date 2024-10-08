package X;

import java.io.IOException;

/* renamed from: X.9rY  reason: invalid class name and case insensitive filesystem */
public final class C390609rY extends IOException {
    public C390609rY(Throwable th) {
        super(002.A0u("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}
