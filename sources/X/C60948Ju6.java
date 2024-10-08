package X;

/* renamed from: X.Ju6  reason: case insensitive filesystem */
public final class C60948Ju6 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60948Ju6) {
                C60948Ju6 ju6 = (C60948Ju6) obj;
                if (!0qQ.A0K(this.A01, ju6.A01) || !0qQ.A0K(this.A03, ju6.A03) || !0qQ.A0K(this.A02, ju6.A02) || !0qQ.A0K(this.A05, ju6.A05) || !0qQ.A0K(this.A00, ju6.A00) || !0qQ.A0K(this.A04, ju6.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A04);
    }

    public C60948Ju6(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A00 = str5;
        this.A04 = str6;
    }
}
