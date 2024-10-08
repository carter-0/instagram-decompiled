package X;

/* renamed from: X.DtN  reason: case insensitive filesystem */
public final class C47236DtN extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C47236DtN(String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47236DtN) {
                C47236DtN dtN = (C47236DtN) obj;
                if (!0qQ.A0K(this.A00, dtN.A00) || !0qQ.A0K(this.A01, dtN.A01) || this.A02 != dtN.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, (AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
