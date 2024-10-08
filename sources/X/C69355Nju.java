package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nju  reason: case insensitive filesystem */
public enum C69355Nju {
    UNKNOWN(0),
    COMPOSER_BLOCK_UNREACHABLE_USER(1),
    GROUP_THREAD_WITH_NON_ADDRESSABLE_PARTICIPANT(2),
    CANONICAL_THREAD_WITH_NON_ADDRESSABLE_USER(3),
    MESSAGE_REQUEST(4),
    DISAPPEARING_MESSAGE_PROMOTION(5),
    DISAPPEARING_MESSAGE_SCREENSHOT_PROMOTION(6),
    RESTRICT_COMPOSER(7),
    QUICK_PROMOTION_TOP_BANNER(8),
    PROACTIVE_WARNINGS(9),
    MESSAGE_REQUEST_GROUP_INVITE(10),
    UNSEND_NUX_BANNER(11),
    ODN_CONTROL_RECEIVED(12);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69355Nju[] njuArr;
        A02 = 0oU.A00(njuArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69355Nju nju : values()) {
            C51967G9n.A1O(nju, A0x, nju.A00);
        }
        A01 = 0k2.A0J(A0x, C74066PoV.A00);
    }

    /* access modifiers changed from: public */
    C69355Nju(int i) {
        this.A00 = i;
    }
}
