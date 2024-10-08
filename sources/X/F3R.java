package X;

import java.util.Arrays;
import java.util.List;

public final class F3R {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3R)) {
            return false;
        }
        F3R f3r = (F3R) obj;
        return 2PP.A00(this.A02, f3r.A02) && 2PP.A00(this.A01, f3r.A01) && 2PP.A00(this.A03, f3r.A03) && 2PP.A00(this.A04, f3r.A04) && this.A00 == f3r.A00 && 2PP.A00(this.A05, f3r.A05);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A03, this.A04, this.A00, this.A05});
    }
}
