package X;

import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.Iterator;
import java.util.Map;

public final class S2X {
    public final C10295Rpt A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Map A02 = AnonymousClass7TE.A1H();
    public final Map A03 = AnonymousClass7TE.A1H();

    public final void A00(int i) {
        Map map = this.A03;
        if (map.isEmpty()) {
            DirectLiveLocationService directLiveLocationService = this.A00.A00;
            C8367QpP qpP = directLiveLocationService.A00;
            if (qpP != null) {
                qpP.A01(directLiveLocationService.A04);
            }
            directLiveLocationService.A03 = false;
            directLiveLocationService.stopForeground(1);
            if (i > 0) {
                directLiveLocationService.stopSelf(i);
            } else {
                directLiveLocationService.stopSelf();
            }
        } else {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                C10208RoP roP = new C10208RoP((C327287Ae) A1J.getValue());
                roP.A00.AYj(new C12040Sl1(0, new C12041Sl2(this, A13, i), roP));
            }
        }
    }

    public S2X(C10295Rpt rpt) {
        this.A00 = rpt;
    }
}
