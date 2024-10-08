package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMq  reason: case insensitive filesystem */
public enum C54659HMq {
    THREE_THUMBNAILS(1),
    FOUR_THUMBNAILS(2),
    HIDE_THUMBNAILS(3),
    TWO_THUMBNAILS(5),
    TOP_MAIN_BOTTOM_TWO_TAPPABLE_THUMBNAILS(6),
    TOP_MAIN_BOTTOM_THREE_TAPPABLE_THUMBNAILS(7),
    TOP_MAIN_BOTTOM_TWO_TAPPABLE_THUMBNAILS_WITH_TITLES(8),
    TOP_MAIN_BOTTOM_SCROLLABLE_THUMBNAILS(9),
    SECOND_CARD_TAPPABLE_THUMBNAILS(10);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C54659HMq[] hMqArr;
        A02 = 0oU.A00(hMqArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C54659HMq hMq : values()) {
            C51967G9n.A1O(hMq, A0x, hMq.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54659HMq(int i) {
        this.A00 = i;
    }
}
