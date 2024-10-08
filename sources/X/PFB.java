package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class PFB implements C74419PuZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PFB(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void D0U() {
    }

    public final void DVU(N4G n4g) {
        N4G n4g2 = n4g;
        if (this.A00 != 0) {
            0qQ.A0B(n4g, 0);
            ((C67098MiI) this.A03).A03(n4g, (C74396PuC) this.A01, (AnonymousClass2Ep) this.A02);
            return;
        }
        0qQ.A0B(n4g, 0);
        C67521MpG mpG = (C67521MpG) this.A03;
        Map map = (Map) this.A02;
        C62320sa r2 = (C62320sa) this.A01;
        AnonymousClass7TF.A1B(map, 0, r2);
        Context context = mpG.A00;
        UserSession userSession = mpG.A02;
        Set keySet = map.keySet();
        ArrayList A0r = AnonymousClass7TG.A0r(keySet);
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str == null) {
                str = "";
            }
            A0r.add(str);
        }
        C71131OdU.A00(context, n4g2, mpG.A01, userSession, new C69000Ncc(mpG, map, r2), A0r, 0sn.A00, false, false);
    }
}
