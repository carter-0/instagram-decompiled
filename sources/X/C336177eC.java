package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7eC  reason: invalid class name and case insensitive filesystem */
public final class C336177eC implements C336187eD {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final boolean Erh() {
        return true;
    }

    public C336177eC(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void CpL() {
        FGc.A06(this.A00, this.A01, this.A02);
    }

    public final void Cqd() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            UserSession userSession = this.A01;
            String str = this.A02;
            FGc.A05(fragmentActivity, userSession);
            C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), userSession, (User) null, str, "click", AnonymousClass000.A00(2769));
        }
    }

    public final boolean Eri() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }
}
