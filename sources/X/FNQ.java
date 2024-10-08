package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.HashMap;

public final class FNQ implements View.OnClickListener {
    public final /* synthetic */ C3250870z A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public FNQ(C3250870z r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2045872540);
        C3250870z r4 = this.A00;
        String A0r = DbX.A0r(r4.A08.A0P.A0J);
        if (this.A02) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "CREATOR_PROFILE_MESSAGING");
            String A002 = AnonymousClass000.A00(2957);
            if (A0r == null) {
                A0r = "";
            }
            A1E.put(A002, A0r);
            C360678ey A052 = C359988do.A05(r4.A05, AnonymousClass000.A00(556), A1E);
            E84.A00(A052, r4, 12);
            1ES.A03(A052);
        } else {
            UserSession userSession = r4.A05;
            UserDetailFragment userDetailFragment = r4.A07;
            C48856ElI.A00(userDetailFragment, r4.A02, userDetailFragment, userSession, A0r, this.A01);
        }
        AnonymousClass0fD.A0C(1693691607, A05);
    }
}
