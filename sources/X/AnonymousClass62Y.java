package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.62Y  reason: invalid class name */
public final class AnonymousClass62Y {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C286025Tq A03;
    public final AnonymousClass5Z4 A04;
    public final C286305Uu A05;
    public final C268024cd A06;
    public final AnonymousClass5Q8 A07;
    public final List A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass62Y) {
                AnonymousClass62Y r8 = (AnonymousClass62Y) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A08, r8.A08) || this.A00 != r8.A00 || this.A09 != r8.A09 || this.A01 != r8.A01 || !0qQ.A0K(this.A06, r8.A06) || this.A07 != r8.A07 || !0qQ.A0K(this.A05, r8.A05) || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        long j = this.A02;
        return ((((((((((hashCode + i) * 31) + this.A01) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TextLayoutInput(text=");
        sb.append(this.A03);
        sb.append(", style=");
        sb.append(this.A04);
        sb.append(", placeholders=");
        sb.append(this.A08);
        sb.append(", maxLines=");
        sb.append(this.A00);
        sb.append(", softWrap=");
        sb.append(this.A09);
        sb.append(", overflow=");
        int i = this.A01;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        sb.append(str);
        sb.append(", density=");
        sb.append(this.A06);
        sb.append(", layoutDirection=");
        sb.append(this.A07);
        sb.append(", fontFamilyResolver=");
        sb.append(this.A05);
        sb.append(Pxd.A00(113));
        sb.append(Constraints.A05(this.A02));
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass62Y(C286025Tq r1, AnonymousClass5Z4 r2, C286305Uu r3, C268024cd r4, AnonymousClass5Q8 r5, List list, int i, int i2, long j, boolean z) {
        this.A03 = r1;
        this.A04 = r2;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
        this.A02 = j;
    }
}
