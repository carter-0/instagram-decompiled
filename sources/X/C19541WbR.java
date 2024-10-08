package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WbR  reason: case insensitive filesystem */
public final class C19541WbR implements X8a {
    public final C14440TwO A00;

    public C19541WbR(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new C14440TwO(userSession, C14439TwN.A00(userSession).A00());
    }

    public final /* synthetic */ void Dhi(UKV ukv) {
    }

    public final /* synthetic */ C14198Trd E38(String str, List list) {
        return VGD.A00(this, str);
    }

    public final C14198Trd E3A(String str, String str2, List list, List list2) {
        C14207Trm trm = new C14207Trm(false, C51973G9u.A1b(str, list, list2), false);
        trm.A06(this.A00.A00(str), str2);
        trm.A07(list2, str2);
        trm.A08(list, str2);
        return trm.A01();
    }

    public final C14198Trd E39() {
        return C14448TwW.A00();
    }
}
