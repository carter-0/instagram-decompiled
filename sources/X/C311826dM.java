package X;

/* renamed from: X.6dM  reason: invalid class name and case insensitive filesystem */
public final class C311826dM extends AnonymousClass1VF {
    public C311826dM() {
        super(4, 5);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN syncedAt INTEGER NOT NULL DEFAULT 0\n        ");
    }
}
