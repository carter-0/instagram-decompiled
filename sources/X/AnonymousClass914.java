package X;

/* renamed from: X.914  reason: invalid class name */
public final class AnonymousClass914 extends AnonymousClass0T0 {
    public Long A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public boolean A05 = false;
    public boolean A06 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass914) {
                AnonymousClass914 r5 = (AnonymousClass914) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A05 != r5.A05 || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        Long l = this.A00;
        if (l == null || l.longValue() * 1000 <= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.A00;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.A01;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        int i6 = 1237;
        if (this.A05) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A06) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        String str4 = this.A04;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i9 + i;
    }
}
