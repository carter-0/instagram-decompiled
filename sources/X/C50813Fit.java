package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fit  reason: case insensitive filesystem */
public final class C50813Fit implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Dbb.A11(new RecentAdActivityFragment(), this.A00, this.A01);
    }

    public C50813Fit(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
