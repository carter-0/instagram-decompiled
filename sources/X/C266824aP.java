package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4aP  reason: invalid class name and case insensitive filesystem */
public final class C266824aP {
    public HashMap A00 = new HashMap();
    public HashMap A01 = new HashMap();
    public HashMap A02 = new HashMap();

    public final void A01(C266724aF r2, C266714aE r3, MediaEffect mediaEffect) {
        A02(r2, r3, mediaEffect, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017 A[LOOP:0: B:3:0x0017->B:6:0x0029, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C266714aE r1, X.C266824aP r2, java.lang.String r3) {
        /*
            java.util.HashMap r0 = r2.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x002b
            java.util.Collection r1 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0017:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()
            X.4aM r0 = (X.C266794aM) r0
            java.util.HashMap r0 = r0.A03
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0017
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266824aP.A00(X.4aE, X.4aP, java.lang.String):void");
    }

    public final void A02(C266724aF r5, C266714aE r6, MediaEffect mediaEffect, String str) {
        AbstractMap hashMap;
        if (str != null) {
            try {
                HashMap hashMap2 = this.A01;
                if (hashMap2.containsKey(r6)) {
                    hashMap = (AbstractMap) hashMap2.get(r6);
                } else {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(str)) {
                    A00(r6, this, str);
                }
                hashMap.put(str, mediaEffect);
                hashMap2.put(r6, hashMap);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
        SIO sio = new SIO(r5, mediaEffect);
        List arrayList = new ArrayList();
        HashMap hashMap3 = this.A00;
        if (!hashMap3.containsKey(r6) || (arrayList = (List) hashMap3.get(r6)) != null) {
            arrayList.add(sio);
        }
        hashMap3.put(r6, arrayList);
    }

    public final void A03(C266714aE r8, MediaEffect mediaEffect) {
        A02(new C266724aF(TimeUnit.MILLISECONDS, -1, -1), r8, mediaEffect, (String) null);
    }

    public final void A04(C266794aM r5) {
        int i;
        try {
            C266784aL.A06(!new ArrayList(r5.A04).isEmpty(), (String) null);
            C266714aE r3 = r5.A01;
            Iterator it = new ArrayList(r5.A03.keySet()).iterator();
            while (it.hasNext()) {
                A00(r3, this, (String) it.next());
            }
            HashMap hashMap = this.A02;
            AbstractMap abstractMap = (AbstractMap) hashMap.get(r3);
            if (abstractMap == null) {
                abstractMap = new HashMap();
                i = 0;
            } else {
                i = abstractMap.size();
            }
            abstractMap.put(Integer.valueOf(i), r5);
            hashMap.put(r3, abstractMap);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
