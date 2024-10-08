package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.51J  reason: invalid class name */
public enum AnonymousClass51J {
    ORIGINAL("original"),
    AUDIO_TRACK("audio_track"),
    VOICEOVER("voiceover"),
    VIDEO_STICKER("video_sticker"),
    TEXT_TO_SPEECH("text_to_speech"),
    SOUND_EFFECTS("sound_effects"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass51J[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass51J r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass51J(String str) {
        this.A00 = str;
    }
}
