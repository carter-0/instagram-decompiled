package com.meta.foa.performancelogging.lss;

import X.0oU;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

public enum LocalSendSpeedMessageTypes {
    TEXT("text"),
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    STICKER("sticker"),
    GIF("gif"),
    PHOTO("photo"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    COLLECTION("collection"),
    EPHEMERAL_PHOTO("ephemeral_photo"),
    EPHEMERAL_VIDEO("ephemeral_video"),
    REACTION("reaction");
    
    public final String typeName;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        LocalSendSpeedMessageTypes[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getTypeName() {
        return this.typeName;
    }

    /* access modifiers changed from: public */
    LocalSendSpeedMessageTypes(String str) {
        this.typeName = str;
    }
}
