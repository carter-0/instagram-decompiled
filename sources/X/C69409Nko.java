package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nko  reason: case insensitive filesystem */
public enum C69409Nko {
    STORIES_NETEGO("stories_netego"),
    TRENDING_PROMPTS_SURFACE("trending_prompts_surface"),
    STORY_CREATION_FLOW_SHUFFLE_SUGGESTIONS("story_creation_flow_shuffle_suggestions"),
    TRENDING_PROMPTS_NOTIFICATION_SOURCING("trending_prompts_notification_sourcing"),
    TRENDING_PROMPTS_ADD_YOURS_IN_CHAT_SOURCING("trending_prompts_add_yours_in_chat_sourcing");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69409Nko[] nkoArr;
        A02 = 0oU.A00(nkoArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69409Nko nko : values()) {
            A0x.put(nko.A00, nko);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69409Nko(String str) {
        this.A00 = str;
    }
}
