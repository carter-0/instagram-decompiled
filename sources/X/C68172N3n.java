package X;

import com.instagram.android.R;

/* renamed from: X.N3n  reason: case insensitive filesystem */
public final class C68172N3n extends AnonymousClass0T0 {
    public int A00;
    public final int A01 = 1;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A01 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68172N3n)) {
                return false;
            }
            C68172N3n n3n = (C68172N3n) obj;
            if (n3n.A01 != 1 || this.A00 != n3n.A00 || !0qQ.A0K(this.A05, n3n.A05) || !0qQ.A0K(this.A04, n3n.A04) || !0qQ.A0K(this.A02, n3n.A02)) {
                return false;
            }
            str = this.A03;
            str2 = n3n.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C68172N3n)) {
                return false;
            }
            C68172N3n n3n2 = (C68172N3n) obj;
            if (n3n2.A01 != 0 || !0qQ.A0K(this.A05, n3n2.A05) || !0qQ.A0K(this.A03, n3n2.A03) || this.A00 != n3n2.A00 || !0qQ.A0K(this.A02, n3n2.A02)) {
                return false;
            }
            str = this.A04;
            str2 = n3n2.A04;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        String str;
        if (this.A01 != 0) {
            A08 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, this.A00 * 31)));
            str = this.A03;
        } else {
            A08 = AnonymousClass7TF.A08(this.A02, (((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A00) * 31);
            str = this.A04;
        }
        return C41845B3m.A01(str, A08);
    }

    public C68172N3n(String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A03 = str2;
        this.A00 = R.color.badge_color;
        this.A02 = str3;
        this.A04 = str4;
    }

    public C68172N3n(String str, String str2, int i, String str3, String str4) {
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
