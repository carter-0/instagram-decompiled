package X;

import java.util.List;

/* renamed from: X.9Iy  reason: invalid class name and case insensitive filesystem */
public final class C376689Iy extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C376689Iy(String str, List list, boolean z) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376689Iy)) {
                    return false;
                }
                C376689Iy r3 = (C376689Iy) obj;
                if (r3.A00 != 0 || this.A03 != r3.A03 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A01, r3.A01)) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376689Iy)) {
                    return false;
                }
                C376689Iy r32 = (C376689Iy) obj;
                if (r32.A00 != 1 || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A02, r32.A02) || this.A03 != r32.A03) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode;
        int hashCode2;
        switch (this.A00) {
            case 0:
                int i3 = 1237;
                if (this.A03) {
                    i3 = 1231;
                }
                int i4 = i3 * 31;
                String str = this.A02;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                i = (i4 + hashCode) * 31;
                i2 = this.A01.hashCode();
                break;
            case 1:
                int hashCode3 = this.A01.hashCode() * 31;
                String str2 = this.A02;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                i = (hashCode3 + hashCode2) * 31;
                i2 = 1237;
                if (this.A03) {
                    i2 = 1231;
                    break;
                }
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public C376689Iy(1Xj r2, String str, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = z;
    }

    public C376689Iy(Long l, String str, boolean z) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = l;
    }
}
