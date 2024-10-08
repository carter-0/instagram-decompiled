package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.3pa  reason: invalid class name and case insensitive filesystem */
public abstract class C252733pa implements Closeable, 0lm {
    public final String A00;
    public final C262224Cq A01;

    public void close() {
        19E.A05((CancellationException) null, this.A01);
    }

    public void onUserSessionWillEnd(boolean z) {
        if (this instanceof C2615249x) {
            C2615249x r0 = (C2615249x) this;
            r0.close();
            r0.A03.A01();
            return;
        }
        close();
    }

    public C252733pa(String str, C262224Cq r2) {
        this.A01 = r2;
        this.A00 = str;
    }
}
