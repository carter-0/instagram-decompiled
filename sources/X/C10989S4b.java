package X;

import java.util.Arrays;

/* renamed from: X.S4b  reason: case insensitive filesystem */
public final class C10989S4b {
    public final RJC A00;
    public final S42 A01;
    public final Boolean A02;

    public /* synthetic */ C10989S4b(RJC rjc, S42 s42, Boolean bool) {
        this.A00 = rjc;
        this.A02 = bool;
        this.A01 = s42;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10989S4b) {
                C10989S4b s4b = (C10989S4b) obj;
                if (!SA1.A01(this.A00, s4b.A00) || !SA1.A01(this.A02, s4b.A02) || !SA1.A01(this.A01, s4b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, null, this.A02, null, this.A01});
    }
}
