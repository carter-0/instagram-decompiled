package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3PK  reason: invalid class name */
public final class AnonymousClass3PK {
    public static int A04;
    public int A00;
    public int A01;
    public C2813857k A02;
    public final Map A03 = new HashMap();

    public final void A00(String str) {
        C2813857k r0;
        Map map = this.A03;
        map.remove(str);
        if (map.isEmpty() && (r0 = this.A02) != null) {
            r0.onFinish();
            this.A02 = null;
        }
    }

    public AnonymousClass3PK(C2813857k r5, List list) {
        A04++;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3PJ r2 = (AnonymousClass3PJ) it.next();
            this.A03.put(r2.A04, r2);
            this.A01++;
            this.A00 += r2.A01;
        }
        this.A02 = r5;
    }
}
