package X;

import java.util.List;

/* renamed from: X.A9p  reason: case insensitive filesystem */
public final class C39794A9p {
    public final C347297wa A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39794A9p) {
                C39794A9p a9p = (C39794A9p) obj;
                if (this.A00 != a9p.A00 || !0qQ.A0K(this.A03, a9p.A03) || !0qQ.A0K(this.A02, a9p.A02) || !0qQ.A0K(this.A01, a9p.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C39794A9p(C347297wa r3, List list, List list2) {
        List A1P = 0sr.A1P(new C347727xH[]{C347727xH.BLOCK, C347727xH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE});
        this.A00 = r3;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = A1P;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeatureConfigValidationParam(appName=");
        A1A.append(this.A00);
        A1A.append(", surfaces=");
        A1A.append(this.A03);
        A1A.append(", contentTypes=");
        A1A.append(this.A02);
        A1A.append(", behaviors=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
