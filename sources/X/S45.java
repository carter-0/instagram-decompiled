package X;

import androidx.media3.common.util.Util;

public final class S45 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            S45 s45 = (S45) obj;
            if (!Util.A0E(this.A00, s45.A00) || !Util.A0E(this.A01, s45.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + JTR.A0G(this.A00);
    }

    public S45(String str, String str2) {
        this.A00 = Util.A09(str);
        this.A01 = str2;
    }
}
