package X;

import java.util.Arrays;

/* renamed from: X.HrT  reason: case insensitive filesystem */
public final class C56021HrT {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C56021HrT) && 0qQ.A0K(this.A00, ((C56021HrT) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, false, getClass()});
    }

    public C56021HrT(String str) {
        this.A00 = str;
    }
}
