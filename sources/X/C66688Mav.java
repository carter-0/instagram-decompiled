package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Mav  reason: case insensitive filesystem */
public abstract class C66688Mav {
    public static final List A00(C74516PwB pwB, C251033mS r3, boolean z) {
        List unmodifiableList;
        0qQ.A0B(pwB, 0);
        if (!z) {
            return 0sn.A00;
        }
        List<String> Bk9 = pwB.Bk9();
        if (Bk9 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(Bk9.size());
            for (String A02 : Bk9) {
                C251053mU A022 = r3.A02(A02);
                if (A022 != null) {
                    arrayList.add(A022);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        0qQ.A0A(unmodifiableList);
        return unmodifiableList;
    }
}
