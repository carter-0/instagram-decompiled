package X;

import java.util.List;

/* renamed from: X.JvW  reason: case insensitive filesystem */
public final class C61032JvW extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C61032JvW(List list, List list2, List list3) {
        this((String) null, list, list2, list3, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61032JvW)) {
                return false;
            }
            C61032JvW jvW = (C61032JvW) obj;
            if (jvW.A00 == 1 && this.A06 == jvW.A06 && 0qQ.A0K(this.A03, jvW.A03) && 0qQ.A0K(this.A01, jvW.A01) && 0qQ.A0K(this.A02, jvW.A02) && this.A05 == jvW.A05 && 0qQ.A0K(this.A04, jvW.A04) && this.A08 == jvW.A08 && this.A07 == jvW.A07 && this.A0A == jvW.A0A && this.A09 == jvW.A09) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61032JvW)) {
                return false;
            }
            C61032JvW jvW2 = (C61032JvW) obj;
            if (jvW2.A00 == 0 && 0qQ.A0K(this.A03, jvW2.A03) && 0qQ.A0K(this.A02, jvW2.A02) && this.A05 == jvW2.A05 && 0qQ.A0K(this.A04, jvW2.A04) && this.A06 == jvW2.A06 && this.A09 == jvW2.A09 && this.A08 == jvW2.A08 && this.A07 == jvW2.A07 && this.A0A == jvW2.A0A && 0qQ.A0K(this.A01, jvW2.A01)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, C51965G9l.A05(this.A06))));
            return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A09(this.A05, A072) + AnonymousClass7TG.A0E(this.A04)) * 31))));
        }
        int A073 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03));
        return AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A073) + AnonymousClass7TG.A0E(this.A04)) * 31))))) + AnonymousClass7TE.A0L(this.A01);
    }

    public C61032JvW(Long l, String str, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass7TG.A1O(list, list2);
        this.A03 = list;
        this.A02 = list2;
        this.A05 = z;
        this.A04 = str;
        this.A06 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A07 = z5;
        this.A0A = z6;
        this.A01 = l;
    }

    public C61032JvW(String str, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = z;
        this.A03 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A05 = z2;
        this.A04 = str;
        this.A08 = z3;
        this.A07 = z4;
        this.A0A = z5;
        this.A09 = z6;
    }
}
