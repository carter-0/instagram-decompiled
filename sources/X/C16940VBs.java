package X;

import java.util.List;

/* renamed from: X.VBs  reason: case insensitive filesystem */
public abstract class C16940VBs {
    public static final 1Xj A00(C295745oq r5) {
        List list;
        C295795ov r1;
        0qQ.A0B(r5, 0);
        int ordinal = r5.A02.ordinal();
        Object obj = null;
        if (ordinal == 1 || ordinal == 3) {
            C295775ot r12 = r5.A01;
            0qQ.A0A(r12);
            list = r12.A0E;
        } else if (ordinal != 12 && ordinal != 13) {
            return null;
        } else {
            C295775ot r13 = r5.A01;
            0qQ.A0A(r13);
            list = r13.A0D;
        }
        if (!(list == null || (r1 = (C295795ov) 00k.A0O(list, 0)) == null)) {
            obj = r1.A0F;
            0qQ.A0A(obj);
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        return (1Xj) obj;
    }
}
