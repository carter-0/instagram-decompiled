package X;

import java.io.File;

public final class AD9 {
    public final long A00;
    public final C341687nM A01;
    public final File A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public AD9(C341687nM r4, File file, Boolean bool, Integer num, Long l) {
        long j;
        this.A02 = file;
        this.A06 = AnonymousClass7TG.A1X(bool);
        if (l != null) {
            j = l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        this.A00 = j;
        this.A01 = r4;
        this.A04 = num;
        this.A03 = null;
        this.A05 = false;
    }

    public AD9(AD9 ad9, Integer num, boolean z) {
        this.A02 = ad9.A02;
        this.A06 = ad9.A06;
        this.A00 = ad9.A00;
        this.A01 = ad9.A01;
        this.A04 = ad9.A04;
        this.A03 = num;
        this.A05 = z;
    }
}
