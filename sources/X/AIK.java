package X;

import java.util.List;

public final class AIK {
    public static final AIK A00 = new Object();

    public static final void A00(C58840Ae r2, C391479t9 r3, C391489tA r4, C255773uh r5, C255783ui r6, List list) {
        int i;
        DDv dDv;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r2, "ig_wellbeing_anti_bullying_stickers");
        A0e.A8M(r3, "action");
        A0e.A8M(r4, "step");
        A0e.A9F(C66579MXk.A00(1146), Long.valueOf((long) i));
        if (r6 != null) {
            int ordinal = r6.A11.ordinal();
            if (ordinal == 0) {
                dDv = r6.A1C;
            } else if (ordinal == 1) {
                dDv = r6.A1D;
            } else if (ordinal == 51) {
                dDv = r6.A1G;
            } else if (ordinal == 4) {
                dDv = r6.A1F;
            }
            if (dDv != null) {
                A0e.AAJ("sticker_id_str", dDv.A09);
            }
        }
        1Xj r0 = r5.A0b;
        if (r0 != null) {
            A0e.AAJ("media_id_str", r0.getId());
        }
        A0e.Cgf();
    }

    public static final void A01(C58840Ae r6, C255773uh r7, List list) {
        C58840Ae r0 = r6;
        C255773uh r3 = r7;
        A00(r0, C391479t9.IMPRESSION, C391489tA.CONSUMER_STICKER, r3, (C255783ui) 00k.A0J(list), list);
    }
}
