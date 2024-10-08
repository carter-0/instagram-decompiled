package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiJ  reason: case insensitive filesystem */
public final class C50777FiJ implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50777FiJ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C46447Df9.A03().A02(this.A00, this.A01, "qp_megaphone");
    }
}
