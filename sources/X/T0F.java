package X;

import com.google.common.io.Closeables;
import java.io.Closeable;
import java.util.logging.Level;

public final class T0F implements C227882kF {
    public static final T0F A00 = new Object();

    public final void Ez9(Closeable closeable, Throwable th, Throwable th2) {
        Closeables.logger.log(Level.WARNING, AnonymousClass7TG.A0m(closeable, "Suppressing exception thrown when closing ", AnonymousClass7TE.A1A()), th2);
    }
}
