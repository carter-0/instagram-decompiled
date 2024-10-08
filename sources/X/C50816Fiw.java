package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fiw  reason: case insensitive filesystem */
public final class C50816Fiw implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0D(C49139Eq2.A00(userSession));
        A0M.A04();
    }

    public C50816Fiw(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
