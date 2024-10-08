package X;

/* renamed from: X.MaW  reason: case insensitive filesystem */
public abstract class C66663MaW {
    public static void A04(C241953Sa r4, AnonymousClass3S9 r5) {
        AnonymousClass3SZ r0 = r5.A0v;
        if (r0 != null) {
            if (AnonymousClass48V.A01.compare(r4.A02, r0.A02) >= 0) {
                r5.A0v = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r10.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r9.AoJ(r3).A05(r8.A05, X.DbT.A0l(r8.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r10.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r2 = r9.AoJ(r3);
        r1 = r8.A05;
        r6 = r8.A01;
        A05(r2, r10, r1, !r6);
        r2 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (X.182.A06(r2, r7, 36314493948529272L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (X.182.A06(r2, r7, 36314493949250170L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r3.C6C() == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r4 = (X.C70654OFb) r7.A01(X.C70654OFb.class, new X.C58685Ivu(r7, 6));
        r2 = r3.C6C();
        X.0qQ.A0B(r2, 0);
        r1 = r4.A01;
        r0 = X.JTO.A15(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r6 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r0.remove(r2) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r2 = r4.A00.AR4();
        r2.E5g("thread_with_muted_outgoing_chat_notification", X.C66581MXm.A0w(",", (java.lang.Iterable) r1.getValue()));
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        if ((!r0.contains(r2)) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        X.JTO.A15(r1).add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.session.UserSession r7, X.C65931i8 r8, X.2Dm r9, java.lang.String r10) {
        /*
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x00b9
            X.3U9 r3 = r9.C60(r0)
            if (r3 == 0) goto L_0x0014
            int r0 = r10.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0015;
                case -948696717: goto L_0x0018;
                case 1501196714: goto L_0x0030;
                case 1563991648: goto L_0x0033;
                case 1885454214: goto L_0x0036;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.C66581MXm.A1L(r3, r9)
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r0 = "executing"
            goto L_0x001a
        L_0x0018:
            java.lang.String r0 = "queued"
        L_0x001a:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r9.AoJ(r3)
            java.lang.String r1 = r8.A05
            boolean r0 = r8.A01
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            r2.A05(r1, r0)
            goto L_0x0011
        L_0x0030:
            java.lang.String r0 = "upload_failed_permanent"
            goto L_0x0038
        L_0x0033:
            java.lang.String r0 = "uploaded"
            goto L_0x0038
        L_0x0036:
            java.lang.String r0 = "upload_failed_transient"
        L_0x0038:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r9.AoJ(r3)
            java.lang.String r1 = r8.A05
            boolean r6 = r8.A01
            r0 = r6 ^ 1
            A05(r2, r10, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314493948529272(0x8103d700000a78, double:3.028770427555513E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0011
            r0 = 36314493949250170(0x8103d7000b0a7a, double:3.0287704280114117E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r3.C6C()
            if (r0 == 0) goto L_0x0011
            r5 = 0
            r0 = 6
            X.Ivu r1 = new X.Ivu
            r1.<init>(r7, r0)
            java.lang.Class<X.OFb> r0 = X.C70654OFb.class
            java.lang.Object r4 = r7.A01(r0, r1)
            X.OFb r4 = (X.C70654OFb) r4
            java.lang.String r2 = r3.C6C()
            X.0qQ.A0B(r2, r5)
            X.0eM r1 = r4.A01
            java.util.List r0 = X.JTO.A15(r1)
            if (r6 == 0) goto L_0x00a9
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x0011
        L_0x008d:
            X.0xa r0 = r4.A00
            X.0xY r2 = r0.AR4()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r0 = ","
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
            java.lang.String r0 = "thread_with_muted_outgoing_chat_notification"
            r2.E5g(r0, r1)
            r2.apply()
            goto L_0x0011
        L_0x00a9:
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = X.JTO.A15(r1)
            r0.add(r2)
            goto L_0x008d
        L_0x00b9:
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A01(com.instagram.common.session.UserSession, X.1i8, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r8.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r7.BJ7(r3).A05(r6.A05, java.lang.Boolean.valueOf(r6.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r8.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r1 = r7.BJ7(r3);
        r0 = r6.A05;
        r2 = r6.A01;
        A05(r1, r8, r0, r2);
        r4 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (X.182.A06(r4, r5, 36314493948529272L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (X.182.A06(r4, r5, 36314493949250170L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r3.C6C() == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r5 = (X.C70654OFb) r5.A01(X.C70654OFb.class, new X.C58685Ivu(r5, 6));
        r4 = r3.C6C();
        r2 = !r2;
        X.0qQ.A0B(r4, 0);
        r1 = r5.A02;
        r0 = X.JTO.A15(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r2 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r0.remove(r4) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r2 = r5.A00.AR4();
        r2.E5g("thread_with_muted_outgoing_chat_notification", X.C66581MXm.A0w(",", (java.lang.Iterable) r1.getValue()));
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        if ((!r0.contains(r4)) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        X.JTO.A15(r1).add(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.instagram.common.session.UserSession r5, X.C65941iJ r6, X.2Dm r7, java.lang.String r8) {
        /*
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x00b9
            X.3U9 r3 = r7.C60(r0)
            if (r3 == 0) goto L_0x0014
            int r0 = r8.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0015;
                case -948696717: goto L_0x0018;
                case 1501196714: goto L_0x0030;
                case 1563991648: goto L_0x0033;
                case 1885454214: goto L_0x0036;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.C66581MXm.A1L(r3, r7)
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r0 = "executing"
            goto L_0x001a
        L_0x0018:
            java.lang.String r0 = "queued"
        L_0x001a:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r7.BJ7(r3)
            java.lang.String r1 = r6.A05
            boolean r0 = r6.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
            goto L_0x0011
        L_0x0030:
            java.lang.String r0 = "upload_failed_permanent"
            goto L_0x0038
        L_0x0033:
            java.lang.String r0 = "uploaded"
            goto L_0x0038
        L_0x0036:
            java.lang.String r0 = "upload_failed_transient"
        L_0x0038:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r1 = r7.BJ7(r3)
            java.lang.String r0 = r6.A05
            boolean r2 = r6.A01
            A05(r1, r8, r0, r2)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314493948529272(0x8103d700000a78, double:3.028770427555513E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0011
            r0 = 36314493949250170(0x8103d7000b0a7a, double:3.0287704280114117E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r3.C6C()
            if (r0 == 0) goto L_0x0011
            r0 = 6
            X.Ivu r1 = new X.Ivu
            r1.<init>(r5, r0)
            java.lang.Class<X.OFb> r0 = X.C70654OFb.class
            java.lang.Object r5 = r5.A01(r0, r1)
            X.OFb r5 = (X.C70654OFb) r5
            java.lang.String r4 = r3.C6C()
            r2 = r2 ^ 1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0eM r1 = r5.A02
            java.util.List r0 = X.JTO.A15(r1)
            if (r2 == 0) goto L_0x00a9
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L_0x0011
        L_0x008d:
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.0xa r0 = r5.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = ","
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
            java.lang.String r0 = "thread_with_muted_outgoing_chat_notification"
            r2.E5g(r0, r1)
            r2.apply()
            goto L_0x0011
        L_0x00a9:
            boolean r0 = r0.contains(r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = X.JTO.A15(r1)
            r0.add(r4)
            goto L_0x008d
        L_0x00b9:
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A02(com.instagram.common.session.UserSession, X.1iJ, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r7.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r6.BJD(r3).A05(r5.A05, X.AnonymousClass7TE.A0v());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r7.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        A05(r6.BJD(r3), r7, r5.A05, true);
        r2 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (X.182.A06(r2, r4, 36314493948529272L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (X.182.A06(r2, r4, 36314493949250170L) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r3.C6C() == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r4 = (X.C70654OFb) r4.A01(X.C70654OFb.class, new X.C58685Ivu(r4, 6));
        r2 = r3.C6C();
        X.0qQ.A0B(r2, 0);
        r1 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if ((!X.JTO.A15(r1).contains(r2)) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        X.JTO.A15(r1).add(r2);
        r2 = r4.A00.AR4();
        r2.E5g("thread_with_muted_outgoing_chat_notification", X.C66581MXm.A0w(",", (java.lang.Iterable) r1.getValue()));
        r2.apply();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.instagram.common.session.UserSession r4, X.AnonymousClass1hy r5, X.2Dm r6, java.lang.String r7) {
        /*
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x00ab
            X.3U9 r3 = r6.C60(r0)
            if (r3 == 0) goto L_0x0014
            int r0 = r7.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0015;
                case -948696717: goto L_0x0018;
                case 1501196714: goto L_0x002e;
                case 1563991648: goto L_0x0031;
                case 1885454214: goto L_0x0034;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.C66581MXm.A1L(r3, r6)
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r0 = "executing"
            goto L_0x001a
        L_0x0018:
            java.lang.String r0 = "queued"
        L_0x001a:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r6.BJD(r3)
            java.lang.String r1 = r5.A05
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r2.A05(r1, r0)
            goto L_0x0011
        L_0x002e:
            java.lang.String r0 = "upload_failed_permanent"
            goto L_0x0036
        L_0x0031:
            java.lang.String r0 = "uploaded"
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = "upload_failed_transient"
        L_0x0036:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r6.BJD(r3)
            java.lang.String r1 = r5.A05
            r0 = 1
            A05(r2, r7, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314493948529272(0x8103d700000a78, double:3.028770427555513E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0011
            r0 = 36314493949250170(0x8103d7000b0a7a, double:3.0287704280114117E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r3.C6C()
            if (r0 == 0) goto L_0x0011
            r0 = 6
            X.Ivu r1 = new X.Ivu
            r1.<init>(r4, r0)
            java.lang.Class<X.OFb> r0 = X.C70654OFb.class
            java.lang.Object r4 = r4.A01(r0, r1)
            X.OFb r4 = (X.C70654OFb) r4
            java.lang.String r2 = r3.C6C()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0eM r1 = r4.A03
            java.util.List r0 = X.JTO.A15(r1)
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = X.JTO.A15(r1)
            r0.add(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.0xa r0 = r4.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = ","
            java.lang.String r1 = X.C66581MXm.A0w(r0, r1)
            java.lang.String r0 = "thread_with_muted_outgoing_chat_notification"
            r2.E5g(r0, r1)
            r2.apply()
            goto L_0x0011
        L_0x00ab:
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A03(com.instagram.common.session.UserSession, X.1hy, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        A05(r5.AZr(r3), r6, r4.A05, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5.AZr(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C65861hN r4, X.2Dm r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A00
            X.3U9 r3 = r5.C60(r0)
            if (r3 == 0) goto L_0x004d
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0033;
                case -948696717: goto L_0x0030;
                case 1501196714: goto L_0x001c;
                case 1563991648: goto L_0x0019;
                case 1885454214: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0016:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x001e
        L_0x0019:
            java.lang.String r0 = "uploaded"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x001e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.AZr(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            A05(r2, r6, r1, r0)
            goto L_0x004a
        L_0x0030:
            java.lang.String r0 = "queued"
            goto L_0x0035
        L_0x0033:
            java.lang.String r0 = "executing"
        L_0x0035:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.AZr(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004a:
            X.C66581MXm.A1L(r3, r5)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A06(X.1hN, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r5.BJ8(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A01));
        r5 = (X.2Dr) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        A05(r5.BJ8(r3), r6, r4.A05, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.2Dr.A0G(r5, r3.BJz(), X.AnonymousClass05K.A0A, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.C65791gn r4, X.2Dm r5, java.lang.String r6) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r4.A00
            X.3U9 r3 = r5.C5z(r0)
            if (r3 == 0) goto L_0x004d
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x001f;
                case -948696717: goto L_0x001c;
                case 1501196714: goto L_0x003a;
                case 1563991648: goto L_0x0019;
                case 1885454214: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0016:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x003c
        L_0x0019:
            java.lang.String r0 = "uploaded"
            goto L_0x003c
        L_0x001c:
            java.lang.String r0 = "queued"
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = "executing"
        L_0x0021:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJ8(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            goto L_0x004e
        L_0x003a:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x003c:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJ8(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            A05(r2, r6, r1, r0)
        L_0x004d:
            return
        L_0x004e:
            com.instagram.model.direct.DirectThreadKey r2 = r3.BJz()     // Catch:{ all -> 0x005a }
            java.lang.Integer r1 = X.AnonymousClass05K.A0A     // Catch:{ all -> 0x005a }
            r0 = 1
            X.2Dr.A0G(r5, r2, r1, r0, r0)     // Catch:{ all -> 0x005a }
            monitor-exit(r5)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A08(X.1gn, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r7.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r6.C69(r4).A04(java.lang.Integer.valueOf(r5.A00), r5.A05, A0H(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r6.Aut(r4).A04(r5.A01, r5.A05, A0H(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r7.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r1 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r6.C69(r4).A05(r5.A05, java.lang.Integer.valueOf(r5.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r6.Aut(r4).A05(r5.A05, r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        X.C66581MXm.A1L(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.C65971iV r5, X.2Dm r6, java.lang.String r7) {
        /*
            java.lang.String r0 = r5.A02
            X.3U9 r4 = r6.C60(r0)
            if (r4 == 0) goto L_0x007a
            int r1 = r5.A00
            r0 = 7
            boolean r1 = X.JTQ.A1O(r1, r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0053;
                case -948696717: goto L_0x0050;
                case 1501196714: goto L_0x0023;
                case 1563991648: goto L_0x0020;
                case 1885454214: goto L_0x001d;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r7)
            throw r0
        L_0x001d:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0025
        L_0x0020:
            java.lang.String r0 = "uploaded"
            goto L_0x0025
        L_0x0023:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0025:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0016
            if (r1 == 0) goto L_0x0040
            X.3SB r3 = r6.C69(r4)
            java.lang.String r2 = r5.A05
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = A0H(r7)
            r3.A04(r1, r2, r0)
        L_0x0040:
            X.3SB r3 = r6.Aut(r4)
            java.lang.String r2 = r5.A05
            java.lang.String r1 = r5.A01
            boolean r0 = A0H(r7)
            r3.A04(r1, r2, r0)
            goto L_0x0077
        L_0x0050:
            java.lang.String r0 = "queued"
            goto L_0x0055
        L_0x0053:
            java.lang.String r0 = "executing"
        L_0x0055:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0016
            if (r1 == 0) goto L_0x006c
            X.3SB r2 = r6.C69(r4)
            java.lang.String r1 = r5.A05
            int r0 = r5.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05(r1, r0)
        L_0x006c:
            X.3SB r2 = r6.Aut(r4)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r5.A01
            r2.A05(r1, r0)
        L_0x0077:
            X.C66581MXm.A1L(r4, r6)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A09(X.1iV, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        A05(r5.BJ9(r3), r6, r4.A05, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5.BJ9(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.AnonymousClass1gz r4, X.2Dm r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A00
            X.3U9 r3 = r5.C60(r0)
            if (r3 == 0) goto L_0x004d
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0033;
                case -948696717: goto L_0x0030;
                case 1501196714: goto L_0x001c;
                case 1563991648: goto L_0x0019;
                case 1885454214: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0016:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x001e
        L_0x0019:
            java.lang.String r0 = "uploaded"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x001e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJ9(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            A05(r2, r6, r1, r0)
            goto L_0x004a
        L_0x0030:
            java.lang.String r0 = "queued"
            goto L_0x0035
        L_0x0033:
            java.lang.String r0 = "executing"
        L_0x0035:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJ9(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004a:
            X.C66581MXm.A1L(r3, r5)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0A(X.1gz, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        A05(r5.BJF(r3), r6, r4.A05, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r5.BJF(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C65831h5 r4, X.2Dm r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L_0x0051
            X.3U9 r3 = r5.C60(r0)
            if (r3 == 0) goto L_0x0050
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0035;
                case -948696717: goto L_0x0032;
                case 1501196714: goto L_0x001e;
                case 1563991648: goto L_0x001b;
                case 1885454214: goto L_0x0018;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0018:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0020
        L_0x001b:
            java.lang.String r0 = "uploaded"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0020:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJF(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            A05(r2, r6, r1, r0)
            goto L_0x004c
        L_0x0032:
            java.lang.String r0 = "queued"
            goto L_0x0037
        L_0x0035:
            java.lang.String r0 = "executing"
        L_0x0037:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJF(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004c:
            X.C66581MXm.A1L(r3, r5)
            return
        L_0x0050:
            return
        L_0x0051:
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0C(X.1h5, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        A05(r5.BJL(r3), r6, r4.A05, r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5.BJL(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C65851hB r4, X.2Dm r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A01
            X.3U9 r3 = r5.C60(r0)
            if (r3 == 0) goto L_0x004d
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0033;
                case -948696717: goto L_0x0030;
                case 1501196714: goto L_0x001c;
                case 1563991648: goto L_0x0019;
                case 1885454214: goto L_0x0016;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0016:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x001e
        L_0x0019:
            java.lang.String r0 = "uploaded"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x001e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJL(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A02
            A05(r2, r6, r1, r0)
            goto L_0x004a
        L_0x0030:
            java.lang.String r0 = "queued"
            goto L_0x0035
        L_0x0033:
            java.lang.String r0 = "executing"
        L_0x0035:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3SB r2 = r5.BJL(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004a:
            X.C66581MXm.A1L(r3, r5)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0D(X.1hB, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (A0H(r5) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3.A00(new X.C330937Ov(r2, r1));
        r2 = r4.A03();
        r1 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r1 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r5.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r2 = r4.A03();
        r1 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3.A00(new X.C330937Ov(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r5.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r2 = r4.A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.1Ng r3, X.C65901hl r4, java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x003d;
                case -948696717: goto L_0x003a;
                case 1501196714: goto L_0x0014;
                case 1563991648: goto L_0x0011;
                case 1885454214: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r5)
            throw r0
        L_0x000e:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0016
        L_0x0011:
            java.lang.String r0 = "uploaded"
            goto L_0x0016
        L_0x0014:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0016:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.3t0 r2 = r4.A03()
            boolean r0 = A0H(r5)
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0028:
            X.7Ov r0 = new X.7Ov
            r0.<init>(r2, r1)
            r3.A00(r0)
            X.3t0 r2 = r4.A03()
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x004b
        L_0x0037:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0028
        L_0x003a:
            java.lang.String r0 = "queued"
            goto L_0x003f
        L_0x003d:
            java.lang.String r0 = "executing"
        L_0x003f:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.3t0 r2 = r4.A03()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x004b:
            X.7Ov r0 = new X.7Ov
            r0.<init>(r2, r1)
            r3.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A00(X.1Ng, X.1hl, java.lang.String):void");
    }

    public static void A05(AnonymousClass3SB r2, String str, String str2, boolean z) {
        r2.A04(Boolean.valueOf(z), str2, A0H(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0159, code lost:
        X.0qQ.A0B(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0169, code lost:
        if (X.2Dr.A00(r4, r2).A0O(r5, r2.A0A.A06, r3) == false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016b, code lost:
        X.2Dr.A0A(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r11.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r1 = r9.C6K();
        r7 = r9.A00;
        r6 = (X.2Dr) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r11.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r5 = r9.A00;
        r4 = r10.C5z(r9.C6K());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r3 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r2 = (X.2Dr) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (X.AnonymousClass48V.A01.compare(r5.A02, r0.A02) >= 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e5, code lost:
        if (X.AnonymousClass48V.A01.compare(r5.A02, r0.A02) >= 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        X.0qQ.A0B(r7, 1);
        r0 = r6.A0P(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fc, code lost:
        if (r0 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fe, code lost:
        r5 = r0.A0I;
        X.0qQ.A07(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0109, code lost:
        if (X.AnonymousClass7TF.A1Z(r5.A05) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010b, code lost:
        r4 = r5.A03;
        r3 = r4.readLock();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0116, code lost:
        if (r4.getWriteHoldCount() != 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        r1 = r4.getReadHoldCount();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r0 >= r1) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011f, code lost:
        r3.unlock();
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0125, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        r8 = r4.writeLock();
        r8.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        A04(r7, r5.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0132, code lost:
        if (r2 >= r1) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r3.lock();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013b, code lost:
        if (r2 < r1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r3.lock();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0143, code lost:
        r3 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0145, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        A04(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014b, code lost:
        r8.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014e, code lost:
        X.2Dr.A0A(r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C65721gN r9, X.2Dm r10, java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x003b;
                case -948696717: goto L_0x0038;
                case 1501196714: goto L_0x0024;
                case 1563991648: goto L_0x0011;
                case 1885454214: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r11)
            throw r0
        L_0x000e:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0026
        L_0x0011:
            java.lang.String r0 = "uploaded"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0007
            com.instagram.model.direct.DirectThreadKey r2 = r9.C6K()
            X.3SZ r5 = r9.A00
            r1 = r10
            X.2Dr r1 = (X.2Dr) r1
            monitor-enter(r10)
            goto L_0x0059
        L_0x0024:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0026:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0007
            com.instagram.model.direct.DirectThreadKey r1 = r9.C6K()
            X.3SZ r7 = r9.A00
            r6 = r10
            X.2Dr r6 = (X.2Dr) r6
            monitor-enter(r10)
            goto L_0x00f4
        L_0x0038:
            java.lang.String r0 = "queued"
            goto L_0x003d
        L_0x003b:
            java.lang.String r0 = "executing"
        L_0x003d:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.3SZ r5 = r9.A00
            com.instagram.model.direct.DirectThreadKey r0 = r9.C6K()
            X.3U9 r4 = r10.C5z(r0)
            if (r4 == 0) goto L_0x0173
            java.lang.String r3 = r9.A02
            if (r3 == 0) goto L_0x0173
            r2 = r10
            X.2Dr r2 = (X.2Dr) r2
            monitor-enter(r10)
            goto L_0x0159
        L_0x0059:
            r0 = 1
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x016f }
            X.48S r0 = r1.A0P(r2)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0172
            X.3U9 r2 = r0.A0I     // Catch:{ all -> 0x016f }
            if (r2 == 0) goto L_0x0172
            com.instagram.common.session.UserSession r0 = r1.A0A     // Catch:{ all -> 0x016f }
            java.lang.String r4 = r0.A06     // Catch:{ all -> 0x016f }
            X.0eM r0 = r2.A05     // Catch:{ all -> 0x016f }
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x00ce
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.A03     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.readLock()     // Catch:{ all -> 0x016f }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x016f }
            r7 = 0
            if (r0 != 0) goto L_0x008d
            int r6 = r1.getReadHoldCount()     // Catch:{ all -> 0x016f }
            r0 = 0
        L_0x0085:
            if (r0 >= r6) goto L_0x008e
            r9.unlock()     // Catch:{ all -> 0x016f }
            int r0 = r0 + 1
            goto L_0x0085
        L_0x008d:
            r6 = 0
        L_0x008e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r1.writeLock()     // Catch:{ all -> 0x016f }
            r8.lock()     // Catch:{ all -> 0x016f }
            X.3S9 r3 = r2.A01     // Catch:{ all -> 0x00c5 }
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00c5 }
            X.3SZ r0 = (X.AnonymousClass3SZ) r0     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x00c5 }
            java.util.Comparator r1 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x00c5 }
            int r0 = r1.compare(r0, r2)     // Catch:{ all -> 0x00c5 }
            if (r0 < 0) goto L_0x00b5
        L_0x00ad:
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x00c5 }
            X.0qQ.A06(r0)     // Catch:{ all -> 0x00c5 }
            r0.put(r4, r5)     // Catch:{ all -> 0x00c5 }
        L_0x00b5:
            A04(r5, r3)     // Catch:{ all -> 0x00c5 }
        L_0x00b8:
            if (r7 >= r6) goto L_0x00c0
            r9.lock()     // Catch:{ all -> 0x016f }
            int r7 = r7 + 1
            goto L_0x00b8
        L_0x00c0:
            r8.unlock()     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            if (r7 >= r6) goto L_0x0155
            r9.lock()     // Catch:{ all -> 0x016f }
            int r7 = r7 + 1
            goto L_0x00c6
        L_0x00ce:
            X.3S9 r3 = r2.A01     // Catch:{ all -> 0x016f }
            monitor-enter(r3)     // Catch:{ all -> 0x016f }
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0152 }
            X.3SZ r0 = (X.AnonymousClass3SZ) r0     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x0152 }
            java.util.Comparator r1 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x0152 }
            int r0 = r1.compare(r0, r2)     // Catch:{ all -> 0x0152 }
            if (r0 < 0) goto L_0x00ef
        L_0x00e7:
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x0152 }
            X.0qQ.A06(r0)     // Catch:{ all -> 0x0152 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0152 }
        L_0x00ef:
            A04(r5, r3)     // Catch:{ all -> 0x0152 }
            monitor-exit(r3)     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x00f4:
            r0 = 1
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x016f }
            X.48S r0 = r6.A0P(r1)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0172
            X.3U9 r5 = r0.A0I     // Catch:{ all -> 0x016f }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x016f }
            X.0eM r0 = r5.A05     // Catch:{ all -> 0x016f }
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0143
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r5.A03     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()     // Catch:{ all -> 0x016f }
            int r0 = r4.getWriteHoldCount()     // Catch:{ all -> 0x016f }
            r2 = 0
            if (r0 != 0) goto L_0x0125
            int r1 = r4.getReadHoldCount()     // Catch:{ all -> 0x016f }
            r0 = 0
        L_0x011d:
            if (r0 >= r1) goto L_0x0126
            r3.unlock()     // Catch:{ all -> 0x016f }
            int r0 = r0 + 1
            goto L_0x011d
        L_0x0125:
            r1 = 0
        L_0x0126:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r4.writeLock()     // Catch:{ all -> 0x016f }
            r8.lock()     // Catch:{ all -> 0x016f }
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x013a }
            A04(r7, r0)     // Catch:{ all -> 0x013a }
        L_0x0132:
            if (r2 >= r1) goto L_0x014b
            r3.lock()     // Catch:{ all -> 0x016f }
            int r2 = r2 + 1
            goto L_0x0132
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            if (r2 >= r1) goto L_0x0155
            r3.lock()     // Catch:{ all -> 0x016f }
            int r2 = r2 + 1
            goto L_0x013b
        L_0x0143:
            X.3S9 r3 = r5.A01     // Catch:{ all -> 0x016f }
            monitor-enter(r3)     // Catch:{ all -> 0x016f }
            A04(r7, r3)     // Catch:{ all -> 0x0152 }
            monitor-exit(r3)     // Catch:{ all -> 0x016f }
            goto L_0x014e
        L_0x014b:
            r8.unlock()     // Catch:{ all -> 0x016f }
        L_0x014e:
            X.2Dr.A0A(r5, r6)     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x0152:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016f }
            goto L_0x0158
        L_0x0155:
            r8.unlock()     // Catch:{ all -> 0x016f }
        L_0x0158:
            throw r0     // Catch:{ all -> 0x016f }
        L_0x0159:
            r0 = 1
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x016f }
            com.instagram.common.session.UserSession r0 = r2.A0A     // Catch:{ all -> 0x016f }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x016f }
            X.3U9 r0 = X.2Dr.A00(r4, r2)     // Catch:{ all -> 0x016f }
            boolean r0 = r0.A0O(r5, r1, r3)     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0172
            X.2Dr.A0A(r4, r2)     // Catch:{ all -> 0x016f }
            goto L_0x0172
        L_0x016f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0172:
            monitor-exit(r10)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A07(X.1gN, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        A05(r5.BJB(r3), r6, r4.A05, r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r5.BJB(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C65811gt r4, X.2Dm r5, java.lang.String r6) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r4.C6K()
            X.3U9 r3 = r5.C5z(r0)
            if (r3 == 0) goto L_0x004f
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0035;
                case -948696717: goto L_0x0032;
                case 1501196714: goto L_0x001e;
                case 1563991648: goto L_0x001b;
                case 1885454214: goto L_0x0018;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0018:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0020
        L_0x001b:
            java.lang.String r0 = "uploaded"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0020:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJB(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A02
            A05(r2, r6, r1, r0)
            goto L_0x004c
        L_0x0032:
            java.lang.String r0 = "queued"
            goto L_0x0037
        L_0x0035:
            java.lang.String r0 = "executing"
        L_0x0037:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJB(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004c:
            X.C66581MXm.A1L(r3, r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0B(X.1gt, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5.C6U(r1).A05(r4.A05, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r5.C6U(r1).A04(r4.A00, r4.A05, A0H(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.C66341mG r4, X.2Dm r5, java.lang.String r6) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r4.C6K()
            X.3U9 r1 = r5.C5z(r0)
            if (r1 == 0) goto L_0x004c
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0021;
                case -948696717: goto L_0x001e;
                case 1501196714: goto L_0x0035;
                case 1563991648: goto L_0x001b;
                case 1885454214: goto L_0x0018;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0018:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0037
        L_0x001b:
            java.lang.String r0 = "uploaded"
            goto L_0x0037
        L_0x001e:
            java.lang.String r0 = "queued"
            goto L_0x0023
        L_0x0021:
            java.lang.String r0 = "executing"
        L_0x0023:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.C6U(r1)
            java.lang.String r1 = r4.A05
            X.9IM r0 = r4.A00
            r2.A05(r1, r0)
            return
        L_0x0035:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0037:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r3 = r5.C6U(r1)
            java.lang.String r2 = r4.A05
            X.9IM r1 = r4.A00
            boolean r0 = A0H(r6)
            r3.A04(r1, r2, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0E(X.1mG, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r7.C6A(r4).A04(java.lang.Integer.valueOf(r5), r6.A05, A0H(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r8.equals(r0) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r7.C6A(r4).A05(r6.A05, java.lang.Integer.valueOf(r5 ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r8.equals(r0) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(X.C66101jR r6, X.2Dm r7, java.lang.String r8) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r6.C6K()
            X.3U9 r4 = r7.C5z(r0)
            if (r4 == 0) goto L_0x0016
            boolean r5 = r6.A01
            int r0 = r8.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x003a;
                case -948696717: goto L_0x0037;
                case 1501196714: goto L_0x001d;
                case 1563991648: goto L_0x001a;
                case 1885454214: goto L_0x0017;
                default: goto L_0x0013;
            }
        L_0x0013:
            X.C66581MXm.A1L(r4, r7)
        L_0x0016:
            return
        L_0x0017:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x001f
        L_0x001a:
            java.lang.String r0 = "uploaded"
            goto L_0x001f
        L_0x001d:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x001f:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0013
            X.3SB r3 = r7.C6A(r4)
            java.lang.String r2 = r6.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = A0H(r8)
            r3.A04(r1, r2, r0)
            goto L_0x0013
        L_0x0037:
            java.lang.String r0 = "queued"
            goto L_0x003c
        L_0x003a:
            java.lang.String r0 = "executing"
        L_0x003c:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0013
            X.3SB r2 = r7.C6A(r4)
            java.lang.String r1 = r6.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A05(r1, r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0F(X.1jR, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        A05(r5.BJK(r3), r6, r4.A05, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r6.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r5.BJK(r3).A05(r4.A05, java.lang.Boolean.valueOf(r4.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        X.C66581MXm.A1L(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(X.AnonymousClass1hH r4, X.2Dm r5, java.lang.String r6) {
        /*
            com.instagram.model.direct.DirectThreadKey r0 = r4.C6K()
            X.3U9 r3 = r5.C5z(r0)
            if (r3 == 0) goto L_0x004f
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0035;
                case -948696717: goto L_0x0032;
                case 1501196714: goto L_0x001e;
                case 1563991648: goto L_0x001b;
                case 1885454214: goto L_0x0018;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r6)
            throw r0
        L_0x0018:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0020
        L_0x001b:
            java.lang.String r0 = "uploaded"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0020:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJK(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            A05(r2, r6, r1, r0)
            goto L_0x004c
        L_0x0032:
            java.lang.String r0 = "queued"
            goto L_0x0037
        L_0x0035:
            java.lang.String r0 = "executing"
        L_0x0037:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.3SB r2 = r5.BJK(r3)
            java.lang.String r1 = r4.A05
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
        L_0x004c:
            X.C66581MXm.A1L(r3, r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66663MaW.A0G(X.1hH, X.2Dm, java.lang.String):void");
    }

    public static boolean A0H(String str) {
        String str2;
        switch (str.hashCode()) {
            case 1501196714:
                str2 = "upload_failed_permanent";
                break;
            case 1563991648:
                if (str.equals("uploaded")) {
                    return true;
                }
                break;
            case 1885454214:
                str2 = "upload_failed_transient";
                break;
        }
        if (str.equals(str2)) {
            return false;
        }
        throw DbW.A0c("Invalid lifecycleState: ", str);
    }
}
