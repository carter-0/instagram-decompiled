package X;

/* renamed from: X.2QG  reason: invalid class name */
public final class AnonymousClass2QG {
    public final boolean A00() {
        AnonymousClass0Ky r1;
        long j;
        if (0LA.A04 == null) {
            r1 = null;
        } else {
            r1 = 0LA.A04.A01;
        }
        if (r1 == null) {
            return false;
        }
        synchronized (r1) {
            j = r1.A02;
        }
        if (j > 0) {
            return true;
        }
        return false;
    }
}
