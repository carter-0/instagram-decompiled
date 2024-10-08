package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

public final class A8Z {
    public final /* synthetic */ AnonymousClass7VL A00;

    public final void A00(String str) {
        AnonymousClass7VL r1 = this.A00;
        FragmentActivity requireActivity = r1.A01.requireActivity();
        UserSession userSession = r1.A03;
        SUL sul = new SUL(requireActivity, userSession, 2EG.A1V, str, false);
        sul.A0E(userSession.A06);
        sul.A0F((String) r1.A08.invoke());
        sul.A0S = r1.A05;
        sul.A0r = false;
        sul.A0D = ZonePolicy.A0F;
        sul.A0A();
    }

    public A8Z(AnonymousClass7VL r1) {
        this.A00 = r1;
    }
}
