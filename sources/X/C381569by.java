package X;

/* renamed from: X.9by  reason: invalid class name and case insensitive filesystem */
public final class C381569by extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final C363928ka A02;
    public final C363928ka A03;
    public final C370018vh A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381569by) {
                C381569by r8 = (C381569by) obj;
                if (!0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A05, r8.A05) || this.A00 != r8.A00 || this.A01 != r8.A01 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A06, r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A08, AnonymousClass7TE.A0O(this.A07)))));
        int i = 0;
        int A0C = (((((A012 + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0C + i;
    }

    public C381569by(C363928ka r1, C363928ka r2, C370018vh r3, String str, String str2, String str3, String str4, long j, long j2) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = str4;
    }
}
