package X;

public abstract class Q42 {
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
        r7.A0P(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ca, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.R9W
            if (r0 == 0) goto L_0x0011
            r0 = r6
            X.R9W r0 = (X.R9W) r0
            X.4tV r7 = (X.C276544tV) r7
            int r4 = r0.A00
            java.lang.Object r2 = r0.A01
        L_0x000d:
            r7.A0P(r4, r2)
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = r6 instanceof X.R9V
            if (r0 == 0) goto L_0x00d9
            r3 = r6
            X.R9V r3 = (X.R9V) r3
            int r0 = r3.A00
            X.4tV r7 = (X.C276544tV) r7
            switch(r0) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x01bf;
                case 2: goto L_0x003d;
                case 3: goto L_0x00a1;
                case 4: goto L_0x00b9;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.1Kj r0 = X.C64361Kj.A00()
            X.4ts r0 = r0.A08
            int r4 = r0.A00(r7)
            java.util.List r0 = r7.A0M(r4)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.Q44.A03(r7, r0)
            r2.addAll(r0)
            goto L_0x000d
        L_0x003d:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            java.util.List r1 = r7.A0L()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.component.base.BloksModel>"
            X.0qQ.A0C(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()
            X.4tV r1 = (X.C276544tV) r1
            r0 = 132(0x84, float:1.85E-43)
            X.4tV r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r4 = r0.A0D()
        L_0x006c:
            r5.add(r4)
            goto L_0x0053
        L_0x0070:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r3 = X.C51966G9m.A1H(r0)
        L_0x0076:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r2 = r3.next()
            X.4tV r2 = (X.C276544tV) r2
            r0 = 132(0x84, float:1.85E-43)
            X.4tV r0 = r2.A07(r0)
            if (r0 == 0) goto L_0x009f
            java.lang.String r1 = r0.A0D()
        L_0x008e:
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x0076
            java.util.List r0 = r7.A0L()
            r0.add(r2)
            r5.add(r1)
            goto L_0x0076
        L_0x009f:
            r1 = r4
            goto L_0x008e
        L_0x00a1:
            X.1Kj r0 = X.C64361Kj.A00()
            X.4ts r0 = r0.A08
            int r4 = r0.A00(r7)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.Q44.A03(r7, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x000d
        L_0x00b9:
            X.1Kj r0 = X.C64361Kj.A00()
            X.4ts r0 = r0.A08
            int r4 = r0.A00(r7)
            java.util.List r0 = r7.A0M(r4)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            r1 = 0
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = X.Q44.A03(r7, r0)
            r2.addAll(r1, r0)
            goto L_0x000d
        L_0x00d9:
            boolean r0 = r6 instanceof X.R9Y
            if (r0 == 0) goto L_0x00fd
            r3 = r6
            X.R9Y r3 = (X.R9Y) r3
            int r0 = r3.A00
            X.4tV r7 = (X.C276544tV) r7
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r3.A02
            X.Tee r0 = (X.C13670Tee) r0
            android.util.Pair r0 = X.Q44.A01(r7, r0)
            int r2 = X.Pxf.A04(r0)
            if (r2 >= 0) goto L_0x01cb
            java.lang.String r1 = "ComponentTree"
            java.lang.String r0 = "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent."
        L_0x00f9:
            android.util.Log.w(r1, r0)
            return
        L_0x00fd:
            boolean r0 = r6 instanceof X.R9U
            if (r0 == 0) goto L_0x011d
            r3 = r6
            X.R9U r3 = (X.R9U) r3
            X.4tV r7 = (X.C276544tV) r7
            java.lang.String r1 = r3.A00
            X.Q2v r0 = new X.Q2v
            r0.<init>(r1)
            android.util.Pair r0 = X.Q44.A01(r7, r0)
            int r1 = X.Pxf.A04(r0)
            if (r1 >= 0) goto L_0x01df
            java.lang.String r1 = "ComponentTreeMutator"
            java.lang.String r0 = "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent."
            goto L_0x00f9
        L_0x011d:
            boolean r0 = r6 instanceof X.Q48
            if (r0 == 0) goto L_0x013d
            r0 = r6
            X.Q48 r0 = (X.Q48) r0
            X.4tV r7 = (X.C276544tV) r7
            java.lang.String r1 = r0.A00
            X.Q2v r0 = new X.Q2v
            r0.<init>(r1)
            android.util.Pair r0 = X.Q44.A01(r7, r0)
            int r1 = X.Pxf.A04(r0)
            if (r1 >= 0) goto L_0x01fb
            java.lang.String r1 = "ComponentTreeMutator"
            java.lang.String r0 = "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent."
            goto L_0x00f9
        L_0x013d:
            boolean r0 = r6 instanceof X.R9T
            if (r0 == 0) goto L_0x0179
            r3 = r6
            X.R9T r3 = (X.R9T) r3
            X.4tV r7 = (X.C276544tV) r7
            java.lang.String r1 = r3.A01
            X.Q2v r0 = new X.Q2v
            r0.<init>(r1)
            android.util.Pair r0 = X.Q44.A01(r7, r0)
            java.lang.Object r2 = r0.first
            java.util.List r2 = (java.util.List) r2
            int r4 = X.Pxf.A04(r0)
            java.lang.String r1 = r3.A00
            X.Q2v r0 = new X.Q2v
            r0.<init>(r1)
            int r3 = X.Q44.A00(r0, r2)
            r0 = -1
            java.lang.String r1 = "ComponentTree"
            if (r4 != r0) goto L_0x016d
            java.lang.String r0 = "removeChildren: The starting id doesn't exist. No children have been removed."
            goto L_0x00f9
        L_0x016d:
            if (r3 != r0) goto L_0x0173
            java.lang.String r0 = "removeChildren: The ending id doesn't exist. No children have been removed."
            goto L_0x00f9
        L_0x0173:
            if (r4 <= r3) goto L_0x0195
            java.lang.String r0 = "removeChildren: The starting index is larger than the ending index. No children have been removed."
            goto L_0x00f9
        L_0x0179:
            r3 = r6
            X.R9X r3 = (X.R9X) r3
            X.4tV r7 = (X.C276544tV) r7
            java.lang.String r1 = r3.A01
            X.Q2v r0 = new X.Q2v
            r0.<init>(r1)
            android.util.Pair r0 = X.Q44.A01(r7, r0)
            int r2 = X.Pxf.A04(r0)
            if (r2 >= 0) goto L_0x0203
            java.lang.String r1 = "ComponentTree"
            java.lang.String r0 = "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent."
            goto L_0x00f9
        L_0x0195:
            java.util.Iterator r2 = r2.iterator()
            r1 = 0
        L_0x019a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            r2.next()
            if (r1 <= r4) goto L_0x01aa
            if (r1 >= r3) goto L_0x01aa
            r2.remove()
        L_0x01aa:
            int r1 = r1 + 1
            goto L_0x019a
        L_0x01ad:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            goto L_0x01c7
        L_0x01bf:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r3.A01
            r1 = 38
        L_0x01c7:
            r7.A0P(r1, r0)
            return
        L_0x01cb:
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            r1.remove(r2)
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            goto L_0x020c
        L_0x01d7:
            java.lang.Object r1 = r3.A02
            r0 = 31
            r7.A0P(r0, r1)
            return
        L_0x01df:
            java.lang.Object r2 = r0.first
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
        L_0x01e7:
            int r0 = r0 + -1
            if (r0 <= r1) goto L_0x01ef
            r2.remove(r0)
            goto L_0x01e7
        L_0x01ef:
            int r1 = r1 + 1
            java.util.List r0 = r3.A01
            java.util.ArrayList r0 = X.Q44.A03(r7, r0)
            r2.addAll(r1, r0)
            return
        L_0x01fb:
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            r0.remove(r1)
            return
        L_0x0203:
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            int r0 = r3.A00
            int r2 = r2 + r0
            java.util.List r0 = r3.A02
        L_0x020c:
            java.util.ArrayList r0 = X.Q44.A03(r7, r0)
            r1.addAll(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q42.A00(java.lang.Object):void");
    }

    public boolean A01(Object obj) {
        if (this instanceof R9W) {
            R9W r9w = (R9W) this;
            int i = r9w.A00;
            Object obj2 = r9w.A01;
            Object A00 = C276544tV.A00((C276544tV) obj, i);
            if (A00 == obj2) {
                return false;
            }
            if (!(obj2 instanceof Number)) {
                return !Q06.A00(A00, obj2);
            }
            if (A00 instanceof Number) {
                Number number = (Number) A00;
                Number number2 = (Number) obj2;
                if (number.longValue() == number2.longValue() && number.doubleValue() == number2.doubleValue()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
