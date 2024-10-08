package X;

import java.util.List;

/* renamed from: X.8jm  reason: invalid class name and case insensitive filesystem */
public final class C363468jm {
    public String A00 = "";
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C363468jm) {
                C363468jm r5 = (C363468jm) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxSourceIdentityWithDestinations(sourceIdentityId=");
        sb.append(this.A00);
        sb.append(", destinationIdentities=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C363468jm() {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 2);
        this.A01 = r1;
    }
}
