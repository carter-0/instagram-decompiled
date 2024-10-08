package X;

import java.util.concurrent.TimeUnit;

public final class XQQ extends C65091aX {
    public final long A00 = 2;
    public final C65071aK A01;
    public final C318206oZ A02;
    public final TimeUnit A03;

    public XQQ(1aJ r3, C65071aK r4, C318206oZ r5, TimeUnit timeUnit) {
        super(r3);
        this.A03 = timeUnit;
        this.A02 = r5;
        this.A01 = r4;
    }

    public final void A02(1aL r15) {
        1aL y5q;
        C22475Y5s y5s;
        C318286oh r5;
        C22416Y2y y2y;
        long j;
        TimeUnit timeUnit;
        C65071aK r8 = this.A01;
        1aL r9 = r15;
        if (r8 == null) {
            long j2 = this.A00;
            y5q = new C22470Y5n(r9, this.A02.A00(), this.A03, j2);
            r15.Do4(y5q);
            y5s = y5q.A03;
            r5 = y5q.A02;
            y2y = new C22416Y2y(y5q, 0);
            j = y5q.A00;
            timeUnit = y5q.A04;
        } else {
            long j3 = this.A00;
            y5q = new C22473Y5q(r8, r9, this.A02.A00(), this.A03, j3);
            r15.Do4(y5q);
            y5s = y5q.A04;
            r5 = y5q.A03;
            y2y = new C22416Y2y(y5q, 0);
            j = y5q.A01;
            timeUnit = y5q.A05;
        }
        1af.A00(r5.A01(y2y, timeUnit, j), y5s);
        this.A00.Eyt(y5q);
    }
}
