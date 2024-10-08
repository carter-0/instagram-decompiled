package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.NtY  reason: case insensitive filesystem */
public abstract class C69870NtY {
    public static final void A00(UserSession userSession, DirectPromptTypes directPromptTypes) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), C273654mx.A00(2262));
        Map A0g = C66584MXp.A0g(directPromptTypes);
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "tap");
            DbS.A1L(A0e, "prompt");
            C66583MXo.A18(A0e, A0g);
        }
    }
}
