package X;

import java.util.Map;

public final class SJ2 {
    public int A00;
    public final Map A01;

    public SJ2(Map map) {
        this.A01 = map;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SJ2) {
                SJ2 sj2 = (SJ2) obj;
                if (!0qQ.A0K(this.A01, sj2.A01) || this.A00 != sj2.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AccordionGroup(indexMap=");
        A1A.append(this.A01);
        A1A.append(", visibleSize=");
        return C51975G9x.A0j(A1A, this.A00);
    }

    public SJ2() {
        this(AnonymousClass7TE.A1H());
    }
}
