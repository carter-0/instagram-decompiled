package X;

import java.util.Arrays;

/* renamed from: X.OMj  reason: case insensitive filesystem */
public final class C70814OMj {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C70814OMj oMj = (C70814OMj) obj;
            if (!2Ob.A00(this.A01, oMj.A01) || !2Ob.A00(this.A02, oMj.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02});
    }
}
