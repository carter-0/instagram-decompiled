package X;

/* renamed from: X.BFu  reason: case insensitive filesystem */
public final class C42067BFu extends AnonymousClass0T0 implements C46230DRl {
    public final String A00;
    public final String A01;

    public final C42067BFu F7j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42067BFu) {
                C42067BFu bFu = (C42067BFu) obj;
                if (!0qQ.A0K(this.A00, bFu.A00) || !0qQ.A0K(this.A01, bFu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C42067BFu(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
