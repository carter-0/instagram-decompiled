package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class S95 {
    public static final LinkedHashMap A00(List list, List list2) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C13361TWv tWv = C13361TWv.A00;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pxj.A1R(A1C, it);
            }
            linkedHashMap = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A1C, 10)));
            for (Object next : A1C) {
                linkedHashMap.put(next, tWv.invoke(next));
            }
        } else {
            linkedHashMap = 0Yt.A0E();
        }
        if (list2 != null) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Pxj.A1R(A1C2, it2);
            }
            linkedHashMap2 = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A1C2, 10)));
            for (Object next2 : A1C2) {
                linkedHashMap2.put(next2, tWv.invoke(next2));
            }
        } else {
            linkedHashMap2 = 0Yt.A0E();
        }
        return 0Yt.A04(linkedHashMap, linkedHashMap2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Rqv] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Rqv] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5 == null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A01(X.0sn r4, java.util.List r5, boolean r6, boolean r7) {
        /*
            java.lang.String r3 = "inapp"
            if (r7 == 0) goto L_0x0034
            java.lang.String r1 = "subs"
            if (r5 != 0) goto L_0x000b
        L_0x0009:
            X.0sn r5 = X.0sn.A00
        L_0x000b:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r5)
            X.Rqv r2 = new X.Rqv
            r2.<init>()
            r2.A00 = r1
            r2.A01 = r0
            if (r6 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x0032
            if (r4 != 0) goto L_0x0020
            X.0sn r4 = X.0sn.A00
        L_0x0020:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r4)
            X.Rqv r0 = new X.Rqv
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r1
        L_0x002d:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
            return r0
        L_0x0032:
            r0 = 0
            goto L_0x002d
        L_0x0034:
            r1 = r3
            if (r4 == 0) goto L_0x0009
            r5 = r4
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S95.A01(java.util.List, java.util.List, boolean, boolean):X.0eP");
    }
}
