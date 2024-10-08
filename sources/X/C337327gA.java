package X;

/* renamed from: X.7gA  reason: invalid class name and case insensitive filesystem */
public final class C337327gA extends AnonymousClass0T0 implements C337337gB {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C337327gA) {
                C337327gA r5 = (C337327gA) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A04 != r5.A04 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B7h() {
        return this.A01;
    }

    public final boolean BPV() {
        return this.A04;
    }

    public final String BWq() {
        return this.A02;
    }

    public final String BXI() {
        return this.A03;
    }

    public final String getFormattedAmountRaised() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.A00;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A01;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public C337327gA(String str, String str2, String str3, String str4, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A02 = str3;
        this.A03 = str4;
    }
}
