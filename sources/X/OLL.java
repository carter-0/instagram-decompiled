package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class OLL {
    public Context A00;
    public View.OnClickListener A01;
    public Fragment A02;
    public C314826iu A03;
    public UserSession A04;

    public final void A00() {
        String str;
        C314826iu r0 = this.A03;
        if (r0 == null) {
            str = "audLogging";
        } else {
            r0.A00();
            AnonymousClass37E r1 = AnonymousClass37D.A00;
            Fragment fragment = this.A02;
            if (fragment == null) {
                str = "fragment";
            } else {
                DbX.A10(fragment.getActivity(), r1);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
