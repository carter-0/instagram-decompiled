package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

public final class M7K implements Runnable {
    public final /* synthetic */ C61064Jw2 A00;
    public final /* synthetic */ C65217LpN A01;

    public M7K(C61064Jw2 jw2, C65217LpN lpN) {
        this.A00 = jw2;
        this.A01 = lpN;
    }

    public final void run() {
        List list;
        LDQ ldq;
        long j;
        C61064Jw2 jw2 = this.A00;
        Location location = null;
        if (jw2.A03) {
            C65217LpN lpN = this.A01;
            C66576MXh mXh = lpN.A04;
            C61850KOp kOp = lpN.A05;
            C64700LgV lgV = kOp.A00;
            if (lgV != null) {
                location = lgV.A00;
                j = lgV.A01;
            } else {
                j = 0;
            }
            mXh.E17(location, j);
            05G r5 = kOp.A03;
            C61064Jw2 jw22 = (C61064Jw2) r5.getValue();
            List list2 = (List) jw22.A01;
            String str = jw22.A02;
            0qQ.A0B(list2, 0);
            r5.Epw(new C61064Jw2((Venue) jw22.A00, str, list2, false));
        }
        C65217LpN lpN2 = this.A01;
        C61676KHa kHa = lpN2.A01;
        if (kHa != null) {
            LOe lOe = kHa.A02;
            if (lOe != null) {
                lOe.A02((Venue) jw2.A00);
            }
            Venue venue = (Venue) jw2.A00;
            if (!(venue == null || (ldq = lpN2.A00) == null)) {
                ldq.A00(venue);
            }
            List list3 = (List) jw2.A01;
            if (list3.isEmpty()) {
                C61676KHa kHa2 = lpN2.A01;
                if (kHa2 != null) {
                    LOe lOe2 = kHa2.A02;
                    if (lOe2 != null) {
                        C60409Jl2 jl2 = lOe2.A04;
                        jl2.A00.clear();
                        jl2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            } else {
                C61676KHa kHa3 = lpN2.A01;
                if (kHa3 != null) {
                    LOe lOe3 = kHa3.A02;
                    if (lOe3 != null) {
                        if (lpN2.A06) {
                            int size = list3.size();
                            int i = 5;
                            if (5 > size) {
                                i = size;
                            }
                            list = list3.subList(0, i);
                        } else {
                            list = list3;
                        }
                        0qQ.A0B(list, 0);
                        C60409Jl2 jl22 = lOe3.A04;
                        DbW.A0z(jl22, list, jl22.A00);
                    }
                    UserSession userSession = lpN2.A03;
                    String str2 = jw2.A02;
                    if (str2 != null) {
                        lpN2.A00 = new LDQ(lpN2.A02, userSession, str2, list3);
                    }
                    C61676KHa kHa4 = lpN2.A01;
                    if (kHa4 != null) {
                        LOe lOe4 = kHa4.A02;
                        if (lOe4 != null) {
                            LOe.A00(lOe4, lOe4.A02);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F("locationTagOption");
        throw AnonymousClass00P.createAndThrow();
    }
}
