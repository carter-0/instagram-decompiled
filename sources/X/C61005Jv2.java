package X;

import com.instagram.android.R;

/* renamed from: X.Jv2  reason: case insensitive filesystem */
public final class C61005Jv2 extends AnonymousClass0T0 {
    public final int A00;
    public final C66378MPk A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C61005Jv2(C66378MPk mPk, String str, String str2, int i, boolean z) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = mPk;
        this.A03 = str2;
        this.A04 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61005Jv2) {
                C61005Jv2 jv2 = (C61005Jv2) obj;
                if (!0qQ.A0K(this.A02, jv2.A02) || !0qQ.A0K(this.A01, jv2.A01) || !0qQ.A0K(this.A03, jv2.A03) || this.A04 != jv2.A04 || this.A00 != jv2.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A00;
    }

    public C61005Jv2() {
        this(C64476Lcd.A00, "", (String) null, R.drawable.instagram_arrow_cw_pano_outline_24, true);
    }
}
