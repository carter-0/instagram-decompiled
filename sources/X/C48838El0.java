package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.El0  reason: case insensitive filesystem */
public abstract class C48838El0 {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r7, UserSession userSession, MessagingUser messagingUser, String str, String str2, boolean z, boolean z2) {
        if (messagingUser.A00 == AnonymousClass7TF.A1U(0, fragmentActivity, userSession)) {
            FEC.A00(fragmentActivity, r7, userSession, messagingUser.A02, "ig_direct");
            return;
        }
        C46474Dfc A01 = C46548Dgp.A01(userSession, messagingUser.A03, str, r7.getModuleName());
        if (str2 != null && z2 && DbS.A04(0Tu.A05, userSession, 36605864530023752L) == 2) {
            A01.A04 = new SourceModelInfoParams(str2, 0, 0);
            A01.A0Z = z2;
        }
        Fragment A00 = C46447Df9.A00(userSession, A01);
        if (z) {
            DbY.A0u(fragmentActivity, A00.mArguments, userSession, "profile");
            return;
        }
        C309516Yo A0M = DbV.A0M(A00, fragmentActivity, userSession);
        A0M.A0F = true;
        A0M.A07();
    }
}
