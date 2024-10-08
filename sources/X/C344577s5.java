package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7s5  reason: invalid class name and case insensitive filesystem */
public final class C344577s5 {
    public static final List A00 = new ArrayList();

    public static synchronized C344587s6 A00(int i) {
        C344587s6 A01;
        synchronized (C344577s5.class) {
            A01 = A01((Object) null, i);
        }
        return A01;
    }

    public static synchronized C344587s6 A01(Object obj, int i) {
        C344587s6 r2;
        synchronized (C344577s5.class) {
            r2 = new C344587s6(obj, i);
            A00.add(new WeakReference(r2));
        }
        return r2;
    }

    public static synchronized C344557s3 A02() {
        synchronized (C344577s5.class) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                C344557s3 r1 = (C344557s3) ((WeakReference) it.next()).get();
                if (r1 == null) {
                    it.remove();
                } else if (r1.CQx()) {
                    return r1;
                }
            }
            return null;
        }
    }
}
