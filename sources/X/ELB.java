package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class ELB extends ELE {
    public final FragmentActivity A00;

    public ELB(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r11) {
        super(fragmentActivity, userSession, r11, (C270394gf) null, false, false, false);
        this.A00 = fragmentActivity;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1812779892);
        super.onFail(r5);
        C46345Dco.A00.A01(2131957508, (Integer) null);
        AnonymousClass0fD.A0A(1100747840, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession;
        1Xj r1;
        String str;
        int A03 = AnonymousClass0fD.A03(89206551);
        C61284K0v k0v = (C61284K0v) obj;
        int A0D = AnonymousClass7TG.A0D(k0v, -1322536252);
        super.onSuccess(k0v);
        C47154DrV A002 = k0v.FH3();
        boolean z = false;
        boolean A1S = AnonymousClass7TF.A1S(A002.A01 ? 1 : 0, 1);
        HashMap hashMap = A002.A00;
        if (hashMap != null) {
            z = AnonymousClass7TF.A1Y(hashMap.get("FB"), true);
        }
        if (z) {
            if (A1S) {
                C46345Dco.A00.A01(2131957509, (Integer) null);
                userSession = this.A01;
                0qQ.A07(userSession);
                r1 = this.A02;
                0qQ.A07(r1);
                str = "mutation_success_both";
            }
            C46345Dco.A00.A01(2131957508, (Integer) null);
            userSession = this.A01;
            0qQ.A07(userSession);
            r1 = this.A02;
            0qQ.A07(r1);
            str = "mutation_fail_both";
        } else {
            if (A1S) {
                C46345Dco.A00.A01(2131957514, (Integer) null);
                userSession = this.A01;
                0qQ.A07(userSession);
                r1 = this.A02;
                0qQ.A07(r1);
                str = "mutation_fail_facebook_only";
            }
            C46345Dco.A00.A01(2131957508, (Integer) null);
            userSession = this.A01;
            0qQ.A07(userSession);
            r1 = this.A02;
            0qQ.A07(r1);
            str = "mutation_fail_both";
        }
        C48897Elx.A00(str, userSession, r1);
        AnonymousClass0fD.A0A(722484599, A0D);
        AnonymousClass0fD.A0A(1475606784, A03);
    }
}
