package X;

import java.util.concurrent.TimeUnit;

public final class XEW extends C65091aX {
    public final long A00;
    public final C318206oZ A01;
    public final TimeUnit A02;

    public final void A02(1aL r9) {
        C65071aK r1 = this.A00;
        long j = this.A00;
        1aL r3 = r9;
        r1.Eyt(new XDG(r3, this.A01.A00(), this.A02, j));
    }

    public XEW(1aJ r1, C318206oZ r2, TimeUnit timeUnit, long j) {
        super(r1);
        this.A00 = j;
        this.A02 = timeUnit;
        this.A01 = r2;
    }
}
