package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.DirectInviteContactViewModel;

/* renamed from: X.Fwg  reason: case insensitive filesystem */
public final class C51592Fwg implements AnonymousClass0eL, 0sL {
    public final int A00;
    public final Object A01;

    public final Object invoke(Object obj, Object obj2) {
        C294875nB r4;
        int i;
        Object obj3 = obj2;
        Object obj4 = obj;
        if (this.A00 != 0) {
            String str = (String) obj4;
            Boolean bool = (Boolean) obj3;
            DdZ ddZ = ((C46656Dib) this.A01).A0h;
            if (ddZ != null) {
                ddZ.A04(bool.booleanValue(), (String) null, (String) null, str);
            }
            return C60340gF.A00;
        }
        C71874OsH osH = (C71874OsH) this.A01;
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj4;
        View view = (View) obj3;
        Context context = osH.A07;
        UserSession userSession = osH.A0D;
        boolean A012 = C267044ar.A01(context, userSession);
        C48145EZn eZn = C48145EZn.DIRECT_MESSAGE_SEARCH;
        if (A012) {
            0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "inline_contact_list_impression");
            if (A0e.isSampled()) {
                DbX.A1K(eZn, A0e, DbY.A0a());
                C49947FGb.A00(A0e, true);
            }
            r4 = osH.A0I;
            i = 43;
        } else {
            C49947FGb.A05(eZn, userSession, A012);
            r4 = osH.A0I;
            i = 6;
        }
        r4.Cj7(view, directInviteContactViewModel, i, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A04);
        return null;
    }

    public C51592Fwg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
