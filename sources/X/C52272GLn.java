package X;

/* renamed from: X.GLn  reason: case insensitive filesystem */
public final class C52272GLn extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52272GLn) {
                C52272GLn gLn = (C52272GLn) obj;
                if (!0qQ.A0K(this.A00, gLn.A00) || !0qQ.A0K(this.A01, gLn.A01) || !0qQ.A0K(this.A02, gLn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public C52272GLn(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public C52272GLn() {
        this((String) null, (String) null, (String) null);
    }
}
