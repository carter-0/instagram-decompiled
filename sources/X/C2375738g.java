package X;

/* renamed from: X.38g  reason: invalid class name and case insensitive filesystem */
public final class C2375738g extends AnonymousClass1VF {
    public static final C2375738g A00 = new C2375738g();

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }

    public C2375738g() {
        super(11, 12);
    }
}
