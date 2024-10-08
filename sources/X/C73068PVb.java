package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.PVb  reason: case insensitive filesystem */
public final class C73068PVb implements Runnable {
    public final /* synthetic */ OLL A00;

    public C73068PVb(OLL oll) {
        this.A00 = oll;
    }

    public final void run() {
        OLL oll = this.A00;
        UserSession userSession = oll.A04;
        String str = "userSession";
        if (userSession != null) {
            C331127Pr A0W = DbS.A0W(userSession);
            Context context = oll.A00;
            str = "context";
            if (context != null) {
                A0W.A0g = context.getString(2131976057);
                A0W.A1J = true;
                A0W.A0K = new C71403Ok2(oll, 6);
                A0W.A0h = context.getString(2131968516);
                A0W.A0L = new C71403Ok2(oll, 7);
                A0W.A11 = false;
                A0W.A1N = true;
                A0W.A0k = false;
                A0W.A0q = false;
                DbS.A1S(A0W, true);
                A0W.A0y = false;
                C331157Pu A002 = A0W.A00();
                C314826iu r0 = oll.A03;
                if (r0 == null) {
                    str = "audLogging";
                } else {
                    r0.A01();
                    Fragment fragment = oll.A02;
                    if (fragment == null) {
                        str = "fragment";
                    } else {
                        FragmentActivity requireActivity = fragment.requireActivity();
                        Bundle A0A = DbV.A0A(userSession);
                        NIG nig = new NIG();
                        nig.setArguments(A0A);
                        A002.A02(requireActivity, nig);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
