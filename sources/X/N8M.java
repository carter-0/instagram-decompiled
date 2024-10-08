package X;

public final class N8M extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8M) {
                N8M n8m = (N8M) obj;
                if (!0qQ.A0K(this.A05, n8m.A05) || !0qQ.A0K(this.A03, n8m.A03) || !0qQ.A0K(this.A04, n8m.A04) || this.A00 != n8m.A00 || this.A01 != n8m.A01 || this.A02 != n8m.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A04, (AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public N8M(String str, String str2, String str3, int i, int i2, int i3) {
        AnonymousClass7TG.A1P(str, str3);
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
