package X;

import java.util.LinkedList;

public final class S6M {
    public C13452Taf A00;
    public Object A01;
    public LinkedList A02;
    public final T9Z A03;

    public final void A00(SED sed) {
        LinkedList linkedList = this.A02;
        if (linkedList == null) {
            linkedList = Pxe.A1A();
            this.A02 = linkedList;
        }
        linkedList.add(sed);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Object r7) {
        /*
            r6 = this;
            X.Taf r1 = r6.A00
            X.T9Z r2 = r6.A03
            X.SuR r1 = (X.C12436SuR) r1
            java.util.Map r0 = r1.A00
            if (r0 != 0) goto L_0x010b
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r1.A00 = r0
        L_0x0010:
            java.util.Map r0 = r1.A00
            r0.put(r2, r7)
        L_0x0015:
            r6.A01 = r7
            java.lang.Object r3 = r2.A02
            java.util.LinkedList r0 = r6.A02
            if (r0 == 0) goto L_0x0179
            java.util.Iterator r5 = r0.iterator()
            r0 = 0
            r6.A02 = r0
        L_0x0024:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r4 = r5.next()
            X.SED r4 = (X.SED) r4
            boolean r0 = r4 instanceof X.C8189Qiu
            if (r0 == 0) goto L_0x006b
            X.Qiu r4 = (X.C8189Qiu) r4
            X.Rud r1 = r4.A00
            java.util.List r0 = r1.A00
            java.util.Iterator r4 = r0.iterator()
            java.util.Map r2 = r1.A01
        L_0x0040:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r1 = r4.next()
            X.Qiu r1 = (X.C8189Qiu) r1
            X.Qi1 r0 = r1.A00
            X.S6M r0 = r0.A00
            X.T9Z r0 = r0.A03
            java.lang.Object r0 = r0.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0068
            r4.remove()
            java.lang.Object r0 = r1.A01
            r2.put(r0, r7)
            java.util.Map r0 = r1.A02
            r2.putAll(r0)
            goto L_0x0024
        L_0x0068:
            java.util.Map r2 = r1.A02
            goto L_0x0040
        L_0x006b:
            boolean r0 = r4 instanceof X.C8186Qir
            if (r0 == 0) goto L_0x00a4
            X.Qir r4 = (X.C8186Qir) r4
            X.Ruc r1 = r4.A00
            java.util.List r0 = r1.A00
            java.util.Iterator r4 = r0.iterator()
            java.util.Collection r2 = r1.A02
        L_0x007b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r4.next()
            X.Qir r1 = (X.C8186Qir) r1
            X.Qi1 r0 = r1.A00
            X.S6M r0 = r0.A00
            X.T9Z r0 = r0.A03
            java.lang.Object r0 = r0.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4.remove()
            r2.add(r7)
            java.util.List r0 = r1.A01
            r2.addAll(r0)
            goto L_0x0024
        L_0x00a1:
            java.util.List r2 = r1.A01
            goto L_0x007b
        L_0x00a4:
            boolean r0 = r4 instanceof X.C8185Qiq
            if (r0 == 0) goto L_0x00c1
            X.Qiq r4 = (X.C8185Qiq) r4
            X.Qi1 r0 = r4.A00
            X.S6M r0 = r0.A00
            X.T9Z r0 = r0.A03
            java.lang.Object r0 = r0.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0159
            X.Qia r1 = r4.A00
            java.lang.Object r0 = r4.A01
            r1.A0L(r0, r7)
            goto L_0x0024
        L_0x00c1:
            boolean r0 = r4 instanceof X.C8188Qit
            if (r0 == 0) goto L_0x00e0
            X.Qit r4 = (X.C8188Qit) r4
            X.Qi1 r0 = r4.A00
            X.S6M r0 = r0.A00
            X.T9Z r0 = r0.A03
            java.lang.Object r0 = r0.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x016c
            X.T9a r2 = r4.A00
            java.lang.Object r1 = r4.A01
            java.lang.String r0 = r4.A02
            r2.A02(r1, r0, r7)
            goto L_0x0024
        L_0x00e0:
            X.Qis r4 = (X.C8187Qis) r4
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x0104
            X.4fV r3 = r4.A01
            X.QkR r2 = r4.A02
            X.4f7 r0 = r2.A06
            java.lang.String r1 = r0.A02
            java.lang.Class r0 = r2.A0A()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved"
            r3.A0W(r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0104:
            X.QkR r0 = r4.A02
            r0.A0L(r1, r7)
            goto L_0x0024
        L_0x010b:
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0010
            if (r0 == r7) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Already had POJO for id ("
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            java.lang.String r0 = X.C66581MXm.A0y(r0)
            r1.append(r0)
            java.lang.String r0 = ") ["
            r1.append(r0)
            java.lang.String r0 = X.Pxg.A0r(r2, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0133:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to resolve a forward reference with id ["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "] that wasn't previously seen as unresolved."
            java.lang.IllegalArgumentException r0 = X.Pxg.A0d(r0, r1)
            throw r0
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to resolve a forward reference with id ["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "] that wasn't previously seen as unresolved."
            java.lang.IllegalArgumentException r0 = X.Pxg.A0d(r0, r1)
            throw r0
        L_0x0159:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to resolve a forward reference with id ["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "] that wasn't previously seen as unresolved."
            java.lang.IllegalArgumentException r0 = X.Pxg.A0d(r0, r1)
            throw r0
        L_0x016c:
            java.lang.String r2 = "Trying to resolve a forward reference with id ["
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "] that wasn't previously registered."
            java.lang.IllegalArgumentException r0 = X.Pxg.A0c(r2, r1, r0)
            throw r0
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S6M.A01(java.lang.Object):void");
    }

    public final String toString() {
        return String.valueOf(this.A03);
    }

    public S6M(T9Z t9z) {
        this.A03 = t9z;
    }
}
