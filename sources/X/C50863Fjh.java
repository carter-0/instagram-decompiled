package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjh  reason: case insensitive filesystem */
public final class C50863Fjh implements G6H {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        new F2R(this.A00.requireActivity(), this.A01, this.A02, "igd_android_qp").A00();
    }

    public C50863Fjh(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
