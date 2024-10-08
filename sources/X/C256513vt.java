package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3vt  reason: invalid class name and case insensitive filesystem */
public final class C256513vt {
    public final C256453vn A00;
    public final AtomicInteger A01;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C256513vt) || !this.A00.equals(((C256513vt) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C256513vt(C256453vn r2, int i) {
        this.A00 = r2;
        this.A01 = new AtomicInteger(i);
    }
}
