package X;

import com.facebook.android.maps.model.LatLngBounds;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ozi  reason: case insensitive filesystem */
public final class C72273Ozi implements AnonymousClass2en {
    public long A00 = System.currentTimeMillis();
    public final C68462NJa A01;
    public final C68462NJa A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Set A05 = DbS.A0y();
    public final Set A06 = DbS.A0y();

    public C72273Ozi(2el r3, C68462NJa nJa, C68462NJa nJa2) {
        0qQ.A0B(r3, 1);
        this.A02 = nJa;
        this.A01 = nJa2;
        r3.A00 = this;
    }

    public final void Dgu() {
        C69041NdZ ndZ;
        if (System.currentTimeMillis() - this.A00 > 250) {
            this.A00 = System.currentTimeMillis();
            Map map = this.A04;
            map.clear();
            Set set = this.A05;
            set.clear();
            Set set2 = this.A06;
            set2.clear();
            C68462NJa nJa = this.A02;
            C18663VwL vwL = nJa.A0g;
            if (vwL != null) {
                C17523VZc A032 = vwL.A03();
                if (A032 != null) {
                    C18663VwL vwL2 = nJa.A0g;
                    if (vwL2 != null) {
                        HashSet A062 = vwL2.A06(vwL2.A07());
                        LatLngBounds latLngBounds = new LatLngBounds(A032.A04, A032.A01);
                        Iterator it = A062.iterator();
                        while (it.hasNext()) {
                            C14955UGt uGt = (C14955UGt) it.next();
                            if (!(uGt instanceof C69041NdZ) || (ndZ = (C69041NdZ) uGt) == null) {
                                break;
                            }
                            C18663VwL vwL3 = nJa.A0g;
                            if (vwL3 != null) {
                                C17523VZc A042 = vwL3.A04(C69041NdZ.A00(ndZ));
                                if (A042 != null && latLngBounds.A01(A042.A00) && !ndZ.A0S) {
                                    N4t n4t = ndZ.A0P;
                                    if (!n4t.A0C && !n4t.A0H && !n4t.A0D && !n4t.A0K) {
                                        set2.add(ndZ.getId());
                                    }
                                }
                            }
                        }
                    }
                }
                Map map2 = this.A03;
                Iterator A0u = AnonymousClass7TF.A0u(map2);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    long A0R = AnonymousClass7TE.A0R(A1J.getValue());
                    if (!set2.contains(key)) {
                        map.put(key, Long.valueOf(this.A00 - A0R));
                        A0u.remove();
                    }
                }
                for (Object next : set2) {
                    if (!map2.containsKey(next)) {
                        map2.put(next, Long.valueOf(this.A00));
                        set.add(next);
                    }
                }
                if ((!map.isEmpty()) || C66580MXl.A1b(set)) {
                    set.size();
                    map.size();
                    this.A01.A05(map);
                    return;
                }
                return;
            }
            0qQ.A0F("mapViewController");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
