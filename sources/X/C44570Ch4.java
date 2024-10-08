package X;

import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ch4  reason: case insensitive filesystem */
public abstract class C44570Ch4 {
    public static C256183vM A00(List list) {
        1E9 A0p = C41847B3o.A0p();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((UserTagInfoDictIntf) it.next()).FDC(A0p));
        }
        return new C256183vM(A0r);
    }
}
