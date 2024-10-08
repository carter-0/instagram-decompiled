package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjM  reason: case insensitive filesystem */
public final class C50842FjM implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0M = DbS.A0M(this.A00.requireActivity(), this.A01);
        A0M.A0D(FFR.A00().A02(AnonymousClass05K.A00, false, false));
        A0M.A0A = C46367Ddj.A01(19, 24, 43);
        A0M.A04();
    }

    public C50842FjM(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
