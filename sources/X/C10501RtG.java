package X;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.RtG  reason: case insensitive filesystem */
public final class C10501RtG {
    public final Context A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public C10501RtG(Context context) {
        0sl A03;
        C10957S2p s2p;
        0qQ.A0B(context, 1);
        this.A00 = context;
        String packageName = context.getPackageName();
        Set set = C10041Rle.A00;
        if (!set.contains(packageName)) {
            A03 = 0sl.A00;
        } else {
            A03 = 094.A03(packageName, set);
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Intent A09 = DbS.A09();
            C66581MXm.A17(A09, A18, "com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl");
            if (context.getPackageManager().resolveService(A09, 128) != null) {
                Map map = this.A01;
                if (!map.containsKey(A18) || (s2p = (C10957S2p) map.get(A18)) == null || s2p.A00 == null) {
                    map.put(A18, new C10957S2p(context, A18));
                }
            }
        }
    }
}
