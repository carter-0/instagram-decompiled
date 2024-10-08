package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FiV  reason: case insensitive filesystem */
public final class C50789FiV implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession;
        AnonymousClass3M3 A012;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("deal_template_id");
        if (queryParameter == null) {
            F9Y.A00();
            userSession = this.A01;
            A012 = C46649DiU.A02(userSession, "com.instagram.incentive_platform.screens.deal_information", DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, DbY.A0j("QP")));
        } else {
            C49884FBk A002 = F9Y.A00();
            userSession = this.A01;
            A012 = A002.A01(userSession, queryParameter, "QP");
        }
        C309516Yo A0Q = DbU.A0Q(this.A00, userSession);
        A0Q.A0A = "QP";
        A0Q.A0D(A012);
        A0Q.A04();
    }

    public C50789FiV(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
