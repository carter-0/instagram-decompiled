package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class FR8 implements AnonymousClass08X {
    public static final F1G A02 = new Object();
    public final HashMap A00;
    public final AtomicInteger A01;

    public final Bundle EKB() {
        Set entrySet = this.A00.entrySet();
        0qQ.A07(entrySet);
        ArrayList A0r = AnonymousClass7TG.A0r(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            AnonymousClass7TF.A1I(String.valueOf(AnonymousClass7TE.A0M(A1J.getKey())), A1J.getValue(), A0r);
        }
        0eP[] r1 = (0eP[]) A0r.toArray(new 0eP[0]);
        return Q21.A00((0eP[]) Arrays.copyOf(r1, r1.length));
    }

    public FR8(HashMap hashMap) {
        this.A00 = hashMap;
        this.A01 = new AtomicInteger(hashMap.size());
    }
}
