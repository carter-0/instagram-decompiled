package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public final class WZh implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C360908fL.A00(28D.A2L);
        Bundle bundle2 = new Bundle();
        DbU.A0x(this.A00, bundle2, this.A01, TransparentModalActivity.class, C273654mx.A00(662));
    }

    public WZh(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment.getActivity();
    }
}
