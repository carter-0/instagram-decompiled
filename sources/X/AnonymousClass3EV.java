package X;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.3EV  reason: invalid class name */
public final class AnonymousClass3EV extends C227602jb {
    public final String A00;

    public final FileChannel A01() {
        return ((FileInputStream) this.A00).getChannel();
    }

    public AnonymousClass3EV(1JT r3) {
        super(new FileInputStream(r3.A02()));
        r3.A00();
        this.A00 = r3.A02().getAbsolutePath();
    }
}
