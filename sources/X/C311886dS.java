package X;

/* renamed from: X.6dS  reason: invalid class name and case insensitive filesystem */
public final class C311886dS extends AnonymousClass1VF {
    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN isUserSafetyWarningRequired INTEGER NOT NULL DEFAULT 0\n        ");
    }

    public C311886dS() {
        super(10, 11);
    }
}
