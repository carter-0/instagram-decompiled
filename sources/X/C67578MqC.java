package X;

import java.util.List;

/* renamed from: X.MqC  reason: case insensitive filesystem */
public final class C67578MqC implements C74305Psf {
    public final int A00;
    public final Object A01;

    public C67578MqC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ boolean Ezf(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (2 - this.A00 != 0) {
            AnonymousClass7TG.A1N(list, list2);
            return C66734Mbf.A00(list, list2);
        }
        AnonymousClass7TG.A1N(list, list2);
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            Object obj4 = list2.get(i);
            0qQ.A0B(obj4, 0);
            if (!obj3.equals(obj4)) {
                return false;
            }
        }
        return true;
    }
}
