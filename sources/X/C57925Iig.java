package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iig  reason: case insensitive filesystem */
public final class C57925Iig implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;

    public C57925Iig(Bundle bundle, Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A02 = userSession;
        this.A00 = bundle;
    }

    public final void run() {
        28D r3 = 28D.A12;
        Fragment fragment = this.A01;
        I3M.A01(fragment.requireActivity(), this.A00, fragment, r3, this.A02, true, false);
    }
}
