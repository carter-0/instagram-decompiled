package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: X.97K  reason: invalid class name */
public final class AnonymousClass97K {
    public static final Logger A00 = Logger.getLogger(AnonymousClass97K.class.getName());
    public static final AtomicBoolean A01 = new AtomicBoolean(false);

    public static boolean A00() {
        if (A01.get()) {
            return true;
        }
        return false;
    }
}
