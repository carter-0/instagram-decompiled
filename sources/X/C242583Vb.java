package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Vb  reason: invalid class name and case insensitive filesystem */
public final class C242583Vb {
    public static GSY A00;
    public static final C242583Vb A01 = new Object();

    public final void A00(String str, String str2, List list) {
        List list2;
        0qQ.A0B(list, 0);
        GSY gsy = A00;
        if (gsy == null || (list2 = (List) gsy.A00) == null) {
            A00 = new GSY((Object) new ArrayList(), (Object) new ArrayList(list), str, str2, 16);
            return;
        }
        list2.addAll(new ArrayList(list));
    }
}
