package X;

import java.util.LinkedList;

/* renamed from: X.ACt  reason: case insensitive filesystem */
public final class C39872ACt {
    public static C39872ACt A01;
    public final LinkedList A00 = new LinkedList();

    public static synchronized C39872ACt A00() {
        C39872ACt aCt;
        synchronized (C39872ACt.class) {
            aCt = A01;
            if (aCt == null) {
                aCt = new C39872ACt();
                A01 = aCt;
            }
        }
        return aCt;
    }
}
