package X;

/* renamed from: X.95Q  reason: invalid class name */
public abstract class AnonymousClass95Q {
    public static final AnonymousClass95U A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.95U, X.95T] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.95U, X.95T] */
    static {
        AnonymousClass95U r1 = AnonymousClass95R.A0B;
        boolean z = r1.A00;
        ? r2 = new AnonymousClass95T(r1, "privacy_permission_snapshot/");
        r2.A00 = z;
        ? r0 = new AnonymousClass95T(r2, "last_lookup_time_seconds");
        r0.A00 = z;
        A00 = r0;
    }

    public final int A00() {
        try {
            return (int) (System.currentTimeMillis() / 1000);
        } catch (ClassCastException e) {
            0KC.A0K(AnonymousClass000.A00(957), "ClassCastException while converting Milliseconds into Seconds", e);
            return 0;
        }
    }
}
