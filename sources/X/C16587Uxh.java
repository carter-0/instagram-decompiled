package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxh  reason: case insensitive filesystem */
public enum C16587Uxh {
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    SPEAKEASY("speakeasy"),
    BEFORE_AND_AFTER("before_and_after"),
    TOP_THREE("top_three"),
    STORY_TEMPLATE("story_template"),
    MAGIC_MOD_RESTYLE("magic_mod_restyle"),
    MAGIC_MOD_BRUSH("magic_mod_brush"),
    MAGIC_MOD_BACKDROP("magic_mod_backdrop"),
    MAGIC_MOD_BACKDROP_TOPIC("magic_mod_backdrop_topic"),
    GENAI_IMAGINE_ME("genai_imagine_me"),
    GENAI_IMAGINE("genai_imagine"),
    ELECTION("election"),
    MUSIC_PICK("music_pick"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16587Uxh[] uxhArr;
        A02 = 0oU.A00(uxhArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16587Uxh uxh : values()) {
            linkedHashMap.put(uxh.A00, uxh);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16587Uxh(String str) {
        this.A00 = str;
    }
}
