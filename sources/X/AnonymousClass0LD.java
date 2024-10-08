package X;

import java.util.Map;

/* renamed from: X.0LD  reason: invalid class name */
public final class AnonymousClass0LD {
    public static AnonymousClass0LD A03;
    public AnonymousClass0MN A00;
    public C63000xP A01;
    public Map A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0LD] */
    public static synchronized AnonymousClass0LD A00() {
        AnonymousClass0LD r0;
        synchronized (AnonymousClass0LD.class) {
            AnonymousClass0LD r02 = A03;
            r0 = r02;
            if (r02 == null) {
                ? obj = new Object();
                A03 = obj;
                r0 = obj;
            }
        }
        return r0;
    }
}
