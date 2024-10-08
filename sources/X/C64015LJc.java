package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LJc  reason: case insensitive filesystem */
public abstract class C64015LJc {
    public static final List A00(AnonymousClass3Q2 r4) {
        List list = r4.A4o;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (Dba.A1X(C318046oG.KARAOKE_CAPTION, ((AnonymousClass5JJ) next).A0I)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final List A01(AnonymousClass3Q2 r5) {
        C248883ik r0;
        List list = r5.A4o;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            AnonymousClass5JJ r2 = (AnonymousClass5JJ) next;
            if (Dba.A1X(C318046oG.TEXT, r2.A0I) && (r0 = r2.A02) != null && r0.A09 == 0 && r2.A0F == null) {
                A1C.add(next);
            }
        }
        return A1C;
    }
}
