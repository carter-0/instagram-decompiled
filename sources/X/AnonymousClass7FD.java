package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7FD  reason: invalid class name */
public abstract class AnonymousClass7FD {
    public static final AnonymousClass7FE A00(UserSession userSession, AnonymousClass9HC r11, AnonymousClass7LQ r12, AnonymousClass7L2 r13) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(r13, 2);
        AnonymousClass9HC r2 = r11;
        0qQ.A0B(r11, 3);
        return A02(userSession, r2, r12, r13, r12.A0e.A10, (Boolean) null, (Boolean) null, AnonymousClass0eN.A01(AnonymousClass7FC.A00), false);
    }

    public static final AnonymousClass7FE A01(UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, C254933tI r13, 2FW r14) {
        0qQ.A0B(userSession, 0);
        2FW r4 = r14;
        0qQ.A0B(r14, 3);
        AnonymousClass7L2 r3 = r12;
        0qQ.A0B(r12, 4);
        AnonymousClass9HC r2 = r10;
        0qQ.A0B(r10, 5);
        0t0 A01 = AnonymousClass0eN.A01(new AnonymousClass9LX((Object) null, 1));
        boolean A0K = 0qQ.A0K(r13.A0U, userSession.A06);
        boolean z = false;
        if (r11.A0e.A2P != r11.A0G.A0x) {
            z = true;
        }
        return new AnonymousClass7FE(r2, r3, r4, A01, true, A0K, false, false, z, r11.A0Y);
    }

    public static final AnonymousClass7FE A02(UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, 2FW r13, Boolean bool, Boolean bool2, AnonymousClass0eM r16, boolean z) {
        boolean z2;
        boolean z3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r11, 1);
        AnonymousClass7L2 r3 = r12;
        0qQ.A0B(r12, 2);
        AnonymousClass9HC r2 = r10;
        0qQ.A0B(r10, 3);
        AnonymousClass0eM r5 = r16;
        0qQ.A0B(r5, 4);
        2FW r4 = r13;
        0qQ.A0B(r13, 8);
        C254703su r1 = r11.A0e;
        0qQ.A07(r1);
        boolean A1j = r1.A1j(0eE.A00(userSession).A00());
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = r11.A0U;
        }
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        } else {
            z3 = r11.A0V;
        }
        boolean z4 = false;
        if (r1.A2P != r11.A0G.A0x) {
            z4 = true;
        }
        return new AnonymousClass7FE(r2, r3, r4, r5, z, A1j, z2, z3, z4, r11.A0Y);
    }

    public static final AnonymousClass7FE A04(UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, 2FW r13, AnonymousClass0eM r14) {
        return A02(userSession, r10, r11, r12, r13, (Boolean) null, (Boolean) null, r14, false);
    }

    public static final AnonymousClass7FE A03(UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, 2FW r13, AnonymousClass0eM r14) {
        Boolean bool = Boolean.FALSE;
        return A02(userSession, r10, r11, r12, r13, bool, bool, r14, false);
    }
}
