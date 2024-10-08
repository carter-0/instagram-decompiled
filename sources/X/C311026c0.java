package X;

import com.instagram.user.model.User;

/* renamed from: X.6c0  reason: invalid class name and case insensitive filesystem */
public final class C311026c0 implements C250603lj {
    public final C311016bz A00;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        String str;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        Integer CEk = r7.CEk(r6);
        0qQ.A07(CEk);
        if (CEk == AnonymousClass05K.A00) {
            C311016bz r3 = this.A00;
            Object obj = r6.A03;
            0qQ.A06(obj);
            C255773uh r2 = (C255773uh) obj;
            C250973mM r1 = ((AnonymousClass6YY) r6.A04).A00;
            0qQ.A0B(r2, 0);
            r3.A00.A00(r2, r1);
        } else if (CEk == AnonymousClass05K.A0C) {
            C311016bz r4 = this.A00;
            Object obj2 = r6.A03;
            C255773uh r22 = (C255773uh) obj2;
            if (r22.A0P) {
                User user = r22.A0i;
                if (user != null) {
                    str = user.getId();
                } else {
                    str = null;
                }
                r4.A01.put(002.A0R("highlightRewind:", str), r6);
            } else {
                r4.A01.put(r22.A0k, r6);
            }
            C310046aL r12 = r4.A00;
            0qQ.A06(obj2);
            r12.A01(r22, ((AnonymousClass6YY) r6.A04).A02);
        }
    }

    public C311026c0(C311016bz r1) {
        this.A00 = r1;
    }
}
