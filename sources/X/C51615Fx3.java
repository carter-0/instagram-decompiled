package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.DirectInviteContactViewModel;

/* renamed from: X.Fx3  reason: case insensitive filesystem */
public final /* synthetic */ class C51615Fx3 implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ EEP A01;

    public /* synthetic */ C51615Fx3(Context context, EEP eep) {
        this.A01 = eep;
        this.A00 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        EEP eep = this.A01;
        Context context = this.A00;
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
        View view = (View) obj2;
        UserSession userSession = eep.A0g;
        boolean A012 = C267044ar.A01(context, userSession);
        C48145EZn eZn = C48145EZn.DIRECT_MESSAGE_OMNIPICKER;
        if (A012) {
            0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "inline_contact_list_impression");
            if (A0e.isSampled()) {
                DbX.A1K(eZn, A0e, DbY.A0a());
                C49947FGb.A00(A0e, true);
            }
            i = 43;
        } else {
            C49947FGb.A05(eZn, userSession, A012);
            i = 6;
        }
        C68273N8k n8k = new C68273N8k(directInviteContactViewModel, AnonymousClass05K.A0E, eep.A0L, eep.A0I, EEP.A04(eep), i, (long) directInviteContactViewModel.A00, (long) directInviteContactViewModel.A03);
        if (eep.A09 == null) {
            eep.A09 = new FZN(new PE2(eep, 0));
        }
        EK7 ek7 = eep.A0o.A02;
        if (ek7 != null) {
            str = ek7.A01;
        } else {
            str = "";
        }
        eep.A0h.A05(view, DbU.A0a(eep.A09, AnonymousClass30Y.A00(n8k, 0, n8k.BK4(str))));
        return null;
    }
}
