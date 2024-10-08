package X;

import java.util.List;

/* renamed from: X.K3e  reason: case insensitive filesystem */
public final class C61343K3e extends C62728KlS {
    public final C317966o8 A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61343K3e) {
                C61343K3e k3e = (C61343K3e) obj;
                if (!0qQ.A0K(this.A00, k3e.A00) || !0qQ.A0K(this.A01, k3e.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public C61343K3e(C317966o8 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }
}
