package X;

public enum HN0 {
    RENAME_TOOLTIP("rename_original_audio_tooltip_last_seen_timestamp_ms_key", 0, 2),
    PARTIAL_ATTRIBUTION_RESTORE_TOOLTIP((String) null, 1, 1),
    MUSIC_ON_PROFILE_TOOLTIP((String) null, 2, 1),
    TRY_AUDIO_FILTER_TOOLTIP((String) null, 3, 1),
    SHARE_TO_NOTE_TOOLTIP((String) null, 4, 1),
    TRENDING_AUDIO_TOOLTIP("trending_audio_tooltip_last_seen_timestamp_ms_key", 5, 3);
    
    public final int A00;
    public final String A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        HN0[] hn0Arr;
        A03 = 0oU.A00(hn0Arr);
    }

    /* access modifiers changed from: public */
    HN0(String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r2;
        this.A01 = str;
    }
}
