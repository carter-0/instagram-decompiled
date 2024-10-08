package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.Destination;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.EPf  reason: case insensitive filesystem */
public final class C47973EPf extends C319156q8 {
    public final G5B A01() {
        G5B g5b;
        C323256xC r1 = this.A01;
        if (r1.A04() > 0) {
            g5b = new C50692Fgr(r1.A04());
        } else {
            g5b = C50691Fgq.A00;
        }
        return g5b;
    }

    public final void A02() {
        C323256xC r1 = this.A01;
        User user = r1.A0E;
        if (user != null) {
            String id = user.getId();
            C65001Zz.A00().Cfg(r1.A06, r1.A09, new WallLaunchConfig((Destination) null, id));
        }
    }
}
