package X;

/* renamed from: X.38Z  reason: invalid class name */
public final class AnonymousClass38Z extends AnonymousClass1VF {
    public static final AnonymousClass38Z A00 = new AnonymousClass38Z();

    public AnonymousClass38Z() {
        super(3, 4);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
