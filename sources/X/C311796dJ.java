package X;

/* renamed from: X.6dJ  reason: invalid class name and case insensitive filesystem */
public final class C311796dJ extends AnonymousClass1VF {
    public C311796dJ() {
        super(1, 2);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN useHandsFree INTEGER NOT NULL DEFAULT 0\n        ");
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN handsFreeDurationMs INTEGER NOT NULL DEFAULT 0\n        ");
    }
}
