package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class DdR implements Runnable {
    public final /* synthetic */ DdD A00;

    public DdR(DdD ddD) {
        this.A00 = ddD;
    }

    public final void run() {
        DdD ddD = this.A00;
        UserSession userSession = ddD.A03;
        C46400DeN.A04(userSession, "direct_inbox", "native");
        Fragment fragment = ddD.A02;
        FragmentActivity requireActivity = fragment.requireActivity();
        Context requireContext = fragment.requireContext();
        String str = userSession.A05;
        Bundle A0B = DbV.A0B(str, 0);
        DbS.A1A(A0B, str);
        DbS.A1B(A0B, "direct_inbox");
        A0B.putBoolean(C273654mx.A00(93), true);
        A0B.putParcelable(AnonymousClass000.A00(647), F5W.A00(requireContext, "all", "direct_inbox_account_switch", (String) null, 0));
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0V = new C57388IZt(ddD, 3);
        C331157Pu A002 = A0W.A00();
        E6S e6s = new E6S();
        e6s.setArguments(A0B);
        A002.A02(requireActivity, e6s);
        C46400DeN.A06(userSession);
    }
}
