package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class P4C implements C74402PuI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P4C(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DFF() {
        if (this.A00 == 0) {
            ((OVU) this.A02).A06.A02();
        }
    }

    public final void DU4(OLT olt) {
        int min;
        if (this.A00 != 0) {
            ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
            C14625TzX tzX = reelDashboardFragment.mListAdapter;
            if (tzX != null) {
                C14629Tzb tzb = (C14629Tzb) tzX.A0C.get(((C255773uh) this.A02).A0j);
                if (tzb != null) {
                    C255773uh r0 = tzb.A0G;
                    r0.getClass();
                    r0.A04 = olt;
                    tzb.A0j.A07();
                }
                UserSession userSession = reelDashboardFragment.A06;
                List unmodifiableList = Collections.unmodifiableList(olt.A04);
                AnonymousClass7TG.A1N(userSession, unmodifiableList);
                1OC A03 = C320126ro.A03(userSession, unmodifiableList);
                NMI.A00(A03, this, 34);
                reelDashboardFragment.schedule(A03);
                return;
            }
            return;
        }
        0qQ.A0B(olt, 0);
        OVU ovu = (OVU) this.A02;
        ovu.A01 = olt;
        OVU.A00(ovu);
        Set set = ovu.A07;
        int A012 = DbT.A01(Collections.unmodifiableList(olt.A04), set.size());
        int i = olt.A00;
        OLT olt2 = ovu.A01;
        if (olt2 == null) {
            min = 0;
        } else {
            min = Math.min(C51966G9m.A1J(olt2.A04).size(), 5);
        }
        if (i <= min && N4P.A00((N4P) this.A01) + A012 <= ovu.A02) {
            set.addAll(C51966G9m.A1J(olt.A04));
            ovu.A01();
        }
        ovu.A06.A02();
    }
}
