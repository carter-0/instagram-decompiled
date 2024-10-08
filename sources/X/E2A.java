package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E2A extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IgMeShortUrlFragment";
    public final Handler A00 = new Handler();
    public final String A01 = "ig_me_short_url";
    public final AnonymousClass0eM A02 = C227642jf.A01(this);

    public final void configureActionBar(2da r6) {
        UserSession userSession;
        0qQ.A0B(r6, 0);
        int A022 = DbZ.A02(this);
        UserSession session = getSession();
        if (session instanceof UserSession) {
            userSession = session;
        } else {
            userSession = null;
        }
        r6.ETj(userSession, R.layout.action_bar_title_logo, A022, 0);
        r6.Eu4(true);
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-650061888);
        E2A.super.onCreate(bundle);
        String string = requireArguments().getString(C273654mx.A00(2176));
        if (string == null || string.length() == 0) {
            FHB.A03(requireActivity(), requireArguments());
        } else {
            1NY A0b = AnonymousClass7TG.A0b(getSession());
            A0b.A0A("notifications/shorturl/");
            A0b.A9m("short_code", string);
            C47696EDf.A00(this, DbU.A0S(A0b, C47338Dv5.class, F5r.class), 42);
        }
        AnonymousClass0fD.A09(-181127773, A022);
    }
}
