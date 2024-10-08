package X;

/* renamed from: X.7yL  reason: invalid class name and case insensitive filesystem */
public abstract class C348377yL {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r2 == null) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A00(X.AnonymousClass27H r9, X.AnonymousClass87G r10, X.AnonymousClass858 r11, java.util.List r12, boolean r13, boolean r14) {
        /*
            r7 = 0
            if (r14 == 0) goto L_0x0029
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r12.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.87G r0 = (X.AnonymousClass87G) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.CbC()
            if (r0 == 0) goto L_0x000c
            r4.add(r1)
            goto L_0x000c
        L_0x0029:
            X.0sn r4 = X.0sn.A00
        L_0x002b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r12.iterator()
        L_0x0034:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.87G r1 = (X.AnonymousClass87G) r1
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00()
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.CbC()
            if (r0 == 0) goto L_0x0050
            if (r14 == 0) goto L_0x0050
            goto L_0x0034
        L_0x0050:
            X.5rf r0 = X.C297385rf.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x005f
            goto L_0x0034
        L_0x005f:
            r6.add(r2)
            goto L_0x0034
        L_0x0063:
            r5 = 0
            if (r10 == 0) goto L_0x0117
            com.instagram.model.shopping.ProductItemWithAR r0 = r10.A06
            if (r0 != 0) goto L_0x008b
            java.util.Iterator r3 = r6.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.87G r0 = (X.AnonymousClass87G) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r10.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0117
        L_0x008b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r1.add(r7, r10)
        L_0x0093:
            if (r13 != 0) goto L_0x009b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x009d
        L_0x009b:
            X.87G r5 = X.AnonymousClass87G.A0T
        L_0x009d:
            X.0sn r0 = X.0sn.A00
            X.7yM r10 = new X.7yM
            r10.<init>(r5, r1, r0, r4)
            boolean r0 = r11 instanceof X.C348397yN
            if (r0 == 0) goto L_0x00c2
            android.util.SparseArray r1 = r10.A00
            r0 = 1
            java.lang.Object r9 = r1.get(r0)
            X.0qQ.A07(r9)
            java.util.List r9 = (java.util.List) r9
        L_0x00b4:
            int r0 = r4.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r9, r1)
            return r0
        L_0x00c2:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            X.859[] r11 = r11.A00
            int r7 = r11.length
            r6 = 0
        L_0x00d0:
            if (r6 >= r7) goto L_0x00b4
            r5 = r11[r6]
            android.util.SparseArray r1 = r10.A00
            int r0 = r5.A00
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00e5
            java.util.Collections.reverse(r1)
        L_0x00e5:
            java.util.Iterator r3 = r1.iterator()
            r2 = 0
        L_0x00ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r1 = r3.next()
            X.87G r1 = (X.AnonymousClass87G) r1
            int r0 = r5.A01
            if (r2 >= r0) goto L_0x0114
            java.lang.String r0 = r1.getId()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00ea
            r9.add(r1)
            java.lang.String r0 = r1.getId()
            X.0qQ.A07(r0)
            r8.add(r0)
            int r2 = r2 + 1
            goto L_0x00ea
        L_0x0114:
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x0117:
            r1 = r6
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348377yL.A00(X.27H, X.87G, X.858, java.util.List, boolean, boolean):X.0eP");
    }
}
