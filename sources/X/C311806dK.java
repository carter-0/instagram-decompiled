package X;

/* renamed from: X.6dK  reason: invalid class name and case insensitive filesystem */
public final class C311806dK extends AnonymousClass1VF {
    public C311806dK() {
        super(2, 3);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN isEncrypted INTEGER NOT NULL DEFAULT 0\n        ");
    }
}
