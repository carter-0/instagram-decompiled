package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class E8Q extends C48014ERb {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetSuggestUpdateFragment";

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(665948375);
        super.onCreate(bundle);
        if (getSession() instanceof UserSession) {
            UserSession session = getSession();
            DbS.A1Z(session);
            if (1CI.A00(session)) {
                AnonymousClass0fD.A09(759044167, A02);
                return;
            }
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("this screen should only be visible to employees after log in");
        AnonymousClass0fD.A09(-1708710855, A02);
        throw A0z;
    }
}
