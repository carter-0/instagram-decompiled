package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public final class FLP implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;

    public FLP(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1184619926);
        UserSession userSession = this.A00;
        HashMap A0F = 1Au.A00(userSession).A0F();
        if (!A0F.isEmpty()) {
            0wc A02 = AnonymousClass0kN.A02(userSession);
            Map A0w = AnonymousClass7TF.A0w("reason", "exit_settings_session_before_returning_to_profile");
            1Ln A0I = DbZ.A0I(A02, "ig_user_resets_supervision_upsell_eligibility");
            A0I.A0x(A0w);
            A0I.Cgf();
        }
        A0F.remove("UPDATE_ACCOUNT_PRIVACY_SETTING");
        A0F.remove("UPDATE_SCC_SETTING");
        A0F.remove("UPDATE_MESSAGING_SETTING");
        1Au.A00(userSession).A17(A0F);
        AnonymousClass0fD.A0C(1101185458, A05);
    }
}
