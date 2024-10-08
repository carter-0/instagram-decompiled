package com.instagram.repository.common;

import X.AnonymousClass4HQ;
import X.C250653lq;
import X.C294655mo;
import android.util.LruCache;

public abstract class MemoryCache {
    public final AnonymousClass4HQ A00;
    public final long A01;

    public final Object A00(Object obj) {
        LruCache lruCache = ((C250653lq) this).A00;
        C294655mo r6 = (C294655mo) lruCache.get(obj);
        if (r6 != null) {
            long j = r6.A00;
            if (j == -1 || j > System.currentTimeMillis()) {
                return r6.A01;
            }
            lruCache.remove(obj);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Object r6, X.AnonymousClass4D7 r7, X.0sP r8) {
        /*
            r5 = this;
            r3 = 24
            boolean r0 = X.ME9.A03(r3, r7)
            if (r0 == 0) goto L_0x0046
            r4 = r7
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r0) goto L_0x004c
            java.lang.Object r6 = r4.A02
            java.lang.Object r0 = r4.A01
            com.instagram.repository.common.MemoryCache r0 = (com.instagram.repository.common.MemoryCache) r0
            X.0eS.A00(r3)
        L_0x002a:
            r0.A01(r6, r3)
        L_0x002d:
            return r3
        L_0x002e:
            X.0eS.A00(r3)
            java.lang.Object r3 = r5.A00(r6)
            if (r3 != 0) goto L_0x002d
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r0
            java.lang.Object r3 = r8.invoke(r4)
            if (r3 != r2) goto L_0x0044
            return r2
        L_0x0044:
            r0 = r5
            goto L_0x002a
        L_0x0046:
            X.ME9 r4 = new X.ME9
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x004c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.MemoryCache.A02(java.lang.Object, X.4D7, X.0sP):java.lang.Object");
    }

    public MemoryCache(AnonymousClass4HQ r1, long j) {
        this.A01 = j;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.5mo] */
    public Object A01(Object obj, Object obj2) {
        ? obj3 = new Object();
        obj3.A00 = System.currentTimeMillis() + this.A01;
        obj3.A01 = obj2;
        C294655mo r0 = (C294655mo) ((C250653lq) this).A00.put(obj, obj3);
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }
}
