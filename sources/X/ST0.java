package X;

import android.util.Log;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class ST0 {
    public int A00;
    public final int A01;
    public final C11036S6o A02;
    public final QH4 A03;
    public final Map A04;
    public final Map A05;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object A04(int r4, java.lang.Class r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x0043 }
            java.util.NavigableMap r1 = X.Pxj.A0z(r5, r0)     // Catch:{ all -> 0x0043 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0043 }
            java.lang.Object r2 = r1.ceilingKey(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0026
            int r0 = r3.A00     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0028
            int r1 = r3.A01     // Catch:{ all -> 0x0043 }
            int r1 = r1 / r0
            r0 = 2
            if (r1 >= r0) goto L_0x0028
            int r1 = r2.intValue()     // Catch:{ all -> 0x0043 }
            int r0 = r4 * 8
            if (r1 > r0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            X.QH4 r0 = r3.A03     // Catch:{ all -> 0x0043 }
            X.Sir r0 = r0.A00(r5, r4)     // Catch:{ all -> 0x0043 }
            goto L_0x003d
        L_0x0033:
            X.QH4 r1 = r3.A03     // Catch:{ all -> 0x0043 }
            int r0 = r2.intValue()     // Catch:{ all -> 0x0043 }
            X.Sir r0 = r1.A00(r5, r0)     // Catch:{ all -> 0x0043 }
        L_0x003d:
            java.lang.Object r0 = A01(r0, r3, r5)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)
            return r0
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST0.A04(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized void A05(Object obj) {
        Class<?> cls = obj.getClass();
        C13797ThG A002 = A00(cls);
        int AcT = A002.AcT(obj);
        int B0Y = A002.B0Y() * AcT;
        int i = this.A01;
        if (B0Y <= i / 2) {
            C11918Sir A003 = this.A03.A00(cls, AcT);
            this.A02.A02(A003, obj);
            NavigableMap A0z = Pxj.A0z(cls, this.A04);
            Integer num = (Integer) C51968G9o.A10(A0z, A003.A00);
            Integer valueOf = Integer.valueOf(A003.A00);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            C66580MXl.A1T(valueOf, A0z, i2);
            this.A00 += B0Y;
            A02(this, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.ThG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.ThG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.ThG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C13797ThG A00(java.lang.Class r3) {
        /*
            r2 = this;
            java.util.Map r1 = r2.A05
            java.lang.Object r0 = r1.get(r3)
            X.ThG r0 = (X.C13797ThG) r0
            if (r0 != 0) goto L_0x001a
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.Sio r0 = new X.Sio
            r0.<init>()
        L_0x0017:
            r1.put(r3, r0)
        L_0x001a:
            return r0
        L_0x001b:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.Sin r0 = new X.Sin
            r0.<init>()
            goto L_0x0017
        L_0x0029:
            java.lang.String r1 = "No array pool found for: "
            java.lang.String r0 = r3.getSimpleName()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST0.A00(java.lang.Class):X.ThG");
    }

    public static void A02(ST0 st0, int i) {
        while (st0.A00 > i) {
            Object A002 = st0.A02.A00();
            C9217RTu.A00(A002);
            Class<?> cls = A002.getClass();
            C13797ThG A003 = st0.A00(cls);
            int i2 = st0.A00;
            int AcT = A003.AcT(A002);
            st0.A00 = i2 - (A003.B0Y() * AcT);
            st0.A03(cls, AcT);
            Log.isLoggable(A003.getTag(), 2);
        }
    }

    private void A03(Class cls, int i) {
        Map map = this.A04;
        Map map2 = (Map) map.get(cls);
        if (map2 == null) {
            map2 = new TreeMap();
            map.put(cls, map2);
        }
        Integer valueOf = Integer.valueOf(i);
        Number A14 = C51966G9m.A14(valueOf, map2);
        if (A14 != null) {
            int intValue = A14.intValue();
            if (intValue == 1) {
                map2.remove(valueOf);
            } else {
                C66580MXl.A1T(valueOf, map2, intValue - 1);
            }
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Tried to decrement empty size, size: ");
            A1A.append(i);
            throw AnonymousClass7TE.A11(AnonymousClass7TG.A0m(this, ", this: ", A1A));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Rnk, X.QH4] */
    public ST0(int i) {
        this.A02 = new C11036S6o();
        this.A03 = new C10169Rnk();
        this.A04 = AnonymousClass7TE.A1E();
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = i;
    }

    public static Object A01(C11918Sir sir, ST0 st0, Class cls) {
        C13797ThG A002 = st0.A00(cls);
        Object A012 = st0.A02.A01(sir);
        if (A012 != null) {
            int i = st0.A00;
            int AcT = A002.AcT(A012);
            st0.A00 = i - (A002.B0Y() * AcT);
            st0.A03(cls, AcT);
            return A012;
        }
        Log.isLoggable(A002.getTag(), 2);
        return A002.Cqy(sir.A00);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Rnk, X.QH4] */
    public ST0() {
        this.A02 = new C11036S6o();
        this.A03 = new C10169Rnk();
        this.A04 = AnonymousClass7TE.A1E();
        this.A05 = AnonymousClass7TE.A1E();
        this.A01 = 4194304;
    }
}
