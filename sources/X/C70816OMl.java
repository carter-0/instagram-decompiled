package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.OMl  reason: case insensitive filesystem */
public final class C70816OMl {
    public String A00;
    public List A01;
    public List A02;
    public List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C70816OMl oMl = (C70816OMl) obj;
            if (!0qQ.A0K(this.A00, oMl.A00) || !0qQ.A0K(this.A03, oMl.A03) || !0qQ.A0K(this.A02, oMl.A02) || !0qQ.A0K(this.A01, oMl.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A03, this.A02, this.A01});
    }
}
