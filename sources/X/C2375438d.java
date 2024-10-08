package X;

/* renamed from: X.38d  reason: invalid class name and case insensitive filesystem */
public final class C2375438d extends AnonymousClass1VF {
    public static final C2375438d A00 = new C2375438d();

    public C2375438d() {
        super(7, 8);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
