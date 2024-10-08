package X;

import java.util.Arrays;

/* renamed from: X.5Dg  reason: invalid class name and case insensitive filesystem */
public final class C282485Dg extends AnonymousClass0T0 {
    public int A00;
    public long A01;
    public C272074k3 A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C282485Dg)) {
            return false;
        }
        C282485Dg r7 = (C282485Dg) obj;
        return this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
