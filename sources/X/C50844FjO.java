package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjO  reason: case insensitive filesystem */
public final class C50844FjO implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        1Wg A002;
        1We r0 = 1We.A02;
        if (r0 != null && (A002 = 1We.A00(r0)) != null) {
            EWJ ewj = EWJ.IG_TS_QP;
            UserSession userSession = this.A01;
            DbY.A14(A002.A01(userSession, ewj), this.A00.requireActivity(), userSession);
        }
    }

    public C50844FjO(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
