package X;

import com.instagram.user.model.User;

/* renamed from: X.7cr  reason: invalid class name and case insensitive filesystem */
public final class C335377cr extends C335387cs {
    public final User A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335377cr) {
                C335377cr r5 = (C335377cr) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A05 != r5.A05 || this.A07 != r5.A07 || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A02.hashCode() * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.A00.hashCode()) * 31;
        Long l = this.A01;
        if (l != null) {
            i = l.hashCode();
        }
        int i3 = (hashCode4 + i) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A06) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public C335377cr(User user, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = user;
        this.A01 = l;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
    }
}
