package X;

import java.util.Arrays;

/* renamed from: X.8IY  reason: invalid class name */
public final class AnonymousClass8IY {
    public final AnonymousClass8IW A00;
    public final AnonymousClass8IX A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8IY)) {
                return false;
            }
            AnonymousClass8IY r4 = (AnonymousClass8IY) obj;
            if (!(r4.A00 == this.A00 && r4.A01 == this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public AnonymousClass8IY(AnonymousClass8IW r1, AnonymousClass8IX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
