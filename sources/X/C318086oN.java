package X;

import java.util.ArrayList;

/* renamed from: X.6oN  reason: invalid class name and case insensitive filesystem */
public abstract class C318086oN {
    public static final void A00(int i) {
        ArrayList arrayList = new ArrayList(2);
        if ((i & 256) == 256) {
            arrayList.add("CREATE");
        }
        if ((i & 32) == 32) {
            arrayList.add("OPEN");
        }
    }
}
