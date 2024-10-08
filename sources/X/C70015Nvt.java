package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nvt  reason: case insensitive filesystem */
public abstract class C70015Nvt {
    public static final boolean A00(AnonymousClass0iw r15, UserSession userSession, NYK nyk, C332927Wz r18) {
        C332927Wz r6 = r18;
        NYK nyk2 = nyk;
        0qQ.A0B(nyk2, 0);
        0qQ.A0B(r6, 3);
        N3Y n3y = nyk2.A02;
        if (!C70020Nvy.A00(r6, nyk2.BSG(), nyk2.BCL()) && n3y != null) {
            String str = n3y.A04;
            1iA r7 = n3y.A01;
            String str2 = n3y.A02;
            String str3 = n3y.A06;
            boolean z = n3y.A08;
            String str4 = n3y.A03;
            ((AnonymousClass7XH) r6).Cpy(r7, str, str2, str3, str4, n3y.A05, n3y.A00, z);
            String str5 = n3y.A07;
            0qQ.A0B(str5, 2);
            UserSession userSession2 = userSession;
            0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r15, userSession2, str4, 3), "coauthor_direct_invite_click");
            if (A0e.isSampled()) {
                G9t.A1J(A0e, str5);
                A0e.AAE(C263944Ny.A00(str4), AnonymousClass000.A00(1580));
                A0e.AAE(C263944Ny.A00(userSession2.A06), "actor_id");
                A0e.Cgf();
            }
        }
        return true;
    }
}
