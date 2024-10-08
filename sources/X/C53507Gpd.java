package X;

/* renamed from: X.Gpd  reason: case insensitive filesystem */
public final class C53507Gpd extends AnonymousClass0T0 implements C59550JNw {
    public final C286025Tq A00;
    public final String A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53507Gpd) {
                C53507Gpd gpd = (C53507Gpd) obj;
                if (!0qQ.A0K(this.A01, gpd.A01) || !0qQ.A0K(this.A00, gpd.A00) || !0qQ.A0K(this.A02, gpd.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ CharSequence Bfa() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C53507Gpd(C286025Tq r1, String str, 0sP r3) {
        AnonymousClass7TG.A1P(str, r3);
        this.A01 = str;
        this.A00 = r1;
        this.A02 = r3;
    }
}
