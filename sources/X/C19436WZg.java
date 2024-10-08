package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;

/* renamed from: X.WZg  reason: case insensitive filesystem */
public final class C19436WZg implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        C18681Vwf.A00(uri, this.A00, this.A01, MapEntryPoint.MAIN_FEED_QP, AnonymousClass7TF.A0b());
    }

    public C19436WZg(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
