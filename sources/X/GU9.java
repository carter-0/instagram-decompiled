package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class GU9 implements B1W {
    public final UserSession A00;
    public final Fragment A01;

    public final void DVI(1Xj r7, AnonymousClass3W1 r8) {
        Context context = this.A01.getContext();
        if (context != null) {
            ENZ.A04.A02(context, this.A00, new IWA(1, context, this, r7), true, false);
        }
    }

    public GU9(Fragment fragment, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = fragment;
    }
}
