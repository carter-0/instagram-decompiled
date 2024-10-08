package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

public final class P1B implements AnonymousClass7HJ {
    public final /* synthetic */ C68444NIh A00;

    public final /* synthetic */ void DAC() {
    }

    public final void DjH(MessagingUser messagingUser) {
        C68444NIh nIh = this.A00;
        DirectThreadKey directThreadKey = nIh.A0C;
        if (directThreadKey == null) {
            0qQ.A0F("threadKey");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = directThreadKey.A00;
        if (str != null) {
            AnonymousClass0eM r2 = nIh.A0I;
            0lg A0X = DbT.A0X(r2);
            String str2 = messagingUser.A03;
            0qQ.A07(str2);
            C3265677h.A0K(nIh, A0X, str, str2);
            C48838El0.A00(nIh.requireActivity(), nIh, AnonymousClass7TE.A0l(r2), messagingUser, "direct_prompt_viewer", (String) null, false, false);
        }
    }

    public final /* synthetic */ void Djk() {
    }

    public P1B(C68444NIh nIh) {
        this.A00 = nIh;
    }

    public final void CxV() {
        DbX.A1J(this.A00);
    }

    public final void D89() {
        C68444NIh nIh = this.A00;
        C358248ab A0H = Dba.A0H(nIh);
        A0H.A09(2131960076);
        A0H.A08(2131960079);
        A0H.A0K(C71249OgE.A00(nIh, 31), 2131960075);
        A0H.A0C(C71210Ofb.A00);
        AnonymousClass7TH.A0a(A0H, true);
    }

    public final void De3() {
        String str;
        N3F n3f;
        User user;
        C68444NIh nIh = this.A00;
        C67746Mtz mtz = nIh.A04;
        if (mtz == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        FragmentActivity requireActivity = nIh.requireActivity();
        String str2 = (String) mtz.A08.getValue();
        if (str2 != null) {
            N2Z n2z = (N2Z) mtz.A00.A02();
            if (n2z == null || (n3f = n2z.A00) == null || (user = n3f.A02) == null) {
                str = null;
            } else {
                str = user.getId();
            }
            String str3 = mtz.A03.A00;
            if (str != null && str3 != null) {
                UserSession userSession = mtz.A01;
                DirectPromptTypes directPromptTypes = DirectPromptTypes.QUESTIONS;
                String str4 = mtz.A05;
                C71128OdR.A03(requireActivity, nIh, userSession, directPromptTypes, C14068TpH.IGD_PROMPT_GRID_VIEW, C16677UzD.IGD_PROMPT_RESPONSE, str2, str4, str, str3);
            }
        }
    }
}
