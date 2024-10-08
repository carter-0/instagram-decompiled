package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class WOF implements X3J {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C18662VwK A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public WOF(FragmentActivity fragmentActivity, C18662VwK vwK, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = vwK;
    }

    public final void onComplete() {
        WGT.A00(this.A00, this.A02, this.A03, this.A01.A00());
    }
}
