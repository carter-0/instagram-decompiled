package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;

public final class PJ4 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            FGP.A01(activity, BugReportSource.APPIRATER_FEEDBACK, this.A01, DbU.A0m(fragment, 2131973088), DbU.A0m(fragment, 2131964189));
        }
    }

    public PJ4(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
