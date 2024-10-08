package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SQf  reason: case insensitive filesystem */
public final class C11371SQf {
    public static final C11371SQf A01 = new C11371SQf(true);
    public static volatile C11371SQf A02;
    public final Map A00;

    public static C11371SQf A00() {
        C11371SQf sQf;
        Class<C11371SQf> cls = C11371SQf.class;
        C11371SQf sQf2 = A02;
        if (sQf2 != null) {
            return sQf2;
        }
        synchronized (cls) {
            sQf = A02;
            if (sQf == null) {
                sQf = SA5.A00();
                A02 = sQf;
            }
        }
        return sQf;
    }

    public C11371SQf(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C11371SQf() {
        this.A00 = AnonymousClass7TE.A1E();
    }
}
