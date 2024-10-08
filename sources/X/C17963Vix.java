package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vix  reason: case insensitive filesystem */
public final class C17963Vix {
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();

    public final void A00() {
        this.A00 = true;
    }

    public final void A01(X2R x2r) {
        C17815VgU vgU;
        if (this.A00) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                Map map = ((C17406VUl) it.next()).A02;
                Iterator A16 = DbV.A16(map);
                while (A16.hasNext()) {
                    X2R x2r2 = (X2R) A16.next();
                    if (x2r.getClass().equals(x2r2.getClass()) && x2r2.FMt(x2r) && (vgU = (C17815VgU) map.get(x2r2)) != null) {
                        for (V3I v3i : vgU.A01) {
                            C17182VLm vLm = v3i.A01;
                            if (vLm != null) {
                                Map map2 = vgU.A02;
                                0qQ.A0A(map2);
                                Object obj = vLm.A00.A00;
                                map2.put("opacity_value_key", obj);
                                map2.put("opacity_values_key", new Float[]{Float.valueOf(0.0f), (Float) obj});
                            }
                            v3i.A00.AT9(vgU.A00, vgU.A02);
                        }
                    }
                }
            }
        }
    }
}
