package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class VAB {
    public static final void A00(BaseFragmentActivity baseFragmentActivity, UserSession userSession, String str) {
        Bundle A0B = DbV.A0B(userSession, 2);
        A0B.putString("entryPoint", str);
        A0B.putString("igUserID", userSession.A06);
        A0B.putString("waterfallID", WGU.A00(userSession).A03);
        1WM.getInstance();
        T8B A00 = new T8B(userSession).A00(A0B);
        A00.A01(Pxd.A00(361));
        A00.F08(baseFragmentActivity).A04();
    }
}
