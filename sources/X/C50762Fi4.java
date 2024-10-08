package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi4  reason: case insensitive filesystem */
public final class C50762Fi4 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A0X;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A01(userSession, obj)) {
            DbY.A0s();
            C309516Yo A0M = DbS.A0M(this.A00, userSession);
            A0M.A0B((Bundle) null, C48762Ejl.A00(userSession, "", (String) null, true, false, false, false, false));
            A0M.A04();
        }
    }

    public C50762Fi4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
