package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.VzD  reason: case insensitive filesystem */
public final class C18734VzD {
    public static final C18734VzD A04 = new C18734VzD();
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final LruCache A01 = new LruCache(64);
    public final Object A02 = new Object();
    public final ConcurrentMap A03 = new 17j().A00();

    public static final void A00(C18734VzD vzD, C17918Vi9 vi9) {
        List list = vi9.A06;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A10 = JTR.A10(it);
            if (A10 != null) {
                arrayList.add(A10);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C20194Wms wms = new C20194Wms((C15295Ua1) it2.next(), vi9);
            if (0qQ.A0K(Looper.getMainLooper(), Looper.myLooper())) {
                wms.run();
            } else {
                vzD.A00.post(wms);
            }
        }
    }
}
