package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fii  reason: case insensitive filesystem */
public final class C50802Fii implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0Q = DbU.A0Q(this.A00, this.A01);
        A0Q.A0B((Bundle) null, Eq6.A00(C21251XQw.MAIN_SETTINGS_SCREEN, (String) null));
        A0Q.A04();
    }

    public C50802Fii(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
