package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DeO  reason: case insensitive filesystem */
public enum C46401DeO {
    PROMOTIONAL("promotional"),
    WELCOME("welcome"),
    WELCOME_FEEDBACK_STORY("welcome_feedback_story"),
    FEEDBACK_STICKER_STORY_FROM_NOTIF("feedback_sticker_story_from_notif");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C46401DeO[] deOArr;
        A02 = 0oU.A00(deOArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C46401DeO deO : values()) {
            A0x.put(deO.A00, deO);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C46401DeO(String str) {
        this.A00 = str;
    }
}
