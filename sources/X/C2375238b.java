package X;

/* renamed from: X.38b  reason: invalid class name and case insensitive filesystem */
public final class C2375238b extends AnonymousClass1VF {
    public static final C2375238b A00 = new C2375238b();

    public C2375238b() {
        super(6, 7);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
