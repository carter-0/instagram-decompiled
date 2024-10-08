package X;

import java.util.concurrent.Callable;

public final class XQH extends 1aJ {
    public final C3032668b A00;
    public final Object A01;

    public final void A02(1aL r3) {
        try {
            Object apply = this.A00.apply(this.A01);
            1aP.A01(apply, "The mapper returned a null ObservableSource");
            C65071aK r1 = (C65071aK) apply;
            if (r1 instanceof Callable) {
                try {
                    Object call = ((Callable) r1).call();
                    if (call == null) {
                        r3.Do4(AnonymousClass6F8.INSTANCE);
                        r3.onComplete();
                        return;
                    }
                    AnonymousClass66n r0 = new AnonymousClass66n(r3, call);
                    r3.Do4(r0);
                    r0.run();
                } catch (Throwable th) {
                    th = th;
                    C9877Riq.A00(th);
                    r3.Do4(AnonymousClass6F8.INSTANCE);
                    r3.onError(th);
                }
            } else {
                r1.Eyt(r3);
            }
        } catch (Throwable th2) {
            th = th2;
            r3.Do4(AnonymousClass6F8.INSTANCE);
            r3.onError(th);
        }
    }

    public XQH(C3032668b r1, Object obj) {
        this.A01 = obj;
        this.A00 = r1;
    }
}
