package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SEU {
    public static final SEU A02 = new SEU();
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final Runnable A01 = new C12907TCw(this);

    static {
        TimeUnit.DAYS.toMillis(1);
    }
}
