package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Q1a  reason: case insensitive filesystem */
public final class C7253Q1a implements C13819Thn {
    public final long A00 = System.currentTimeMillis();
    public final C13819Thn A01;
    public final 1FL A02;

    public final Collection Aav() {
        Collection Aav = this.A01.Aav();
        1FL r4 = this.A02;
        1FL.A00(r4);
        Map map = r4.A02;
        synchronized (map) {
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.addAll(map.keySet());
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (!Aav.contains(A18)) {
                    map.remove(A18);
                    r4.A00 = true;
                }
            }
        }
        1FL.A01(r4);
        return Aav;
    }

    public final boolean Cdx(String str) {
        return this.A01.Cdx(str);
    }

    public final long Cf8(String str) {
        1FL r5 = this.A02;
        Object A022 = r5.A02(str, "eviction_timestamps");
        if ((A022 instanceof Long) && this.A00 > ((Number) A022).longValue()) {
            return Long.MIN_VALUE;
        }
        Object A023 = r5.A02(str, "eviction_priority");
        if (A023 instanceof Long) {
            return ((Number) A023).longValue();
        }
        return this.A01.Cf8(str);
    }

    public final long[] getItemInformation(String str) {
        long[] itemInformation = this.A01.getItemInformation(str);
        itemInformation[0] = Cf8(str);
        return itemInformation;
    }

    public final boolean remove(String str) {
        this.A02.A03(str);
        return this.A01.remove(str);
    }

    public C7253Q1a(C13819Thn thn, 1FL r4) {
        this.A01 = thn;
        this.A02 = r4;
    }
}
