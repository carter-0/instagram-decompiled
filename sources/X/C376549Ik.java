package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Ik  reason: invalid class name and case insensitive filesystem */
public final class C376549Ik extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C376549Ik(C238863Ds r2, C238833Dp r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, Integer num, boolean z, boolean z2) {
        this.A03 = r5;
        this.A06 = userSession;
        this.A02 = r3;
        this.A01 = r6;
        this.A05 = r2;
        this.A04 = num;
        this.A08 = z;
        this.A07 = z2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376549Ik)) {
                return false;
            }
            C376549Ik r3 = (C376549Ik) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A06, r3.A06) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A01, r3.A01) || this.A05 != r3.A05 || !0qQ.A0K(this.A04, r3.A04) || this.A08 != r3.A08) {
                return false;
            }
            z = this.A07;
            z2 = r3.A07;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376549Ik)) {
                return false;
            }
            C376549Ik r32 = (C376549Ik) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A06, r32.A06) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A01, r32.A01) || this.A07 != r32.A07) {
                return false;
            }
            z = this.A08;
            z2 = r32.A08;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        boolean z;
        int hashCode4;
        if (this.A00 != 0) {
            int hashCode5 = ((((((this.A03.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
            Object obj = this.A05;
            int i2 = 0;
            if (obj == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj.hashCode();
            }
            int i3 = (hashCode5 + hashCode4) * 31;
            Object obj2 = this.A04;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            int i4 = (i3 + i2) * 31;
            int i5 = 1237;
            if (this.A08) {
                i5 = 1231;
            }
            i = (i4 + i5) * 31;
            z = this.A07;
        } else {
            int hashCode6 = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
            Object obj3 = this.A05;
            int i6 = 0;
            if (obj3 == null) {
                hashCode = 0;
            } else {
                hashCode = obj3.hashCode();
            }
            int i7 = (hashCode6 + hashCode) * 31;
            Object obj4 = this.A06;
            if (obj4 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj4.hashCode();
            }
            int i8 = (i7 + hashCode2) * 31;
            Object obj5 = this.A02;
            if (obj5 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj5.hashCode();
            }
            int i9 = (i8 + hashCode3) * 31;
            Object obj6 = this.A01;
            if (obj6 != null) {
                i6 = obj6.hashCode();
            }
            int i10 = (i9 + i6) * 31;
            int i11 = 1237;
            if (this.A07) {
                i11 = 1231;
            }
            i = (i10 + i11) * 31;
            z = this.A08;
        }
        int i12 = 1237;
        if (z) {
            i12 = 1231;
        }
        return i + i12;
    }

    public C376549Ik(CharSequence charSequence, Integer num, Integer num2, Long l, List list, Map map, boolean z, boolean z2) {
        0qQ.A0B(list, 1);
        0qQ.A0B(map, 2);
        this.A04 = list;
        this.A03 = map;
        this.A05 = charSequence;
        this.A06 = num;
        this.A02 = num2;
        this.A01 = l;
        this.A07 = z;
        this.A08 = z2;
    }
}
