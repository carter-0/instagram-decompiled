package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjC  reason: case insensitive filesystem */
public final class C50832FjC implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A2W;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A01(userSession, obj)) {
            C56352Hx3.A01(this.A00, userSession, "qp");
        }
    }

    public C50832FjC(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
