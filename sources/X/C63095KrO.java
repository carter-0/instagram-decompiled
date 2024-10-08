package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KrO  reason: case insensitive filesystem */
public abstract class C63095KrO {
    public static final ArrayList A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63832L8n l8n = (C63832L8n) it.next();
            float f = 0.0f;
            for (C63916LCc lCc : l8n.A04) {
                f += lCc.A00;
            }
            double d = (double) f;
            if (0.0d <= d && d <= 1.0d) {
                A1C.add(l8n);
            }
        }
        return A1C;
    }
}
