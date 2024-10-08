package X;

/* renamed from: X.Goi  reason: case insensitive filesystem */
public final class C53450Goi extends AnonymousClass0T0 implements C59652JRu {
    public final C53451Goj A00;
    public final String A01;

    public final C53450Goi F6I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53450Goi) {
                C53450Goi goi = (C53450Goi) obj;
                if (!0qQ.A0K(this.A01, goi.A01) || !0qQ.A0K(this.A00, goi.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C53450Goi(C53451Goj goj, String str) {
        AnonymousClass7TG.A1O(str, goj);
        this.A01 = str;
        this.A00 = goj;
    }
}
