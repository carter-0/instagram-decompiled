package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Xr3  reason: case insensitive filesystem */
public abstract class C22013Xr3 {
    public static final Throwable A00 = new Y5R();

    public static RuntimeException A00(Throwable th) {
        if (th instanceof Error) {
            throw th;
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static Throwable A01(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = A00;
        if (th != th2) {
            return (Throwable) atomicReference.getAndSet(th2);
        }
        return th;
    }

    public static boolean A02(Throwable th, AtomicReference atomicReference) {
        Object obj;
        Throwable tQr;
        do {
            obj = atomicReference.get();
            if (obj == A00) {
                return false;
            }
            if (obj == null) {
                tQr = th;
            } else {
                tQr = new C13225TQr(Arrays.asList(new Throwable[]{(Throwable) obj, th}));
            }
        } while (!1FH.A00(obj, tQr, atomicReference));
        return true;
    }
}
