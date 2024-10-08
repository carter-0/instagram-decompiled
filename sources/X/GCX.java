package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class GCX {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public GCX(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void A00(1Xj r6, AnonymousClass3W1 r7) {
        String str;
        AnonymousClass7TG.A1N(r6, r7);
        AnonymousClass4DU r4 = this.A02;
        String moduleName = r4.getModuleName();
        if (0qQ.A0K(moduleName, "clips_viewer_clips_tab")) {
            str = "clips_viewer_clips_tab_visual_search";
        } else if (0qQ.A0K(moduleName, AnonymousClass000.A00(2815))) {
            str = "clips_viewer_feed_timeline_visual_search";
        } else {
            str = "";
        }
        C249713kF r1 = C249713kF.A00;
        FragmentActivity fragmentActivity = this.A00;
        C56012HrK A0P = r1.A0P(fragmentActivity, this.A01, r4);
        A0P.A07 = AnonymousClass05K.A01;
        A0P.A01 = r6;
        A0P.A02 = r7;
        A0P.A09 = r4.getModuleName();
        A0P.A0A = str;
        A0P.A08 = fragmentActivity.getString(2131973747);
        A0P.A00();
    }
}
