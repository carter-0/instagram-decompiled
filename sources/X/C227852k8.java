package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Deque;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
public abstract class C227852k8 implements Closeable {
    public static final C227882kF A00;

    public static void A00(C227882kF r3, Throwable th, Deque deque) {
        Throwable th2 = th;
        while (!deque.isEmpty()) {
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    r3.Ez9(closeable, th2, th3);
                }
            }
        }
        if (th == null && th2 != null) {
            Class<IOException> cls = IOException.class;
            Object obj = SS5.A00;
            if (cls.isInstance(th2)) {
                throw cls.cast(th2);
            } else if ((th2 instanceof RuntimeException) || (th2 instanceof Error)) {
                throw th2;
            } else {
                throw new AssertionError(th2);
            }
        }
    }

    static {
        C227882kF r0;
        Class<Throwable> cls = Throwable.class;
        try {
            r0 = new AnonymousClass2kD(cls.getMethod("addSuppressed", new Class[]{cls}));
        } catch (Throwable unused) {
            r0 = T0F.A00;
        }
        A00 = r0;
    }
}
