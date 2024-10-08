package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sQ  reason: invalid class name and case insensitive filesystem */
public enum C391149sQ {
    DUAL_STICKER("DUAL_STICKER"),
    FEED_TO_STORY_STICKER("FEED_TO_STORY_STICKER"),
    GALLERY_STICKER("GALLERY_STICKER"),
    QUESTION_RESPONSE_STICKER("QUESTION_RESPONSE_STICKER"),
    REEL_REMIX("REEL_REMIX"),
    REEL_TO_STORY_STICKER("REEL_TO_STORY_STICKER"),
    STORY_MENTION_RESHARE("STORY_MENTION_RESHARE"),
    STORY_EOY_SHARE("STORY_EOY_SHARE"),
    ROLL_CALL_STORIES("ROLL_CALL_STORIES"),
    UNKNOWN("UNKNOWN");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391149sQ[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391149sQ r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391149sQ(String str) {
        this.A00 = str;
    }
}
