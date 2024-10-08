package X;

import java.util.List;
import java.util.Map;

public final class N40 extends AnonymousClass0T0 {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final Map A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public static final N40 A00(Integer num, List list, List list2, List list3, List list4, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(num, 0);
        C51974G9v.A1P(list, list2, list3, list4);
        0qQ.A0B(map, 5);
        return new N40(num, list, list2, list3, list4, map, z, z2, z3, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N40) {
                N40 n40 = (N40) obj;
                if (!(this.A00 == n40.A00 && 0qQ.A0K(this.A02, n40.A02) && 0qQ.A0K(this.A04, n40.A04) && 0qQ.A0K(this.A03, n40.A03) && 0qQ.A0K(this.A01, n40.A01) && 0qQ.A0K(this.A05, n40.A05) && this.A08 == n40.A08 && this.A0A == n40.A0A && this.A0B == n40.A0B && this.A09 == n40.A09 && this.A07 == n40.A07 && this.A06 == n40.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        Integer num = this.A00;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "SEARCH";
                break;
            case 2:
                str = C273654mx.A00(458);
                break;
            case 3:
                str = "ONLY_GIPHY";
                break;
            case 4:
                str = "ONLY_FAVORITES";
                break;
            case 5:
                str = "ONLY_RECENTS";
                break;
            default:
                str = "TRENDING";
                break;
        }
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, C51968G9o.A0F(str, intValue))))))))))));
    }

    public N40(Integer num, List list, List list2, List list3, List list4, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = num;
        this.A02 = list;
        this.A04 = list2;
        this.A03 = list3;
        this.A01 = list4;
        this.A05 = map;
        this.A08 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A09 = z4;
        this.A07 = z5;
        this.A06 = z6;
    }
}
