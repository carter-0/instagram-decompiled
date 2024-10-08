package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;

/* renamed from: X.NvA  reason: case insensitive filesystem */
public abstract class C69970NvA {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, ClipsInteractionReplySheetContent clipsInteractionReplySheetContent, C62320sa r9, C62320sa r10) {
        0qQ.A0B(userSession, 2);
        NKP nkp = new NKP();
        Bundle A09 = DbY.A09(userSession);
        A09.putParcelable("REPLY_CONTENT", clipsInteractionReplySheetContent);
        nkp.setArguments(A09);
        nkp.A04 = r9;
        nkp.A05 = r10;
        C331127Pr A0W = DbS.A0W(userSession);
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        AnonymousClass37D A01 = r2.A01(fragmentActivity);
        C331157Pu A00 = C48943Emh.A00(r2.A01(fragmentActivity));
        if (A00 == null || A00.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
            DbU.A0y(fragmentActivity, nkp, A0W);
            return;
        }
        AnonymousClass37D A012 = r2.A01(fragmentActivity);
        if (A012 != null) {
            ((AnonymousClass37F) A012).A0H = new C65751Lz5(4, fragmentActivity, A0W, nkp);
        }
        if (A01 != null) {
            A01.A0B();
        }
    }
}
