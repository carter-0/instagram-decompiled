package X;

import java.util.List;

public final class UVA extends C69566NoA {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UVA) {
                UVA uva = (UVA) obj;
                if (!0qQ.A0K(this.A01, uva.A01) || !0qQ.A0K(this.A00, uva.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UVA(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public UVA() {
        this((List) null, (List) null);
    }
}
