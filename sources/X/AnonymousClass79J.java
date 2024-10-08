package X;

/* renamed from: X.79J  reason: invalid class name */
public final class AnonymousClass79J {
    public final AnonymousClass79I A00() {
        AnonymousClass79I r0 = AnonymousClass79I.A03;
        if (r0 == null) {
            synchronized (this) {
                r0 = AnonymousClass79I.A03;
                if (r0 == null) {
                    r0 = new AnonymousClass79I();
                    AnonymousClass79I.A03 = r0;
                }
            }
        }
        return r0;
    }
}
