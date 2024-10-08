package X;

import java.util.Arrays;

/* renamed from: X.4ou  reason: invalid class name and case insensitive filesystem */
public final class C274694ou {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C274694ou r5 = (C274694ou) obj;
            if (!2PP.A00(this.A05, r5.A05) || !2PP.A00(this.A03, r5.A03) || !2PP.A00(this.A00, r5.A00) || !2PP.A00(this.A06, r5.A06) || !2PP.A00(this.A04, r5.A04) || !2PP.A00(this.A02, r5.A02) || !2PP.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A03, this.A00, this.A06, this.A04, this.A02, this.A01});
    }
}
