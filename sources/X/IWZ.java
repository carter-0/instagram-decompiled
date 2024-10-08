package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class IWZ implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        int i = 2131973671;
        if (182.A06(0Tu.A05, userSession, 36317972872632022L)) {
            i = 2131955204;
        }
        Fragment fragment = this.A00;
        String A16 = AnonymousClass7TE.A16(fragment.requireContext(), i);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0U = A16;
        A0N.A0i = true;
        C46649DiU.A04(AnonymousClass000.A00(1202), AnonymousClass7TE.A1E()).A0D(fragment.requireActivity(), A0N);
    }

    public IWZ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
