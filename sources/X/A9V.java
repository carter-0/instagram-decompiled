package X;

import java.util.Arrays;
import java.util.List;

public final class A9V {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public long A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (!(obj instanceof A9V)) {
            return false;
        }
        return 2PP.A00(Long.valueOf(this.A06), Long.valueOf(((A9V) obj).A06));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A06)});
    }
}
