package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class AfS implements C66463MSr {
    public final /* synthetic */ C353918Jw A00;

    public /* synthetic */ AfS(C353918Jw r1) {
        this.A00 = r1;
    }

    public final void DfE(Integer num) {
        C353918Jw r1 = this.A00;
        if (num == AnonymousClass05K.A00) {
            C347147wL r4 = (C347147wL) r1.A06.getValue();
            28D r6 = (28D) r1.A05.get();
            C347327wd r3 = r4.A00;
            r4.A01();
            UserSession userSession = r4.A03;
            if (!182.A06(0Tu.A05, userSession, 2342155841010009364L) && r3 != null) {
                if (r6 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (C347327wd.A02.contains(r6)) {
                    Fragment fragment = r4.A02;
                    if (fragment.getActivity() != null && C347147wL.A00(r4)) {
                        FragmentActivity activity = fragment.getActivity();
                        0qQ.A0A(activity);
                        new C49695F2f(activity, fragment, r6, userSession, (String) null).A00();
                    }
                }
            }
        }
    }
}
