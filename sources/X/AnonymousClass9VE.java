package X;

import java.util.List;

/* renamed from: X.9VE  reason: invalid class name */
public final class AnonymousClass9VE extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass9VH A01;
    public final BB6 A02;
    public final AnonymousClass9VF A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final List A07;
    public final Long A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VE) {
                AnonymousClass9VE r5 = (AnonymousClass9VE) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || this.A00 != r5.A00 || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A05, r5.A05) || this.A04 != r5.A04 || !0qQ.A0K(this.A03, r5.A03)) {
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
        String A002;
        int hashCode4;
        int hashCode5 = ((((this.A06.hashCode() * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        BB6 bb6 = this.A02;
        int i = 0;
        if (bb6 == null) {
            hashCode = 0;
        } else {
            hashCode = bb6.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A01.hashCode()) * 31;
        Long l = this.A08;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        Long l2 = this.A05;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode4 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    A002 = "INELIGIBLE";
                    break;
                case 2:
                    A002 = AnonymousClass000.A00(2488);
                    break;
                default:
                    A002 = "ELIGIBLE";
                    break;
            }
            hashCode4 = A002.hashCode() + intValue;
        }
        int i4 = (i3 + hashCode4) * 31;
        AnonymousClass9VF r0 = this.A03;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return i4 + i;
    }

    public AnonymousClass9VE(AnonymousClass9VH r1, BB6 bb6, AnonymousClass9VF r3, Integer num, Long l, Long l2, String str, List list, int i) {
        this.A06 = str;
        this.A00 = i;
        this.A07 = list;
        this.A02 = bb6;
        this.A01 = r1;
        this.A08 = l;
        this.A05 = l2;
        this.A04 = num;
        this.A03 = r3;
    }
}
