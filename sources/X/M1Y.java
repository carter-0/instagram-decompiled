package X;

import java.util.Arrays;
import java.util.List;

public final class M1Y implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public String A06;
    public List A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            M1Y m1y = (M1Y) obj;
            if (!(this.A01 == m1y.A01 && this.A00 == m1y.A00 && this.A03 == m1y.A03 && this.A02 == m1y.A02 && 0qQ.A0K(this.A06, m1y.A06) && this.A07 == m1y.A07 && this.A05 == m1y.A05 && this.A08 == m1y.A08)) {
                return false;
            }
        }
        return true;
    }

    public final M1Y A00() {
        int i = this.A01;
        int i2 = this.A00;
        String str = this.A06;
        int i3 = this.A03;
        int i4 = this.A02;
        List list = this.A07;
        int i5 = this.A05;
        int i6 = this.A04;
        M1Y m1y = new M1Y();
        m1y.A01 = i;
        m1y.A00 = i2;
        m1y.A06 = str;
        m1y.A03 = i3;
        m1y.A02 = i4;
        m1y.A07 = list;
        m1y.A05 = i5;
        m1y.A04 = i6;
        return m1y;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        M1Y m1y = (M1Y) obj;
        0qQ.A0B(m1y, 0);
        return this.A03 - m1y.A03;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A06, this.A07, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A05), Boolean.valueOf(this.A08)});
    }
}
