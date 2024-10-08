package X;

import java.util.List;

public final class N9W extends AnonymousClass0T0 implements C74270Pry {
    public final float A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9W) {
                N9W n9w = (N9W) obj;
                if (!(this.A05 == n9w.A05 && 0qQ.A0K(this.A03, n9w.A03) && 0qQ.A0K(this.A01, n9w.A01) && 0qQ.A0K(this.A02, n9w.A02) && Float.compare(this.A00, n9w.A00) == 0 && this.A08 == n9w.A08 && this.A06 == n9w.A06 && this.A07 == n9w.A07 && this.A04 == n9w.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A03, C51965G9l.A05(this.A05)))), this.A00)))));
    }

    public N9W(String str, String str2, List list, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C51974G9v.A1M(list, str, str2);
        this.A05 = z;
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = f;
        this.A08 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A04 = z5;
    }
}
