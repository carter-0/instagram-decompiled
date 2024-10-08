package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2or  reason: invalid class name and case insensitive filesystem */
public final class C230062or {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C230052oq A03;
    public final String A04;
    public final Set A05 = new HashSet();

    public C230062or(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C230052oq r5, String str) {
        0qQ.A0B(str, 2);
        this.A01 = r3;
        this.A04 = str;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r5;
    }

    public final void A00() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A08();
        r1.A0D(C46354Dcy.A00(userSession, this.A04, false, true, false, false, false));
        r1.A04();
    }

    public final void A01(String str) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        r3.A08();
        r3.A0D(C46447Df9.A03().A01.A02(userSession, C46548Dgp.A01(userSession, str, AnonymousClass000.A00(602), this.A04).A04()));
        r3.A04();
    }
}
