package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FlW  reason: case insensitive filesystem */
public final class C50943FlW implements G6O {
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C309516Yo A0Q;
        E4B A00;
        AnonymousClass7TG.A1T(context, userSession, fragmentActivity);
        if (!C48885Ell.A00(userSession) || AnonymousClass7TE.A0q(userSession).getInt("hidden_word_settings_info_nux_shown_count", 0) >= 3) {
            A0Q = DbU.A0Q(fragmentActivity, userSession);
            A00 = C48883Elj.A00().A00.A00(context, userSession, AnonymousClass05K.A1I);
        } else {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1L(A0q.AR4(), A0q, "hidden_word_settings_info_nux_shown_count", 0);
            A0Q = DbU.A0Q(fragmentActivity, userSession);
            C48883Elj.A00();
            A00 = new E4B();
        }
        A0Q.A0D(A00);
        A0Q.A04();
    }
}
