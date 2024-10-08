package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IWb  reason: case insensitive filesystem */
public final class C57292IWb implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        if (1Ze.A01 != null) {
            C55169HdL.A00().A01(this.A00, (C67231sQ) null, this.A01, HM8.PRO_DASHBOARD_ENTRYPOINT, (List) null);
        }
    }

    public C57292IWb(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
