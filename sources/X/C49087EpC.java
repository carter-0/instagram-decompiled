package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.EpC  reason: case insensitive filesystem */
public abstract class C49087EpC {
    public static final void A00(Fragment fragment, UserSession userSession) {
        int i;
        Bundle A0B = DbV.A0B(userSession, 1);
        1Av A00 = 1Au.A00(userSession);
        0s0 r0 = A00.A4g;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (!AnonymousClass7TG.A1a(A00, r0, r3, 521)) {
            A0B.putInt("quick_snap_viewer_request_code_key", 13377);
            1Av A002 = 1Au.A00(userSession);
            AnonymousClass7TF.A1J(A002, A002.A4g, r3, 521, true);
            i = 906;
        } else {
            i = 182;
        }
        String A003 = C273654mx.A00(i);
        Dba.A0K(fragment.requireActivity(), A0B, userSession, TransparentModalActivity.class, A003).A0D(fragment, 13377);
    }
}
