package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FiF  reason: case insensitive filesystem */
public final class C50773FiF implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        2bg r1 = 2bg.A1Z;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (r1.A01(userSession, obj)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("usecase", "ecm_filtered_content_management");
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.prcx.identity.selection", A1E);
            FragmentActivity fragmentActivity = this.A00;
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0U = "";
            C46649DiU.A07(fragmentActivity, A0N, A04);
        }
    }

    public C50773FiF(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
