package X;

import java.util.Collections;
import java.util.Map;

public final class SNG {
    public static final SNG A01 = new SNG(true);
    public static volatile SNG A02;
    public final Map A00;

    public SNG(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public SNG() {
        this.A00 = AnonymousClass7TE.A1E();
    }
}
