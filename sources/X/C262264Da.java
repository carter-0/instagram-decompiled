package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Da  reason: invalid class name and case insensitive filesystem */
public final class C262264Da {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C262264Da(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z) {
        0qQ.A0B(list, 1);
        this.A09 = list;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A05 = str4;
        this.A02 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A0A = z;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C262264Da)) {
            return false;
        }
        C262264Da r4 = (C262264Da) obj;
        return 0qQ.A0K(this.A09, r4.A09) && 0qQ.A0K(this.A06, r4.A06) && 0qQ.A0K(this.A07, r4.A07) && 0qQ.A0K(this.A08, r4.A08) && this.A00 == r4.A00 && 0qQ.A0K(this.A05, r4.A05) && 0qQ.A0K(this.A02, r4.A02) && 0qQ.A0K(this.A03, r4.A03) && 0qQ.A0K(this.A04, r4.A04) && this.A0A == r4.A0A && 0qQ.A0K(this.A01, r4.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A06, this.A07, this.A08, Integer.valueOf(this.A00), this.A05, this.A02, this.A03, this.A04, Boolean.valueOf(this.A0A), this.A01});
    }
}
