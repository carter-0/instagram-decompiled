package X;

import java.util.Set;

public final class Q0G {
    public final Integer A00;
    public final Integer A01;
    public final Set A02;
    public final Set A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Q0G q0g = (Q0G) obj;
            if (this.A01 == q0g.A01 && this.A00 == q0g.A00 && this.A03.equals(q0g.A03)) {
                return this.A02.equals(q0g.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int A0D = C51971G9r.A0D(num, C270974hh.A00(num)) * 31;
        Integer num2 = this.A00;
        return ((AnonymousClass7TG.A0B(num2, Q0J.A00(num2), A0D) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    public Q0G(Integer num, Integer num2, Set set, Set set2) {
        this.A01 = num;
        this.A00 = num2;
        this.A03 = set;
        this.A02 = set2;
    }
}
