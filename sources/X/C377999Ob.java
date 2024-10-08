package X;

import java.util.List;

/* renamed from: X.9Ob  reason: invalid class name and case insensitive filesystem */
public final class C377999Ob extends AnonymousClass0T0 {
    public final int A00;
    public final JYL A01;
    public final List A02;
    public final List A03;

    public C377999Ob(JYL jyl, List list, List list2, int i) {
        AnonymousClass7TF.A1D(list2, 3, jyl);
        this.A00 = i;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = jyl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C377999Ob) {
                C377999Ob r5 = (C377999Ob) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A03, ((this.A00 * 31) + AnonymousClass7TG.A0C(this.A02)) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaDraftInDatabase(version=");
        A1A.append(this.A00);
        A1A.append(", stickers=");
        A1A.append(this.A02);
        A1A.append(", unschematizedCompositions=");
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(48));
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
