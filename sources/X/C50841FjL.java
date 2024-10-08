package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjL  reason: case insensitive filesystem */
public final class C50841FjL implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0M = DbS.A0M(this.A00.requireActivity(), this.A01);
        DbU.A0v();
        A0M.A0D(new E2E());
        A0M.A04();
    }

    public C50841FjL(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
