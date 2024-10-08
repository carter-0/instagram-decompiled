package X;

import java.util.Arrays;

/* renamed from: X.Jbt  reason: case insensitive filesystem */
public final class C59930Jbt {
    public final AnonymousClass3Q2 A00;
    public final 1us A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C59930Jbt jbt = (C59930Jbt) obj;
            if (!0qQ.A0K(this.A00, jbt.A00) || !0qQ.A0K(this.A01, jbt.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C59930Jbt(AnonymousClass3Q2 r2, 1us r3) {
        if (!r2.A4w || r3 != null) {
            this.A00 = r2;
            this.A01 = r3;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
