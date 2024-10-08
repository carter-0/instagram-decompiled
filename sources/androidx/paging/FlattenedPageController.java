package androidx.paging;

import X.136;
import X.LDo;

public final class FlattenedPageController {
    public int A00 = -1;
    public final LDo A01 = new LDo();
    public final 136 A02 = new 136();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.0k0 r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 3
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x0031
            r6 = r10
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r5 = r6.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r2) goto L_0x0037
            java.lang.Object r3 = r6.A03
            X.136 r3 = (X.136) r3
            java.lang.Object r9 = r6.A02
            X.0k0 r9 = (X.0k0) r9
            java.lang.Object r1 = r6.A01
            androidx.paging.FlattenedPageController r1 = (androidx.paging.FlattenedPageController) r1
            X.0eS.A00(r5)
            goto L_0x004b
        L_0x0031:
            X.MED r6 = new X.MED
            r6.<init>(r8, r10, r3)
            goto L_0x0015
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003c:
            X.0eS.A00(r5)
            X.136 r3 = r8.A02
            X.MED.A00(r8, r9, r3, r6, r2)
            java.lang.Object r0 = X.136.A00(r6, r3)
            if (r0 == r1) goto L_0x0104
            r1 = r8
        L_0x004b:
            int r0 = r9.A00     // Catch:{ all -> 0x00ff }
            r1.A00 = r0     // Catch:{ all -> 0x00ff }
            X.LDo r5 = r1.A01     // Catch:{ all -> 0x00ff }
            java.lang.Object r6 = r9.A01     // Catch:{ all -> 0x00ff }
            X.Kou r6 = (X.C62942Kou) r6     // Catch:{ all -> 0x00ff }
            r7 = 0
            X.0qQ.A0B(r6, r7)     // Catch:{ all -> 0x00ff }
            r5.A03 = r2     // Catch:{ all -> 0x00ff }
            boolean r0 = r6 instanceof androidx.paging.PageEvent$Insert     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00ac
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6     // Catch:{ all -> 0x00ff }
            X.LGK r1 = r5.A04     // Catch:{ all -> 0x00ff }
            X.LP3 r0 = r6.A03     // Catch:{ all -> 0x00ff }
            r1.A03(r0)     // Catch:{ all -> 0x00ff }
            X.LP3 r0 = r6.A02     // Catch:{ all -> 0x00ff }
            r5.A02 = r0     // Catch:{ all -> 0x00ff }
            X.Kfy r0 = r6.A04     // Catch:{ all -> 0x00ff }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x00ff }
            if (r1 == r2) goto L_0x0081
            r0 = 2
            if (r1 == r0) goto L_0x007a
            if (r1 != r7) goto L_0x00f9
            goto L_0x00e7
        L_0x007a:
            int r0 = r6.A00     // Catch:{ all -> 0x00ff }
            r5.A00 = r0     // Catch:{ all -> 0x00ff }
            X.01W r1 = r5.A05     // Catch:{ all -> 0x00ff }
            goto L_0x00f4
        L_0x0081:
            int r0 = r6.A01     // Catch:{ all -> 0x00ff }
            r5.A01 = r0     // Catch:{ all -> 0x00ff }
            java.util.List r6 = r6.A05     // Catch:{ all -> 0x00ff }
            int r2 = X.DbT.A02(r6, r2)     // Catch:{ all -> 0x00ff }
            r1 = -1
            X.2HZ r0 = new X.2HZ     // Catch:{ all -> 0x00ff }
            r0.<init>(r2, r7, r1)     // Catch:{ all -> 0x00ff }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00ff }
        L_0x0095:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00f9
            r0 = r2
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x00ff }
            int r0 = r0.A00()     // Catch:{ all -> 0x00ff }
            X.01W r1 = r5.A05     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x00ff }
            r1.addFirst(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x0095
        L_0x00ac:
            boolean r0 = r6 instanceof X.C60335Jje     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00be
            X.Jje r6 = (X.C60335Jje) r6     // Catch:{ all -> 0x00ff }
            X.LGK r1 = r5.A04     // Catch:{ all -> 0x00ff }
            X.LP3 r0 = r6.A01     // Catch:{ all -> 0x00ff }
            r1.A03(r0)     // Catch:{ all -> 0x00ff }
            X.LP3 r0 = r6.A00     // Catch:{ all -> 0x00ff }
            r5.A02 = r0     // Catch:{ all -> 0x00ff }
            goto L_0x00f9
        L_0x00be:
            boolean r0 = r6 instanceof androidx.paging.PageEvent$StaticList     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00f9
            androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent$StaticList) r6     // Catch:{ all -> 0x00ff }
            X.LP3 r1 = r6.A01     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x00cd
            X.LGK r0 = r5.A04     // Catch:{ all -> 0x00ff }
            r0.A03(r1)     // Catch:{ all -> 0x00ff }
        L_0x00cd:
            X.LP3 r0 = r6.A00     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00d3
            r5.A02 = r0     // Catch:{ all -> 0x00ff }
        L_0x00d3:
            X.01W r2 = r5.A05     // Catch:{ all -> 0x00ff }
            r2.clear()     // Catch:{ all -> 0x00ff }
            r5.A00 = r7     // Catch:{ all -> 0x00ff }
            r5.A01 = r7     // Catch:{ all -> 0x00ff }
            java.util.List r1 = r6.A02     // Catch:{ all -> 0x00ff }
            X.LRX r0 = new X.LRX     // Catch:{ all -> 0x00ff }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x00ff }
            r2.add(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00f9
        L_0x00e7:
            X.01W r1 = r5.A05     // Catch:{ all -> 0x00ff }
            r1.clear()     // Catch:{ all -> 0x00ff }
            int r0 = r6.A00     // Catch:{ all -> 0x00ff }
            r5.A00 = r0     // Catch:{ all -> 0x00ff }
            int r0 = r6.A01     // Catch:{ all -> 0x00ff }
            r5.A01 = r0     // Catch:{ all -> 0x00ff }
        L_0x00f4:
            java.util.List r0 = r6.A05     // Catch:{ all -> 0x00ff }
            r1.addAll(r0)     // Catch:{ all -> 0x00ff }
        L_0x00f9:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x00ff }
            r3.A05(r4)
            return r1
        L_0x00ff:
            r0 = move-exception
            r3.A05(r4)
            throw r0
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A00(X.0k0, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r4 = 4
            boolean r0 = X.C66146MDy.A02(r4, r10)
            if (r0 == 0) goto L_0x002d
            r3 = r10
            X.MDy r3 = (X.C66146MDy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A03
            X.1Hj r8 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r0) goto L_0x0033
            java.lang.Object r6 = r3.A02
            X.136 r6 = (X.136) r6
            java.lang.Object r1 = r3.A01
            androidx.paging.FlattenedPageController r1 = (androidx.paging.FlattenedPageController) r1
            X.0eS.A00(r2)
            goto L_0x0047
        L_0x002d:
            X.MDy r3 = new X.MDy
            r3.<init>(r9, r10, r4)
            goto L_0x0015
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            X.0eS.A00(r2)
            X.136 r6 = r9.A02
            X.C66146MDy.A00(r9, r6, r3, r0)
            java.lang.Object r0 = X.136.A00(r3, r6)
            if (r0 == r8) goto L_0x008b
            r1 = r9
        L_0x0047:
            X.LDo r0 = r1.A01     // Catch:{ all -> 0x0086 }
            java.util.List r2 = r0.A00()     // Catch:{ all -> 0x0086 }
            int r1 = r1.A00     // Catch:{ all -> 0x0086 }
            int r0 = r2.size()     // Catch:{ all -> 0x0086 }
            int r1 = r1 - r0
            int r5 = r1 + 1
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r2)     // Catch:{ all -> 0x0086 }
            r4 = 0
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0086 }
        L_0x005f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0086 }
            int r1 = r4 + 1
            if (r4 >= 0) goto L_0x0075
            X.0sr.A1T()     // Catch:{ all -> 0x0086 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0075:
            X.Kou r2 = (X.C62942Kou) r2     // Catch:{ all -> 0x0086 }
            int r4 = r4 + r5
            X.0k0 r0 = new X.0k0     // Catch:{ all -> 0x0086 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0086 }
            r8.add(r0)     // Catch:{ all -> 0x0086 }
            r4 = r1
            goto L_0x005f
        L_0x0082:
            r6.A05(r7)
            return r8
        L_0x0086:
            r0 = move-exception
            r6.A05(r7)
            throw r0
        L_0x008b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A01(X.4D7):java.lang.Object");
    }
}
