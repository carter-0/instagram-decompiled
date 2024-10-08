package X;

/* renamed from: X.JyB  reason: case insensitive filesystem */
public final class C61159JyB extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61159JyB) {
                C61159JyB jyB = (C61159JyB) obj;
                if (!0qQ.A0K(this.A00, jyB.A00) || !0qQ.A0K(this.A01, jyB.A01) || !0qQ.A0K(this.A02, jyB.A02)) {
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
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C61159JyB(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
