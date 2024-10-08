package X;

import com.instagram.user.model.User;

/* renamed from: X.3fi  reason: invalid class name and case insensitive filesystem */
public final class C247063fi extends AnonymousClass0T0 {
    public final C61054Jvs A00;
    public final 1Xj A01;
    public final AnonymousClass3ZT A02;
    public final User A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247063fi) {
                C247063fi r5 = (C247063fi) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A05 != r5.A05 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || this.A07 != r5.A07 || this.A08 != r5.A08 || this.A06 != r5.A06) {
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
        int hashCode3;
        1Xj r0 = this.A01;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        User user = this.A03;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        AnonymousClass3ZT r02 = this.A02;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int hashCode4 = (((i5 + hashCode3) * 31) + this.A00.hashCode()) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        int i6 = (hashCode4 + i) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A06) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C247063fi(C61054Jvs jvs, 1Xj r2, AnonymousClass3ZT r3, User user, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A05 = z;
        this.A03 = user;
        this.A02 = r3;
        this.A00 = jvs;
        this.A04 = str;
        this.A07 = z2;
        this.A08 = z3;
        this.A06 = z4;
    }
}
