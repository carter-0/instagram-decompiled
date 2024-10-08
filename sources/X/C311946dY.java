package X;

/* renamed from: X.6dY  reason: invalid class name and case insensitive filesystem */
public final class C311946dY extends AnonymousClass1VF {
    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN requiredSdkVersion TEXT\n        ");
        r2.AT6("\n          ALTER TABLE effects\n          ADD COLUMN bestInstanceId TEXT\n        ");
    }

    public C311946dY() {
        super(16, 17);
    }
}
