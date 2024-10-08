package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fir  reason: case insensitive filesystem */
public final class C50811Fir implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        AnonymousClass1Nd.A00(userSession).A00(new FWW(userSession.A06, ""));
    }

    public C50811Fir(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
