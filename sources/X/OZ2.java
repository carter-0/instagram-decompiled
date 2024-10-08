package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

public final class OZ2 {
    public static final OZ2 A00 = new Object();

    public final void A01(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r17, AnonymousClass0iw r18, 0wc r19, UserSession userSession, C66965Mfy mfy, N4P n4p, C68303N9q n9q, G87 g87) {
        UserSession userSession2 = userSession;
        C68303N9q n9q2 = n9q;
        AnonymousClass7TG.A1P(userSession2, n9q2);
        AnonymousClass07i r3 = r17;
        0qQ.A0B(r3, 6);
        User user = n9q2.A00;
        N4P n4p2 = n4p;
        C254743sy A08 = n4p2.A08();
        boolean A05 = N4P.A05(n4p2);
        C254793t3 r1 = n4p2.A0L;
        0qQ.A0B(r1, 0);
        A00(context, fragmentActivity, r3, r18, r19, userSession2, mfy, A08, user, g87, A05, r1 instanceof MsysThreadId, n4p2.A0n);
    }

    public static final void A00(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r18, AnonymousClass0iw r19, 0wc r20, UserSession userSession, C66965Mfy mfy, C254743sy r23, User user, G87 g87, boolean z, boolean z2, boolean z3) {
        C69445Nlp nlp;
        C56541I0s A002;
        String A03 = C330397Mp.A03(r23);
        C3263576k A003 = C3263476j.A00(z2, z);
        if (!z3 || !z) {
            nlp = C69445Nlp.DEFAULT;
        } else {
            nlp = C69445Nlp.GXAC;
        }
        User user2 = user;
        boolean isRestricted = user2.isRestricted();
        String id = user2.getId();
        Context context2 = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0wc r7 = r20;
        UserSession userSession2 = userSession;
        C66965Mfy mfy2 = mfy;
        if (isRestricted) {
            AnonymousClass73V.A05(r7, A003, nlp, "unrestrict_option", A03, id, AnonymousClass7TE.A1C());
            1YZ r5 = 1YZ.A02;
            if (r5 != null) {
                Context context3 = context2;
                r5.A02(context3, r18, userSession2, new C72987PRu(context2, fragmentActivity2, mfy2), user2.getId(), r19.getModuleName());
                return;
            }
            return;
        }
        AnonymousClass73V.A05(r7, A003, nlp, "restrict_option", A03, id, AnonymousClass7TE.A1C());
        1YZ r2 = 1YZ.A02;
        if (r2 != null && (A002 = r2.A00()) != null) {
            G87 g872 = g87;
            A002.A00(context2, A003, nlp, r7, userSession2, user2, g872, C48088EVg.DIRECT_PROFILE, new C51101FoV(0, fragmentActivity2, mfy2), r19.getModuleName(), (String) null);
        }
    }
}
