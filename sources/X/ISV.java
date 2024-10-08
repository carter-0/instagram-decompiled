package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ISV implements B1X {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public ISV(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void Dzj(1Xj r6, AnonymousClass3W1 r7, String str) {
        AnonymousClass7TG.A1T(r6, r7, str);
        Integer num = AnonymousClass05K.A00;
        if (str.equals("feed_timeline")) {
            C249713kF r3 = C249713kF.A00;
            FragmentActivity fragmentActivity = this.A00;
            C56012HrK A0P = r3.A0P(fragmentActivity, this.A01, this.A02);
            A0P.A07 = num;
            A0P.A01 = r6;
            A0P.A02 = r7;
            A0P.A09 = str;
            A0P.A0A = "feed_timeline_visual_search";
            A0P.A08 = fragmentActivity.getString(2131973747);
            A0P.A00();
            return;
        }
        throw DbW.A0c("Invalid visual search container module: ", str);
    }
}
