package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.GNu  reason: case insensitive filesystem */
public final class C52327GNu {
    public static final /* synthetic */ C52327GNu A00 = new Object();

    public static final void A00(2VG r2, 2VG r3) {
        List<Pair> B2I;
        if (r3 != null && r2 != null && (B2I = r2.B2I()) != null) {
            for (Pair pair : B2I) {
                Object obj = pair.first;
                0qQ.A06(obj);
                Object obj2 = pair.second;
                0qQ.A06(obj2);
                r3.EAm((2Sg) obj2, (String) obj);
            }
        }
    }
}
