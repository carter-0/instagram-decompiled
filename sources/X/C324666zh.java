package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.6zh  reason: invalid class name and case insensitive filesystem */
public abstract class C324666zh {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Xl A00(com.instagram.common.session.UserSession r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.6zi r1 = X.C324676zi.A00
            java.lang.Class<X.6zj> r0 = X.C324686zj.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.6zj r0 = (X.C324686zj) r0
            r2 = 0
            if (r4 == 0) goto L_0x0034
            java.util.Map r1 = r0.A00
            java.lang.Object r0 = r1.get(r4)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            if (r0 == 0) goto L_0x0023
            X.1Xj r0 = r0.A0K
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r0.getId()
        L_0x0023:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r1.remove(r4)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            if (r0 == 0) goto L_0x0034
        L_0x0031:
            X.1Xl r0 = (X.1Xl) r0
            return r0
        L_0x0034:
            X.1E8 r0 = X.1E7.A00(r3)
            X.1Xj r0 = r0.A02(r5)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324666zh.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String):X.1Xl");
    }

    public static final String A01(UserSession userSession, AnonymousClass3OA r3) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        ((C324686zj) userSession.A01(C324686zj.class, C324676zi.A00)).A00.put(obj, r3);
        return obj;
    }

    public static final void A02(Bundle bundle, UserSession userSession, AnonymousClass3OA r5) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        ((C324686zj) userSession.A01(C324686zj.class, C324676zi.A00)).A00.put(obj, r5);
        bundle.putString("fragment_argument_ad_retrieval_key", obj);
    }
}
