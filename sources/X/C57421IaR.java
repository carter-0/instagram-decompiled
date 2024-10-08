package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IaR  reason: case insensitive filesystem */
public final class C57421IaR implements C311686d5 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass32T A01;
    public final /* synthetic */ String A02;

    public final void DYA() {
    }

    public final void DYB() {
    }

    public C57421IaR(1Xj r1, AnonymousClass32T r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onClick() {
        AnonymousClass32T r0 = this.A01;
        UserSession userSession = r0.A02;
        FragmentActivity fragmentActivity = r0.A01;
        AnonymousClass4DU r7 = r0.A03;
        String moduleName = r7.getModuleName();
        String str = this.A02;
        String A002 = C273654mx.A00(3244);
        C49965FGy.A05(fragmentActivity, userSession, moduleName, str, A002, false);
        1Xj r9 = this.A00;
        if (r9 != null) {
            C321406u6.A00(r7, userSession, r9, A002, C51973G9u.A0j(userSession, r9), 0oI.A0A(fragmentActivity));
        }
    }
}
