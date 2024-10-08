package X;

import java.util.concurrent.Callable;

/* renamed from: X.6FH  reason: invalid class name */
public abstract class AnonymousClass6FH {
    public static boolean A00(C65071aK r3, 1aL r4, C3032668b r5) {
        boolean z = false;
        if (r3 instanceof Callable) {
            z = true;
            try {
                Object call = ((Callable) r3).call();
                if (call != null) {
                    Object apply = r5.apply(call);
                    1aP.A01(apply, "The mapper returned a null ObservableSource");
                    C65071aK r1 = (C65071aK) apply;
                    if (r1 instanceof Callable) {
                        Object call2 = ((Callable) r1).call();
                        if (call2 != null) {
                            AnonymousClass66n r0 = new AnonymousClass66n(r4, call2);
                            r4.Do4(r0);
                            r0.run();
                            return true;
                        }
                    } else {
                        r1.Eyt(r4);
                        return true;
                    }
                }
                r4.Do4(AnonymousClass6F8.INSTANCE);
                r4.onComplete();
            } catch (Throwable th) {
                C9877Riq.A00(th);
                r4.Do4(AnonymousClass6F8.INSTANCE);
                r4.onError(th);
                return true;
            }
        }
        return z;
    }
}
