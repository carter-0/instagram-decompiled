package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.XEy  reason: case insensitive filesystem */
public final class C21108XEy extends C65091aX {
    public final long A00 = 5;
    public final C318206oZ A01;
    public final TimeUnit A02;

    public C21108XEy(C65071aK r3, C318206oZ r4, TimeUnit timeUnit) {
        super(r3);
        this.A02 = timeUnit;
        this.A01 = r4;
    }

    public final void A02(1aL r8) {
        XDH xdh = new XDH(r8);
        C318286oh A002 = this.A01.A00();
        this.A00.Eyt(new XDD(xdh, A002, this.A02, this.A00));
    }
}
