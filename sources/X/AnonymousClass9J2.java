package X;

import android.text.SpannableStringBuilder;
import com.instagram.user.model.User;

/* renamed from: X.9J2  reason: invalid class name */
public final class AnonymousClass9J2 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass9J2(C376459Ib r2, AnonymousClass3QO r3, User user, String str, boolean z, boolean z2) {
        0qQ.A0B(r3, 5);
        this.A05 = z;
        this.A06 = z2;
        this.A04 = str;
        this.A03 = user;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9J2)) {
                return false;
            }
            AnonymousClass9J2 r3 = (AnonymousClass9J2) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || this.A05 != r3.A05 || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A03, r3.A03) || this.A06 != r3.A06) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9J2)) {
                return false;
            }
            AnonymousClass9J2 r32 = (AnonymousClass9J2) obj;
            if (r32.A00 == 0 && this.A05 == r32.A05 && this.A06 == r32.A06 && 0qQ.A0K(this.A04, r32.A04) && 0qQ.A0K(this.A03, r32.A03) && this.A02 == r32.A02 && 0qQ.A0K(this.A01, r32.A01)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        if (this.A00 != 0) {
            int hashCode4 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
            int i = 1237;
            if (this.A05) {
                i = 1231;
            }
            int i2 = (hashCode4 + i) * 31;
            String str = this.A04;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            hashCode = (((i2 + hashCode3) * 31) + this.A03.hashCode()) * 31;
            hashCode2 = 1237;
            if (this.A06) {
                hashCode2 = 1231;
            }
        } else {
            int i3 = 1237;
            if (this.A05) {
                i3 = 1231;
            }
            int i4 = i3 * 31;
            int i5 = 1237;
            if (this.A06) {
                i5 = 1231;
            }
            hashCode = (((((((i4 + i5) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31;
            hashCode2 = this.A01.hashCode();
        }
        return hashCode + hashCode2;
    }

    public AnonymousClass9J2(SpannableStringBuilder spannableStringBuilder, 1Xj r3, AnonymousClass3W1 r4, String str, boolean z, boolean z2) {
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = z;
        this.A04 = str;
        this.A03 = spannableStringBuilder;
        this.A06 = z2;
    }
}
