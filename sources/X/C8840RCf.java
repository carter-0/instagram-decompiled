package X;

import java.io.IOException;

/* renamed from: X.RCf  reason: case insensitive filesystem */
public final class C8840RCf extends IOException {
    public C8840RCf(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public C8840RCf(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C8840RCf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
