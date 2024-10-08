package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class FCN {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        if (fragmentActivity != null && str != null && str.length() != 0) {
            C310336ap A0a = DbS.A0a();
            A0a.A0D = str;
            DbW.A0q(fragmentActivity, A0a, 2131970029);
            A0a.A0A = new FdJ(11, (Object) fragmentActivity, (Object) userSession);
            A0a.A0L = true;
            DbY.A1N(A0a);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        if (fragmentActivity != null) {
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A09(2131976953);
            A0X.A08(2131976954);
            A0X.A05();
            Dba.A0t(new C50017FJc(7, (Object) fragmentActivity, (Object) userSession, z), A0X, 2131956592);
        }
    }

    public static final void A00(Context context, DialogInterface.OnClickListener onClickListener) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131975992);
        A0Y.A08(2131975991);
        A0Y.A0H((DialogInterface.OnClickListener) null, 2131968381);
        Dba.A0t(onClickListener, A0Y, 2131976948);
    }
}
