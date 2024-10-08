package X;

import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.5gc  reason: invalid class name and case insensitive filesystem */
public final class C291135gc implements Comparator {
    public final HashMap A00;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        HashMap hashMap = this.A00;
        Object obj3 = hashMap.get(obj2);
        0qQ.A0A(obj3);
        double d = ((C290955gH) obj3).A00;
        Object obj4 = hashMap.get(obj);
        0qQ.A0A(obj4);
        return Double.compare(d, ((C290955gH) obj4).A00);
    }

    public C291135gc(HashMap hashMap) {
        this.A00 = hashMap;
    }
}
