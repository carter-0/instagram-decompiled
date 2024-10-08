package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9yI  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C394549yI {
    public static void A00() {
        List list;
        if (!2CC.A02) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            0qQ.A07(stackTrace);
            int length = stackTrace.length;
            if (2 >= length) {
                list = 03t.A0J(stackTrace);
            } else {
                ArrayList arrayList = new ArrayList(2);
                for (int i = length - 2; i < length; i++) {
                    arrayList.add(stackTrace[i]);
                }
                list = arrayList;
            }
            0wj.A00(00k.A0P(",", "", "", list, (0sP) null), 17640711, false).report();
            return;
        }
        throw AnonymousClass7TG.A0u();
    }
}
