package X;

import java.util.HashMap;

/* renamed from: X.Nu8  reason: case insensitive filesystem */
public abstract class C69906Nu8 {
    public static final N3F A00(N3B n3b) {
        String str;
        Integer num;
        0qQ.A0B(n3b, 0);
        String str2 = n3b.A07;
        N37 n37 = n3b.A00;
        HashMap hashMap = n3b.A09;
        C74521PwG pwG = n3b.A01;
        if (pwG != null) {
            str = ((N59) pwG).A00;
        } else {
            str = null;
        }
        Long l = n3b.A06;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        return new N3F(n37, (C300925yB) null, n3b.A02, num, AnonymousClass05K.A0N, str2, str, n3b.A08, hashMap, AnonymousClass7TG.A1X(n3b.A03), C51972G9s.A1Z(n3b.A04), false);
    }
}
