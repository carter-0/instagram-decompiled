package X;

/* renamed from: X.Jy8  reason: case insensitive filesystem */
public final class C61156Jy8 extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61156Jy8) {
                C61156Jy8 jy8 = (C61156Jy8) obj;
                if (!0qQ.A0K(this.A01, jy8.A01) || !0qQ.A0K(this.A00, jy8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R(this.A01, this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C61156Jy8(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
