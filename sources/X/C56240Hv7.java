package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Hv7  reason: case insensitive filesystem */
public abstract class C56240Hv7 {
    public static final ArrayList A00(UserSession userSession, AnonymousClass3Q2 r6, List list) {
        int i;
        0qQ.A0B(list, 0);
        C53257Gl5 gl5 = new C53257Gl5(I0M.A00.A00(userSession, r6), AnonymousClass05K.A01);
        ListIterator A18 = C51968G9o.A18(list);
        while (true) {
            if (A18.hasPrevious()) {
                if (((C53257Gl5) A18.previous()).A01 == AnonymousClass05K.A00) {
                    i = A18.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i + 1;
        return 00k.A0S(C51969G9p.A0v(list, i2), 00k.A0S(AnonymousClass7TE.A1I(gl5), list.subList(0, i2)));
    }

    public static final ArrayList A01(UserSession userSession, List list, List list2) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0r.add(new C53257Gl5(I0M.A00.A00(userSession, (AnonymousClass3Q2) it.next()), AnonymousClass05K.A01));
        }
        return 00k.A0S(A0r, list);
    }
}
