package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjE  reason: case insensitive filesystem */
public final class C50834FjE implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0M = DbS.A0M(this.A00, this.A01);
        A0M.A0D(new C227812jx());
        A0M.A04();
    }

    public C50834FjE(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
