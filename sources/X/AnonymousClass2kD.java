package X;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: X.2kD  reason: invalid class name */
public final class AnonymousClass2kD implements C227882kF {
    public final Method A00;

    public final void Ez9(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                this.A00.invoke(th, new Object[]{th2});
            } catch (Throwable unused) {
                T0F.A00.Ez9(closeable, th, th2);
            }
        }
    }

    public AnonymousClass2kD(Method method) {
        this.A00 = method;
    }
}
