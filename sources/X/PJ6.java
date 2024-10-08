package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class PJ6 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public PJ6(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("direct_is_creating_secret_conversation", true);
        DbY.A0u(this.A00, A0a, this.A01, C273654mx.A00(660));
    }
}
