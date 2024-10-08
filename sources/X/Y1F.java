package X;

import java.io.Closeable;
import java.io.IOException;

public final class Y1F implements Closeable {
    public final YCS A00;
    public final YCT A01;
    public final /* synthetic */ C21485Xcc A02;
    public final /* synthetic */ Y7U A03;

    public Y1F(C21485Xcc xcc, Y7U y7u, YCS ycs, YCT yct) {
        this.A03 = y7u;
        this.A02 = xcc;
        this.A01 = yct;
        this.A00 = ycs;
    }

    public final void close() {
        C21485Xcc xcc = this.A02;
        xcc.A03.A02((IOException) null, xcc, true, true);
    }
}
