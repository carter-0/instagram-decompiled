package X;

import java.util.List;
import java.util.Locale;

public final class S56 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final S7N A09;
    public final QGY A0A;
    public final C7489QGe A0B;
    public final C10655Rvp A0C;
    public final C11816Sh2 A0D;
    public final C10157RnY A0E;
    public final C10723Rx1 A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;

    public final String toString() {
        return A00("");
    }

    public final String A00(String str) {
        int i;
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append(this.A0J);
        A0n.append("\n");
        S7N s7n = this.A09;
        S56 s56 = (S56) s7n.A06.A05(this.A08);
        if (s56 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A0n.append(str2);
                A0n.append(s56.A0J);
                s56 = (S56) s7n.A06.A05(s56.A08);
                if (s56 == null) {
                    break;
                }
                str2 = "->";
            }
            A0n.append(str);
            A0n.append("\n");
        }
        List list = this.A0M;
        if (!list.isEmpty()) {
            A0n.append(str);
            A0n.append("\tMasks: ");
            A0n.append(list.size());
            A0n.append("\n");
        }
        int i2 = this.A06;
        if (!(i2 == 0 || (i = this.A05) == 0)) {
            A0n.append(str);
            A0n.append("\tBackground: ");
            A0n.append(String.format(Locale.US, "%dx%d %X\n", Pxf.A1Y(Integer.valueOf(i2), Integer.valueOf(i), this.A04)));
        }
        List list2 = this.A0N;
        if (!list2.isEmpty()) {
            A0n.append(str);
            A0n.append("\tShapes:\n");
            for (Object next : list2) {
                A0n.append(str);
                Pxf.A1K(next, "\t\t", "\n", A0n);
            }
        }
        return A0n.toString();
    }

    public S56(S7N s7n, QGY qgy, C7489QGe qGe, C10655Rvp rvp, C11816Sh2 sh2, C10157RnY rnY, C10723Rx1 rx1, Integer num, Integer num2, Integer num3, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0N = list;
        this.A09 = s7n;
        this.A0J = str;
        this.A07 = j;
        this.A0H = num;
        this.A08 = j2;
        this.A0K = str2;
        this.A0M = list2;
        this.A0D = sh2;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = qGe;
        this.A0C = rvp;
        this.A0L = list3;
        this.A0I = num2;
        this.A0A = qgy;
        this.A0O = z;
        this.A0E = rnY;
        this.A0F = rx1;
        this.A0G = num3;
    }
}
