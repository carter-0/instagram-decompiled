package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.FBa  reason: case insensitive filesystem */
public final class C49876FBa {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05 = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49876FBa)) {
            return false;
        }
        C49876FBa fBa = (C49876FBa) obj;
        return this.A05 == fBa.A05 && 2PP.A00(this.A01, fBa.A01) && 2PP.A00(this.A02, fBa.A02) && 2PP.A00(this.A04, fBa.A04) && 2PP.A00(this.A03, fBa.A03) && 2PP.A00(this.A00, fBa.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A04});
    }

    public static C49876FBa parseFromJson(16F r0) {
        return C48780Ek3.parseFromJson(r0);
    }
}
