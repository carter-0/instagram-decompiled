package X;

import java.util.List;

/* renamed from: X.9JP  reason: invalid class name */
public final class AnonymousClass9JP extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public AnonymousClass9JP(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, long j, boolean z) {
        this.A00 = i2;
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0qQ.A0B(list, 7);
        0qQ.A0B(str5, 9);
        0qQ.A0B(str6, 10);
        this.A0A = z;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A01 = i;
        this.A03 = list;
        this.A02 = j;
        this.A04 = str5;
        this.A09 = str6;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof AnonymousClass9JP)) {
            return false;
        }
        AnonymousClass9JP r6 = (AnonymousClass9JP) obj;
        if (r6.A00 != i || this.A0A != r6.A0A || !0qQ.A0K(this.A08, r6.A08) || !0qQ.A0K(this.A05, r6.A05) || !0qQ.A0K(this.A06, r6.A06) || !0qQ.A0K(this.A07, r6.A07) || this.A01 != r6.A01 || !0qQ.A0K(this.A03, r6.A03) || this.A02 != r6.A02 || !0qQ.A0K(this.A04, r6.A04) || !0qQ.A0K(this.A09, r6.A09)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        long j = this.A02;
        return (((((((((((((((((i * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A04.hashCode()) * 31) + this.A09.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00 != 0) {
            str = "IABNoBounceRealTimeInfo(isNoBounce=";
        } else {
            sb = new StringBuilder();
            str = "AdClickRealTimeInfo(isAdClick=";
        }
        sb.append(str);
        sb.append(this.A0A);
        sb.append(", signalId=");
        sb.append(this.A08);
        sb.append(C273654mx.A00(441));
        sb.append(this.A05);
        sb.append(C273654mx.A00(446));
        sb.append(this.A06);
        sb.append(", itemId=");
        sb.append(this.A07);
        sb.append(", itemType=");
        sb.append(this.A01);
        sb.append(", mediaIds=");
        sb.append(this.A03);
        sb.append(C273654mx.A00(1046));
        sb.append(this.A02);
        sb.append(C273654mx.A00(1045));
        sb.append(this.A04);
        sb.append(C273654mx.A00(101));
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }
}
