package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nkv  reason: case insensitive filesystem */
public enum C69415Nkv {
    STORY_REPLIES(0, 0, (int) null),
    NON_STORY_REPLIES(1, 1, (int) null),
    VERIFIED(2, 2, 2131959921),
    CREATOR(3, 3, 2131959918),
    BUSINESS(4, 4, 2131959917),
    SUBSCRIBER(5, 5, 2131959920),
    CREATOR_AI(6, 7, 2131959919);
    
    public static final Map A03 = null;
    public final int A00;
    public final Integer A01;
    public final String A02;

    public final boolean A00(AnonymousClass2Ep r7) {
        0qQ.A0B(r7, 0);
        if (r7.BKd() == 0) {
            return false;
        }
        int ordinal = ordinal();
        if (ordinal == 2) {
            return DbX.A1a(((AnonymousClass3U9) r7).A01.A1b);
        }
        if (ordinal == 3) {
            return r7.CQs();
        }
        if (ordinal == 4) {
            return r7.CPn();
        }
        if (ordinal == 5) {
            return r7.CTB();
        }
        if (ordinal == 6) {
            return r7.CL4();
        }
        return false;
    }

    /* access modifiers changed from: public */
    static {
        C69415Nkv[] nkvArr;
        A04 = 0oU.A00(nkvArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (C69415Nkv nkv : values()) {
            C51967G9n.A1O(nkv, A0x, nkv.A00);
        }
        A03 = A0x;
    }

    /* access modifiers changed from: public */
    C69415Nkv(int i, int i2, Integer num) {
        this.A00 = i2;
        this.A01 = num;
        this.A02 = r2;
    }
}
