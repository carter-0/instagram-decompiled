package com.instagram.video.common.events;

import X.0oU;
import X.0qQ;
import X.O3A;
import kotlin.enums.EnumEntries;

public enum IgVideoRealtimeEventPayload$Type {
    JOIN,
    SERVER_MEDIA_UPDATE,
    HANGUP,
    ICE_CANDIDATE,
    RING,
    DISMISS,
    CONFERENCE_STATE,
    ADD_PARTICIPANTS,
    SUBSCRIPTION,
    CLIENT_MEDIA_UPDATE,
    DATA_MESSAGE,
    REMOVE_PARTICIPANTS,
    EXPERIMENT,
    P2P_PROTOCOL,
    P2P_ANSWER,
    P2P_ICE_CANDIDATE,
    UNKNOWN;
    
    public static final O3A Companion = null;

    public static final IgVideoRealtimeEventPayload$Type fromServerValue(String str) {
        0qQ.A0B(str, 0);
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.O3A, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        IgVideoRealtimeEventPayload$Type[] $values;
        $ENTRIES = 0oU.A00($values);
        Companion = new Object();
    }
}
