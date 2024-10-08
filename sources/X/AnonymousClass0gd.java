package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0gd  reason: invalid class name */
public final class AnonymousClass0gd {
    public static AnonymousClass0gd A01;
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public static AnonymousClass0gd A00() {
        AnonymousClass0gd r0 = A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0gd r02 = new AnonymousClass0gd();
        A01 = r02;
        return r02;
    }
}
