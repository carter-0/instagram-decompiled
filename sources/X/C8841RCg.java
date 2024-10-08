package X;

import java.io.IOException;

/* renamed from: X.RCg  reason: case insensitive filesystem */
public class C8841RCg extends IOException {
    public final int A00;

    public C8841RCg(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C8841RCg(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public C8841RCg() {
        this.A00 = 2008;
    }
}
