package X;

import java.io.IOException;

public final class RCS extends IOException {
    public RCS(String str, Throwable th, int i) {
        super(002.A0b(str, ", status code: ", i), th);
    }
}
