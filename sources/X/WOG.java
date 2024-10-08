package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class WOG implements X3J {
    public final /* synthetic */ C15320UaS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public WOG(C15320UaS uaS, String str, String str2, String str3) {
        this.A00 = uaS;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void onComplete() {
        String str;
        C15320UaS uaS = this.A00;
        FragmentActivity requireActivity = uaS.requireActivity();
        UserSession userSession = uaS.A0H;
        String str2 = null;
        if (userSession == null) {
            str = "userSession";
        } else {
            C18784W1k w1k = uaS.A0C;
            if (w1k == null) {
                str = "dataFetcher";
            } else {
                String A032 = w1k.A03(C16678UzE.SUMMARY.toString(), this.A01);
                0qQ.A07(A032);
                String str3 = this.A02;
                String str4 = this.A03;
                WGU wgu = uaS.A0B;
                if (wgu != null) {
                    str2 = wgu.A03;
                }
                WGT.A02(requireActivity, userSession, A032, str3, str4, str2, "ig_boost", (String) null, false);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
