package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Xd6  reason: case insensitive filesystem */
public final class C21501Xd6 {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21501Xd6) {
            C21501Xd6 xd6 = (C21501Xd6) obj;
            if (0qQ.A0K(this.A00, xd6.A00) && 0qQ.A0K(this.A01, xd6.A01) && 0qQ.A0K(this.A02, xd6.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = xd6.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, this.A00.hashCode() * 31));
    }

    public C21501Xd6(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TableInfo{name='");
        A1A.append(this.A00);
        A1A.append("', columns=");
        A1A.append(this.A01);
        A1A.append(", foreignKeys=");
        A1A.append(this.A02);
        A1A.append(", indices=");
        return Pxg.A0p(this.A03, A1A);
    }
}
