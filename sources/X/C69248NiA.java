package X;

import java.io.IOException;

/* renamed from: X.NiA  reason: case insensitive filesystem */
public final class C69248NiA extends IOException {
    public final int A00;

    public C69248NiA(int i, Throwable th) {
        super(002.A05(i, "status ", ", ", th.getMessage()), th);
        this.A00 = i;
    }
}
