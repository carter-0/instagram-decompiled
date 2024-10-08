package X;

import java.util.List;

/* renamed from: X.A9h  reason: case insensitive filesystem */
public final class C39787A9h {
    public final C347677xC A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39787A9h) {
                C39787A9h a9h = (C39787A9h) obj;
                if (this.A00 != a9h.A00 || !0qQ.A0K(this.A02, a9h.A02) || !0qQ.A0K(this.A01, a9h.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C39787A9h(C347677xC r3) {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 2);
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r1;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeatureValidationParam(featureId=");
        A1A.append(this.A00);
        A1A.append(", sourceRuleValidationParams=");
        A1A.append(this.A02);
        A1A.append(", destinationRuleValidationParams=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
