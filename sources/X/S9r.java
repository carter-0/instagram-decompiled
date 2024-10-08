package X;

public abstract class S9r {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C8131QhP r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0097
            X.QDM r0 = r5.A09()
            java.util.List r1 = r0.A07()
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 1
            if (r0 == 0) goto L_0x009e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x009e
        L_0x001b:
            r1 = 1
        L_0x001c:
            boolean r0 = X.C11431STx.A06()
            if (r0 == 0) goto L_0x009c
            X.QDM r0 = r5.A09()
            X.2Fk r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x009c
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x0097
            if (r0 != 0) goto L_0x0097
            r5.A0R = r4
            X.QDM r0 = r5.A09()
            java.util.List r0 = r0.A07()
            java.util.Iterator r2 = r0.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r1 = r2.next()
            X.QDM r0 = r5.A09()
            X.0qQ.A0B(r1, r3)
            java.util.Map r0 = r0.A0T
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.Boolean r0 = r0.A00
        L_0x0064:
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x0049
            r2 = 0
        L_0x006b:
            X.QDM r0 = r5.A09()
            java.lang.String r4 = "nux_checkout"
            X.Sto r1 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r3 = r0.A0R
            X.QDH r0 = r0.A0S
            X.SEB r0 = r0.A03()
            if (r2 == 0) goto L_0x00cf
            java.util.LinkedHashMap r2 = X.SUU.A07(r0)
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_ecpcheckout_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 57
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 26
            X.TY3.A00(r1, r3, r2, r4, r0)
        L_0x0097:
            return
        L_0x0098:
            r0 = 0
            goto L_0x0064
        L_0x009a:
            r2 = 1
            goto L_0x006b
        L_0x009c:
            r0 = 0
            goto L_0x0037
        L_0x009e:
            java.util.Iterator r2 = r1.iterator()
        L_0x00a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.QDM r0 = r5.A09()
            java.util.Map r0 = r0.A0T
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00a2
            X.QDM r0 = r5.A09()
            X.0qQ.A0B(r1, r3)
            java.util.Map r0 = r0.A0T
            X.SOw r0 = X.Pxh.A0T(r1, r0)
            if (r0 == 0) goto L_0x00cc
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00cc
            goto L_0x00a2
        L_0x00cc:
            r1 = 0
            goto L_0x001c
        L_0x00cf:
            java.util.LinkedHashMap r0 = X.SUU.A07(r0)
            r1.A0Y(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S9r.A00(X.QhP):void");
    }

    public static final boolean A01(0sL r3, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                r3.invoke(true, (Object) null);
                return true;
            }
        } else if (!z2) {
            return true;
        }
        if (!z || z2) {
            r3.invoke(false, AnonymousClass7TE.A15("Component was loaded but is not required"));
            return false;
        }
        r3.invoke(false, AnonymousClass7TE.A15("Required component failed to load"));
        return false;
    }
}
