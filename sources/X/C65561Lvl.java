package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvl  reason: case insensitive filesystem */
public final class C65561Lvl implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        LPM.A01(this.A00.requireActivity(), C62574Ki7.UNKNOWN, this.A01, false, false);
    }

    public C65561Lvl(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
