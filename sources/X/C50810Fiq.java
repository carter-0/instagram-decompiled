package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fiq  reason: case insensitive filesystem */
public final class C50810Fiq implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        C309516Yo A0Q = DbU.A0Q(this.A00, this.A01);
        A0Q.A0A = "QP";
        A0Q.A0D(FCL.A00().A00(IGRevShareProductType.REELS_OVERLAY_ADS, "QP", DbT.A0v(uri)));
        A0Q.A04();
    }

    public C50810Fiq(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
