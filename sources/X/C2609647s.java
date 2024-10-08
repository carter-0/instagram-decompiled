package X;

import java.io.IOException;

/* renamed from: X.47s  reason: invalid class name and case insensitive filesystem */
public class C2609647s extends IOException {
    public final int A00;

    public C2609647s(String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
    }

    public C2609647s(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public C2609647s(String str, int i) {
        super(str);
        this.A00 = i;
    }

    public C2609647s() {
        this.A00 = 2008;
    }
}
