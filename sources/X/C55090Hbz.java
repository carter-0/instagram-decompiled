package X;

import com.instagram.model.people.PeopleTag;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Hbz  reason: case insensitive filesystem */
public abstract class C55090Hbz {
    public static final int A00(1Xj r5, String str) {
        r5.A5D();
        if (str != null) {
            int A0o = r5.A0o();
            int i = 0;
            while (i < A0o) {
                1Xj A1c = r5.A1c(i);
                if (A1c != null) {
                    ArrayList A3E = A1c.A3E();
                    if (A3E != null) {
                        Iterator it = A3E.iterator();
                        while (it.hasNext()) {
                            if (0qQ.A0K(((PeopleTag) it.next()).A07().getId(), str)) {
                                return i;
                            }
                        }
                        continue;
                    }
                    i++;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        return 0;
    }
}
