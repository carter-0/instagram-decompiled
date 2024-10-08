package X;

/* renamed from: X.Jxh  reason: case insensitive filesystem */
public final class C61131Jxh extends AnonymousClass0T0 implements C66381MPn {
    public final String A00;
    public final String A01;
    public final String A02;

    public C61131Jxh(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61131Jxh) {
                C61131Jxh jxh = (C61131Jxh) obj;
                if (!0qQ.A0K(this.A02, jxh.A02) || !0qQ.A0K(this.A00, jxh.A00) || !0qQ.A0K(this.A01, jxh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }
}
