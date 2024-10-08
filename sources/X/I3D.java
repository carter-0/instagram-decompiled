package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class I3D {
    public static final void A01(UserSession userSession, Integer num) {
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 1);
        HashMap A0E = 1Au.A00(userSession).A0E();
        A0E.put(C55178HdU.A00(num), A0q);
        1Au.A00(userSession).A16(A0E);
    }

    public static final void A02(UserSession userSession, Integer num, long j) {
        LinkedList linkedList;
        ArrayList A1D;
        0qQ.A0B(userSession, 2);
        HashMap A0E = 1Au.A00(userSession).A0E();
        String A00 = C55178HdU.A00(num);
        if (A0E.containsKey(A00)) {
            ArrayList arrayList = (ArrayList) A0E.get(A00);
            if (arrayList == null) {
                A1D = AnonymousClass7TE.A1C();
                AnonymousClass7TE.A1Y(A1D, j);
            } else {
                long A01 = 182.A01(0Tu.A05, userSession, 36596398422100402L);
                linkedList = new LinkedList(arrayList);
                while (!linkedList.isEmpty() && ((long) linkedList.size()) >= A01) {
                    linkedList.removeFirst();
                }
                linkedList.addLast(Long.valueOf(j));
                A1D = AnonymousClass7TE.A1D(linkedList);
            }
        } else {
            linkedList = new LinkedList();
            linkedList.addLast(Long.valueOf(j));
            A1D = AnonymousClass7TE.A1D(linkedList);
        }
        A0E.put(A00, A1D);
        1Au.A00(userSession).A16(A0E);
    }

    public static final ArrayList A00(UserSession userSession, Integer num) {
        ArrayList arrayList;
        HashMap A0E = 1Au.A00(userSession).A0E();
        String A00 = C55178HdU.A00(num);
        if (!A0E.containsKey(A00) || (arrayList = (ArrayList) A0E.get(A00)) == null) {
            return AnonymousClass7TE.A1C();
        }
        return arrayList;
    }
}
