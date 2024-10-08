package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6Rd  reason: invalid class name and case insensitive filesystem */
public final class C307706Rd implements AnonymousClass6RZ {
    public final C307716Re A00 = new C307716Re();
    public final Map A01 = new LinkedHashMap();
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();

    public final C45273Ctc EpY(C307786Rm r5, C307896Rx r6, C307446Qd r7, C276504tR r8, C229652no r9) {
        0qQ.A0B(r8, 2);
        String str = ((C276494tQ) r8).A00;
        Map map = this.A01;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new ArrayList();
            map.put(str, obj);
        }
        ((Collection) obj).add(new WeakReference(r7));
        return new C45273Ctc(new C73158PXt(this, str), (Object) null);
    }
}
