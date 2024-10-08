package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "This class is temporary and exists for the Reels Viewer migration")
public final class GCY implements JTG {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C51979GAc A03;

    public GCY(FragmentActivity fragmentActivity, AnonymousClass4DH r2, UserSession userSession, C51979GAc gAc) {
        C51972G9s.A1D(gAc, userSession);
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = gAc;
        this.A02 = userSession;
    }

    public final void EGO(C267324bN r11, User user) {
        AnonymousClass7TG.A1N(r11, user);
        1Xj r2 = r11.A02;
        if (r2 != null) {
            UserSession userSession = this.A02;
            C71342cb.A00(userSession).A08 = r2.A30();
            C71342cb.A00(userSession).A09 = DbT.A0x(r2);
            C319976rX.A08(this.A03, userSession, Dbb.A0O(userSession, user), "tap_clips_tab", user.getId(), r11.getId(), r11.A0P, "clips_tab");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final View.OnTouchListener Da7(C267324bN r2, User user, String str) {
        return GJJ.A00;
    }
}
