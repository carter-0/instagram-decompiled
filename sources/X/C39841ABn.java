package X;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ABn  reason: case insensitive filesystem */
public abstract class C39841ABn {
    public static final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public static C374819Ax A00(String str) {
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C374819Ax r2 = (C374819Ax) it.next();
            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return r2;
            }
        }
        throw AnonymousClass7TG.A0q(002.A0R("No KMS client does support: ", str));
    }
}
