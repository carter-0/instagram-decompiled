package com.instagram.direct.perf.constants;

import X.0oU;
import X.0qQ;
import java.util.Locale;
import kotlin.enums.EnumEntries;

public enum ThreadFetchReason {
    MISSING_DATA_IN_INBOX_SNAPSHOT_E2E("snapshot"),
    THREAD_SUMMARY("snapshot"),
    DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK("paging_new"),
    INITIAL_SNAPSHOT("snapshot"),
    MISSING_CUTOVER_OPEN_THREAD("snapshot"),
    IRIS_THREAD_SNAPSHOT_SIDE_EFFECT("snapshot"),
    EAGER_THREAD_RESOLUTION("snapshot"),
    IRIS_SYNC_MESSAGE("snapshot"),
    BROADCAST_CHANNEL_SNAPSHOT_REQUEST("snapshot"),
    OPEN_BROADCAST_CHANNEL("snapshot"),
    UPDATE_STORY_MENTION_SETTINGS("snapshot"),
    BURNER("snapshot"),
    ARMADILLO_BADGE_COUNTER("snapshot"),
    FETCH_CHANNEL_MESSAGES("snapshot"),
    STALE_THREAD_ON_THREAD_OPEN("snapshot"),
    GROUP_PREVIEW_JOIN_CHANNEL("snapshot"),
    GROUP_PREVIEW_FOLLOW_USER("snapshot"),
    GROUP_PREVIEW_NAVIGATE_TO_THREAD("snapshot"),
    MESSAGE_SHARE_STICKER("snapshot"),
    RTC_SHARE("snapshot"),
    LOAD_AND_OPEN_GROUP_THREAD("snapshot"),
    ARMADILLO_MIXED_NOTIFICATION_IS_OPEN_THREAD_MUTED("snapshot"),
    ARMADILLO_MIXED_NOTIFICATION("snapshot"),
    CHECK_MUTED_WORDS_FOR_PUSH("snapshot"),
    PREPARE_FOR_PUSH_NOTIFICATION("snapshot"),
    CONFIRM_PENDING_MESSAGES("snapshot"),
    BROADCAST_CHANNEL_INBOX_UPDATE("snapshot"),
    DJANGO_SIDE_EFFECT("snapshot"),
    CLICK_TO_JOIN("snapshot"),
    HERA_CALL("snapshot"),
    AE_MISSING_THREAD_AT_MESSAGE_SYNC_OP_RENDERER("snapshot"),
    AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER("snapshot"),
    AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER("snapshot"),
    AE_MISSING_THREAD_IN_THREAD_STORE("snapshot");
    
    public final String fetchType;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        ThreadFetchReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getFetchType() {
        return this.fetchType;
    }

    /* access modifiers changed from: public */
    ThreadFetchReason(String str) {
        this.fetchType = str;
    }

    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        return lowerCase;
    }
}
