package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Wdt  reason: case insensitive filesystem */
public final class C19691Wdt implements X82 {
    public final int Bon(int i, int i2) {
        if (i2 != 2) {
            return (int) Math.floor(((double) (i2 + 1)) / 2.0d);
        }
        return 2;
    }

    public final ArrayList Bop(List list, Set set, int i, int i2) {
        Object obj;
        int max;
        ArrayList arrayList = new ArrayList();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A0F = AnonymousClass7TG.A0F(it);
            int A0F2 = AnonymousClass7TG.A0F(it);
            if (i == 0) {
                max = Math.min(A0F, A0F2);
            } else {
                max = Math.max(A0F, A0F2);
            }
            obj = Integer.valueOf(max);
        } else {
            if (!list.isEmpty()) {
                int i3 = i * 2;
                if (list.size() % 2 == 0) {
                    arrayList.add(list.get(i3));
                    i3++;
                } else if (i == 0) {
                    i3 = 0;
                } else {
                    arrayList.add(list.get(i3 - 1));
                }
                obj = list.get(i3);
            }
            return arrayList;
        }
        arrayList.add(obj);
        return arrayList;
    }

    public final boolean Cb5(X82 x82) {
        return x82.getClass().equals(C19691Wdt.class);
    }
}
