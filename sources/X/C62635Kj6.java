package X;

/* renamed from: X.Kj6  reason: case insensitive filesystem */
public enum C62635Kj6 {
    CONNECTING,
    CONNECTED_WAITING_FOR_COUNTDOWN,
    CONNECTED,
    STARTED,
    STARTED_AUDIO_ONLY,
    STARTED_MATCHING_CONTENT_DETECTED,
    STARTED_MATCHING_CONTENT_INITIALLY_WARNED,
    CMP_VIOLATION,
    RESUMED,
    STOPPED_BLOCKED,
    STOPPED_SUMMARY,
    STOPPED,
    UNKNOWN;

    /* access modifiers changed from: public */
    static {
        C62635Kj6[] kj6Arr;
        A00 = 0oU.A00(kj6Arr);
    }

    public final boolean A00() {
        if (this == STARTED || this == STARTED_AUDIO_ONLY || this == STARTED_MATCHING_CONTENT_DETECTED || this == STARTED_MATCHING_CONTENT_INITIALLY_WARNED || this == CMP_VIOLATION || this == RESUMED) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this == STOPPED || this == STOPPED_SUMMARY || this == STOPPED_BLOCKED) {
            return true;
        }
        return false;
    }
}
