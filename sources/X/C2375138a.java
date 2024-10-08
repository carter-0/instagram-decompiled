package X;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
public final class C2375138a extends AnonymousClass1VF {
    public static final C2375138a A00 = new C2375138a();

    public C2375138a() {
        super(4, 5);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        r2.AT6("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
