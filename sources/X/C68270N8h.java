package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.N8h  reason: case insensitive filesystem */
public final class C68270N8h extends AnonymousClass0T0 implements C74252Prg {
    public final List A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68270N8h) {
                C68270N8h n8h = (C68270N8h) obj;
                if (!0qQ.A0K(this.A03, n8h.A03) || !0qQ.A0K(this.A01, n8h.A01) || !0qQ.A0K(this.A02, n8h.A02) || !0qQ.A0K(this.A00, n8h.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03))));
    }

    public C68270N8h(List list, Set set, Set set2, Set set3) {
        C51974G9v.A1P(set, set2, set3, list);
        this.A03 = set;
        this.A01 = set2;
        this.A02 = set3;
        this.A00 = list;
    }
}
