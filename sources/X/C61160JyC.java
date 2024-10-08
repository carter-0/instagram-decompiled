package X;

/* renamed from: X.JyC  reason: case insensitive filesystem */
public final class C61160JyC extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final String A01;
    public final 0sP A02;

    public C61160JyC(String str, 0sP r3, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61160JyC) {
                C61160JyC jyC = (C61160JyC) obj;
                if (!0qQ.A0K(this.A01, jyC.A01) || this.A00 != jyC.A00 || !0qQ.A0K(this.A02, jyC.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0b(this.A01, "}_", this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0O(this.A01) + this.A00) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61160JyC jyC = (C61160JyC) obj;
        0qQ.A0B(jyC, 0);
        if (!0qQ.A0K(this.A01, jyC.A01) || this.A00 != jyC.A00) {
            return false;
        }
        return true;
    }
}
