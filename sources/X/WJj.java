package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class WJj implements C252203oj {
    public final 2cs A00;
    public final UserSession A01;
    public final View A02;

    public WJj(View view, UserSession userSession) {
        int A022 = DbW.A02(1, userSession, view);
        this.A01 = userSession;
        View A0G = AnonymousClass7TF.A0G(view, R.id.privacy_message);
        this.A02 = A0G;
        WBX.A00(A0G, A022, this);
        2cs A023 = 2cp.A00().A02();
        A023.A06 = true;
        A023.A0A(this);
        this.A00 = A023;
        C18887WAz.A00(view.requireViewById(R.id.privacy_message_dismiss_button), 24, this);
        A023.A08((double) C51971G9r.A00(AnonymousClass7TE.A0q(userSession).getBoolean("archive_map_privacy_banner_dismissed", false) ? 1 : 0), true);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public static final void A00(WJj wJj) {
        float f = (float) wJj.A00.A09.A00;
        View view = wJj.A02;
        float f2 = 1.0f - 0.0f;
        float f3 = (-((float) view.getHeight())) - 0.0f;
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            f4 = (f - 0.0f) / f2;
        }
        view.setTranslationY((f4 * f3) + 0.0f);
        int i = 0;
        if (f == 1.0f) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void DmE(2cs r1) {
        A00(this);
    }
}
