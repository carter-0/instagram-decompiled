package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;

public final class Q3X implements C299065uW {
    public double A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final QuickPerformanceLogger A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final void D4y(Map map, int i) {
        if (this.A06) {
            int i2 = this.A01;
            if (i2 != -1) {
                if (i < i2) {
                    1Kn.A02("BloksRenderPerfCommitListener", "Frame version is decreasing");
                    return;
                }
                int i3 = i - i2;
                int i4 = i3 - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                this.A04 += i4;
                if (((long) i4) > 4) {
                    this.A00 += (((double) i4) * 1.0d) / 4.0d;
                }
                this.A05 += (long) (this.A08 * i3);
            }
            this.A01 = i;
        }
    }

    public Q3X(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, String str3, int i, int i2, int i3) {
        this.A08 = i;
        this.A09 = quickPerformanceLogger;
        this.A07 = i2;
        this.A0C = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A02 = i3;
        this.A03 = i3;
    }
}
