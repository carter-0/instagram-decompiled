package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

public final class WKp implements C344847sW {
    public final WeakReference A00;

    public final void E4c(C344907sc r4) {
        C18660VwH vwH = (C18660VwH) this.A00.get();
        if (vwH != null && r4.CAG() == C344877sZ.CONFIGURATION) {
            vwH.A0A = ((AVX) r4).A00;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.8ye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.8ye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.8ye} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.7v8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.7v8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.7v7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.8ye} */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.8xz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.7v9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.7v8] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.7v7] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.7v6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EBc(X.C345237tA r7, X.C344877sZ r8) {
        /*
            r6 = this;
            java.lang.ref.WeakReference r0 = r6.A00
            java.lang.Object r4 = r0.get()
            X.VwH r4 = (X.C18660VwH) r4
            if (r4 == 0) goto L_0x0049
            boolean r1 = X.AnonymousClass7TF.A1V(r7)
            java.lang.String r0 = "Null listener registered"
            X.0JA.A08(r1, r0)
            X.VvR r3 = r4.A0K
            java.util.Map r2 = r3.A00
            monitor-enter(r2)
            java.lang.Object r1 = r2.get(r8)     // Catch:{ all -> 0x0038 }
            X.81j r1 = (X.C3496981j) r1     // Catch:{ all -> 0x0038 }
            if (r1 != 0) goto L_0x0028
            X.81j r1 = new X.81j     // Catch:{ all -> 0x0038 }
            r1.<init>()     // Catch:{ all -> 0x0038 }
            r2.put(r8, r1)     // Catch:{ all -> 0x0038 }
        L_0x0028:
            java.lang.ref.WeakReference r0 = X.C18633VvR.A00(r3, r7, r8)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0038 }
            r0.<init>(r7)     // Catch:{ all -> 0x0038 }
            r1.A01(r0)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003b:
            X.C18660VwH.A00(r4)
            X.8n3 r1 = r4.A03
            if (r1 == 0) goto L_0x0049
            int r0 = r8.ordinal()
            switch(r0) {
                case 5: goto L_0x004a;
                case 6: goto L_0x0064;
                case 7: goto L_0x0077;
                case 13: goto L_0x00ab;
                case 14: goto L_0x008b;
                case 22: goto L_0x005c;
                default: goto L_0x0049;
            }
        L_0x0049:
            return
        L_0x004a:
            int r2 = r1.BfA()
            int r0 = r1.Bez()
            X.7v6 r1 = new X.7v6
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r0
            goto L_0x00b6
        L_0x005c:
            X.7lD r0 = r4.A05
            X.8ye r1 = new X.8ye
            r1.<init>(r0)
            goto L_0x00b6
        L_0x0064:
            X.X5q r0 = r4.A04
            if (r0 != 0) goto L_0x0072
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.7v7 r1 = new X.7v7
            r1.<init>()
            r1.A00 = r0
            goto L_0x00b6
        L_0x0072:
            X.7v7 r1 = r0.BHQ()
            goto L_0x00b6
        L_0x0077:
            X.X5q r0 = r4.A04
            if (r0 != 0) goto L_0x0086
            r0 = 0
            X.7v8 r1 = new X.7v8
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r0
            goto L_0x00b6
        L_0x0086:
            X.7v8 r1 = r0.BHV()
            goto L_0x00b6
        L_0x008b:
            X.X7P r0 = r4.A00
            if (r0 == 0) goto L_0x0049
            int r5 = r0.getWidth()
            X.X7P r0 = r4.A00
            int r2 = r0.getHeight()
            X.X7P r0 = r4.A00
            float r0 = r0.AwL()
            X.7v9 r1 = new X.7v9
            r1.<init>()
            r1.A02 = r5
            r1.A01 = r2
            r1.A00 = r0
            goto L_0x00b6
        L_0x00ab:
            java.lang.Integer r0 = r4.A08
            if (r0 == 0) goto L_0x0049
            X.8xz r1 = new X.8xz
            r1.<init>()
            r1.A00 = r0
        L_0x00b6:
            X.WG9 r0 = r4.A0J
            r3.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WKp.EBc(X.7tA, X.7sZ):void");
    }

    public final void FIu(C345237tA r6) {
        C18660VwH vwH = (C18660VwH) this.A00.get();
        if (vwH != null) {
            C18633VvR vvR = vwH.A0K;
            Map map = vvR.A00;
            synchronized (map) {
                Iterator A16 = DbV.A16(map);
                while (A16.hasNext()) {
                    vvR.A02(r6, (C344877sZ) A16.next());
                }
            }
            C18660VwH.A00(vwH);
        }
    }

    public final void FIv(C345237tA r4, C344877sZ r5) {
        C18660VwH vwH = (C18660VwH) this.A00.get();
        if (vwH != null) {
            0JA.A08(AnonymousClass7TF.A1V(r4), "Null listener unregistered");
            vwH.A0K.A02(r4, r5);
            C18660VwH.A00(vwH);
        }
    }

    public WKp(C18660VwH vwH) {
        this.A00 = new WeakReference(vwH);
    }
}
