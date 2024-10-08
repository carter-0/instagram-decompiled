package X;

import java.util.List;

/* renamed from: X.KZi  reason: case insensitive filesystem */
public final class C62078KZi extends C62862Knc {
    public final List A00;
    public final List A01;
    public final boolean A02;
    public final C62866Kng A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62078KZi) {
                C62078KZi kZi = (C62078KZi) obj;
                if (!0qQ.A0K(this.A01, kZi.A01) || !0qQ.A0K(this.A00, kZi.A00) || !0qQ.A0K(this.A03, kZi.A03) || this.A02 != kZi.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01))));
    }

    public C62078KZi(C62866Kng kng, List list, List list2, boolean z) {
        AnonymousClass7TG.A1Q(list2, kng);
        this.A01 = list;
        this.A00 = list2;
        this.A03 = kng;
        this.A02 = z;
    }
}
