package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvg  reason: case insensitive filesystem */
public final class C65556Lvg implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        new C2355930l(this.A00, this.A01).CfX(C62574Ki7.DIRECT_INBOX_FILTER_QP, false, false);
    }

    public C65556Lvg(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
