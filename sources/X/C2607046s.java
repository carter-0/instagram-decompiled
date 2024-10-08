package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.46s  reason: invalid class name and case insensitive filesystem */
public final class C2607046s {
    public List A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2607046s r5 = (C2607046s) obj;
            if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
