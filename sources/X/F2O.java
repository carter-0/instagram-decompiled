package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class F2O {
    public String A00 = "";
    public boolean A01;
    public boolean A02 = true;
    public boolean A03 = true;

    public final void A00(C51894G6k g6k, UserSession userSession, AnonymousClass4D6 r8, String str) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A02 = false;
        C50213FTt fTt = new C50213FTt(g6k, this);
        String str2 = this.A00;
        0qQ.A0B(str2, 4);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("business/discovery/suggest_business/");
        A0b.A0Q(C47340Dva.class, F57.class);
        A0b.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        1OC A0T = DbT.A0T(A0b, "seen_ids", str2);
        A0T.A00 = C47697EDg.A00(fTt, 36);
        r8.schedule(A0T);
    }
}
