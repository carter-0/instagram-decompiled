package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class M9Z implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62032KWk A02;
    public final /* synthetic */ String A03;

    public M9Z(FragmentActivity fragmentActivity, UserSession userSession, C62032KWk kWk, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = kWk;
    }

    public final void run() {
        UserSession userSession = this.A01;
        C69972NvC.A00(this.A00, userSession, this.A02, this.A03);
    }
}
