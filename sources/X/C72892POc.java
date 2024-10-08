package X;

import com.facebook.rtc.views.omnigrid.GridItemSize;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.POc  reason: case insensitive filesystem */
public final class C72892POc implements C74362Ptc {
    public final /* synthetic */ NgG A00;

    public C72892POc(NgG ngG) {
        this.A00 = ngG;
    }

    public final void DyG(int i, int i2) {
        C68294N9h n9h;
        NgG ngG = this.A00;
        C68166N3g n3g = ngG.A00;
        if (n3g != null) {
            C70525O9y o9y = ngG.A05;
            String str = n3g.A09;
            0qQ.A0B(str, 0);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            C69110Nep nep = o9y.A00;
            Map map = nep.A0D;
            A1H.putAll(map);
            boolean A06 = C69110Nep.A06(A1H);
            boolean A05 = C69110Nep.A05(A1H);
            A1H.put(DbV.A0q(str), new GridItemSize(i, i2));
            boolean A062 = C69110Nep.A06(A1H);
            boolean A052 = C69110Nep.A05(A1H);
            map.clear();
            map.putAll(A1H);
            if (A06 != A062 || A05 != A052) {
                C68294N9h n9h2 = (C68294N9h) nep.A01;
                if (n9h2 != null) {
                    n9h = C68294N9h.A00((C59721JVf) null, (N3V) null, n9h2, (List) null, (List) null, 0Yt.A0B(map), 130047, false, false, false, false, false, false, false, false, false);
                } else {
                    n9h = null;
                }
                nep.A0J(n9h);
            }
        }
    }
}
