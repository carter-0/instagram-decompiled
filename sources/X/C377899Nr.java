package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9Nr  reason: invalid class name and case insensitive filesystem */
public final class C377899Nr implements Runnable {
    public final /* synthetic */ AnonymousClass7UL A00;

    public C377899Nr(AnonymousClass7UL r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7UL r2 = this.A00;
        Fragment fragment = (Fragment) r2.A0C.get();
        if (fragment != null && fragment.isResumed()) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = r2.A05;
            if (1Wj.A00 != null) {
                DcL.A00().A00(requireActivity, userSession, "867181687644522", (Map) null);
            }
        }
    }
}
