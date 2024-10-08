package X;

import java.util.List;

/* renamed from: X.LOo  reason: case insensitive filesystem */
public final class C64121LOo {
    public final MTJ A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64121LOo) {
                C64121LOo lOo = (C64121LOo) obj;
                if (!0qQ.A0K(this.A01, lOo.A01) || !0qQ.A0K(this.A00, lOo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C64121LOo(MTJ mtj) {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 1);
        this.A01 = r1;
        this.A00 = mtj;
    }

    public final int hashCode() {
        return (AnonymousClass7TE.A0K(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RecommendationResult(notFilteredRecommendation=");
        A1A.append(this.A01);
        A1A.append(", error=");
        A1A.append((Object) null);
        A1A.append(", triggerRule=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C64121LOo(List list) {
        this.A01 = list;
        this.A00 = null;
    }
}
