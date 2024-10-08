package X;

import java.util.List;

public final class BGJ extends AnonymousClass0T0 implements DRR {
    public final List A00;
    public final BBV A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGJ) {
                BGJ bgj = (BGJ) obj;
                if (!0qQ.A0K(this.A00, bgj.A00) || !0qQ.A0K(this.A01, bgj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BGJ(BBV bbv, List list) {
        this.A00 = list;
        this.A01 = bbv;
    }
}
