package X;

import java.util.List;

/* renamed from: X.A9i  reason: case insensitive filesystem */
public final class C39788A9i {
    public final C347727xH A00;
    public final List A01;
    public final C347677xC A02;

    public C39788A9i(C347677xC r2, C347727xH r3, List list) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39788A9i) {
                C39788A9i a9i = (C39788A9i) obj;
                if (!(this.A02 == a9i.A02 && this.A00 == a9i.A00 && 0qQ.A0K(this.A01, a9i.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A02)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeatureValidationResult(featureId=");
        A1A.append(this.A02);
        A1A.append(", behavior=");
        A1A.append(this.A00);
        A1A.append(", failedRules=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
