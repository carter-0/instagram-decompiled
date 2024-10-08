package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class M84 implements Runnable {
    public final /* synthetic */ IgdsSwitch A00;
    public final /* synthetic */ C60058JeZ A01;

    public M84(IgdsSwitch igdsSwitch, C60058JeZ jeZ) {
        this.A01 = jeZ;
        this.A00 = igdsSwitch;
    }

    public final void run() {
        C60058JeZ jeZ = this.A01;
        LO1 lo1 = jeZ.A0L;
        FragmentActivity fragmentActivity = jeZ.A0H;
        UserSession userSession = jeZ.A0J;
        IgdsSwitch igdsSwitch = this.A00;
        boolean A1b = C51973G9u.A1b(fragmentActivity, userSession, igdsSwitch);
        AnonymousClass5Gv r0 = lo1.A01;
        if (r0 == null) {
            AnonymousClass5Gt A0V = DbZ.A0V(fragmentActivity, 2131962382);
            A0V.A03(igdsSwitch);
            A0V.A01();
            A0V.A0A = A1b;
            A0V.A00 = 3000;
            A0V.A04 = new C389309pE(userSession, 3);
            r0 = A0V.A00();
            lo1.A01 = r0;
        }
        if (r0 != null) {
            r0.A07(userSession);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
