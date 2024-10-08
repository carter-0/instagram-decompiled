package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjV  reason: case insensitive filesystem */
public final class C50851FjV implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0M = DbS.A0M(this.A00, this.A01);
        A0M.A0E = true;
        A0M.A0D(FC8.A00().A00("preview_picker"));
        A0M.A04();
    }

    public C50851FjV(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
