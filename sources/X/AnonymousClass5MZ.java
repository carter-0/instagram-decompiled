package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.5MZ  reason: invalid class name */
public final class AnonymousClass5MZ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5MZ)) {
            return false;
        }
        AnonymousClass5MZ r4 = (AnonymousClass5MZ) obj;
        return Util.A0I(this.A04, r4.A04) && Util.A0I(this.A03, r4.A03) && Util.A0I(this.A00, r4.A00) && Util.A0I(this.A02, r4.A02) && Util.A0I(this.A01, r4.A01);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.A04;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.A00;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.A02;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.A01;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }

    public AnonymousClass5MZ(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }
}
