package X;

import java.util.List;

public final class OJe {
    public final /* synthetic */ C71067Oam A00;

    public OJe(C71067Oam oam) {
        this.A00 = oam;
    }

    public final void A00(C68197N5m n5m) {
        C71067Oam oam = this.A00;
        List list = oam.A0B;
        if (list.size() > 1 && list.indexOf(n5m) != DbT.A02(list, 1)) {
            list.remove(n5m);
            C71067Oam.A01(oam);
            C71067Oam.A00(oam);
        }
    }
}
