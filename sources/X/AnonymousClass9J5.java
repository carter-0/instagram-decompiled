package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9J5  reason: invalid class name */
public final class AnonymousClass9J5 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public AnonymousClass9J5(String str, C62320sa r5, 0sP r6, 0sP r7, 0sP r8, 0sP r9, int i, boolean z) {
        z = (i & 2) != 0 ? false : z;
        C62320sa r1 = null;
        r7 = (i & 4) != 0 ? null : r7;
        r8 = (i & 8) != 0 ? null : r8;
        r9 = (i & 16) != 0 ? null : r9;
        str = (i & 32) != 0 ? null : str;
        r1 = (i & 64) == 0 ? r5 : r1;
        this.A00 = 0;
        0qQ.A0B(r6, 1);
        this.A01 = r6;
        this.A07 = z;
        this.A04 = r7;
        this.A02 = r8;
        this.A05 = r9;
        this.A06 = str;
        this.A03 = r1;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9J5)) {
                return false;
            }
            AnonymousClass9J5 r3 = (AnonymousClass9J5) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04) || this.A07 != r3.A07 || !0qQ.A0K(this.A06, r3.A06)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = r3.A05;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9J5)) {
                return false;
            }
            AnonymousClass9J5 r32 = (AnonymousClass9J5) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A01, r32.A01) || this.A07 != r32.A07 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A06, r32.A06)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = r32.A03;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            int i2 = 0;
            if (obj == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = obj.hashCode();
            }
            int i3 = hashCode5 * 31;
            Object obj2 = this.A02;
            if (obj2 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj2.hashCode();
            }
            int i4 = (i3 + hashCode6) * 31;
            Object obj3 = this.A03;
            if (obj3 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = obj3.hashCode();
            }
            int i5 = (i4 + hashCode7) * 31;
            Object obj4 = this.A04;
            if (obj4 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = obj4.hashCode();
            }
            int i6 = (i5 + hashCode8) * 31;
            int i7 = 1237;
            if (this.A07) {
                i7 = 1231;
            }
            int i8 = (i6 + i7) * 31;
            String str = this.A06;
            if (str != null) {
                i2 = str.hashCode();
            }
            return ((i8 + i2) * 31) + this.A05.hashCode();
        }
        int hashCode9 = obj.hashCode() * 31;
        int i9 = 1237;
        if (this.A07) {
            i9 = 1231;
        }
        int i10 = (hashCode9 + i9) * 31;
        Object obj5 = this.A04;
        int i11 = 0;
        if (obj5 == null) {
            hashCode = 0;
        } else {
            hashCode = obj5.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        Object obj6 = this.A02;
        if (obj6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj6.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Object obj7 = this.A05;
        if (obj7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj7.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Object obj8 = this.A03;
        if (obj8 != null) {
            i11 = obj8.hashCode();
        }
        return i15 + i11;
    }

    public AnonymousClass9J5(BBV bbv, XA1 xa1, User user, Boolean bool, String str, List list, boolean z) {
        0qQ.A0B(user, 7);
        this.A01 = xa1;
        this.A02 = bbv;
        this.A03 = list;
        this.A04 = bool;
        this.A07 = z;
        this.A06 = str;
        this.A05 = user;
    }
}
