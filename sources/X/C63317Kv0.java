package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kv0  reason: case insensitive filesystem */
public abstract class C63317Kv0 {
    public static C61219JzC A00(List list, boolean z) {
        AnonymousClass7TH.A0K();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JTT.A1U(A0r, it);
        }
        return new C61219JzC(A0r, z);
    }
}
