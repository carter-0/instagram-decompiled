package X;

/* renamed from: X.ReW  reason: case insensitive filesystem */
public abstract class C9652ReW {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.3lr} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r3 != 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r0 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0142, code lost:
        if (X.00l.A0W(r0) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0144, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0098, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.QSO r8, X.C13930TlY r9, java.lang.String r10) {
        /*
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r0 = r9.Arl()
            r1 = 1
            if (r0 == 0) goto L_0x0157
            java.lang.Class<X.QSN> r3 = X.QSN.class
            java.lang.String r2 = "country_to_fields"
            r0 = -1715326638(0xffffffff99c23152, float:-2.007905E-23)
            com.google.common.collect.ImmutableList r7 = r8.getRequiredCompactedTreeListField(r1, r2, r3, r0)
            java.lang.String r6 = "Required value was null."
            if (r7 == 0) goto L_0x0152
            java.util.Iterator r3 = r7.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x014a
            java.lang.Object r5 = r3.next()
            r2 = r5
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "country_code"
            java.lang.String r2 = r2.A07(r0)
            java.lang.String r0 = r9.Arl()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x001e
        L_0x003c:
            X.3lr r5 = (X.C250663lr) r5
            if (r5 != 0) goto L_0x0088
            java.util.Iterator r3 = r7.iterator()
        L_0x0044:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r5 = r3.next()
            r2 = r5
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "country_code"
            java.lang.String r2 = r2.A07(r0)
            java.lang.String r0 = "default_country"
            java.lang.String r0 = r8.A07(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0044
        L_0x0063:
            X.3lr r5 = (X.C250663lr) r5
            if (r5 != 0) goto L_0x0088
            java.util.Iterator r4 = r7.iterator()
        L_0x006b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r3 = r4.next()
            r5 = r3
            X.3lr r5 = (X.C250663lr) r5
            java.lang.String r0 = "country_code"
            java.lang.String r2 = r5.A07(r0)
            java.lang.String r0 = "default"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x006b
            if (r3 == 0) goto L_0x014d
        L_0x0088:
            java.lang.Class<X.BTX> r3 = X.BTX.class
            java.lang.String r2 = "form_fields"
            r0 = 1073342581(0x3ff9e875, float:1.9524065)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r1, r2, r3, r0)
            X.3kO r4 = X.C66580MXl.A0J(r0)
        L_0x0097:
            r1 = 1
        L_0x0098:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0157
            X.3lr r3 = X.C41845B3m.A0V(r4)
            java.lang.Class<X.QXR> r2 = X.QXR.class
            r0 = 2121596196(0x7e74fd24, float:8.1411503E37)
            X.3lr r2 = r3.A01(r2, r0)
            X.0qQ.A07(r2)
            java.lang.String r0 = "field_id"
            java.lang.String r3 = r2.A0B(r0)
            if (r3 == 0) goto L_0x0098
            int r0 = r3.hashCode()
            switch(r0) {
                case -1881886578: goto L_0x00be;
                case -1881886577: goto L_0x00d4;
                case 120609: goto L_0x00ea;
                case 3053931: goto L_0x0100;
                case 109757585: goto L_0x0115;
                case 553963973: goto L_0x012b;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x0098
        L_0x00be:
            java.lang.String r0 = "street1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r9.C1d()
            goto L_0x013c
        L_0x00d4:
            java.lang.String r0 = "street2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r9.C1e()
            goto L_0x013c
        L_0x00ea:
            java.lang.String r0 = "zip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r9.CHc()
            goto L_0x013c
        L_0x0100:
            java.lang.String r0 = "city"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r9.AZd()
            goto L_0x013c
        L_0x0115:
            java.lang.String r0 = "state"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r9.AZf()
            goto L_0x013c
        L_0x012b:
            java.lang.String r0 = "care_of"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0144
            boolean r0 = X.Pxi.A1S(r2)
            if (r0 != 0) goto L_0x0097
            r0 = r10
        L_0x013c:
            if (r0 == 0) goto L_0x0144
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0097
        L_0x0144:
            r1 = 0
            goto L_0x0098
        L_0x0147:
            r5 = r4
            goto L_0x0063
        L_0x014a:
            r5 = r4
            goto L_0x003c
        L_0x014d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9652ReW.A00(X.QSO, X.TlY, java.lang.String):boolean");
    }
}
