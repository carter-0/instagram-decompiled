package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.48l  reason: invalid class name and case insensitive filesystem */
public abstract class C2611448l {
    public static final List A00(String str) {
        if (str == null) {
            return 0sn.A00;
        }
        List A03 = new 11S(" ").A03(str);
        ArrayList arrayList = new ArrayList();
        for (Object next : A03) {
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
