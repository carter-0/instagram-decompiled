package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fjx  reason: case insensitive filesystem */
public final class C50879Fjx implements G6H {
    public final Activity A00;
    public final Fragment A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void CI0(Uri uri, Bundle bundle) {
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        String queryParameter = uri2.getQueryParameter("target");
        for (C48090EVi eVi : C48090EVi.A01) {
            if (00p.A0j(eVi.A00, queryParameter, true)) {
                if (eVi.ordinal() == 0) {
                    Activity activity = this.A00;
                    Fragment fragment = this.A01;
                    0hq parentFragmentManager = fragment.getParentFragmentManager();
                    0eE r0 = AnonymousClass0t1.A01;
                    UserSession userSession = this.A03;
                    User A012 = r0.A01(userSession);
                    C46395DeI.A04(activity, (View) null, parentFragmentManager, AnonymousClass07i.A00(fragment), this.A02, userSession, A012, (Long) null, "profile_highlight_tray", (String) null, (String) null, (String) null, false);
                    return;
                }
                return;
            }
        }
    }

    public C50879Fjx(Activity activity, Fragment fragment, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = userSession;
        this.A02 = r3;
    }
}
