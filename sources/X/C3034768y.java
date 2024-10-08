package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.68y  reason: invalid class name and case insensitive filesystem */
public final class C3034768y {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0077 A[EDGE_INSN: B:64:0x0077->B:36:0x0077 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.2TT r5, X.AnonymousClass3P4 r6, java.util.Collection r7) {
        /*
            r3 = 0
            r0 = 1
            X.0qQ.A0B(r7, r0)
            boolean r0 = r5.A09
            r5 = 0
            if (r0 != 0) goto L_0x000d
            if (r6 != 0) goto L_0x000d
        L_0x000c:
            return r3
        L_0x000d:
            java.util.List r2 = X.00k.A0a(r7)
            if (r0 == 0) goto L_0x0032
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001e
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001e
            return r3
        L_0x001e:
            java.util.Iterator r1 = r2.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.72i r0 = (X.C3254272i) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0022
        L_0x0032:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C306766Nk
            if (r0 == 0) goto L_0x0052
            r3.add(r1)
            goto L_0x0040
        L_0x0052:
            r4.add(r1)
            goto L_0x0040
        L_0x0056:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0098
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0098
        L_0x0066:
            r3 = 0
        L_0x0067:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0077
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x007e
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x007d
            r5 = 1
        L_0x007d:
            return r5
        L_0x007e:
            java.util.Iterator r2 = r4.iterator()
        L_0x0082:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            X.72i r1 = (X.C3254272i) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0082
            X.9IL r0 = r1.A01
            if (r0 != 0) goto L_0x0082
            r0 = 0
            goto L_0x0078
        L_0x0098:
            java.util.Iterator r2 = r3.iterator()
        L_0x009c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r2.next()
            X.72i r1 = (X.C3254272i) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00b0
            X.9IL r0 = r1.A01
            if (r0 == 0) goto L_0x009c
        L_0x00b0:
            r3 = 1
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3034768y.A01(X.2TT, X.3P4, java.util.Collection):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C306006Kk A02(X.AnonymousClass9J0 r13, X.2TT r14, X.C2595542d r15, java.util.Collection r16, boolean r17) {
        /*
            r12 = this;
            r10 = 2
            r3 = r16
            X.0qQ.A0B(r3, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            X.72i r0 = (X.C3254272i) r0
            X.9IL r0 = r0.A01
            if (r0 == 0) goto L_0x000f
            r2.add(r0)
            goto L_0x000f
        L_0x0023:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x002c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.9IL r0 = (X.AnonymousClass9IL) r0
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x002c
            r5.add(r2)
            goto L_0x002c
        L_0x0043:
            java.util.Iterator r4 = r5.iterator()
            boolean r0 = r4.hasNext()
            r7 = r13
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r4.next()
            X.9IL r0 = (X.AnonymousClass9IL) r0
            long r0 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x005a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r4.next()
            X.9IL r0 = (X.AnonymousClass9IL) r0
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x005a
            r2 = r1
            goto L_0x005a
        L_0x0074:
            if (r13 == 0) goto L_0x007c
            boolean r0 = r13.A02
            if (r0 != 0) goto L_0x0098
            if (r17 == 0) goto L_0x0098
        L_0x007c:
            long r8 = A00(r15, r3)
            goto L_0x008c
        L_0x0081:
            if (r2 == 0) goto L_0x0074
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x0093
            long r8 = r2.longValue()
        L_0x008b:
            r10 = 3
        L_0x008c:
            X.6Kk r6 = new X.6Kk
            r11 = r10
            r6.<init>(r7, r8, r10, r11)
            return r6
        L_0x0093:
            long r8 = A00(r15, r3)
            goto L_0x008b
        L_0x0098:
            java.lang.Object r5 = r13.A00
            X.1Jn r5 = (X.1Jn) r5
            boolean r0 = r5 instanceof X.C3254172h
            if (r0 == 0) goto L_0x00bc
            r10 = 113(0x71, float:1.58E-43)
        L_0x00a2:
            r11 = r10
        L_0x00a3:
            java.lang.Object r6 = r13.A04
            X.1Jn r6 = (X.1Jn) r6
            X.1Jq r0 = r15.A01
            X.1Jm r0 = r0.A00
            long r3 = r6.A00
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b4
            r5 = r6
        L_0x00b4:
            long r8 = r5.A00
            X.6Kk r6 = new X.6Kk
            r6.<init>(r7, r8, r10, r11)
            return r6
        L_0x00bc:
            boolean r0 = r5 instanceof X.C252823pl
            r10 = 3
            if (r0 != 0) goto L_0x00a2
            r10 = 4
            boolean r0 = r5 instanceof X.C317976o9
            if (r0 != 0) goto L_0x00d4
            java.lang.Object r0 = r13.A04
            boolean r0 = r0 instanceof X.AnonymousClass42Y
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r5 instanceof X.1Jo
            r11 = 4
            if (r0 == 0) goto L_0x00a3
            r11 = 615(0x267, float:8.62E-43)
            goto L_0x00a3
        L_0x00d4:
            r11 = 630(0x276, float:8.83E-43)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3034768y.A02(X.9J0, X.2TT, X.42d, java.util.Collection, boolean):X.6Kk");
    }

    public static final long A00(C2595542d r5, Collection collection) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass9IL r0 = ((C3254272i) it.next()).A01;
            if (r0 != null) {
                arrayList.add(r0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Object obj = ((AnonymousClass9IL) next).A02;
            if (obj == AnonymousClass05K.A00 || obj == AnonymousClass05K.A01) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            Long valueOf = Long.valueOf(((AnonymousClass9IL) it3.next()).A01);
            while (it3.hasNext()) {
                Long valueOf2 = Long.valueOf(((AnonymousClass9IL) it3.next()).A01);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            if (valueOf != null) {
                j = valueOf.longValue();
                return Math.max(j, r5.A00);
            }
        }
        j = r5.A01.A00;
        return Math.max(j, r5.A00);
    }
}
