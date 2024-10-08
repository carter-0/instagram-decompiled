package X;

/* renamed from: X.DtR  reason: case insensitive filesystem */
public final class C47240DtR extends AnonymousClass0T0 implements C232262tL {
    public boolean A00 = false;
    public final C49457Evy A01;
    public final String A02;
    public final String A03;

    public C47240DtR(C49457Evy evy, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = evy;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47240DtR) {
                C47240DtR dtR = (C47240DtR) obj;
                if (!0qQ.A0K(this.A02, dtR.A02) || !0qQ.A0K(this.A03, dtR.A03) || this.A00 != dtR.A00 || !0qQ.A0K(this.A01, dtR.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
