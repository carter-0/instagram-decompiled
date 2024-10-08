package X;

/* renamed from: X.JxW  reason: case insensitive filesystem */
public final class C61120JxW extends AnonymousClass0T0 implements MWR {
    public final String A00;
    public final String A01;
    public final String A02;

    public C61120JxW(String str, String str2, String str3) {
        0qQ.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61120JxW) {
                C61120JxW jxW = (C61120JxW) obj;
                if (!0qQ.A0K(this.A00, jxW.A00) || !0qQ.A0K(this.A01, jxW.A01) || !0qQ.A0K(this.A02, jxW.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01)) * 31);
    }
}
