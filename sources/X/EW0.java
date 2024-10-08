package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EW0 {
    ANYTIME_MENTION("anytime_mention"),
    STORY_REQUEST_MENTION("story_request_mention"),
    INVISIBLE_MENTION_USER_SELECTION_BUTTON("invisible_mention_user_selection_button");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EW0[] ew0Arr;
        A02 = 0oU.A00(ew0Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EW0 ew0 : values()) {
            A0x.put(ew0.A00, ew0);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EW0(String str) {
        this.A00 = str;
    }
}
