package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.LruCache;
import java.util.Iterator;
import java.util.List;

public abstract class RTP {
    public static final Boolean A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            Context context = r0.A00;
            boolean z = true;
            Object A02 = r7.A02();
            0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) A02;
            String A0h = DbY.A0h(r7, 0);
            if (!00l.A0d(A0h, "://", false)) {
                A0h = 002.A0R(A0h, "://");
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                LruCache lruCache = 0cp.A00;
                if (AnonymousClass7TF.A1V(Pxe.A0F(Uri.parse(A0h)).resolveActivity(packageManager))) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            try {
                                if (packageManager.getPackageInfo(AnonymousClass7TE.A18(it), 0) != null) {
                                    break;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        throw AnonymousClass7TE.A0y();
    }
}
