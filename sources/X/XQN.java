package X;

import java.util.concurrent.Callable;

public final class XQN extends C65091aX {
    public final C21099XEn A00;
    public final Callable A01;

    public final void A02(1aL r5) {
        try {
            Object call = this.A01.call();
            1aP.A01(call, "The seed supplied is null");
            this.A00.Eyt(new Y19(this.A00, r5, call));
        } catch (Throwable th) {
            C9877Riq.A00(th);
            r5.Do4(AnonymousClass6F8.INSTANCE);
            r5.onError(th);
        }
    }

    public XQN(C21099XEn xEn, C65071aK r2, Callable callable) {
        super(r2);
        this.A00 = xEn;
        this.A01 = callable;
    }
}
