package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fhv  reason: case insensitive filesystem */
public final class C50756Fhv implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50756Fhv(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        C48732EjH.A00().A00(AnonymousClass7TE.A0a(), this.A00, this.A01, "DEEPLINK_QP");
    }
}
