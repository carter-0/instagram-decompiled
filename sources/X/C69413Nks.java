package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nks  reason: case insensitive filesystem */
public enum C69413Nks {
    NOT_MAPPED("-1"),
    REPORT_CONTENT(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    BLOCK_ACTOR("2"),
    IP_VIOLATION_EDUCATION("3"),
    UNFOLLOW("8"),
    LEARN_MORE_EDUCATION("10"),
    HOW_TO_BLOCK_USER_EDUCATION("11"),
    PLACE_HOLDER_CONTENT_ACTION("12"),
    PLACE_HOLDER_BULLY_CONTENT_ACTION("13"),
    PLACE_HOLDER_I_JUST_DONT_LIKE_CONTENT_ACTION("14"),
    SELF_INJURY_EDUCATION_ACTION("15"),
    RESTRICT_ACTOR("16"),
    LEARN_MORE_ADS("19"),
    NOTIFY_GUARDIAN("23");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69413Nks[] nksArr;
        A02 = 0oU.A00(nksArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69413Nks nks : values()) {
            A0x.put(nks.A00, nks);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69413Nks(String str) {
        this.A00 = str;
    }
}
