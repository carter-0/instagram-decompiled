package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.2rw  reason: invalid class name and case insensitive filesystem */
public final class C231602rw {
    public final C231502rm A00;

    public final AnonymousClass2u0 A00(String str, C62320sa r10) {
        boolean A02;
        0qQ.A0B(str, 0);
        C231502rm r4 = this.A00;
        C231542rq[] values = C231542rq.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                C231542rq r7 = values[i];
                0qQ.A0B(r7, 0);
                C231532rp r1 = r4.A04;
                if (r7 == C231542rq.MEDIA_CONTENT) {
                    if (C231532rp.A01(r1, str)) {
                        break;
                    }
                    A02 = C231532rp.A02(r1, str);
                } else if (r1.A04.contains(r7)) {
                    if (C231532rp.A00((C231572rt) r1.A02.get(r7), str)) {
                        break;
                    }
                    A02 = C231532rp.A00((C231572rt) r1.A03.get(r7), str);
                } else if (r4.A02(r7, str) != AnonymousClass05K.A0C) {
                    break;
                } else {
                    i++;
                }
                if (A02) {
                    break;
                }
                i++;
            } else {
                C231532rp r3 = r4.A04;
                if (!C231532rp.A01(r3, str) && !C231532rp.A02(r3, str)) {
                    Set set = r3.A04;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return null;
                    }
                    for (Object next : set) {
                        if (!C231532rp.A00((C231572rt) r3.A02.get(next), str)) {
                            if (C231532rp.A00((C231572rt) r3.A03.get(next), str)) {
                            }
                        }
                    }
                    return null;
                }
            }
        }
        Set set2 = AnonymousClass2u0.A05;
        return new AnonymousClass2u0(r4, new AnonymousClass2u1(r10));
    }

    public C231602rw(UserSession userSession) {
        this.A00 = C231492rl.A00(userSession);
    }
}
