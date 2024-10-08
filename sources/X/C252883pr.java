package X;

/* renamed from: X.3pr  reason: invalid class name and case insensitive filesystem */
public enum C252883pr {
    RetryWhenNetworkAvailable,
    Failure,
    Posting,
    PostPending,
    Deleted,
    DeletePending,
    HidePending,
    Success;

    /* access modifiers changed from: public */
    static {
        C252883pr[] r0;
        A00 = 0oU.A00(r0);
    }

    public final boolean A00() {
        if (this == Deleted || this == DeletePending || this == HidePending) {
            return false;
        }
        return true;
    }
}
