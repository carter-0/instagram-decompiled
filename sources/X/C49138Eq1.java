package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.Eq1  reason: case insensitive filesystem */
public abstract class C49138Eq1 {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass9BP r7, AnonymousClass0iw r8, UserSession userSession) {
        C309516Yo A0M;
        String str;
        boolean A1S = DbW.A1S(1, userSession, fragmentActivity);
        if (r7 == AnonymousClass9BP.CHILD_ACCOUNT) {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1L(A0q.AR4(), A0q, "account_linking_login_info_tapped_count", A1S);
            ((EtA) userSession.A01(EtA.class, G1F.A00)).A00 = UUID.randomUUID();
            Bundle A09 = DbY.A09(userSession);
            C273374mT r0 = new C273374mT();
            r0.setArguments(A09);
            A0M = DbV.A0M(r0, fragmentActivity, userSession);
            str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
        } else if (r7 == AnonymousClass9BP.MAIN_ACCOUNT) {
            0xa A0q2 = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1L(A0q2.AR4(), A0q2, "account_linking_login_info_tapped_count", A1S ? 1 : 0);
            Class<EtA> cls = EtA.class;
            G1F g1f = G1F.A00;
            ((EtA) userSession.A01(cls, g1f)).A00 = UUID.randomUUID();
            0xI A00 = 0xI.A00(r8, "ig_manage_main_account_settings_click");
            A00.A0C("account_linking_session_id", String.valueOf(((EtA) userSession.A01(cls, g1f)).A00));
            DbU.A1R(A00, userSession);
            Bundle A092 = DbY.A09(userSession);
            A092.putBoolean("should_pop_back_stack_without_name", true);
            E4j e4j = new E4j();
            e4j.setArguments(A092);
            A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0C = e4j.mTag;
            A0M.A0D(e4j);
            str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
        } else {
            return;
        }
        A0M.A0A = str;
        A0M.A04();
    }
}
