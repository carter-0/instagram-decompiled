package X;

import java.util.LinkedList;

/* renamed from: X.T6p  reason: case insensitive filesystem */
public final class C12780T6p implements C13669Ted {
    public C277014uI A00;
    public final String A01;

    public final boolean FN7(C276544tV r5) {
        LinkedList<C7304Q3g> linkedList = r5.A08;
        if (linkedList == null) {
            return false;
        }
        for (C7304Q3g q3g : linkedList) {
            String str = this.A01;
            String str2 = q3g.A03;
            if (str2 != null && str2.equals(str)) {
                this.A00 = q3g.A02;
                return true;
            }
        }
        return false;
    }

    public C12780T6p(String str) {
        this.A01 = str;
    }
}
