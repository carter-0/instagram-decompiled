package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kux  reason: case insensitive filesystem */
public abstract class C63314Kux {
    public static C61216Jz9 A00(C66555MWj mWj, String str, List list) {
        AnonymousClass7TH.A0K();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JTT.A1U(A0r, it);
        }
        return new C61216Jz9((C61221JzE) mWj, str, A0r);
    }
}
