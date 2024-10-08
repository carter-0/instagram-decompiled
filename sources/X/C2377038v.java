package X;

/* renamed from: X.38v  reason: invalid class name and case insensitive filesystem */
public final class C2377038v extends AnonymousClass1VF {
    public C2377038v() {
        super(17, 18);
    }

    public final void migrate(1W6 r2) {
        r2.AT6("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        r2.AT6("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
