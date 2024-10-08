package X;

/* renamed from: X.39t  reason: invalid class name and case insensitive filesystem */
public enum C2379139t {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean A00() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
            return true;
        }
        return false;
    }
}
