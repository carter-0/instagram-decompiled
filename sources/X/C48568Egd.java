package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Egd  reason: case insensitive filesystem */
public abstract class C48568Egd {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        boolean A1W = DbW.A1W(r14, 0);
        UserSession A0A = C308206Td.A0A((C307786Rm) Dba.A0V(r14, 1));
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        if (A1W) {
            new AnonymousClass631(userSession).A02(A1W);
            return null;
        }
        AnonymousClass4DH A0H = DbU.A0H(r13);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        AnonymousClass4DH r12 = A0H;
        C46480Dfj dfj = new C46480Dfj(1Au.A00(userSession), userSession);
        FragmentActivity A04 = C308206Td.A04(r13);
        AnonymousClass7TF.A1B(A04, 1, r12);
        1Av r6 = dfj.A01;
        0s0 r5 = r6.A3b;
        AnonymousClass0YZ[] r4 = 1Av.A8a;
        if (!AnonymousClass7TG.A1a(r6, r5, r4, 438)) {
            C358248ab A0Y = DbS.A0Y(A04);
            A0Y.A09(2131963352);
            A0Y.A08(2131963349);
            A0Y.A0K(new C50026FJl(A04, (AnonymousClass0iw) r12, dfj, 15), 2131963348);
            A0Y.A0H(new C50026FJl(A04, (AnonymousClass0iw) r12, dfj, 16), 17039360);
            DbT.A1V(A0Y);
        } else {
            new AnonymousClass631(dfj.A00).A02(false);
            C59689JTv.A01(A04, (String) null, 2131973414, 0);
        }
        AnonymousClass7TF.A1J(r6, r5, r4, 438, true);
        return null;
    }
}
